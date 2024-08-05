package Vista;

import Controlador.ControladorFM;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import javax.swing.BorderFactory;


public class imprimirsexo extends JPanel  {
    private JTable table;
    private JButton imprimirButton;

public imprimirsexo() {
    
       setLayout(new BorderLayout());
    setBackground(java.awt.Color.WHITE);

    JPanel encabezadoPanel = new JPanel();
    encabezadoPanel.setLayout(new BorderLayout());
    encabezadoPanel.setBackground(java.awt.Color.WHITE);

    JLabel encabezado = new JLabel("Atención Médica Distribución por Sexo", JLabel.CENTER);
    encabezado.setFont(new Font("Arial", Font.BOLD, 16));
    encabezado.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
    encabezadoPanel.add(encabezado, BorderLayout.NORTH);

    JLabel subencabezado = new JLabel("Años: 2023, 2024", JLabel.CENTER);
    subencabezado.setFont(new Font("Arial", Font.ITALIC, 14));
    subencabezado.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
    encabezadoPanel.add(subencabezado, BorderLayout.SOUTH);

    DefaultTableModel model = new DefaultTableModel(
        new Object[][]{},
        new Object[]{"Mes", "Hombres 2023", "Mujeres 2023", "Hombres 2024", "Mujeres 2024"}
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
    ControladorFM controlador = new ControladorFM(this, table);
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
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(595, 842));
        setMinimumSize(new java.awt.Dimension(595, 842));
        setName("[0,0]"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logo x100.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
