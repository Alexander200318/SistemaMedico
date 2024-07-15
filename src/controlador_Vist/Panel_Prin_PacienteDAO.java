/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Vista.PANEL_PRINCIPAL_PACIENTE;
import Vista.REGISTRO_PACIENTE;
import java.awt.BorderLayout;

public class Panel_Prin_PacienteDAO {

    PANEL_PRINCIPAL_PACIENTE PanelPaciente;

    public Panel_Prin_PacienteDAO(PANEL_PRINCIPAL_PACIENTE PanelPaciente) {
        this.PanelPaciente = PanelPaciente;
//        this.PanelPaciente.setVisible(true);

        this.PanelPaciente.getBtn_NuevoPaciente().addActionListener((e) -> {
            pasarPanel();
        });

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

}
