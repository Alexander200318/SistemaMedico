/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import controlador_Vist.Panel_Prin_PacienteDAO;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author alexa
 */
public class PANEL_PRINCIPAL_PACIENTE extends javax.swing.JPanel {

    Panel_Prin_PacienteDAO control;
    public PANEL_PRINCIPAL_PACIENTE() {
        initComponents();
        control =new Panel_Prin_PacienteDAO(this);
    }

    public JButton getBtn_NuevoPaciente() {
        return Btn_NuevoPaciente;
    }

    public void setBtn_NuevoPaciente(JButton Btn_NuevoPaciente) {
        this.Btn_NuevoPaciente = Btn_NuevoPaciente;
    }

    public JPanel getPanel_camb_Registro() {
        return Panel_camb_Registro;
    }

    public void setPanel_camb_Registro(JPanel Panel_camb_Registro) {
        this.Panel_camb_Registro = Panel_camb_Registro;
    }

    public JButton getBtnBuscar() {
        return BtnBuscar;
    }

    public void setBtnBuscar(JButton BtnBuscar) {
        this.BtnBuscar = BtnBuscar;
    }

    public JTable getTablaDatosPaciente() {
        return TablaDatosPaciente;
    }

    public void setTablaDatosPaciente(JTable TablaDatosPaciente) {
        this.TablaDatosPaciente = TablaDatosPaciente;
    }

    public JTextField getTxtIngresarNombreOCedula() {
        return TxtIngresarNombreOCedula;
    }

    public void setTxtIngresarNombreOCedula(JTextField TxtIngresarNombreOCedula) {
        this.TxtIngresarNombreOCedula = TxtIngresarNombreOCedula;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_camb_Registro = new javax.swing.JPanel();
        panelRound4 = new Modelo.PanelRound();
        TxtIngresarNombreOCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        panelRound5 = new Modelo.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatosPaciente = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        Btn_NuevoPaciente = new javax.swing.JButton();

        setBackground(new java.awt.Color(32, 65, 109));

        Panel_camb_Registro.setBackground(new java.awt.Color(255, 255, 255));
        Panel_camb_Registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N
        panelRound4.setRoundBottomLeft(20);
        panelRound4.setRoundBottomRight(20);
        panelRound4.setRoundTopLeft(20);
        panelRound4.setRoundTopRight(20);
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtIngresarNombreOCedula.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        TxtIngresarNombreOCedula.setBorder(null);
        TxtIngresarNombreOCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIngresarNombreOCedulaActionPerformed(evt);
            }
        });
        panelRound4.add(TxtIngresarNombreOCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 370, 30));

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel1.setText("Ingresa el nombre o la cedula:");
        panelRound4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 30));

        BtnBuscar.setBackground(new java.awt.Color(64, 172, 159));
        BtnBuscar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setText("BUSCAR");
        panelRound4.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 140, 30));
        panelRound4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 370, 20));

        Panel_camb_Registro.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 870, 90));

        panelRound5.setBackground(new java.awt.Color(255, 255, 255));
        panelRound5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO DE PACIENTES EXISTENTES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Maiandra GD", 1, 18), new java.awt.Color(32, 65, 109))); // NOI18N
        panelRound5.setRoundBottomLeft(20);
        panelRound5.setRoundBottomRight(20);
        panelRound5.setRoundTopLeft(20);
        panelRound5.setRoundTopRight(20);
        panelRound5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaDatosPaciente.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        TablaDatosPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "APELLIDO", "SEXO", "CELULAR", "DIRECCIÓN"
            }
        ));
        jScrollPane1.setViewportView(TablaDatosPaciente);

        panelRound5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 1070, 360));
        panelRound5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1130, 10));

        Panel_camb_Registro.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1130, 430));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 0, 12))); // NOI18N

        Btn_NuevoPaciente.setBackground(new java.awt.Color(64, 172, 159));
        Btn_NuevoPaciente.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        Btn_NuevoPaciente.setForeground(new java.awt.Color(255, 255, 255));
        Btn_NuevoPaciente.setText("Registra Paciente");
        Btn_NuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Btn_NuevoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Btn_NuevoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Panel_camb_Registro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 32, 240, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Panel_camb_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 1222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Panel_camb_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_NuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_NuevoPacienteActionPerformed

    private void TxtIngresarNombreOCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIngresarNombreOCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIngresarNombreOCedulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton Btn_NuevoPaciente;
    private javax.swing.JPanel Panel_camb_Registro;
    private javax.swing.JTable TablaDatosPaciente;
    private javax.swing.JTextField TxtIngresarNombreOCedula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private Modelo.PanelRound panelRound4;
    private Modelo.PanelRound panelRound5;
    // End of variables declaration//GEN-END:variables
}
