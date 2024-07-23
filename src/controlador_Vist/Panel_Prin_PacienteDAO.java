/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Controlador.ControladorMostrarPaciente;
import Modelo.Paciente;
import Modelo.Singleton;
import Vista.PANEL_PRINCIPAL_PACIENTE;
import Vista.PanelDatosPaciente;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Panel_Prin_PacienteDAO {

    PANEL_PRINCIPAL_PACIENTE PanelPaciente;
    ControladorMostrarPaciente Contropaciente;
    Singleton singleton=Singleton.getInstance();

    public Panel_Prin_PacienteDAO(PANEL_PRINCIPAL_PACIENTE PanelPaciente) {
        this.PanelPaciente = PanelPaciente;
        this.PanelPaciente.setVisible(true);
        DatosTablaPaciente(this.PanelPaciente.getTablaDatosPaciente());

        // Add action listener for the search button
        this.PanelPaciente.getBtnBuscar().addActionListener(e -> buscarPaciente());
        MouseclickedTabla(this.PanelPaciente.getTablaDatosPaciente());
    }

    public void DatosTablaPaciente(JTable tabla) {
        Contropaciente = new ControladorMostrarPaciente();
        List<Paciente> listDatos = Contropaciente.obtenerPaciente("");
        PacienteTablaModelDatos tablapaciente = new PacienteTablaModelDatos(listDatos);
        tabla.setModel(tablapaciente);
        tabla.revalidate();
    }

    public void buscarPaciente() {
        String filtro = PanelPaciente.getTxtIngresarNombreOCedula().getText().trim();
        Contropaciente = new ControladorMostrarPaciente();
        List<Paciente> listDatos = Contropaciente.obtenerPaciente(filtro);
        PacienteTablaModelDatos tablapaciente = new PacienteTablaModelDatos(listDatos);
        PanelPaciente.getTablaDatosPaciente().setModel(tablapaciente);
        PanelPaciente.getTablaDatosPaciente().revalidate();
    }

//    public void pasarPanel() {
////        REGISTRO_PACIENTE RegistrarPaciente = new REGISTRO_PACIENTE();
//        RegistrarPaciente.setSize(980, 660);
//        RegistrarPaciente.setLocation(0, 0);
//        PanelPaciente.getPanel_camb_Registro().removeAll();
//        PanelPaciente.getPanel_camb_Registro().add(RegistrarPaciente, BorderLayout.CENTER);
//        PanelPaciente.getPanel_camb_Registro().revalidate();
//        PanelPaciente.getPanel_camb_Registro().repaint();
//    }

    public void pasarDatos() {
        PanelDatosPaciente RegistrarPaciente = new PanelDatosPaciente();
        RegistrarPaciente.setSize(980, 660);
        RegistrarPaciente.setLocation(0, 0);
        PanelPaciente.getPanel_camb_Registro().removeAll();
        PanelPaciente.getPanel_camb_Registro().add(RegistrarPaciente, BorderLayout.CENTER);
        PanelPaciente.getPanel_camb_Registro().revalidate();
        PanelPaciente.getPanel_camb_Registro().repaint();
    }

    private void Tabla(JTable table, int row) {
        if (row >= 0 && row < table.getRowCount()) {
            PacienteTablaModelDatos model = (PacienteTablaModelDatos) table.getModel();
            if (model != null) {
                List<Paciente> pacientes = model.getDatos();
                if (pacientes != null && row < pacientes.size()) {
                    Paciente paciente = pacientes.get(table.convertRowIndexToModel(row));
                    if (paciente != null) {
                        int idPaciente = paciente.getIdPaciente();
                        System.out.println("ID Paciente: " + idPaciente); 
                        singleton.setIdPaciente(idPaciente);
                        CambioDatosPa();
                    } else {
                        System.out.println("Paciente no encontrado.");
                    }
                } else {
                    System.out.println("Índice de fila fuera de rango.");
                }
            } else {
                System.out.println("Modelo de tabla no válido.");
            }
        }
    }

    public void MouseclickedTabla(JTable table) {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.rowAtPoint(e.getPoint());
                if (row >= 0) {
                    Tabla(table, row);
                }
            }
        });
    }
    public void CambioDatosPa(){
        PanelDatosPaciente cambio = new PanelDatosPaciente();
        cambio.setSize(1280,680);
        cambio.setLocation(0, 0);
        PanelPaciente.removeAll();
        PanelPaciente.add(cambio, BorderLayout.CENTER);
        PanelPaciente.revalidate();
        PanelPaciente.repaint();
    }
}
