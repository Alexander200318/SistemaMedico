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
        String nombres = registroForm.getTxtNombreResg().getText().trim();
        String apellidos = registroForm.getTxtApellidoResg().getText().trim();
        String celular = registroForm.getTxtCelularResg().getText();
        String email = registroForm.getTxtEmailResg().getText();
        String contrasena = new String(registroForm.getJPassContraResg().getPassword());
        String especialidad = registroForm.getTxtEspecialidadResg().getText();
        String titulo = registroForm.getTxtTituloResg().getText();

        // Validaciones
        if (identificacion.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || celular.isEmpty() || email.isEmpty() || contrasena.isEmpty() || especialidad.isEmpty() || titulo.isEmpty()) {
            JOptionPane.showMessageDialog(registroForm, "Todos los campos deben ser llenados", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!identificacion.matches("\\d+")) {
            JOptionPane.showMessageDialog(registroForm, "La identificación debe ser numérica", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar formato de nombres y apellidos
        if (!nombres.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+( [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)?$")) {
            JOptionPane.showMessageDialog(registroForm, "El nombre debe estar separado por un solo espacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!apellidos.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+( [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)?$")) {
            JOptionPane.showMessageDialog(registroForm, "El apellido debe estar separado por un solo espacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Separar nombres y apellidos
        String[] nombrePartes = nombres.split(" ", 2);
        String primNombre = nombrePartes[0];
        String segNombre = nombrePartes.length > 1 ? nombrePartes[1].trim().replaceAll("\\s+", "") : "";

        String[] apellidoPartes = apellidos.split(" ", 2);
        String primApellido = apellidoPartes[0];
        String segApellido = apellidoPartes.length > 1 ? apellidoPartes[1].trim().replaceAll("\\s+", "") : "";

        if (!primNombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
            JOptionPane.showMessageDialog(registroForm, "El primer nombre solo puede contener letras", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!primApellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
            JOptionPane.showMessageDialog(registroForm, "El primer apellido solo puede contener letras", "Error", JOptionPane.ERROR_MESSAGE);
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

            if (rs.next()) {
                JOptionPane.showMessageDialog(registroForm, "La identificación ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int idPersona;
            String insertPersonaSql = "INSERT INTO Persona (Identificacion, prim_Nombre, seg_Nombre, prim_Apellido, seg_Apellido, Email, Telefono, Estado_Activo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement psInsertPersona = con.prepareStatement(insertPersonaSql, PreparedStatement.RETURN_GENERATED_KEYS)) {
                psInsertPersona.setString(1, identificacion);
                psInsertPersona.setString(2, primNombre);
                psInsertPersona.setString(3, segNombre);
                psInsertPersona.setString(4, primApellido);
                psInsertPersona.setString(5, segApellido);
                psInsertPersona.setString(6, email);
                psInsertPersona.setString(7, celular);
                psInsertPersona.setBoolean(8, true); // Estado_Activo, asumiendo que siempre es true para nuevos registros

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
