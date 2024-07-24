/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 *
 * @author Jhony
 */
public class FrmImpresion extends javax.swing.JPanel implements Printable  {

    /**
     * Creates new form FrmImpresion
     */
    public FrmImpresion() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        LblNombreDocImprimir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LblCedulaDocImprimir = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        JlabelNom1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        LblFechaPacienteImprimir = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaDiagnosticoPacienteImprimir = new javax.swing.JTextArea();
        LblEdadPacienteImprimir = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        LblPacienteNombreImprimir = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(32, 65, 109));
        jSeparator1.setForeground(new java.awt.Color(19, 74, 164));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 104, 590, 10));

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 65, 109));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Departamento   Medico");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        LblNombreDocImprimir.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        LblNombreDocImprimir.setForeground(new java.awt.Color(32, 65, 109));
        LblNombreDocImprimir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(LblNombreDocImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 290, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logo x100.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 80));

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 65, 109));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Instituto  Superior  Universitario  Tecnólogico  del  Azuay");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 10, 370, -1));

        LblCedulaDocImprimir.setFont(new java.awt.Font("Maiandra GD", 1, 10)); // NOI18N
        LblCedulaDocImprimir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(LblCedulaDocImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 90, 40));

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel9.setText("Edad:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 120, 40, -1));

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel10.setText("Fecha:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel7.setText("Diagnóstico: ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel8.setText("Paciente: ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jPanel2.setBackground(new java.awt.Color(32, 65, 109));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/llamada-telefonica.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 40));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ubicacion-del-terreno.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 30, 40));

        jLabel13.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Padre  Aguirre  8-27.");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("   0985956631");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/url (1).png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, 70));

        jLabel18.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("   https://www.tecazuay.edu.ec/");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Cuenca   010104");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel21.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("   0967453341");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 630, 70));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/LOGO3.png"))); // NOI18N
        jLabel17.setText(" ");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, -10, 90, 110));

        JlabelNom1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        JlabelNom1.setForeground(new java.awt.Color(32, 65, 109));
        JlabelNom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlabelNom1.setText("Dr.");
        add(JlabelNom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 50, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 330, 10));

        LblFechaPacienteImprimir.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        add(LblFechaPacienteImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 100, 20));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 100, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 290, 10));

        TxtAreaDiagnosticoPacienteImprimir.setColumns(20);
        TxtAreaDiagnosticoPacienteImprimir.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        TxtAreaDiagnosticoPacienteImprimir.setLineWrap(true);
        TxtAreaDiagnosticoPacienteImprimir.setRows(5);
        TxtAreaDiagnosticoPacienteImprimir.setWrapStyleWord(true);
        TxtAreaDiagnosticoPacienteImprimir.setBorder(null);
        jScrollPane1.setViewportView(TxtAreaDiagnosticoPacienteImprimir);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 530, 510));

        LblEdadPacienteImprimir.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        add(LblEdadPacienteImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 100, 20));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 100, 10));

        LblPacienteNombreImprimir.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        add(LblPacienteNombreImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 290, 20));

        jLabel19.setFont(new java.awt.Font("Maiandra GD", 1, 11)); // NOI18N
        jLabel19.setText("Cedula   Profesional:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelNom1;
    private javax.swing.JLabel LblCedulaDocImprimir;
    private javax.swing.JLabel LblEdadPacienteImprimir;
    private javax.swing.JLabel LblFechaPacienteImprimir;
    private javax.swing.JLabel LblNombreDocImprimir;
    private javax.swing.JLabel LblPacienteNombreImprimir;
    private javax.swing.JTextArea TxtAreaDiagnosticoPacienteImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex==0) {
            Graphics2D graphics2d=(Graphics2D) graphics;
            graphics2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            printAll(graphics2d);
            return PAGE_EXISTS;
        }else{
            return NO_SUCH_PAGE;
        }
            
    }
}
