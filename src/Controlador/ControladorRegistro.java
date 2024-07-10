package Controlador;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Modelo.Conexion;
import Vista.FrmLogin;
import Vista.FrmRegistrarse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class ControladorRegistro implements ActionListener {

    private final FrmRegistrarse registroForm;

    public ControladorRegistro(FrmRegistrarse registroForm) {
        this.registroForm = registroForm;
        this.registroForm.getBtnRegistrarse().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registroForm.getBtnRegistrarse()) {
            registrarUsuario();
        }
    }

    private void registrarUsuario() {
        String cedula = registroForm.getTxtCedulaRegistrarse().getText();
        String nombre = registroForm.getTxtNombreRegistrarse().getText();
        String apellido = registroForm.getTxtApellidoRegistrarse().getText();
        String telefono = registroForm.getTxtTelefonoRegistrarse().getText();
        String correo = registroForm.getTxtCorreoRegistrarse().getText();
        String contraseña = registroForm.getTxtContraseñaRegistrarse().getText();
        String confiContraseña = registroForm.getTxtConfiContraseñaRegistrarse().getText();

        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || correo.isEmpty() || contraseña.isEmpty() || confiContraseña.isEmpty()) {
            JOptionPane.showMessageDialog(registroForm, "Todos los campos deben ser llenados", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!cedula.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(registroForm, "La cédula debe tener 10 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!telefono.matches("09\\d{8}")) {
            JOptionPane.showMessageDialog(registroForm, "El teléfono debe tener 10 dígitos y comenzar con 09", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        if (!Pattern.matches(emailRegex, correo)) {
            JOptionPane.showMessageDialog(registroForm, "El correo electrónico no es válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!contraseña.equals(confiContraseña)) {
            JOptionPane.showMessageDialog(registroForm, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&\"'.^#()-])[A-Za-z\\d@$!%*?&\"'.^#()-]{8,}$";
        if (!contraseña.matches(passwordRegex)) {
            JOptionPane.showMessageDialog(registroForm, "La contraseña debe tener al menos 8 caracteres, incluir una letra mayúscula, una letra minúscula, un número y un carácter especial", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
        String sql = "INSERT INTO usuario (cedula, nombre_usuario, contraseña, correo_electronico, nombre_completo, fecha_creacion) VALUES (?, ?, ?, ?, ?, NOW())";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cedula);
            ps.setString(2, nombre);
            ps.setString(3, contraseña);  
            ps.setString(4, correo);
            ps.setString(5, nombre + " " + apellido);

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(registroForm, "Usuario registrado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                abrirFormularioLogin();
                registroForm.dispose();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(registroForm, "Error al registrar usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    private void abrirFormularioLogin() {
        FrmLogin frmLogin = new FrmLogin();
        ControladorLogin controladorLogin = new ControladorLogin(frmLogin);
        controladorLogin.iniciar();
        frmLogin.setVisible(true);
    }
}
