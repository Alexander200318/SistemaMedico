/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import controlador_Vist.Panel_DatosHistorial;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author mauca
 */
public class PanelDatosHISTORIAL extends javax.swing.JPanel {

    Panel_DatosHistorial contro;
    public PanelDatosHISTORIAL() {
        initComponents();
        contro=new Panel_DatosHistorial(this);
    }

    public JTable getTBLDatReport() {
        return TBLDatReport;
    }

    public void setTBLDatReport(JTable TBLDatReport) {
        this.TBLDatReport = TBLDatReport;
    }

    public JButton getBtnSeleccionarConsulta() {
        return BtnSeleccionarConsulta;
    }

    public void setBtnSeleccionarConsulta(JButton BtnSeleccionarConsulta) {
        this.BtnSeleccionarConsulta = BtnSeleccionarConsulta;
    }

    public JButton getBtnSeleccionarTriage() {
        return BtnSeleccionarTriage;
    }

    public void setBtnSeleccionarTriage(JButton BtnSeleccionarTriage) {
        this.BtnSeleccionarTriage = BtnSeleccionarTriage;
    }
    
    

    public JPanel getPnl_Cambio_Datos_Hist() {
        return Pnl_Cambio_Datos_Hist;
    }

    public void setPnl_Cambio_Datos_Hist(JPanel Pnl_Cambio_Datos_Hist) {
        this.Pnl_Cambio_Datos_Hist = Pnl_Cambio_Datos_Hist;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PNLReporte = new javax.swing.JPanel();
        PNLIdentifiReport = new javax.swing.JPanel();
        JLbCedulaIngreRepor = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        TxtCedBuscarReport = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        JLbCedulaIngreRepor1 = new javax.swing.JLabel();
        BtnBuscarReport = new javax.swing.JButton();
        BtnBuscarReport1 = new javax.swing.JButton();
        PNLDatosReport = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLDatReport = new javax.swing.JTable();
        Pnl_Cambio_Datos_Hist = new javax.swing.JPanel();
        BtnSeleccionarConsulta = new javax.swing.JButton();
        BtnSeleccionarTriage = new javax.swing.JButton();
        JLbCedulaIngreRepor2 = new javax.swing.JLabel();
        TxtCedBuscarReport1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1280, 680));
        setMinimumSize(new java.awt.Dimension(1280, 680));
        setPreferredSize(new java.awt.Dimension(1280, 680));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PNLReporte.setBackground(new java.awt.Color(255, 255, 255));
        PNLReporte.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historial Paciente                                     ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Maiandra GD", 1, 24))); // NOI18N
        PNLReporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PNLIdentifiReport.setBackground(new java.awt.Color(255, 255, 255));
        PNLIdentifiReport.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        PNLIdentifiReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLbCedulaIngreRepor.setFont(new java.awt.Font("Neue Haas Grotesk Text Pro", 1, 16)); // NOI18N
        JLbCedulaIngreRepor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLbCedulaIngreRepor.setText("Motivo:");
        PNLIdentifiReport.add(JLbCedulaIngreRepor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, -1));
        PNLIdentifiReport.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 290, 10));

        TxtCedBuscarReport.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        TxtCedBuscarReport.setBorder(null);
        PNLIdentifiReport.add(TxtCedBuscarReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 290, 20));
        PNLIdentifiReport.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, -1));
        PNLIdentifiReport.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 140, -1));

        JLbCedulaIngreRepor1.setFont(new java.awt.Font("Neue Haas Grotesk Text Pro", 1, 16)); // NOI18N
        JLbCedulaIngreRepor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLbCedulaIngreRepor1.setText("Ingrese la cédula:");
        PNLIdentifiReport.add(JLbCedulaIngreRepor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, -1));

        BtnBuscarReport.setBackground(new java.awt.Color(64, 172, 159));
        BtnBuscarReport.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        BtnBuscarReport.setText("Limpiar");
        BtnBuscarReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarReportActionPerformed(evt);
            }
        });
        PNLIdentifiReport.add(BtnBuscarReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 110, -1));

        BtnBuscarReport1.setBackground(new java.awt.Color(64, 172, 159));
        BtnBuscarReport1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        BtnBuscarReport1.setText("BUSCAR");
        BtnBuscarReport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarReport1ActionPerformed(evt);
            }
        });
        PNLIdentifiReport.add(BtnBuscarReport1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 110, -1));

        PNLReporte.add(PNLIdentifiReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 400, 170));

        PNLDatosReport.setBackground(new java.awt.Color(255, 255, 255));
        PNLDatosReport.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N
        PNLDatosReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLDatReport.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        TBLDatReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "FECHA", "MOTIVO", "NIVEL PRIORIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TBLDatReport);

        PNLDatosReport.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 420, 360));

        PNLReporte.add(PNLDatosReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 450, 410));

        Pnl_Cambio_Datos_Hist.setBackground(new java.awt.Color(255, 255, 255));
        Pnl_Cambio_Datos_Hist.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N

        javax.swing.GroupLayout Pnl_Cambio_Datos_HistLayout = new javax.swing.GroupLayout(Pnl_Cambio_Datos_Hist);
        Pnl_Cambio_Datos_Hist.setLayout(Pnl_Cambio_Datos_HistLayout);
        Pnl_Cambio_Datos_HistLayout.setHorizontalGroup(
            Pnl_Cambio_Datos_HistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        Pnl_Cambio_Datos_HistLayout.setVerticalGroup(
            Pnl_Cambio_Datos_HistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        PNLReporte.add(Pnl_Cambio_Datos_Hist, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 700, 590));

        BtnSeleccionarConsulta.setBackground(new java.awt.Color(64, 172, 159));
        BtnSeleccionarConsulta.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        BtnSeleccionarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarConsultaActionPerformed(evt);
            }
        });
        PNLReporte.add(BtnSeleccionarConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 50, 40));

        BtnSeleccionarTriage.setBackground(new java.awt.Color(64, 172, 159));
        BtnSeleccionarTriage.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        BtnSeleccionarTriage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarTriageActionPerformed(evt);
            }
        });
        PNLReporte.add(BtnSeleccionarTriage, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 50, 40));

        JLbCedulaIngreRepor2.setFont(new java.awt.Font("Neue Haas Grotesk Text Pro", 1, 14)); // NOI18N
        JLbCedulaIngreRepor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLbCedulaIngreRepor2.setText("Nombre Paciente:");
        PNLReporte.add(JLbCedulaIngreRepor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, -1));

        TxtCedBuscarReport1.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        TxtCedBuscarReport1.setBorder(null);
        PNLReporte.add(TxtCedBuscarReport1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 350, 20));
        PNLReporte.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 350, 10));

        add(PNLReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 1200, 650));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo Login.png"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 0, 1960, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarReportActionPerformed

    private void BtnBuscarReport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarReport1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarReport1ActionPerformed

    private void BtnSeleccionarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSeleccionarConsultaActionPerformed

    private void BtnSeleccionarTriageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarTriageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSeleccionarTriageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarReport;
    private javax.swing.JButton BtnBuscarReport1;
    private javax.swing.JButton BtnSeleccionarConsulta;
    private javax.swing.JButton BtnSeleccionarTriage;
    private javax.swing.JLabel Fondo;
    public javax.swing.JLabel JLbCedulaIngreRepor;
    public javax.swing.JLabel JLbCedulaIngreRepor1;
    public javax.swing.JLabel JLbCedulaIngreRepor2;
    private javax.swing.JPanel PNLDatosReport;
    private javax.swing.JPanel PNLIdentifiReport;
    private javax.swing.JPanel PNLReporte;
    private javax.swing.JPanel Pnl_Cambio_Datos_Hist;
    private javax.swing.JTable TBLDatReport;
    public javax.swing.JTextField TxtCedBuscarReport;
    public javax.swing.JTextField TxtCedBuscarReport1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
