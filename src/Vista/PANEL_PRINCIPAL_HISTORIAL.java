/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import controlador_Vist.Panel_Prin_HistorialDAO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author alexa
 */
public class PANEL_PRINCIPAL_HISTORIAL extends javax.swing.JPanel {

    Panel_Prin_HistorialDAO contr;
    public PANEL_PRINCIPAL_HISTORIAL() {
       
        initComponents();
         contr=new Panel_Prin_HistorialDAO(this);
    }

    public JButton getBtn_Buscar_Hist() {
        return Btn_Buscar_Hist;
    }

    public void setBtn_Buscar_Hist(JButton Btn_Buscar_Hist) {
        this.Btn_Buscar_Hist = Btn_Buscar_Hist;
    }


    public JButton getBtn_Limpiar_Hist() {
        return Btn_Limpiar_Hist;
    }

    public void setBtn_Limpiar_Hist(JButton Btn_Limpiar_Hist) {
        this.Btn_Limpiar_Hist = Btn_Limpiar_Hist;
    }

    public JComboBox<String> getCbx_Sexo_Hist() {
        return Cbx_Sexo_Hist;
    }

    public void setCbx_Sexo_Hist(JComboBox<String> Cbx_Sexo_Hist) {
        this.Cbx_Sexo_Hist = Cbx_Sexo_Hist;
    }

    public JComboBox<String> getCbx_Triage_Hist() {
        return Cbx_Triage_Hist;
    }

    public void setCbx_Triage_Hist(JComboBox<String> Cbx_Triage_Hist) {
        this.Cbx_Triage_Hist = Cbx_Triage_Hist;
    }

    public JDateChooser getFecha_Calendario_final() {
        return Fecha_Calendario_final;
    }

    public void setFecha_Calendario_final(JDateChooser Fecha_Calendario_final) {
        this.Fecha_Calendario_final = Fecha_Calendario_final;
    }

    public JDateChooser getFecha_Calendario_inicial() {
        return Fecha_Calendario_inicial;
    }

    public void setFecha_Calendario_inicial(JDateChooser Fecha_Calendario_inicial) {
        this.Fecha_Calendario_inicial = Fecha_Calendario_inicial;
    }

    public JTextField getTxt_Apellido_Hist() {
        return Txt_Apellido_Hist;
    }

    public void setTxt_Apellido_Hist(JTextField Txt_Apellido_Hist) {
        this.Txt_Apellido_Hist = Txt_Apellido_Hist;
    }

    public JTextField getTxt_Nombres_Hist() {
        return Txt_Nombres_Hist;
    }

    public void setTxt_Nombres_Hist(JTextField Txt_Nombres_Hist) {
        this.Txt_Nombres_Hist = Txt_Nombres_Hist;
    }

    public JTable getTabla_Historial() {
        return tabla_Historial;
    }

    public void setTabla_Historial(JTable tabla_Historial) {
        this.tabla_Historial = tabla_Historial;
    }

    public JTextField getTxt_Cedula_Hist() {
        return Txt_Cedula_Hist;
    }

    public void setTxt_Cedula_Hist(JTextField Txt_Cedula_Hist) {
        this.Txt_Cedula_Hist = Txt_Cedula_Hist;
    }
//////////////////////////////////

    public JButton getBtnreporte() {
        return btnreporte;
    }

