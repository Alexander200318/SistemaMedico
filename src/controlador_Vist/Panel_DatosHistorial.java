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
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
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
         singleton.setId_historialPersonal(0);
        
        vistaPanel.getBtnSeleccionarConsulta().addActionListener((e) -> {
            Panelconsulta();
        });
        
        vistaPanel.getBtnSeleccionarTriage().addActionListener((e) -> {
            PanelTriage();
        });
        
        IngresarDatorTabla(vistaPanel.getTBLDatReport(),singleton.getIdentificacion_Historial(), null , null, null, null, null, null, null, null);
        
        
        this.vistaPanel.getBtn_Buscar_historial().addActionListener((e) -> {
        IngresarDatorTabla(vistaPanel.getTBLDatReport(),singleton.getIdentificacion_Historial(), null , null, null, null, null, null, getFormattedDate(vistaPanel.getDtc_Fech_Inicio()), getFormattedDate(vistaPanel.getDtc_Fech_Fin()));

        });
        
        this.vistaPanel.getBtn_Limpiar_historial().addActionListener((e) -> {
            RecetearDatos();
        });
        
        MouseclickedTabla(vistaPanel.getTBLDatReport());
        
    }
    
    
    
    
    
    
    
    
    public void MouseclickedTabla(JTable table) {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.rowAtPoint(e.getPoint());
                if (row >= 0) {
                    Tabla(table, row);
                     Panelconsulta();
                }
            }
        });
    }
    
    private void Tabla(JTable table, int row) {
        if (row >= 0 && row < table.getRowCount()) {
            ConsultaHistorialPaciente model = (ConsultaHistorialPaciente) table.getModel();
            if (model != null) {
                List<Encabezado_HistorialPaciente> pacientes = model.getConsultas();
                if (pacientes != null && row < pacientes.size()) {
                    Encabezado_HistorialPaciente paciente = pacientes.get(table.convertRowIndexToModel(row));
                    if (paciente != null) {
                        int id_historisl = paciente.getId_historial();
                        System.out.println("ID Historial: " + id_historisl); 
                        singleton.setId_historialPersonal(id_historisl);
                        
//                        CambioDatosPa();
                    } else {
                        System.out.println("Historial no encontrado.");
                    }
                } else {
                    System.out.println("Índice de fila fuera de rango.");
                }
            } else {
                System.out.println("Modelo de tabla no válido.");
            }
        }
    }
    
      public void RecetearDatos() {

        this.vistaPanel.getTxt_motivo().setText(null);
        this.vistaPanel.getDtc_Fech_Inicio().setDate(null);
        this.vistaPanel.getDtc_Fech_Fin().setDate(null);


    }

    
    
    public static String getFormattedDate(JDateChooser dateChooser) {
        // Obtener la fecha seleccionada
        Date date = dateChooser.getDate();
        if (date != null) {
            // Formatear la fecha al formato yyyy-MM-dd
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.format(date);
        } else {
            return "";
        }
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
        List<Encabezado_HistorialPaciente> consultas = controlHistorial.obtenerHistoriaPaciente(identificacion, fecha, nombreParte, apellidoParte, sexoPaciente, nombreDoctor, triage, fechaInicio, fechaFin);
                

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
