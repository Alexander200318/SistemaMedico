/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Controlador.ControladorDE;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class imprimirdocest extends JPanel {
    private final JTable table;
    private final JButton imprimirButton;

    public imprimirdocest() {
        
        setLayout(new BorderLayout());
        setBackground(java.awt.Color.WHITE);

        JPanel encabezadoPanel = new JPanel();
        encabezadoPanel.setLayout(new BorderLayout());
        encabezadoPanel.setBackground(java.awt.Color.WHITE);

        JLabel encabezado = new JLabel("Atención Médica Distribución por Tipo de Paciente", JLabel.CENTER);
        encabezado.setFont(new Font("Arial", Font.BOLD, 16));
        encabezado.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        encabezadoPanel.add(encabezado, BorderLayout.NORTH);

        JLabel subencabezado = new JLabel("Años: 2023, 2024", JLabel.CENTER);
        subencabezado.setFont(new Font("Arial", Font.ITALIC, 14));
        subencabezado.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        encabezadoPanel.add(subencabezado, BorderLayout.SOUTH);

        DefaultTableModel model = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Mes", "Docentes 2023", "Estudiantes 2023", "Docentes 2024", "Estudiantes 2024"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(model);
        table.setRowHeight(40);
        table.setFont(new Font("Arial", Font.PLAIN, 12));

        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);
        table.getColumnModel().getColumn(3).setPreferredWidth(150);
        table.getColumnModel().getColumn(4).setPreferredWidth(150);

        TableColumnModel columnModel = table.getColumnModel();
        TableColumn col0 = columnModel.getColumn(0);
        TableColumn col1 = columnModel.getColumn(1);
        TableColumn col2 = columnModel.getColumn(2);
        TableColumn col3 = columnModel.getColumn(3);
        TableColumn col4 = columnModel.getColumn(4);

        TableCellRenderer headerRenderer = new TableCellRenderer() {
            private final JLabel label = new JLabel();

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                label.setText(value == null ? "" : value.toString());
                label.setFont(new Font("Arial", Font.BOLD, 12));
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
                label.setOpaque(true);
                label.setBackground(java.awt.Color.WHITE);
                return label;
            }
        };

        col0.setHeaderRenderer(headerRenderer);
        col1.setHeaderRenderer(headerRenderer);
        col2.setHeaderRenderer(headerRenderer);
        col3.setHeaderRenderer(headerRenderer);
        col4.setHeaderRenderer(headerRenderer);

        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        table.getTableHeader().setDefaultRenderer(headerRenderer);
        table.getTableHeader().setOpaque(true);
        table.getTableHeader().setBackground(java.awt.Color.WHITE);

        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBackground(java.awt.Color.WHITE);

        tablePanel.add(table.getTableHeader(), BorderLayout.NORTH);
        tablePanel.add(table, BorderLayout.CENTER);

        imprimirButton = new JButton("Imprimir");
        imprimirButton.addActionListener(e -> imprimir());

        add(encabezadoPanel, BorderLayout.NORTH);
        add(tablePanel, BorderLayout.CENTER);
        add(imprimirButton, BorderLayout.SOUTH);

        cargarDatos();
    }

    private void cargarDatos() {
        ControladorDE controlador = new ControladorDE(table);
        controlador.cargarDatos();
        aplicarFormatoTotales();
    }

    private void aplicarFormatoTotales() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        if (rowCount > 0) {
            int lastRowIndex = rowCount - 1;
            for (int i = 0; i < table.getColumnCount(); i++) {
                table.getColumnModel().getColumn(i).setCellRenderer(new TableCellRenderer() {
                    private final JLabel label = new JLabel();

                    @Override
                    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                        label.setText(value == null ? "" : value.toString());
                        if (row == lastRowIndex) {
                            label.setFont(new Font("Arial", Font.BOLD, 12));
                        } else {
                            label.setFont(new Font("Arial", Font.PLAIN, 12));
                        }
                        label.setHorizontalAlignment(JLabel.CENTER);
                        label.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
                        label.setOpaque(true);
                        label.setBackground(java.awt.Color.WHITE);
                        return label;
                    }
                });
            }
        }
    }

    private void imprimir() {
    PrinterJob printerJob = PrinterJob.getPrinterJob();
    printerJob.setPrintable(new Printable() {
        @Override
        public int print(Graphics g, PageFormat pageFormat, int pageIndex) throws PrinterException {
            if (pageIndex != 0) {
                return NO_SUCH_PAGE;
            }
            
            Graphics2D g2d = (Graphics2D) g;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            g2d.scale(0.75, 0.75); // Escalar el contenido (ajustar según sea necesario)

            // Dibujar el panel en el gráfico
            printAll(g2d);
            return PAGE_EXISTS;
        }
    });
    
    // Mostrar el diálogo de impresión
    boolean printAccepted = printerJob.printDialog();
    if (printAccepted) {
        try {
            // Ocultar el botón de impresión
            imprimirButton.setVisible(false);
            printerJob.print();
        } catch (PrinterException e) {
            e.printStackTrace();
            System.err.println("Error durante la impresión: " + e.getMessage());
        }
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
