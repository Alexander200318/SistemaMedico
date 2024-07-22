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
        return text_Parroquia_pac;
    }

    public void setText_Direcion_pac(JTextField text_Direcion_pac) {
        this.text_Parroquia_pac = text_Direcion_pac;
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
        text_Parroquia_pac = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        text_Canton_pac = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        text_Telefono_pac = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        text_Direccion_pac = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Btn_Guardar_pac = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        text_Barrio_pac = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        text_Provincia_pac = new javax.swing.JTextField();
        text_Apellido_pac1 = new javax.swing.JTextField();
        text_Ciclo_pac1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_Fecha_Nacim_pac = new javax.swing.JTextField();
        text_Lugar_pac = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setAutoscrolls(true);
        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        setFocusCycleRoot(true);
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(980, 660));
        setPreferredSize(new java.awt.Dimension(980, 660));

        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Edad:");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 40, 20));

        text_Cedula_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_Cedula_pacActionPerformed(evt);
            }
        });
        panelRound1.add(text_Cedula_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 130, -1));
        panelRound1.add(text_Nombre_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 130, 20));

        text_Pais_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_Pais_pacActionPerformed(evt);
            }
        });
        panelRound1.add(text_Pais_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 130, -1));

        jLabel10.setText("Apellidos:");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 60, 20));
        panelRound1.add(text_Apellido_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 130, -1));

        jLabel11.setText("Barrio:");
        panelRound1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 60, 20));
        panelRound1.add(text_Parroquia_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 130, -1));

        jLabel12.setText("Provincia:");
        panelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, -1, 20));

        jLabel13.setText("Dirección:");
        panelRound1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 20));

        text_Canton_pac.setToolTipText("");
        panelRound1.add(text_Canton_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 130, -1));

        jLabel14.setText("Parroquia:");
        panelRound1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 60, 20));
        panelRound1.add(text_Telefono_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 130, -1));

        jLabel15.setText("Nombres:");
        panelRound1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 60, 20));

        text_Direccion_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_Direccion_pacActionPerformed(evt);
            }
        });
        panelRound1.add(text_Direccion_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 130, -1));

        jLabel16.setText("Cantón:");
        panelRound1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 60, 20));

        Btn_Guardar_pac.setText("Guardar");
        Btn_Guardar_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Guardar_pacActionPerformed(evt);
            }
        });
        panelRound1.add(Btn_Guardar_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 553, -1, -1));

        jLabel17.setText("Cedula:");
        panelRound1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, -1));

        jLabel18.setText("Carrera:");
        panelRound1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 50, 20));

        jLabel19.setText("Ciclo:");
        panelRound1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 60, 20));

        jLabel20.setText("Género:");
        panelRound1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 20));

        text_Barrio_pac.setToolTipText("");
        panelRound1.add(text_Barrio_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 130, -1));

        jLabel21.setText("Teléfono:");
        panelRound1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 20));

        jLabel22.setText("F Nacim:");
        panelRound1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 60, 20));

        jLabel23.setText("Lugar:");
        panelRound1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 60, 20));

        jLabel24.setText("País:");
        panelRound1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 60, 20));

        text_Provincia_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_Provincia_pacActionPerformed(evt);
            }
        });
        panelRound1.add(text_Provincia_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 70, -1));

        text_Apellido_pac1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_Apellido_pac1ActionPerformed(evt);
            }
        });
        panelRound1.add(text_Apellido_pac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 130, -1));
        panelRound1.add(text_Ciclo_pac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 70, -1));

        jLabel1.setText("T. Sangre:");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 60, 20));

        jLabel2.setText("E. Civil");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 50, 20));

        text_Fecha_Nacim_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_Fecha_Nacim_pacActionPerformed(evt);
            }
        });
        panelRound1.add(text_Fecha_Nacim_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 130, -1));

        text_Lugar_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_Lugar_pacActionPerformed(evt);
            }
        });
        panelRound1.add(text_Lugar_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 130, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("4.-ENFERMEDAD ACTUAL");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("1.-DATOS DE FILIACIÓN:");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 940, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("2.-MOTIVO DE CONSTULTA:");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRound1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 130, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRound1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 130, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRound1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 130, -1));
        panelRound1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 70, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("3.-ANTECEDENTES FAMILIARES Y PERSONALES:");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        panelRound1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 940, -1));

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

    private void text_Provincia_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_Provincia_pacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_Provincia_pacActionPerformed

    private void text_Apellido_pac1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_Apellido_pac1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_Apellido_pac1ActionPerformed

    private void text_Fecha_Nacim_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_Fecha_Nacim_pacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_Fecha_Nacim_pacActionPerformed

    private void text_Lugar_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_Lugar_pacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_Lugar_pacActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Guardar_pac;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private Modelo.PanelRound panelRound1;
    private javax.swing.JTextField text_Apellido_pac;
    private javax.swing.JTextField text_Apellido_pac1;
    private javax.swing.JTextField text_Barrio_pac;
    private javax.swing.JTextField text_Canton_pac;
    private javax.swing.JTextField text_Cedula_pac;
    private javax.swing.JTextField text_Ciclo_pac1;
    private javax.swing.JTextField text_Direccion_pac;
    private javax.swing.JTextField text_Fecha_Nacim_pac;
    private javax.swing.JTextField text_Lugar_pac;
    private javax.swing.JTextField text_Nombre_pac;
    private javax.swing.JTextField text_Pais_pac;
    private javax.swing.JTextField text_Parroquia_pac;
    private javax.swing.JTextField text_Provincia_pac;
    private javax.swing.JTextField text_Telefono_pac;
    // End of variables declaration//GEN-END:variables
}
