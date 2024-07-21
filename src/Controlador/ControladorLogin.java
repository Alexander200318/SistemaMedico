/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Vista.FrmLogin;
import Vista.FrmPantallaPrincipal;
import Vista.FrmRegistrarse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorLogin implements ActionListener {

    private final FrmLogin loginForm;

    public ControladorLogin(FrmLogin loginForm) {
        this.loginForm = loginForm;
        this.loginForm.getBtnIniciarSesion().addActionListener(this);
        this.loginForm.getTxtLabelRegistrarBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirFormularioRegistro();
            }
        });
    }

    public void iniciar() {
        loginForm.setTitle("Inicio de Sesión");
        loginForm.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginForm.getBtnIniciarSesion()) {
            iniciarSesion();
        }
    }

    private void iniciarSesion() {
        String cedulaCorreo = loginForm.getTxtCedulaCorreoLogin().getText();
        char[] passwordChars = loginForm.getPasswordContraseñaLogin().getPassword();
        String contraseña = new String(passwordChars);

        if (validarCredenciales(cedulaCorreo, contraseña)) {
            FrmPantallaPrincipal frmPantallaPrincipal = new FrmPantallaPrincipal();
            frmPantallaPrincipal.setVisible(true);
            loginForm.dispose();
        } else {
            JOptionPane.showMessageDialog(loginForm, "Cédula, correo o contraseña incorrectos, o el usuario no es un doctor registrado", "Error de Autenticación", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean validarCredenciales(String cedulaCorreo, String contraseña) {
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
        String sql = "SELECT d.Id_Doctor FROM Persona p " +
                     "JOIN Doctor d ON p.Id_Persona = d.Id_Persona " +
                     "WHERE (p.Identificacion = ? OR p.Email = ?) AND d.Contrasena = ? AND d.Doc_Est_Activo = true";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cedulaCorreo);
            ps.setString(2, cedulaCorreo);
            ps.setString(3, contraseña);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true; 
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return false; 
    }

    private void abrirFormularioRegistro() {
        FrmRegistrarse frmRegistrarse = new FrmRegistrarse();
        ControladorRegistro controladorRegistro = new ControladorRegistro(frmRegistrarse, loginForm);
        frmRegistrarse.setVisible(true);
        loginForm.dispose();
    }
}
