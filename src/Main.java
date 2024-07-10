/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import Controlador.ControladorLogin;
import Vista.FrmLogin;

public class Main {

    public static void main(String[] args) {
        FrmLogin frmLogin = new FrmLogin();
        ControladorLogin controladorLogin = new ControladorLogin(frmLogin);
        controladorLogin.iniciar();
        frmLogin.setVisible(true);
    }
}
