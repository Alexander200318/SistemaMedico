/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import controlador_Vist.Registro_PacienteDAO;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author alexa
 */
public class REGISTRO_PACIENTE extends javax.swing.JPanel {

    Registro_PacienteDAO control;
    public REGISTRO_PACIENTE() {
        initComponents();
        control=new Registro_PacienteDAO(this);
    }
    ///////////////////////////////////////////////////  TEXT
    public JTextField getText_Apellido_pac() {

        return text_Apellido_pac;
    }

    public void setText_Apellido_pac(JTextField text_Apellido_pac) {
        this.text_Apellido_pac = text_Apellido_pac;
    }

    public JTextField getText_Canton_pac() {
        return text_Canton_pac;
    }

    public void setText_Canton_pac(JTextField text_Canton_pac) {
        this.text_Canton_pac = text_Canton_pac;
    }

    public JTextField getText_Cedula_pac() {
        return text_Cedula_pac;
    }

    public void setText_Cedula_pac(JTextField text_Cedula_pac) {
        this.text_Cedula_pac = text_Cedula_pac;
    }

    public JTextField getText_Direccion_pac() {
        return text_Direccion_pac;
    }

    public void setText_Direccion_pac(JTextField text_Direccion_pac) {
        this.text_Direccion_pac = text_Direccion_pac;
    }

    public JTextField getText_Direcion_pac() {
        return text_Direcion_pac;
    }

    public void setText_Direcion_pac(JTextField text_Direcion_pac) {
        this.text_Direcion_pac = text_Direcion_pac;
    }

    public JTextField getText_Nombre_pac() {
        return text_Nombre_pac;
    }

    public void setText_Nombre_pac(JTextField text_Nombre_pac) {
        this.text_Nombre_pac = text_Nombre_pac;
    }

    public JTextField getText_Pais_pac() {
        return text_Pais_pac;
    }

    public void setText_Pais_pac(JTextField text_Pais_pac) {
        this.text_Pais_pac = text_Pais_pac;
    }

    public JTextField getText_Telefono_pac() {
        return text_Telefono_pac;
    }

    
    public void setText_Telefono_pac(JTextField text_Telefono_pac) {
        this.text_Telefono_pac = text_Telefono_pac;
    }

    ///////////////////////////////////////////////////
    
    //////////////////////////////////////////////// BOTONES

    public JButton getBtn_Guardar_pac() {
        return Btn_Guardar_pac;
    }

    public void setBtn_Guardar_pac(JButton Btn_Guardar_pac) {
        this.Btn_Guardar_pac = Btn_Guardar_pac;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings(value = "unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        panelRound1 = new Modelo.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        text_Cedula_pac = new javax.swing.JTextField();
        text_Nombre_pac = new javax.swing.JTextField();
        text_Pais_pac = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        text_Apellido_pac = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        text_Direcion_pac = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        text_Canton_pac = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        text_Telefono_pac = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        text_Direccion_pac = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Btn_Guardar_pac = new javax.swing.JButton();

        setAutoscrolls(true);
        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        setFocusCycleRoot(true);
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(980, 660));
        setPreferredSize(new java.awt.Dimension(980, 660));

        jLabel9.setText("Cedula:");

        text_Cedula_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_Cedula_pacActionPerformed(evt);
            }
        });

        text_Pais_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_Pais_pacActionPerformed(evt);
            }
        });

        jLabel10.setText("Apellido:");

        jLabel11.setText("Telefono:");

        jLabel12.setText("Pais:");

        jLabel13.setText("Direccion:");

        text_Canton_pac.setToolTipText("");

        jLabel14.setText("Direcion:");

        jLabel15.setText("Nombre:");

        text_Direccion_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_Direccion_pacActionPerformed(evt);
            }
        });

        jLabel16.setText("Canton");

        Btn_Guardar_pac.setText("Guardar");
        Btn_Guardar_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Guardar_pacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_Cedula_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_Nombre_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_Direccion_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_Apellido_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_Telefono_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_Direcion_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_Pais_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_Canton_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(Btn_Guardar_pac)))
                .addContainerGap(423, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(text_Cedula_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(text_Nombre_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(text_Apellido_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(text_Direccion_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(text_Telefono_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_Direcion_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(38, 38, 38)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_Pais_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(26, 26, 26)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_Canton_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(60, 60, 60)
                .addComponent(Btn_Guardar_pac)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(panelRound1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void text_Cedula_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_Cedula_pacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_Cedula_pacActionPerformed

    private void text_Pais_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_Pais_pacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_Pais_pacActionPerformed

    private void text_Direccion_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_Direccion_pacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_Direccion_pacActionPerformed

    private void Btn_Guardar_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Guardar_pacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Guardar_pacActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Guardar_pac;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private Modelo.PanelRound panelRound1;
    private javax.swing.JTextField text_Apellido_pac;
    private javax.swing.JTextField text_Canton_pac;
    private javax.swing.JTextField text_Cedula_pac;
    private javax.swing.JTextField text_Direccion_pac;
    private javax.swing.JTextField text_Direcion_pac;
    private javax.swing.JTextField text_Nombre_pac;
    private javax.swing.JTextField text_Pais_pac;
    private javax.swing.JTextField text_Telefono_pac;
    // End of variables declaration//GEN-END:variables
}
