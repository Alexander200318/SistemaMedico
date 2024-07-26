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

        String sql = "SELECT p.identificacion, p.prim_Nombre, p.seg_Nombre, p.prim_Apellido, p.seg_Apellido, p.email, d.especialidad, p.telefono, d.titulo, d.Contrasena "
                + "FROM Doctor d "
                + "JOIN Persona p ON d.Id_Persona = p.Id_Persona "
                + "WHERE d.Id_Doctor = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idDoctor);
            rs = ps.executeQuery();

            if (rs.next()) {
                perfilDoctor.getTxtIdentiResg().setText(rs.getString("identificacion"));
                perfilDoctor.getTxtNombreResg().setText(rs.getString("prim_Nombre") + " " + rs.getString("seg_Nombre"));
                perfilDoctor.getTxtApellidoResg().setText(rs.getString("prim_Apellido") + " " + rs.getString("seg_Apellido"));
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
            String contrasenaActual = JOptionPane.showInputDialog(perfilDoctor, "Ingrese su contraseña actual:");
            if (contrasenaActual != null && !contrasenaActual.trim().isEmpty()) {
                if (verificarContrasena(contrasenaActual)) {
                    String nuevaContra = JOptionPane.showInputDialog(perfilDoctor, "Ingrese la nueva contraseña:");
                    if (nuevaContra != null && !nuevaContra.trim().isEmpty()) {
                        actualizarContrasena(nuevaContra);
                    }
                } else {
                    JOptionPane.showMessageDialog(perfilDoctor, "Contraseña actual incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

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
        String nombres = perfilDoctor.getTxtNombreResg().getText().trim();
        String apellidos = perfilDoctor.getTxtApellidoResg().getText().trim();
        String celular = perfilDoctor.getTxtCelularResg().getText();
        String email = perfilDoctor.getTxtEmailResg().getText();
        String especialidad = perfilDoctor.getTxtEspecialidadResg().getText();
        String titulo = perfilDoctor.getTxtTituloResg().getText();

        // Validaciones
        if (nombres.isEmpty() || apellidos.isEmpty() || celular.isEmpty() || email.isEmpty() || especialidad.isEmpty() || titulo.isEmpty()) {
            JOptionPane.showMessageDialog(perfilDoctor, "Todos los campos deben ser llenados", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar formato de nombres y apellidos
        if (!nombres.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+( [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)?$")) {
            JOptionPane.showMessageDialog(perfilDoctor, "El nombre debe estar separado por un solo espacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!apellidos.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+( [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)?$")) {
            JOptionPane.showMessageDialog(perfilDoctor, "El apellido debe estar separado por un solo espacio", "Error", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(perfilDoctor, "El primer nombre solo puede contener letras", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!primApellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
            JOptionPane.showMessageDialog(perfilDoctor, "El primer apellido solo puede contener letras", "Error", JOptionPane.ERROR_MESSAGE);
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
                + "SET p.prim_Nombre = ?, p.seg_Nombre = ?, p.prim_Apellido = ?, p.seg_Apellido = ?, p.email = ?, d.especialidad = ?, p.telefono = ?, d.titulo = ? "
                + "WHERE d.Id_Doctor = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, primNombre);
            ps.setString(2, segNombre);
            ps.setString(3, primApellido);
            ps.setString(4, segApellido);
            ps.setString(5, email);
            ps.setString(6, especialidad);
            ps.setString(7, celular);
            ps.setString(8, titulo);
            ps.setInt(9, singleton.getId_Doctor());

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

    private boolean verificarContrasena(String contrasenaActual) {
        Conexion cone = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        java.sql.Connection con = cone.getConexion();

        String sql = "SELECT Contrasena FROM Doctor WHERE Id_Doctor = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, singleton.getId_Doctor());
            rs = ps.executeQuery();

            if (rs.next()) {
                String contrasenaBD = rs.getString("Contrasena");
                return contrasenaActual.equals(contrasenaBD);
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
        return false;
    }

    private void actualizarContrasena(String nuevaContra) {
        System.out.println("Actualizando contraseña...");
        // Validación de la contraseña
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&\"'.^#()-])[A-Za-z\\d@$!%*?&\"'.^#()-]{8,}$";
        if (!nuevaContra.matches(passwordRegex)) {
            JOptionPane.showMessageDialog(perfilDoctor, "La contraseña debe tener al menos 8 caracteres, incluir una letra mayúscula, una minúscula, un número y un carácter especial.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion cone = new Conexion();
        PreparedStatement ps = null;
        java.sql.Connection con = cone.getConexion();

        String sql = "UPDATE Doctor SET Contrasena = ? WHERE Id_Doctor = ?";

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
