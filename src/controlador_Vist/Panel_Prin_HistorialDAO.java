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
import Vista.impresionanual;
import Vista.impresiondiscapacidad;
import Vista.imprimirdocest;
import Vista.imprimirsexo;
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 *
 * @author alexa
 */
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.BorderFactory;

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

        this.panelHistorial.getBtnreporte().addActionListener((e) -> {
            mostrarOpcionesReporte();
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
                        Object cellValueColumn1 = table.getValueAt(row, 0);
                        String extractedValue = cellValueColumn1.toString();

                        // Puedes utilizar la cadena 'extractedValue' según sea necesario
                        System.out.println("Valor extraído de la columna 1: " + extractedValue);

                        singleton.setIdentificacion_Historial(extractedValue);
                        CambiarPanel();
                    }
                }
            }
        });
    }

    public void CambiarPanel() {
        PanelDatosHISTORIAL Hist = new PanelDatosHISTORIAL();
        Hist.setSize(1280, 680);
        Hist.setLocation(0, 0);

        this.panelHistorial.removeAll();
        this.panelHistorial.add(Hist, BorderLayout.CENTER);
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

    private void mostrarOpcionesReporte() {
        JFrame opcionesFrame = new JFrame("Opciones de Reporte");
        opcionesFrame.setSize(400, 200);
        opcionesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));
        panel.setBackground(Color.WHITE);

        Font font = new Font("Maiandra GD", Font.BOLD, 14);

        Color buttonColor = new Color(64, 172, 159);

        JButton btnReporteSexo = new JButton("Reporte por Sexo");
        JButton btnReporteTipoPaciente = new JButton("Reporte por Tipo de Paciente");
        JButton btnReporteAnual = new JButton("Reportes Anuales");
        JButton btnReporteDiscapacidad = new JButton("Reportes de Discapacidades");

        btnReporteSexo.setFont(font);
        btnReporteSexo.setBackground(buttonColor);
        btnReporteSexo.setOpaque(true);
        btnReporteSexo.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        btnReporteTipoPaciente.setFont(font);
        btnReporteTipoPaciente.setBackground(buttonColor);
        btnReporteTipoPaciente.setOpaque(true);
        btnReporteTipoPaciente.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        btnReporteAnual.setFont(font);
        btnReporteAnual.setBackground(buttonColor);
        btnReporteAnual.setOpaque(true);
        btnReporteAnual.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        btnReporteDiscapacidad.setFont(font);
        btnReporteDiscapacidad.setBackground(buttonColor);
        btnReporteDiscapacidad.setOpaque(true);
        btnReporteDiscapacidad.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        btnReporteSexo.addActionListener((e) -> abrirReporteSexo());
        btnReporteTipoPaciente.addActionListener((e) -> abrirReporteTipoPaciente());
        btnReporteAnual.addActionListener((e) -> abrirReporteAnual());
        btnReporteDiscapacidad.addActionListener((e) -> abrirReporteDiscapacidad());

        panel.add(btnReporteSexo);
        panel.add(btnReporteTipoPaciente);
        panel.add(btnReporteAnual);
        panel.add(btnReporteDiscapacidad);

        opcionesFrame.add(panel);

        opcionesFrame.setLocationRelativeTo(null); // Centrar el frame
        opcionesFrame.setVisible(true);
    }

    private void abrirReporteSexo() {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Visualización de Datos por Sexo");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cambiado a DISPOSE_ON_CLOSE
            frame.setSize(800, 715);

            imprimirsexo imprimirSexoPanel = new imprimirsexo();
            frame.add(imprimirSexoPanel);

            frame.setLocationRelativeTo(null); // Centrar el frame
            frame.setVisible(true);
        });
    }

    private void abrirReporteTipoPaciente() {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Visualización de Datos por Tipo de Paciente");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cambiado a DISPOSE_ON_CLOSE
            frame.setSize(800, 715);

            imprimirdocest imprimirPanel = new imprimirdocest();
            frame.add(imprimirPanel);

            frame.setLocationRelativeTo(null); // Centrar el frame
            frame.setVisible(true);
        });
    }

    private void abrirReporteAnual() {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Visualización de Datos por Año");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cambiado a DISPOSE_ON_CLOSE
            frame.setSize(800, 715);

            impresionanual imprimirPanel = new impresionanual();
            frame.add(imprimirPanel);

            frame.setLocationRelativeTo(null); // Centrar el frame
            frame.setVisible(true);
        });
    }

    private void abrirReporteDiscapacidad() {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Visualización de Datos por Discapacidad");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cambiado a DISPOSE_ON_CLOSE
            frame.setSize(1300, 715);

            impresiondiscapacidad imprimirPanel = new impresiondiscapacidad();
            frame.add(imprimirPanel);

            frame.setLocationRelativeTo(null); // Centrar el frame
            frame.setVisible(true);
        });
    }
}
