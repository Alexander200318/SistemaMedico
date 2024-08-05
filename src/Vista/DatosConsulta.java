/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import controlador_Vist.DatosConsultaHistorial;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Jhony
 */
public class DatosConsulta extends javax.swing.JPanel {

    DatosConsultaHistorial control;
    public DatosConsulta() {
        initComponents();
        control=new DatosConsultaHistorial(this);
    }

    public JRadioButton getBtnNoAplica() {
        return btnNoAplica;
    }

    public void setBtnNoAplica(JRadioButton btnNoAplica) {
        this.btnNoAplica = btnNoAplica;
    }

    public JTextField getTxt_CIE() {
        return txt_CIE;
    }

    public void setTxt_CIE(JTextField txt_CIE) {
        this.txt_CIE = txt_CIE;
    }
    

    public JRadioButton getBtnDefinitivo() {
        return btnDefinitivo;
    }

    public void setBtnDefinitivo(JRadioButton btnDefinitivo) {
        this.btnDefinitivo = btnDefinitivo;
    }

    public JRadioButton getBtnPresuntivo() {
        return btnPresuntivo;
    }

    public void setBtnPresuntivo(JRadioButton btnPresuntivo) {
        this.btnPresuntivo = btnPresuntivo;
    }

    public JRadioButton getBtnSiAplica() {
        return btnSiAplica;
    }

    public void setBtnSiAplica(JRadioButton btnSiAplica) {
        this.btnSiAplica = btnSiAplica;
    }

    public JTextArea getTxtAreaDiagnostico() {
        return txtAreaDiagnostico;
    }

    public void setTxtAreaDiagnostico(JTextArea txtAreaDiagnostico) {
        this.txtAreaDiagnostico = txtAreaDiagnostico;
    }

    public JTextArea getTxtAreaExComplemetario() {
        return txtAreaExComplemetario;
    }

    public void setTxtAreaExComplemetario(JTextArea txtAreaExComplemetario) {
        this.txtAreaExComplemetario = txtAreaExComplemetario;
    }

    public JTextArea getTxtAreaInstrucciones() {
        return txtAreaInstrucciones;
    }

    public void setTxtAreaInstrucciones(JTextArea txtAreaInstrucciones) {
        this.txtAreaInstrucciones = txtAreaInstrucciones;
    }

    public JTextArea getTxtAreaPlanTrat() {
        return txtAreaPlanTrat;
    }

    public void setTxtAreaPlanTrat(JTextArea txtAreaPlanTrat) {
        this.txtAreaPlanTrat = txtAreaPlanTrat;
    }

    public JTextArea getTxtNotasConsulta() {
        return txtNotasConsulta;
    }

    public void setTxtNotasConsulta(JTextArea txtNotasConsulta) {
        this.txtNotasConsulta = txtNotasConsulta;
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaInstrucciones = new javax.swing.JTextArea();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        txtAreaDiagnostico = new javax.swing.JTextArea();
        btnDefinitivo = new javax.swing.JRadioButton();
        btnPresuntivo = new javax.swing.JRadioButton();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator34 = new javax.swing.JSeparator();
        lblFrecRespiratoria18 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        txt_CIE = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaPlanTrat = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        txtAreaExComplemetario = new javax.swing.JTextArea();
        btnSiAplica = new javax.swing.JRadioButton();
        jSeparator48 = new javax.swing.JSeparator();
        btnNoAplica = new javax.swing.JRadioButton();
        jSeparator49 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotasConsulta = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIAGNÓSTICO Y TRATAMIENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INSTRUCCIONES MÉDICAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaInstrucciones.setEditable(false);
        txtAreaInstrucciones.setColumns(20);
        txtAreaInstrucciones.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAreaInstrucciones.setLineWrap(true);
        txtAreaInstrucciones.setRows(5);
        txtAreaInstrucciones.setWrapStyleWord(true);
        txtAreaInstrucciones.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(txtAreaInstrucciones);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 100));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIAGNÓSTICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaDiagnostico.setEditable(false);
        txtAreaDiagnostico.setColumns(20);
        txtAreaDiagnostico.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAreaDiagnostico.setLineWrap(true);
        txtAreaDiagnostico.setRows(5);
        txtAreaDiagnostico.setWrapStyleWord(true);
        txtAreaDiagnostico.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane24.setViewportView(txtAreaDiagnostico);

        jPanel17.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, 150));

        buttonGroup1.add(btnDefinitivo);
        btnDefinitivo.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnDefinitivo.setText("D. Definitivo");
        jPanel17.add(btnDefinitivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        buttonGroup1.add(btnPresuntivo);
        btnPresuntivo.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnPresuntivo.setText("D. Presuntivo");
        jPanel17.add(btnPresuntivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));
        jPanel17.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 110, 10));
        jPanel17.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 10));

        lblFrecRespiratoria18.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria18.setText("CIE-10");
        jPanel17.add(lblFrecRespiratoria18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 50, 20));
        jPanel17.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 100, 10));

        txt_CIE.setEditable(false);
        txt_CIE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CIE.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel17.add(txt_CIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 100, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PLAN DE TRATAMIENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaPlanTrat.setEditable(false);
        txtAreaPlanTrat.setColumns(20);
        txtAreaPlanTrat.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAreaPlanTrat.setLineWrap(true);
        txtAreaPlanTrat.setRows(5);
        txtAreaPlanTrat.setWrapStyleWord(true);
        txtAreaPlanTrat.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(txtAreaPlanTrat);

        jPanel9.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 160));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXÁMEN COMPLEMENTARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaExComplemetario.setEditable(false);
        txtAreaExComplemetario.setColumns(20);
        txtAreaExComplemetario.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAreaExComplemetario.setLineWrap(true);
        txtAreaExComplemetario.setRows(5);
        txtAreaExComplemetario.setWrapStyleWord(true);
        txtAreaExComplemetario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane23.setViewportView(txtAreaExComplemetario);

        jPanel11.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 290, 130));

        buttonGroup2.add(btnSiAplica);
        btnSiAplica.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnSiAplica.setText("Aplica");
        jPanel11.add(btnSiAplica, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel11.add(jSeparator48, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 90, 10));

        buttonGroup2.add(btnNoAplica);
        btnNoAplica.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnNoAplica.setText("No Aplica");
        jPanel11.add(btnNoAplica, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));
        jPanel11.add(jSeparator49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 90, 10));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Motivo de consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNotasConsulta.setEditable(false);
        txtNotasConsulta.setColumns(20);
        txtNotasConsulta.setRows(5);
        txtNotasConsulta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(txtNotasConsulta);

        jPanel12.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 33, 640, 60));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnDefinitivo;
    private javax.swing.JRadioButton btnNoAplica;
    private javax.swing.JRadioButton btnPresuntivo;
    private javax.swing.JRadioButton btnSiAplica;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JSeparator jSeparator49;
    private javax.swing.JLabel lblFrecRespiratoria18;
    private javax.swing.JTextArea txtAreaDiagnostico;
    private javax.swing.JTextArea txtAreaExComplemetario;
    private javax.swing.JTextArea txtAreaInstrucciones;
    private javax.swing.JTextArea txtAreaPlanTrat;
    private javax.swing.JTextArea txtNotasConsulta;
    private javax.swing.JTextField txt_CIE;
    // End of variables declaration//GEN-END:variables
}
