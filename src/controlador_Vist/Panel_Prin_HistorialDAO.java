/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Controlador.ButtonEditor;
import Controlador.ButtonRenderer;
import Controlador.ControladorPrincHistorial;
import Controlador.OpacityBackground;

import Modelo.ConsultaTableModel;
import Modelo.Encabezado_tabla_Histrl;
import Modelo.Singleton;
import Vista.PANEL_PRINCIPAL_HISTORIAL;
import Vista.PanelDatosHISTORIAL;
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
//import Vista.REGISTRO_HISTORIAL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import javax.swing.table.TableColumn;

/**
 *
 * @author alexa
 */
public class Panel_Prin_HistorialDAO {

    PANEL_PRINCIPAL_HISTORIAL panelHistorial;
    ControladorPrincHistorial controlHistorial;
    OpacityBackground opacidad;
    Singleton singleton = Singleton.getInstance();
    String fechaInicio = "";
    String fechaFin = "";

    public Panel_Prin_HistorialDAO(PANEL_PRINCIPAL_HISTORIAL panelHistorial) {
        this.panelHistorial = panelHistorial;

        IngresarDatorTabla(this.panelHistorial.getTabla_Historial(), null, null, null, null, null, null, null, null, null);

        this.panelHistorial.getBtn_Buscar_Hist().addActionListener((e) -> {
            IngresarDatorTabla(this.panelHistorial.getTabla_Historial(),
                    this.panelHistorial.getTxt_Cedula_Hist().getText(),
                    null,
                    this.panelHistorial.getTxt_Nombres_Hist().getText(),
                    this.panelHistorial.getTxt_Apellido_Hist().getText(),
                    seleccionSexo(),
                    null,
                    seleccionTriage(),
                    fechaInicio = getFormattedDate(this.panelHistorial.getFecha_Calendario_inicial()),
                    fechaFin = getFormattedDate(this.panelHistorial.getFecha_Calendario_final()));

        });

        this.panelHistorial.getBtn_Limpiar_Hist().addActionListener((e) -> {
            RecetearDatos();
        });

        Tabla(this.panelHistorial.getTabla_Historial());

    }

    private void Tabla(JTable table) {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.rowAtPoint(e.getPoint());
                int column = table.columnAtPoint(e.getPoint());

                if (column == 8) {
                    if (row >= 0) {
                        Object cellValue = table.getValueAt(row, column);
                       CambiarPanel();
                    }
                }
            }
        });
    }
//
    public void CambiarPanel(){
        PanelDatosHISTORIAL Hist=new PanelDatosHISTORIAL();
        Hist.setSize(1280, 680);
        Hist.setLocation(0, 0);
        
        this.panelHistorial.removeAll();
        this.panelHistorial.add(Hist,BorderLayout.CENTER);
        this.panelHistorial.revalidate();
        this.panelHistorial.repaint();
        
        
        
     
    
    }
    
    
    
    

    public void RecetearDatos() {
        this.panelHistorial.getTxt_Cedula_Hist().setText(null);
        this.panelHistorial.getTxt_Nombres_Hist().setText(null);
        this.panelHistorial.getTxt_Apellido_Hist().setText(null);
        this.panelHistorial.getFecha_Calendario_inicial().setDate(null);
        this.panelHistorial.getFecha_Calendario_final().setDate(null);
        this.panelHistorial.getCbx_Sexo_Hist().setSelectedIndex(0);
        this.panelHistorial.getCbx_Triage_Hist().setSelectedIndex(0);

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

    public String seleccionSexo() {
        String valor = "";
        Object selectedItem = this.panelHistorial.getCbx_Sexo_Hist().getSelectedItem();
        if (selectedItem != null) {
            String selectedItemString = String.valueOf(selectedItem);
            if (selectedItemString.equalsIgnoreCase("hombre")) {
                valor = "Hombre";
            } else if (selectedItemString.equalsIgnoreCase("mujer")) {
                valor = "Mujer";
            }
        }
        return valor;
    }

    public String seleccionTriage() {
        String nivel = "";
        Object selectedItem = this.panelHistorial.getCbx_Triage_Hist().getSelectedItem();
        if (selectedItem != null) {
            String selectedItemString = String.valueOf(selectedItem);
            if (selectedItemString.equalsIgnoreCase("Emergencia")) {
                nivel = "Emergencia";
            } else if (selectedItemString.equalsIgnoreCase("Prioridad")) {
                nivel = "Prioridad";
            } else if (selectedItemString.equalsIgnoreCase("No urgente")) {
                nivel = "No urgente";
            }
        }
        return nivel;
    }

    /////////////////////////////
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
        controlHistorial = new ControladorPrincHistorial();
        List<Encabezado_tabla_Histrl> consultas = controlHistorial.obtenerConsultasHistorila(
                identificacion,
                fecha,
                nombreParte,
                apellidoParte,
                sexoPaciente,
                nombreDoctor,
                triage,
                fechaInicio,
                fechaFin);

        // Imprimir tamaño de la lista
        System.out.println("Número de consultas: " + consultas.size());

        ConsultaTableModel model = new ConsultaTableModel(consultas);
        tabla.setModel(model);
        /////////////////////////////////////////////////////////////////////////////
        ImageIcon icon = new ImageIcon("src/Iconos/historial-de-pedidos.png");
        ButtonRenderer buttonRenderer = new ButtonRenderer();
        buttonRenderer.setIcon(icon);
        tabla.getColumnModel().getColumn(8).setCellRenderer(buttonRenderer);

        tabla.getColumnModel().getColumn(8).setCellEditor(new ButtonEditor(tabla));

        /////////////////////////////////////////////////////////////////////////////
        tabla.setRowHeight(30); // Altura en píxeles
        TableColumn column;

        column = tabla.getColumnModel().getColumn(0);
        column.setPreferredWidth(55);

        column = tabla.getColumnModel().getColumn(1);
        column.setPreferredWidth(160);

        column = tabla.getColumnModel().getColumn(2);
        column.setPreferredWidth(18);

        column = tabla.getColumnModel().getColumn(3);
        column.setPreferredWidth(50);

        column = tabla.getColumnModel().getColumn(4);
        column.setPreferredWidth(80);

        column = tabla.getColumnModel().getColumn(5);
        column.setPreferredWidth(155);

        column = tabla.getColumnModel().getColumn(6);
        column.setPreferredWidth(250);

        column = tabla.getColumnModel().getColumn(7);
        column.setPreferredWidth(30);

        column = tabla.getColumnModel().getColumn(8);
        column.setPreferredWidth(10);

        tabla.revalidate(); // Actualiza el JTable
    }

