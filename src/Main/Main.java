/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controlador.ControladorLogin;
import Controlador.ControladorReceta;
import Vista.FrmLogin;
import Vista.FrmReceta;

public class Main {
    public static void main(String[] args) {
        FrmLogin frmLogin = new FrmLogin();
        ControladorLogin controladorLogin = new ControladorLogin(frmLogin);
        controladorLogin.iniciar();
        frmLogin.setVisible(true);

        FrmReceta frmReceta = new FrmReceta();
        ControladorReceta controladorReceta = new ControladorReceta(frmReceta);
        controladorReceta.iniciar();
        frmReceta.setVisible(true);
    }
}
