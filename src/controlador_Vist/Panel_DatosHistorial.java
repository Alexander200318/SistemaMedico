/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Vista.DatosConsulta;
import Vista.DatosTriage;
import Vista.PanelDatosHISTORIAL;
import java.awt.BorderLayout;

/**
 *
 * @author Jhony
 */
public class Panel_DatosHistorial {
    PanelDatosHISTORIAL vistaPanel;

    public Panel_DatosHistorial(PanelDatosHISTORIAL vistaPanel) {
        this.vistaPanel = vistaPanel;
        
        Panelconsulta();
        
        vistaPanel.getBtnSeleccionarConsulta().addActionListener((e) -> {
            Panelconsulta();
        });
        
        vistaPanel.getBtnSeleccionarTriage().addActionListener((e) -> {
            PanelTriage();
        });
        
        
    }

    public void Panelconsulta(){
    DatosConsulta PanelPaciente=new DatosConsulta();
                PanelPaciente.setSize(700, 590);
                PanelPaciente.setLocation(0, 0);
                
                vistaPanel.getPnl_Cambio_Datos_Hist().removeAll();
                vistaPanel.getPnl_Cambio_Datos_Hist().add(PanelPaciente, BorderLayout.CENTER);
                vistaPanel.getPnl_Cambio_Datos_Hist().revalidate();
                vistaPanel.getPnl_Cambio_Datos_Hist().repaint();
                
                
    
    
    }
            
     public void PanelTriage(){
    DatosTriage Paneltriia=new DatosTriage();
                Paneltriia.setSize(700, 590);
                Paneltriia.setLocation(0, 0);
                
                vistaPanel.getPnl_Cambio_Datos_Hist().removeAll();
                vistaPanel.getPnl_Cambio_Datos_Hist().add(Paneltriia, BorderLayout.CENTER);
                vistaPanel.getPnl_Cambio_Datos_Hist().revalidate();
                vistaPanel.getPnl_Cambio_Datos_Hist().repaint();
                
                
    
    
    }
    
    
}
