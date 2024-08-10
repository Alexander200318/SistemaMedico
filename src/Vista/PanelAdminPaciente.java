/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import controlador_Vist.PanelPacienteAdminDAO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author alexa
 */
public class PanelAdminPaciente extends javax.swing.JPanel {

  PanelPacienteAdminDAO control;
    public PanelAdminPaciente() {
        initComponents();
        control= new PanelPacienteAdminDAO(this);
    }

    public JButton getBtn_most_Limpiar() {
        return Btn_most_Limpiar;
    }

    public void setBtn_most_Limpiar(JButton Btn_most_Limpiar) {
        this.Btn_most_Limpiar = Btn_most_Limpiar;
    }

   

    public JButton getBtn_Buscar_Adm() {
        return Btn_Buscar_Adm;
    }

    public void setBtn_Buscar_Adm(JButton Btn_Buscar_Adm) {
        this.Btn_Buscar_Adm = Btn_Buscar_Adm;
    }

    public JButton getBtn_Deshabilitar_Adm() {
        return Btn_Deshabilitar_Adm;
    }

    public void setBtn_Deshabilitar_Adm(JButton Btn_Deshabilitar_Adm) {
        this.Btn_Deshabilitar_Adm = Btn_Deshabilitar_Adm;
    }



    public JButton getBtn_Habilitar_Adm() {
        return Btn_Habilitar_Adm;
    }

    public void setBtn_Habilitar_Adm(JButton Btn_Habilitar_Adm) {
        this.Btn_Habilitar_Adm = Btn_Habilitar_Adm;
    }

    public JButton getBtn_Limpiar_Adm() {
        return Btn_Limpiar_Adm;
    }

    public void setBtn_Limpiar_Adm(JButton Btn_Limpiar_Adm) {
        this.Btn_Limpiar_Adm = Btn_Limpiar_Adm;
    }

    public JComboBox<String> getCbx_ad_rol() {
        return Cbx_ad_rol;
    }

    public void setCbx_ad_rol(JComboBox<String> Cbx_ad_rol) {
        this.Cbx_ad_rol = Cbx_ad_rol;
    }

    public JTextField getTxt_ad_apellido() {
        return Txt_ad_apellido;
    }

    public void setTxt_ad_apellido(JTextField Txt_ad_apellido) {
        this.Txt_ad_apellido = Txt_ad_apellido;
    }

    public JTextField getTxt_ad_identificacion() {
        return Txt_ad_identificacion;
    }

    public void setTxt_ad_identificacion(JTextField Txt_ad_identificacion) {
        this.Txt_ad_identificacion = Txt_ad_identificacion;
    }

    public JTextField getTxt_ad_nombre() {
        return Txt_ad_nombre;
    }

    public void setTxt_ad_nombre(JTextField Txt_ad_nombre) {
        this.Txt_ad_nombre = Txt_ad_nombre;
    }



    public JTextField getTxt_most_direccion() {
        return txt_most_direccion;
    }

    public void setTxt_most_direccion(JTextField txt_most_direccion) {
        this.txt_most_direccion = txt_most_direccion;
    }

    public JTextField getTxt_most_discapacidad() {
        return txt_most_discapacidad;
    }

    public void setTxt_most_discapacidad(JTextField txt_most_discapacidad) {
        this.txt_most_discapacidad = txt_most_discapacidad;
    }

    public JTextField getTxt_most_email() {
        return txt_most_email;
    }

    public void setTxt_most_email(JTextField txt_most_email) {
        this.txt_most_email = txt_most_email;
    }

    public JTextField getTxt_most_identificacion() {
        return txt_most_identificacion;
    }

    public void setTxt_most_identificacion(JTextField txt_most_identificacion) {
        this.txt_most_identificacion = txt_most_identificacion;
    }

    public JTextField getTxt_most_nombress() {
        return txt_most_nombress;
    }

    public void setTxt_most_nombress(JTextField txt_most_nombress) {
        this.txt_most_nombress = txt_most_nombress;
    }

    public JTextField getTxt_most_rol() {
        return txt_most_rol;
    }

    public void setTxt_most_rol(JTextField txt_most_rol) {
        this.txt_most_rol = txt_most_rol;
    }

    public JTextField getTxt_most_sexo() {
        return txt_most_sexo;
    }

    public void setTxt_most_sexo(JTextField txt_most_sexo) {
        this.txt_most_sexo = txt_most_sexo;
    }

    public JTextField getTxt_most_telefono() {
        return txt_most_telefono;
    }

    public void setTxt_most_telefono(JTextField txt_most_telefono) {
        this.txt_most_telefono = txt_most_telefono;
    }
    
    

    public JTable getTablaPacienteAd() {
        return TablaPacienteAd;
    }

