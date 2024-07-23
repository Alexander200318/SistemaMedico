/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Singleton;

public class ControladorFrmPanelDatosPaciente {

    private Singleton singleton;

    public ControladorFrmPanelDatosPaciente() {
        singleton = Singleton.getInstance();
    }

    public void imprimirIdPaciente() {
        int idPaciente = singleton.getIdPaciente();
        System.out.println("ID Paciente desde ControladorFrmPanelDatosPaciente: " + idPaciente);
    }

}
