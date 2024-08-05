/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Controlador.ControladorDiscapacidad;
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
import javax.swing.table.TableColumnModel;

public class impresiondiscapacidad extends JPanel {
    private final JTable table;
    private final JButton imprimirButton;

    public impresiondiscapacidad() {
        setLayout(new BorderLayout());
        setBackground(java.awt.Color.WHITE);

       
        JPanel encabezadoPanel = new JPanel();
        encabezadoPanel.setLayout(new BorderLayout());
        encabezadoPanel.setBackground(java.awt.Color.WHITE);

        
        JLabel encabezado = new JLabel("MATRIZ DE ACTORES EDUCATIVOS CON DISCAPACIDAD", JLabel.CENTER);
        encabezado.setFont(new Font("Arial", Font.BOLD, 16));
        encabezado.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

       
        JLabel medicoResponsable = new JLabel("Médico Responsable: _____________________", JLabel.CENTER);
        medicoResponsable.setFont(new Font("Arial", Font.PLAIN, 12));
        medicoResponsable.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));

        
        encabezadoPanel.add(encabezado, BorderLayout.NORTH);
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
                textArea.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
                textArea.setOpaque(true);
                textArea.setBackground(java.awt.Color.WHITE);
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
        table.getTableHeader().setBackground(java.awt.Color.WHITE);

      
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBackground(java.awt.Color.WHITE);

        tablePanel.add(table.getTableHeader(), BorderLayout.NORTH);
        tablePanel.add(table, BorderLayout.CENTER);

        
        JPanel firmaPanel = new JPanel();
        firmaPanel.setLayout(new GridLayout(3, 1));
        firmaPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        firmaPanel.setBackground(java.awt.Color.WHITE);

     
        JLabel firmaLabel = new JLabel("Firma: ________________________", JLabel.LEFT);
        JLabel nombreLabel = new JLabel("Nombre: ___________________________", JLabel.LEFT);
        JLabel cedulaLabel = new JLabel("Cédula: ______________________", JLabel.LEFT);

        firmaLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        nombreLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        cedulaLabel.setFont(new Font("Arial", Font.PLAIN, 12));

        firmaPanel.add(firmaLabel);
        firmaPanel.add(nombreLabel);
        firmaPanel.add(cedulaLabel);

        imprimirButton = new JButton("Imprimir");
        imprimirButton.addActionListener(e -> imprimir());

        add(encabezadoPanel, BorderLayout.NORTH);
        add(tablePanel, BorderLayout.CENTER);
        add(firmaPanel, BorderLayout.SOUTH);
        add(imprimirButton, BorderLayout.SOUTH);

        cargarDatos();
    }

    private void cargarDatos() {
        String fechaInicio = JOptionPane.showInputDialog(this, "Ingrese la fecha de levantamiento de inicio (Año-Mes-Día):");
        String fechaFin = JOptionPane.showInputDialog(this, "Ingrese la fecha de levantamiento de fin (Año-Mes-Día):");

        if (fechaInicio != null && fechaFin != null) {
            ControladorDiscapacidad controlador = new ControladorDiscapacidad(table);
            controlador.cargarDatos(fechaInicio, fechaFin);
        } else {
            JOptionPane.showMessageDialog(this, "Fechas inválidas. No se cargaron los datos.");
        }
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
