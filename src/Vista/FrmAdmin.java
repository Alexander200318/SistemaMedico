/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import controlador_Vist.PanelPrinAdministrador;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Menfiz
 */
public class FrmAdmin extends javax.swing.JFrame {

    PanelPrinAdministrador control;
    public FrmAdmin() {
        initComponents();
        control = new PanelPrinAdministrador(this);
    }

    public JPanel getPanelCambio() {
        return PanelCambio;
    }

    public void setPanelCambio(JPanel PanelCambio) {
        this.PanelCambio = PanelCambio;
    }

    public JButton getBtnCarrerasAdmin() {
        return BtnCarrerasAdmin;
    }

    public void setBtnCarrerasAdmin(JButton BtnCarrerasAdmin) {
        this.BtnCarrerasAdmin = BtnCarrerasAdmin;
    }

    public JButton getBtnGraficasAdmin() {
        return BtnGraficasAdmin;
    }

    public void setBtnGraficasAdmin(JButton BtnGraficasAdmin) {
        this.BtnGraficasAdmin = BtnGraficasAdmin;
    }



    public JButton getBtn_PacientesaAdmin() {
        return Btn_PacientesaAdmin;
    }

    public void setBtn_PacientesaAdmin(JButton Btn_PacientesaAdmin) {
        this.Btn_PacientesaAdmin = Btn_PacientesaAdmin;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LabelNombre = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        BtnGraficasAdmin = new javax.swing.JButton();
        BtnCarrerasAdmin = new javax.swing.JButton();
        Btn_PacientesaAdmin = new javax.swing.JButton();
        PanelCambio = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("ADMIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 100, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 120, 10));
        jPanel1.add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 240, 40));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 260, 10));

        BtnGraficasAdmin.setBackground(new java.awt.Color(0, 153, 153));
        BtnGraficasAdmin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BtnGraficasAdmin.setText("Inicio");
        jPanel1.add(BtnGraficasAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 260, 80));

        BtnCarrerasAdmin.setBackground(new java.awt.Color(0, 153, 153));
        BtnCarrerasAdmin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BtnCarrerasAdmin.setText("Añadir Carrera");
        jPanel1.add(BtnCarrerasAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 80));

        Btn_PacientesaAdmin.setBackground(new java.awt.Color(0, 153, 153));
        Btn_PacientesaAdmin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_PacientesaAdmin.setText("Paciente ");
        jPanel1.add(Btn_PacientesaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 260, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 720));

        PanelCambio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelCambioLayout = new javax.swing.GroupLayout(PanelCambio);
        PanelCambio.setLayout(PanelCambioLayout);
        PanelCambioLayout.setHorizontalGroup(
            PanelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        PanelCambioLayout.setVerticalGroup(
            PanelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(PanelCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1020, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCarrerasAdmin;
    private javax.swing.JButton BtnGraficasAdmin;
    private javax.swing.JButton Btn_PacientesaAdmin;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JPanel PanelCambio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