    public void setTablaPacienteAd(JTable TablaPacienteAd) {
        this.TablaPacienteAd = TablaPacienteAd;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPacienteAd = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Txt_ad_identificacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cbx_ad_rol = new javax.swing.JComboBox<>();
        Txt_ad_nombre = new javax.swing.JTextField();
        Txt_ad_apellido = new javax.swing.JTextField();
        Btn_Limpiar_Adm = new javax.swing.JButton();
        Btn_Buscar_Adm = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txt_most_nombress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_most_email = new javax.swing.JTextField();
        txt_most_direccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_most_discapacidad = new javax.swing.JTextField();
        txt_most_identificacion = new javax.swing.JTextField();
        txt_most_sexo = new javax.swing.JTextField();
        txt_most_telefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_most_rol = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Btn_most_Limpiar = new javax.swing.JButton();
        Btn_Deshabilitar_Adm = new javax.swing.JButton();
        Btn_Habilitar_Adm = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1020, 720));
        setPreferredSize(new java.awt.Dimension(1020, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaPacienteAd.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        TablaPacienteAd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaPacienteAd);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 980, 280));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administración de Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 20), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txt_ad_identificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Txt_ad_identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_ad_identificacionActionPerformed(evt);
            }
        });
        jPanel1.add(Txt_ad_identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 250, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Apellidos ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ingresa la Indentificacion del Paciente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Rol");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nombres");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, 30));

        Cbx_ad_rol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Cbx_ad_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Pers. Administrativo", "Servicio", "Docente", "Alumno", " ", " " }));
        jPanel1.add(Cbx_ad_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 170, -1));

        Txt_ad_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(Txt_ad_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 200, -1));

        Txt_ad_apellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(Txt_ad_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 190, -1));

        Btn_Limpiar_Adm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_Limpiar_Adm.setText("Limpiar");
        Btn_Limpiar_Adm.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(Btn_Limpiar_Adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 140, 30));

        Btn_Buscar_Adm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_Buscar_Adm.setText("Buscar");
        Btn_Buscar_Adm.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(Btn_Buscar_Adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 140, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 980, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_most_nombress.setEditable(false);
        txt_most_nombress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_most_nombress.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_most_nombress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_most_nombressActionPerformed(evt);
            }
        });
        jPanel2.add(txt_most_nombress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Dieccion");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nombres y Apellidos");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Identificacion");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Sexo");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, 30));

        txt_most_email.setEditable(false);
        txt_most_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_most_email.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_most_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_most_emailActionPerformed(evt);
            }
        });
        jPanel2.add(txt_most_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 200, -1));

        txt_most_direccion.setEditable(false);
        txt_most_direccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_most_direccion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txt_most_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 350, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Emal");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, 30));

        txt_most_discapacidad.setEditable(false);
        txt_most_discapacidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_most_discapacidad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txt_most_discapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 190, -1));

        txt_most_identificacion.setEditable(false);
        txt_most_identificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_most_identificacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txt_most_identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 190, -1));

        txt_most_sexo.setEditable(false);
        txt_most_sexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_most_sexo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txt_most_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 100, -1));

        txt_most_telefono.setEditable(false);
        txt_most_telefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_most_telefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_most_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_most_telefonoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_most_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 200, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Telefono");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, 30));

        txt_most_rol.setEditable(false);
        txt_most_rol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_most_rol.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txt_most_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 160, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Rol");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Discapacidad");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 30));

        Btn_most_Limpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_most_Limpiar.setText("Limpiar Datos");
        jPanel2.add(Btn_most_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 120, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 780, 200));

        Btn_Deshabilitar_Adm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_Deshabilitar_Adm.setText("Deshabilitar");
        Btn_Deshabilitar_Adm.setBorder(new javax.swing.border.MatteBorder(null));
        add(Btn_Deshabilitar_Adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 180, 30));

        Btn_Habilitar_Adm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_Habilitar_Adm.setText("Habilitar");
        Btn_Habilitar_Adm.setBorder(new javax.swing.border.MatteBorder(null));
        Btn_Habilitar_Adm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Habilitar_AdmActionPerformed(evt);
            }
        });
        add(Btn_Habilitar_Adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 180, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 190, 10));

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));
        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Habilitado");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Deshabilitado");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, 30));

        jPanel5.setBackground(new java.awt.Color(0, 255, 0));
        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 30, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 190, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_ad_identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ad_identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ad_identificacionActionPerformed

    private void txt_most_nombressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_most_nombressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_most_nombressActionPerformed

    private void txt_most_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_most_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_most_emailActionPerformed

    private void Btn_Habilitar_AdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Habilitar_AdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Habilitar_AdmActionPerformed

    private void txt_most_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_most_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_most_telefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Buscar_Adm;
    private javax.swing.JButton Btn_Deshabilitar_Adm;
    private javax.swing.JButton Btn_Habilitar_Adm;
    private javax.swing.JButton Btn_Limpiar_Adm;
    private javax.swing.JButton Btn_most_Limpiar;
    private javax.swing.JComboBox<String> Cbx_ad_rol;
    private javax.swing.JTable TablaPacienteAd;
    private javax.swing.JTextField Txt_ad_apellido;
    private javax.swing.JTextField Txt_ad_identificacion;
    private javax.swing.JTextField Txt_ad_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txt_most_direccion;
    private javax.swing.JTextField txt_most_discapacidad;
    private javax.swing.JTextField txt_most_email;
    private javax.swing.JTextField txt_most_identificacion;
    private javax.swing.JTextField txt_most_nombress;
    private javax.swing.JTextField txt_most_rol;
    private javax.swing.JTextField txt_most_sexo;
    private javax.swing.JTextField txt_most_telefono;
    // End of variables declaration//GEN-END:variables
}
