/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Controlador.ControladorMostrarPaciente;
import Modelo.Persona;
import Vista.PANEL_PRINCIPAL_PACIENTE;
import Vista.PanelDatosPaciente;
import Vista.REGISTRO_PACIENTE;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JTable;

public class Panel_Prin_PacienteDAO {

    PANEL_PRINCIPAL_PACIENTE PanelPaciente;
    ControladorMostrarPaciente Contropaciente;

//    public Panel_Prin_PacienteDAO(PANEL_PRINCIPAL_PACIENTE PanelPaciente) {
//        this.PanelPaciente = PanelPaciente;
////        this.PanelPaciente.setVisible(true);
//
//        this.PanelPaciente.getBtn_NuevoPaciente().addActionListener((e) -> {
//            pasarPanel();
//        });
//        this.PanelPaciente.getBtn_prueba().addActionListener((e) -> {
//            pasarDatos();
//        });
//        DatosTablaPaciente(this.PanelPaciente.getTablaDatosPaciente());
//
//    }
    public Panel_Prin_PacienteDAO(PANEL_PRINCIPAL_PACIENTE PanelPaciente) {
        this.PanelPaciente = PanelPaciente;
        this.PanelPaciente.setVisible(true);
        DatosTablaPaciente(this.PanelPaciente.getTablaDatosPaciente());

        // Add action listener for the search button
        this.PanelPaciente.getBtnBuscar().addActionListener(e -> buscarPaciente());
    }

    public void DatosTablaPaciente(JTable tabla) {
        Contropaciente = new ControladorMostrarPaciente();
        List<Persona> listDatos = Contropaciente.obtenerPersonas("");
        PacienteTablaModelDatos tablapaciente = new PacienteTablaModelDatos(listDatos);
        tabla.setModel(tablapaciente);
        tabla.revalidate();
    }

    public void buscarPaciente() {
        String filtro = PanelPaciente.getTxtIngresarNombreOCedula().getText().trim();
        Contropaciente = new ControladorMostrarPaciente();
        List<Persona> listDatos = Contropaciente.obtenerPersonas(filtro);
        PacienteTablaModelDatos tablapaciente = new PacienteTablaModelDatos(listDatos);
        PanelPaciente.getTablaDatosPaciente().setModel(tablapaciente);
        PanelPaciente.getTablaDatosPaciente().revalidate();
    }

    public void pasarPanel() {

        REGISTRO_PACIENTE RegistrarPaciente = new REGISTRO_PACIENTE();
        RegistrarPaciente.setSize(980, 660);
        RegistrarPaciente.setLocation(0, 0);
        PanelPaciente.getPanel_camb_Registro().removeAll();
        PanelPaciente.getPanel_camb_Registro().add(RegistrarPaciente, BorderLayout.CENTER);
        PanelPaciente.getPanel_camb_Registro().revalidate();
        PanelPaciente.getPanel_camb_Registro().repaint();

    }

    public void pasarDatos() {

        PanelDatosPaciente RegistrarPaciente = new PanelDatosPaciente();
        RegistrarPaciente.setSize(980, 660);
        RegistrarPaciente.setLocation(0, 0);
        PanelPaciente.getPanel_camb_Registro().removeAll();
        PanelPaciente.getPanel_camb_Registro().add(RegistrarPaciente, BorderLayout.CENTER);
        PanelPaciente.getPanel_camb_Registro().revalidate();
        PanelPaciente.getPanel_camb_Registro().repaint();

    }

}
