/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Vista.CarrerasAdmin;
import Vista.FrmAdmin;
import Vista.PanelAdminDoctor;
import Vista.PanelAdminPaciente;
import Vista.PanelGraficasAdmin;
import java.awt.BorderLayout;

/**
 *
 * @author alexa
 */
public class PanelPrinAdministrador {
    FrmAdmin vistaAdmin;

    public PanelPrinAdministrador(FrmAdmin vistaAdmin) {
        this.vistaAdmin = vistaAdmin;
        
        vistaAdmin.getBtnGraficasAdmin().addActionListener((e) -> {
            LlamarPanelPrincipal();
            
        });
        
        vistaAdmin.getBtnCarrerasAdmin().addActionListener((e) -> {
            LlamarPanelCarreras();
        });
        
        vistaAdmin.getBtn_PacientesaAdmin().addActionListener((e) -> {
            LlamarPanelPacientes();
            
        });
        
    }
    
    
    public void LlamarPanelPrincipal(){
    
               PanelGraficasAdmin PanelPaciente=new PanelGraficasAdmin();
                PanelPaciente.setSize(1020, 7200);
                PanelPaciente.setLocation(0, 0);
                
                vistaAdmin.getPanelCambio().removeAll();
                vistaAdmin.getPanelCambio().add(PanelPaciente, BorderLayout.CENTER);
                vistaAdmin.getPanelCambio().revalidate();
                vistaAdmin.getPanelCambio().repaint();
                
                
    
    
    }
    public void LlamarPanelCarreras(){
    
     CarrerasAdmin PanelPaciente=new CarrerasAdmin();
                PanelPaciente.setSize(1020, 7200);
                PanelPaciente.setLocation(0, 0);
                
                vistaAdmin.getPanelCambio().removeAll();
                vistaAdmin.getPanelCambio().add(PanelPaciente, BorderLayout.CENTER);
                vistaAdmin.getPanelCambio().revalidate();
                vistaAdmin.getPanelCambio().repaint();
                
                
    
    }
    public void LlamarPanelPacientes(){
    
     PanelAdminPaciente PanelPaciente=new PanelAdminPaciente();
                PanelPaciente.setSize(1020, 7200);
                PanelPaciente.setLocation(0, 0);
                
                vistaAdmin.getPanelCambio().removeAll();
                vistaAdmin.getPanelCambio().add(PanelPaciente, BorderLayout.CENTER);
                vistaAdmin.getPanelCambio().revalidate();
                vistaAdmin.getPanelCambio().repaint();
                
                
    
    }
     public void LlamarPanelDoctor(){
    
    
     PanelAdminDoctor PanelPaciente=new PanelAdminDoctor();
                PanelPaciente.setSize(1020, 7200);
                PanelPaciente.setLocation(0, 0);
                
                vistaAdmin.getPanelCambio().removeAll();
                vistaAdmin.getPanelCambio().add(PanelPaciente, BorderLayout.CENTER);
                vistaAdmin.getPanelCambio().revalidate();
                vistaAdmin.getPanelCambio().repaint();
                
                
    }   
    
}