//    public String QueryGeneral(){
//     String query = "SELECT \n"
//                + "    h.Id_Historial,\n"
//                + "    pac.Identificacion,\n"
//                + "    CONCAT(pac.prim_Nombre, ' ', pac.seg_Nombre, ' ', pac.prim_Apellido, ' ', pac.seg_Apellido) AS nombrePaciente,\n"
//                + "    pac.Fecha_Nacimiento,\n" // Añadida la coma aquí
//                + "    pac.Sexo,\n" // Añadida la coma aquí
//                + "    h.Fecha,\n" // Añadida la coma aquí
//                + "    CONCAT(doc.prim_Nombre, ' ', doc.seg_Nombre, ' ', doc.prim_Apellido, ' ', doc.seg_Apellido) AS nombreDoctor,\n"
//                + "    c.Motivo,\n"
//                + "    h.Descripcion_Hist\n"
//                + "FROM historial h\n"
//                + "JOIN paciente pc ON pc.Id_Paciente = h.Id_Paciente\n"
//                + "JOIN persona pac ON pac.Id_Persona = pc.Id_Persona\n"
//                + "JOIN doctor d ON h.Id_Doctor = d.Id_Doctor\n"
//                + "JOIN persona doc ON doc.Id_Persona = d.Id_Persona\n"
//                + "JOIN consulta c ON h.Id_Consulta = c.Id_Consulta;";
//
//    
//    
//    
//    return query;
//    }
//    public String QueryCedula(String cedula){
//     String query = "SELECT \n"
//                + "    h.Id_Historial,\n"
//                + "    pac.Identificacion,\n"
//                + "    CONCAT(pac.prim_Nombre, ' ', pac.seg_Nombre, ' ', pac.prim_Apellido, ' ', pac.seg_Apellido) AS nombrePaciente,\n"
//                + "    pac.Fecha_Nacimiento,\n" // Añadida la coma aquí
//                + "    pac.Sexo,\n" // Añadida la coma aquí
//                + "    h.Fecha,\n" // Añadida la coma aquí
//                + "    CONCAT(doc.prim_Nombre, ' ', doc.seg_Nombre, ' ', doc.prim_Apellido, ' ', doc.seg_Apellido) AS nombreDoctor,\n"
//                + "    c.Motivo,\n"
//                + "    h.Descripcion_Hist\n"
//                + "FROM historial h\n"
//                + "JOIN paciente pc ON pc.Id_Paciente = h.Id_Paciente\n"
//                + "JOIN persona pac ON pac.Id_Persona = pc.Id_Persona\n"
//                + "JOIN doctor d ON h.Id_Doctor = d.Id_Doctor\n"
//                + "JOIN persona doc ON doc.Id_Persona = d.Id_Persona\n"
//                + "JOIN consulta c ON h.Id_Consulta = c.Id_Consulta;"
//                + "WHERE pac.Identificacion ="+cedula;
//
//    
//    
//    
//    return query;
//    }
}
