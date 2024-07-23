/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import controlador_Vist.Panel_Prin_InicioDAO;
import javax.swing.JTextField;

/**
 *
 * @author alexa
 */
public class Panel_INICIO extends javax.swing.JPanel {

    Panel_Prin_InicioDAO contro;
    public Panel_INICIO() {
        initComponents();
        contro=new Panel_Prin_InicioDAO(this);
    }

    public JTextField getTxt_nombre() {
        return Txt_nombre;
    }

    public void setTxt_nombre(JTextField Txt_nombre) {
        this.Txt_nombre = Txt_nombre;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_nombre = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 680));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sylfaen", 3, 100)); // NOI18N
        jLabel1.setText("Bienvenido");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 558, 251));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logo.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 373, 400));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Doctora:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 615, -1, 40));

        Txt_nombre.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        add(Txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 622, 340, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
