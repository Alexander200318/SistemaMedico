/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controlador.ControladorInterfazImprimir;
import Controlador.ControladorLogin;
import Vista.FrmImpresion;
import Vista.FrmLogin;
import Vista.FrmInterfazImprimir;

public class Main {
    public static void main(String[] args) {
        FrmLogin frmLogin = new FrmLogin();
        ControladorLogin controladorLogin = new ControladorLogin(frmLogin);
        controladorLogin.iniciar();
        frmLogin.setVisible(true);

//        FrmInterfazImprimir frmInterfazImprimir = new FrmInterfazImprimir();
//        FrmImpresion frmImpresion = new FrmImpresion();
//        ControladorInterfazImprimir controladorInterfazImprimir = new ControladorInterfazImprimir(frmInterfazImprimir, frmImpresion);
//        controladorInterfazImprimir.iniciar();
//        frmInterfazImprimir.setVisible(true);
    }
}
