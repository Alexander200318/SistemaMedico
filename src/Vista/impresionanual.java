/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;
import Controlador.Controladoranual;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class impresionanual extends JPanel {
    private final JTable table;
    private final JButton imprimirButton;

    public impresionanual() {
        
        setLayout(new BorderLayout());
        setBackground(java.awt.Color.WHITE);

        JPanel encabezadoPanel = new JPanel();
        encabezadoPanel.setLayout(new BorderLayout());
        encabezadoPanel.setBackground(java.awt.Color.WHITE);

        JLabel encabezado = new JLabel("Atención Médica Distribución por Año", JLabel.CENTER);
        encabezado.setFont(new Font("Arial", Font.BOLD, 16));
        encabezado.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        encabezadoPanel.add(encabezado, BorderLayout.NORTH);

        JLabel subencabezado = new JLabel("Años: 2023, 2024", JLabel.CENTER);
        subencabezado.setFont(new Font("Arial", Font.ITALIC, 14));
        subencabezado.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        encabezadoPanel.add(subencabezado, BorderLayout.SOUTH);

        DefaultTableModel model = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Mes", "Consultas 2023", "Consultas 2024"}
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

        TableColumnModel columnModel = table.getColumnModel();
        TableColumn col0 = columnModel.getColumn(0);
        TableColumn col1 = columnModel.getColumn(1);
        TableColumn col2 = columnModel.getColumn(2);

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
        Controladoranual controlador = new Controladoranual(table);
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
                            label.setFont(label.getFont().deriveFont(Font.BOLD));
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
            g2d.scale(0.75, 0.75); 

            
            printAll(g2d);
            return PAGE_EXISTS;
        }
    });
    
   
    boolean printAccepted = printerJob.printDialog();
    if (printAccepted) {
        try {
           
            imprimirButton.setVisible(false);
            printerJob.print();
        } catch (PrinterException e) {
            e.printStackTrace();
            System.err.println("Error durante la impresión: " + e.getMessage());
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
