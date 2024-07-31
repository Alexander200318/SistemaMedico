/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;




import Controlador.ControladorHistorialPaciente;
import Modelo.ConsultaHistorialPaciente;
import Modelo.Encabezado_HistorialPaciente;
import Modelo.Singleton;
import Vista.DatosConsulta;
import Vista.DatosTriage;
import Vista.PanelDatosHISTORIAL;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 *
 * @author Jhony
 */
public class Panel_DatosHistorial {
    PanelDatosHISTORIAL vistaPanel;
    ControladorHistorialPaciente controlHistorial;
    Singleton singleton= Singleton.getInstance();

    public Panel_DatosHistorial(PanelDatosHISTORIAL vistaPanel) {
        this.vistaPanel = vistaPanel;
        
        Panelconsulta();
        
        vistaPanel.getBtnSeleccionarConsulta().addActionListener((e) -> {
            Panelconsulta();
        });
        
        vistaPanel.getBtnSeleccionarTriage().addActionListener((e) -> {
            PanelTriage();
        });
        
        IngresarDatorTabla(vistaPanel.getTBLDatReport(),singleton.getIdentificacion_Historial() , null, null, null, null, null, null, null, null);
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
     
      public void IngresarDatorTabla(JTable tabla,
            String identificacion,
            String fecha,
            String nombreParte,
            String apellidoParte,
            String sexoPaciente,
            String nombreDoctor,
            String triage,
            String fechaInicio,
            String fechaFin) {
        
        controlHistorial = new ControladorHistorialPaciente();
        List<Encabezado_HistorialPaciente> consultas = controlHistorial.obtenerHistoriaPaciente(identificacion, fecha, nombreParte, apellidoParte, sexoPaciente, nombreDoctor, fechaInicio, fechaInicio, fechaFin);
                

        // Imprimir tamaño de la lista
        System.out.println("Número de consultas: " + consultas.size());

        ConsultaHistorialPaciente model = new ConsultaHistorialPaciente(consultas);
        tabla.setModel(model);
        /////////////////////////////////////////////////////////////////////////////
//        ImageIcon icon = new ImageIcon("src/Iconos/historial-de-pedidos.png");
//        ButtonRenderer buttonRenderer = new ButtonRenderer();
//        buttonRenderer.setIcon(icon);
//        tabla.getColumnModel().getColumn(8).setCellRenderer(buttonRenderer);
//
//        tabla.getColumnModel().getColumn(8).setCellEditor(new ButtonEditor(tabla));

        /////////////////////////////////////////////////////////////////////////////
        tabla.setRowHeight(30); // Altura en píxeles
        TableColumn column;

//        column = tabla.getColumnModel().getColumn(0);
//        column.setPreferredWidth(55);
//
//        column = tabla.getColumnModel().getColumn(1);
//        column.setPreferredWidth(160);
//
//        column = tabla.getColumnModel().getColumn(2);
//        column.setPreferredWidth(18);
//
//        column = tabla.getColumnModel().getColumn(3);
//        column.setPreferredWidth(50);
//
//        column = tabla.getColumnModel().getColumn(4);
//        column.setPreferredWidth(80);
//
//        column = tabla.getColumnModel().getColumn(5);
//        column.setPreferredWidth(155);
//
//        column = tabla.getColumnModel().getColumn(6);
//        column.setPreferredWidth(250);
//
//        column = tabla.getColumnModel().getColumn(7);
//        column.setPreferredWidth(30);
//
//        column = tabla.getColumnModel().getColumn(8);
//        column.setPreferredWidth(10);

        tabla.revalidate(); // Actualiza el JTable
    }
    
    
}
