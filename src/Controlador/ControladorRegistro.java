package Controlador;

import Modelo.Conexion;
import Vista.FrmLogin;
import Vista.FrmRegistrarse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorRegistro implements ActionListener {

    private final FrmRegistrarse registroForm;
    private final FrmLogin loginForm;

    public ControladorRegistro(FrmRegistrarse registroForm, FrmLogin loginForm) {
        this.registroForm = registroForm;
        this.loginForm = loginForm;
        this.registroForm.getBtnRegistrarse().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registroForm.getBtnRegistrarse()) {
            registrarDoctor();
        }
    }

    private void registrarDoctor() {
        // Obtener datos del formulario
        String identificacion = registroForm.getTxtIdentiResg().getText();
        String nombre = registroForm.getTxtNombreResg().getText();
        String apellido = registroForm.getTxtApellidoResg().getText();
        String celular = registroForm.getTxtCelularResg().getText();
        String email = registroForm.getTxtEmailResg().getText();
        String contrasena = new String(registroForm.getJPassContraResg().getPassword());
        String especialidad = registroForm.getTxtEspecialidadResg().getText();
        String titulo = registroForm.getTxtTituloResg().getText();

        // Validaciones
        if (identificacion.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || celular.isEmpty() || email.isEmpty() || contrasena.isEmpty() || especialidad.isEmpty() || titulo.isEmpty()) {
            JOptionPane.showMessageDialog(registroForm, "Todos los campos deben ser llenados", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!identificacion.matches("\\d+")) {
            JOptionPane.showMessageDialog(registroForm, "La identificación debe ser numérica", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(registroForm, "El nombre solo puede contener letras", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!apellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(registroForm, "El apellido solo puede contener letras", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!celular.matches("09\\d{8}")) {
            JOptionPane.showMessageDialog(registroForm, "El celular debe tener 10 dígitos y comenzar con 09", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        if (!email.matches(emailRegex)) {
            JOptionPane.showMessageDialog(registroForm, "El correo electrónico no es válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&\"'.^#()-])[A-Za-z\\d@$!%*?&\"'.^#()-]{8,}$";
        if (!contrasena.matches(passwordRegex)) {
            JOptionPane.showMessageDialog(registroForm, "La contraseña debe tener al menos 8 caracteres, incluir una letra mayúscula, una letra minúscula, un número y un carácter especial", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Conexión y SQL
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();

        // Verificar si la identificación ya existe en Persona
        String checkPersonaSql = "SELECT Id_Persona FROM Persona WHERE Identificacion = ?";
        try (PreparedStatement psCheck = con.prepareStatement(checkPersonaSql)) {
            psCheck.setString(1, identificacion);
            ResultSet rs = psCheck.executeQuery();

            int idPersona;
            if (rs.next()) {
                // La identificación ya existe, obtener el Id_Persona
                idPersona = rs.getInt("Id_Persona");
            } else {
                // La identificación no existe, insertar nuevo registro en Persona
                String insertPersonaSql = "INSERT INTO Persona (Identificacion, prim_Nombre, prim_Apellido, Email, Telefono, Estado_Activo) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement psInsertPersona = con.prepareStatement(insertPersonaSql, PreparedStatement.RETURN_GENERATED_KEYS)) {
                    psInsertPersona.setString(1, identificacion);
                    psInsertPersona.setString(2, nombre);
                    psInsertPersona.setString(3, apellido);
                    psInsertPersona.setString(4, email);
                    psInsertPersona.setString(5, celular);
                    psInsertPersona.setBoolean(6, true); // Estado_Activo, asumiendo que siempre es true para nuevos registros

                    int rowsInserted = psInsertPersona.executeUpdate();
                    if (rowsInserted > 0) {
                        // Obtener el Id_Persona generado
                        ResultSet generatedKeys = psInsertPersona.getGeneratedKeys();
                        if (generatedKeys.next()) {
                            idPersona = generatedKeys.getInt(1);
                        } else {
                            throw new SQLException("No se pudo obtener el Id_Persona generado.");
                        }
                    } else {
                        throw new SQLException("Error al insertar la persona.");
                    }
                }
            }

            // Insertar el doctor
            String insertDoctorSql = "INSERT INTO Doctor (Especialidad, Titulo, Contrasena, Doc_Est_Activo, Id_Persona) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement psInsertDoctor = con.prepareStatement(insertDoctorSql)) {
                psInsertDoctor.setString(1, especialidad);
                psInsertDoctor.setString(2, titulo);
                psInsertDoctor.setString(3, contrasena);
                psInsertDoctor.setBoolean(4, true); // Doc_Est_Activo, asumiendo que siempre es true para nuevos registros
                psInsertDoctor.setInt(5, idPersona);

                int rowsInsertedDoctor = psInsertDoctor.executeUpdate();
                if (rowsInsertedDoctor > 0) {
                    JOptionPane.showMessageDialog(registroForm, "Registro exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                    // Cerrar el formulario de registro
                    registroForm.dispose();

                    // Mostrar el formulario de inicio de sesión
                    loginForm.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(registroForm, "Error al registrar el doctor", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(registroForm, "Error en la base de datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
