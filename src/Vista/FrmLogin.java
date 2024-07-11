/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Jhony
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogin
     */
    public FrmLogin() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }
    

    public JButton getBtnIniciarSesion() {
        return BtnIniciarSesion;
    }

    public void setBtnIniciarSesion(JButton BtnIniciarSesion) {
        this.BtnIniciarSesion = BtnIniciarSesion;
    }

    public JTextField getTxtCedulaCorreoLogin() {
        return TxtCedulaCorreoLogin;
    }

    public void setTxtCedulaCorreoLogin(JTextField TxtCedulaCorreoLogin) {
        this.TxtCedulaCorreoLogin = TxtCedulaCorreoLogin;
    }

    public JTextField getTxtContraseñaLogin() {
        return TxtContraseñaLogin;
    }

    public void setTxtContraseñaLogin(JTextField TxtContraseñaLogin) {
        this.TxtContraseñaLogin = TxtContraseñaLogin;
    }

    public JLabel getTxtLabelRegistrarBtn() {
        return TxtLabelRegistrarBtn;
    }

    public void setTxtLabelRegistrarBtn(JLabel TxtLabelRegistrarBtn) {
        this.TxtLabelRegistrarBtn = TxtLabelRegistrarBtn;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        TxtLabelRegistrarBtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnIniciarSesion = new javax.swing.JButton();
        TxtContraseñaLogin = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        TxtCedulaCorreoLogin = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 650, 170, 20));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("¿No tienes Cuenta?");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 630, -1, -1));

        TxtLabelRegistrarBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        TxtLabelRegistrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        TxtLabelRegistrarBtn.setText("Registrate aquí!");
        TxtLabelRegistrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtLabelRegistrarBtnMouseClicked(evt);
            }
        });
        jPanel1.add(TxtLabelRegistrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 660, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 360, 140, 20));

        BtnIniciarSesion.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        BtnIniciarSesion.setText("ACEPTAR");
        jPanel1.add(BtnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 450, 140, 30));

        TxtContraseñaLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(TxtContraseñaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 400, 270, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 390, 130, 10));

        TxtCedulaCorreoLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(TxtCedulaCorreoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 320, 270, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, 270, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 310, 170, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel5.setText("Cedula/Correo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 280, -1, 20));

        jLabel4.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INICIAR SESIÓN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logo_Instituto.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo Login.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 720));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_Complemento.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 380, 720));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 300, 170, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, 270, 20));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtLabelRegistrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtLabelRegistrarBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLabelRegistrarBtnMouseClicked

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIniciarSesion;
    private javax.swing.JTextField TxtCedulaCorreoLogin;
    private javax.swing.JTextField TxtContraseñaLogin;
    private javax.swing.JLabel TxtLabelRegistrarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