    public void setBtnreporte(JButton btnreporte) {
        this.btnreporte = btnreporte;
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Modelo.PanelRound();
        Txt_Cedula_Hist = new javax.swing.JTextField();
        Cbx_Triage_Hist = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnreporte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Fecha_Calendario_inicial = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fecha_Calendario_final = new com.toedter.calendar.JDateChooser();
        Txt_Apellido_Hist = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Cbx_Sexo_Hist = new javax.swing.JComboBox<>();
        Txt_Nombres_Hist = new javax.swing.JTextField();
        Btn_Limpiar_Hist = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        Btn_Buscar_Hist = new javax.swing.JButton();
        panelRound2 = new Modelo.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Historial = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HISTORIAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txt_Cedula_Hist.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        Txt_Cedula_Hist.setBorder(null);
        Txt_Cedula_Hist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Cedula_HistActionPerformed(evt);
            }
        });
        panelRound1.add(Txt_Cedula_Hist, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 220, 20));

        Cbx_Triage_Hist.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        Cbx_Triage_Hist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "No prioritario", "Prioritario", "Emergencia" }));
        Cbx_Triage_Hist.setBorder(null);
        panelRound1.add(Cbx_Triage_Hist, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 68, 200, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel2.setText("Categoría Triage");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 40, 120, -1));

        btnreporte.setBackground(new java.awt.Color(64, 172, 159));
        btnreporte.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnreporte.setText("REPORTES");
        btnreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });
        panelRound1.add(btnreporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 120, 110, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel1.setText("Ingresa el número de Identificación:");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        Fecha_Calendario_inicial.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        panelRound1.add(Fecha_Calendario_inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 190, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel3.setText("Ingrese la fecha Inicial");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel4.setText("Ingrese la fecha Final");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, 30));

        Fecha_Calendario_final.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        panelRound1.add(Fecha_Calendario_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 200, 30));

        Txt_Apellido_Hist.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        Txt_Apellido_Hist.setBorder(null);
        panelRound1.add(Txt_Apellido_Hist, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 220, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel5.setText("Apellidos:");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 100, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel6.setText("Nombres:");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 100, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel7.setText("Sexo:");
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 70, -1));

        Cbx_Sexo_Hist.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        Cbx_Sexo_Hist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Masxulito ", "Femenino" }));
        Cbx_Sexo_Hist.setBorder(null);
        panelRound1.add(Cbx_Sexo_Hist, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 68, 200, -1));

        Txt_Nombres_Hist.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        Txt_Nombres_Hist.setBorder(null);
        Txt_Nombres_Hist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Nombres_HistActionPerformed(evt);
            }
        });
        panelRound1.add(Txt_Nombres_Hist, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 220, 20));

        Btn_Limpiar_Hist.setBackground(new java.awt.Color(64, 172, 159));
        Btn_Limpiar_Hist.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        Btn_Limpiar_Hist.setText("LIMPIAR");
        panelRound1.add(Btn_Limpiar_Hist, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 130, 30));
        panelRound1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 220, 10));
        panelRound1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, 10));
        panelRound1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 220, 10));
        panelRound1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 90, 200, 10));
        panelRound1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 200, 10));
        panelRound1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 200, 20));
        panelRound1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 190, 20));

        Btn_Buscar_Hist.setBackground(new java.awt.Color(64, 172, 159));
        Btn_Buscar_Hist.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        Btn_Buscar_Hist.setText("BUSCAR");
        panelRound1.add(Btn_Buscar_Hist, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 140, 30));

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DE HISTORIAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_Historial.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        tabla_Historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Identificación", "Nombres", "Sexo", "Fecha Consulta", "Doctor ", "Diagnóstico", "Nivel"
            }
        ));
        tabla_Historial.setDoubleBuffered(true);
        jScrollPane1.setViewportView(tabla_Historial);

        panelRound2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 28, 1200, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_Cedula_HistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Cedula_HistActionPerformed

    }//GEN-LAST:event_Txt_Cedula_HistActionPerformed

    private void Txt_Nombres_HistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Nombres_HistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Nombres_HistActionPerformed

    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnreporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Buscar_Hist;
    private javax.swing.JButton Btn_Limpiar_Hist;
    private javax.swing.JComboBox<String> Cbx_Sexo_Hist;
    private javax.swing.JComboBox<String> Cbx_Triage_Hist;
    private com.toedter.calendar.JDateChooser Fecha_Calendario_final;
    private com.toedter.calendar.JDateChooser Fecha_Calendario_inicial;
    private javax.swing.JTextField Txt_Apellido_Hist;
    private javax.swing.JTextField Txt_Cedula_Hist;
    private javax.swing.JTextField Txt_Nombres_Hist;
    private javax.swing.JButton btnreporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private Modelo.PanelRound panelRound1;
    private Modelo.PanelRound panelRound2;
    private javax.swing.JTable tabla_Historial;
    // End of variables declaration//GEN-END:variables
}
