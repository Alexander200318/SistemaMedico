package Controlador;

import Modelo.Conexion;
import Modelo.Singleton;
import Vista.FrmLogin;
import Vista.FrmPantallaPrincipal;
import Vista.Panel_INICIO;
import Vista.PerfilDoctor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorPerfilDoctor {

    private PerfilDoctor perfilDoctor;
    private Singleton singleton = Singleton.getInstance();
    private boolean isEditing = false;

    public ControladorPerfilDoctor(PerfilDoctor perfilDoctor) {
        this.perfilDoctor = perfilDoctor;

        cargarDatosDoctor(singleton.getId_Doctor());
        inicializarComponentes();
    }

    private void cargarDatosDoctor(int idDoctor) {
        Conexion cone = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        java.sql.Connection con = cone.getConexion();

        String sql = "SELECT p.identificacion, p.prim_Nombre, p.prim_Apellido, p.email, d.especialidad, p.telefono, d.titulo "
                + "FROM Doctor d "
                + "JOIN Persona p ON d.Id_Persona = p.Id_Persona "
                + "WHERE d.Id_Doctor = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idDoctor);
            rs = ps.executeQuery();

            if (rs.next()) {
                perfilDoctor.getTxtIdentiResg().setText(rs.getString("identificacion"));
                perfilDoctor.getTxtNombreResg().setText(rs.getString("prim_Nombre"));
                perfilDoctor.getTxtApellidoResg().setText(rs.getString("prim_Apellido"));
                perfilDoctor.getTxtEmailResg().setText(rs.getString("email"));
                perfilDoctor.getTxtEspecialidadResg().setText(rs.getString("especialidad"));
                perfilDoctor.getTxtCelularResg().setText(rs.getString("telefono"));
                perfilDoctor.getTxtTituloResg().setText(rs.getString("titulo"));

                // Deshabilitar los campos de texto inicialmente
                habilitarCampos(false);
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    private void inicializarComponentes() {
        perfilDoctor.getBtneditar().addActionListener(e -> {
            if (isEditing) {
                actualizarDatosDoctor();
            } else {
                habilitarCampos(true);
            }
            isEditing = !isEditing;
            perfilDoctor.getBtneditar().setText(isEditing ? "GUARDAR CAMBIOS" : "EDITAR PERFIL");
        });

        perfilDoctor.getbtncontra().addActionListener(e -> {
            String nuevaContra = JOptionPane.showInputDialog(perfilDoctor, "Ingrese la nueva contraseña:");
            if (nuevaContra != null && !nuevaContra.trim().isEmpty()) {
                actualizarContrasena(nuevaContra);
            }
        });
    }

    // habilitar los campos que se podran editar
    private void habilitarCampos(boolean habilitar) {
        perfilDoctor.getTxtIdentiResg().setEditable(false); // para no editar el identificador 
        perfilDoctor.getTxtNombreResg().setEditable(habilitar);
        perfilDoctor.getTxtApellidoResg().setEditable(habilitar);
        perfilDoctor.getTxtEmailResg().setEditable(habilitar);
        perfilDoctor.getTxtEspecialidadResg().setEditable(habilitar);
        perfilDoctor.getTxtCelularResg().setEditable(habilitar);
        perfilDoctor.getTxtTituloResg().setEditable(habilitar);
    }

    private void actualizarDatosDoctor() {
        String identificacion = perfilDoctor.getTxtIdentiResg().getText();
        String nombre = perfilDoctor.getTxtNombreResg().getText();
        String apellido = perfilDoctor.getTxtApellidoResg().getText();
        String celular = perfilDoctor.getTxtCelularResg().getText();
        String email = perfilDoctor.getTxtEmailResg().getText();
        String especialidad = perfilDoctor.getTxtEspecialidadResg().getText();
        String titulo = perfilDoctor.getTxtTituloResg().getText();

        // Validaciones
        if (nombre.isEmpty() || apellido.isEmpty() || celular.isEmpty() || email.isEmpty() || especialidad.isEmpty() || titulo.isEmpty()) {
            JOptionPane.showMessageDialog(perfilDoctor, "Todos los campos deben ser llenados", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(perfilDoctor, "El nombre solo puede contener letras", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!apellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(perfilDoctor, "El apellido solo puede contener letras", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!celular.matches("09\\d{8}")) {
            JOptionPane.showMessageDialog(perfilDoctor, "El celular debe tener 10 dígitos y comenzar con 09", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        if (!email.matches(emailRegex)) {
            JOptionPane.showMessageDialog(perfilDoctor, "El correo electrónico no es válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion cone = new Conexion();
        PreparedStatement ps = null;
        java.sql.Connection con = cone.getConexion();

        String sql = "UPDATE Persona p JOIN Doctor d ON p.Id_Persona = d.Id_Persona "
                + "SET p.prim_Nombre = ?, p.prim_Apellido = ?, p.email = ?, d.especialidad = ?, p.telefono = ?, d.titulo = ? "
                + "WHERE d.Id_Doctor = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, email);
            ps.setString(4, especialidad);
            ps.setString(5, celular);
            ps.setString(6, titulo);
            ps.setInt(7, singleton.getId_Doctor());

            int updatedRows = ps.executeUpdate();

            if (updatedRows > 0) {
                JOptionPane.showMessageDialog(perfilDoctor, "Datos actualizados correctamente.");
                habilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(perfilDoctor, "Error al actualizar los datos.");
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    private void actualizarContrasena(String nuevaContra) {
        System.out.println("Actualizando contraseña...");
        // Validación de la contraseña
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&\"'.^#()-])[A-Za-z\\d@$!%*?&\"'.^#()-]{8,}$";
        if (!nuevaContra.matches(passwordRegex)) {
            JOptionPane.showMessageDialog(perfilDoctor, "La contraseña debe tener al menos 8 caracteres, incluir una letra mayúscula, una letra minúscula, un número y un carácter especial", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion cone = new Conexion();
        PreparedStatement ps = null;
        java.sql.Connection con = cone.getConexion();

        String sql = "UPDATE Doctor SET contrasena = ? WHERE Id_Doctor = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nuevaContra);
            ps.setInt(2, singleton.getId_Doctor());

            int updatedRows = ps.executeUpdate();

            if (updatedRows > 0) {
                JOptionPane.showMessageDialog(perfilDoctor, "Contraseña actualizada correctamente.");
            } else {
                JOptionPane.showMessageDialog(perfilDoctor, "Error al actualizar la contraseña.");
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
