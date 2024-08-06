/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Controlador.ControladorDiscapacidad;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.TableColumnModel;

public class impresiondiscapacidad extends JPanel {
    private final JTable table;
    private final JButton imprimirButton;
    private Date fechaInicio;
    private Date fechaFin;
    private JLabel subtituloLabel;

    public impresiondiscapacidad() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // Mostrar el diálogo para recoger las fechas
        mostrarDialogoFecha();

        // Resto del código
        JPanel encabezadoPanel = new JPanel();
        encabezadoPanel.setLayout(new BorderLayout());
        encabezadoPanel.setBackground(Color.WHITE);

        JLabel encabezado = new JLabel("MATRIZ DE ACTORES EDUCATIVOS CON DISCAPACIDAD", JLabel.CENTER);
        encabezado.setFont(new Font("Arial", Font.BOLD, 16));
        encabezado.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        // Crear un panel para las fechas seleccionadas
        JPanel fechaPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        fechaPanel.setBackground(Color.WHITE);

        JLabel fechaLabel = new JLabel(getFechasSeleccionadas());
        fechaLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        fechaLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0)); // Separar del borde del panel

        fechaPanel.add(fechaLabel);

        JLabel medicoResponsable = new JLabel("Médico Responsable: _____________________", JLabel.CENTER);
        medicoResponsable.setFont(new Font("Arial", Font.PLAIN, 12));
        medicoResponsable.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));

        encabezadoPanel.add(encabezado, BorderLayout.NORTH);
        encabezadoPanel.add(fechaPanel, BorderLayout.WEST); // Agregar fechas al lado izquierdo
        encabezadoPanel.add(medicoResponsable, BorderLayout.SOUTH);

        DefaultTableModel model = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"N°", "Número de Cédula", "Nombres y Apellidos", "Actor Educativo", "Edad", "Fecha de Nacimiento", "Tipo de Discapacidad", "Porcentaje de Discapacidad", "Carrera", "Ciclo", "Jornada", "Horario de clases", "Documentación", "Observaciones"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(model);
        table.setRowHeight(60);
        table.setFont(new Font("Arial", Font.PLAIN, 12));

        // Ajustar el ancho de las columnas
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(200);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
        table.getColumnModel().getColumn(4).setPreferredWidth(50);
        table.getColumnModel().getColumn(5).setPreferredWidth(100);
        table.getColumnModel().getColumn(6).setPreferredWidth(150);
        table.getColumnModel().getColumn(7).setPreferredWidth(150);
        table.getColumnModel().getColumn(8).setPreferredWidth(100);
        table.getColumnModel().getColumn(9).setPreferredWidth(100);
        table.getColumnModel().getColumn(10).setPreferredWidth(100);
        table.getColumnModel().getColumn(11).setPreferredWidth(150);
        table.getColumnModel().getColumn(12).setPreferredWidth(100);
        table.getColumnModel().getColumn(13).setPreferredWidth(150);

        TableColumnModel columnModel = table.getColumnModel();
        TableCellRenderer headerRenderer = new TableCellRenderer() {
            private final JTextArea textArea = new JTextArea();

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                textArea.setText(value == null ? "" : value.toString());
                textArea.setFont(new Font("Arial", Font.BOLD, 12));
                textArea.setWrapStyleWord(true);
                textArea.setLineWrap(true);
                textArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                textArea.setOpaque(true);
                textArea.setBackground(Color.WHITE);
                return textArea;
            }
        };

        for (int i = 0; i < table.getColumnCount(); i++) {
            columnModel.getColumn(i).setHeaderRenderer(headerRenderer);
        }

        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        table.getTableHeader().setDefaultRenderer(headerRenderer);
        table.getTableHeader().setOpaque(true);
        table.getTableHeader().setBackground(Color.WHITE);

        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBackground(Color.WHITE);

        tablePanel.add(table.getTableHeader(), BorderLayout.NORTH);
        tablePanel.add(table, BorderLayout.CENTER);

       JPanel firmaPanel = new JPanel(new GridBagLayout());
        firmaPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;


        JLabel firmaLabel = new JLabel("Firma: ________________________", JLabel.LEFT);
        JLabel nombreLabel = new JLabel("Nombre: ___________________________", JLabel.LEFT);
        JLabel cedulaLabel = new JLabel("Cédula: ______________________", JLabel.LEFT);

        firmaLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        nombreLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        cedulaLabel.setFont(new Font("Arial", Font.PLAIN, 12));

        gbc.gridx = 0;
        gbc.gridy = 0;
        firmaPanel.add(firmaLabel, gbc);

        gbc.gridy = 1;
        firmaPanel.add(nombreLabel, gbc);

        gbc.gridy = 2;
        firmaPanel.add(cedulaLabel, gbc);


        imprimirButton = new JButton("Imprimir");
        imprimirButton.addActionListener(e -> imprimir());
        JPanel imprimirPanel = new JPanel();
        imprimirPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        imprimirPanel.setBackground(Color.WHITE);
        imprimirPanel.add(imprimirButton);

        add(encabezadoPanel, BorderLayout.NORTH);
        add(tablePanel, BorderLayout.CENTER);
        add(firmaPanel, BorderLayout.SOUTH);
        add(imprimirPanel, BorderLayout.SOUTH);

        // Cargar los datos después de obtener las fechas
        cargarDatos();
    }

    private void mostrarDialogoFecha() {
        JPanel panelFechas = new JPanel();
        panelFechas.setLayout(new GridLayout(2, 2, 10, 10));

        JDateChooser fechaInicioChooser = new JDateChooser();
        JDateChooser fechaFinChooser = new JDateChooser();

        panelFechas.add(new JLabel("Fecha de inicio:"));
        panelFechas.add(fechaInicioChooser);
        panelFechas.add(new JLabel("Fecha de fin:"));
        panelFechas.add(fechaFinChooser);

        int result = JOptionPane.showConfirmDialog(null, panelFechas, "Seleccione el rango de fechas", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            fechaInicio = fechaInicioChooser.getDate();
            fechaFin = fechaFinChooser.getDate();

            if (fechaInicio == null || fechaFin == null) {
                JOptionPane.showMessageDialog(this, "Por favor seleccione ambas fechas.", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
                mostrarDialogoFecha(); // Volver a mostrar el diálogo si las fechas no son válidas
            } else if (fechaInicio.after(new Date()) || fechaFin.after(new Date())) {
                JOptionPane.showMessageDialog(this, "Las fechas no pueden ser futuras.", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
                mostrarDialogoFecha(); // Volver a mostrar el diálogo si las fechas no son válidas
            } else {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String fechaInicioStr = dateFormat.format(fechaInicio);
                String fechaFinStr = dateFormat.format(fechaFin);
                System.out.println("Fechas seleccionadas: " + fechaInicioStr + " a " + fechaFinStr);
            }
        } else {
            System.exit(0); // Salir del programa si el usuario cancela
        }
    }

    private String getFechasSeleccionadas() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fechaInicioStr = fechaInicio != null ? dateFormat.format(fechaInicio) : "No seleccionada";
        String fechaFinStr = fechaFin != null ? dateFormat.format(fechaFin) : "No seleccionada";
        return "Fecha de levantamiento de información : " + fechaInicioStr + " - " + fechaFinStr;
    }

    private void cargarDatos() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fechaInicioStr = dateFormat.format(fechaInicio);
        String fechaFinStr = dateFormat.format(fechaFin);

        ControladorDiscapacidad controlador = new ControladorDiscapacidad(table);
        controlador.cargarDatos(fechaInicioStr, fechaFinStr);

        imprimirButton.setEnabled(true); // Habilitar el botón de impresión después de cargar los datos
    }
    private void imprimir() {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        
       
        PageFormat pageFormat = printerJob.defaultPage();
        pageFormat.setOrientation(PageFormat.LANDSCAPE);
        
        
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return NO_SUCH_PAGE;
                }

                Graphics2D g2d = (Graphics2D) graphics;
                
                
                double scaleX = pageFormat.getImageableWidth() / getWidth();
                double scaleY = pageFormat.getImageableHeight() / getHeight();
                double scale = Math.min(scaleX, scaleY);

                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                g2d.scale(scale, scale);
                
               
                paint(g2d);

                return PAGE_EXISTS;
            }
        });

        boolean doPrint = printerJob.printDialog();
        if (doPrint) {
            
            imprimirButton.setVisible(false);
            try {
                printerJob.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
