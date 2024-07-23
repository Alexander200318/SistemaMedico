
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import controlador_Vist.PaginaPrincipalDAO;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;

public class FrmPantallaPrincipal extends javax.swing.JFrame {

    private JDesktopPane desktopPane; // Aquí declaramos el JDesktopPane

    PaginaPrincipalDAO diseñoFuncion;
    public FrmPantallaPrincipal() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        diseñoFuncion =new PaginaPrincipalDAO(this);
       }


    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public void setDesktopPane(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
    }

    public JButton getBtnPaciente() {
        return BtnPaciente;
    }

    public void setBtnPaciente(JButton BtnPaciente) {
        this.BtnPaciente = BtnPaciente;
    }

    public JPanel getPane_PacienteMenu() {
        return Pane_PacienteMenu;
    }

    public void setPane_PacienteMenu(JPanel Pane_PacienteMenu) {
        this.Pane_PacienteMenu = Pane_PacienteMenu;
    }

    public JButton getBtnInicio() {
        return BtnInicio;
    }

    public void setBtnInicio(JButton BtnInicio) {
        this.BtnInicio = BtnInicio;
    }

    public JPanel getPane_InicioMenu() {
        return Pane_InicioMenu;
    }

    public void setPane_InicioMenu(JPanel Pane_InicioMenu) {
        this.Pane_InicioMenu = Pane_InicioMenu;
    }

    public JButton getBtnHistorial() {
        return BtnHistorial;
    }

    public void setBtnHistorial(JButton BtnHistorial) {
        this.BtnHistorial = BtnHistorial;
    }

    public JPanel getPane_HistorialMenu() {
        return Pane_HistorialMenu;
    }

    public void setPane_HistorialMenu(JPanel Pane_HistorialMenu) {
        this.Pane_HistorialMenu = Pane_HistorialMenu;
    }

    public JButton getBtnUsuario() {
        return BtnUsuario;
    }

    public void setBtnUsuario(JButton BtnUsuario) {
        this.BtnUsuario = BtnUsuario;
    }

    public JPanel getPane_UsuarioMenu() {
        return Pane_UsuarioMenu;
    }

    public void setPane_UsuarioMenu(JPanel Pane_UsuarioMenu) {
        this.Pane_UsuarioMenu = Pane_UsuarioMenu;
    }

    public JPanel getPANEL_CAMBIO() {
        return PANEL_CAMBIO;
    }

    public void setPANEL_CAMBIO(JPanel PANEL_CAMBIO) {
        this.PANEL_CAMBIO = PANEL_CAMBIO;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        PANEL_CAMBIO = new javax.swing.JPanel();
        panelRound2 = new Modelo.PanelRound();
        Pane_UsuarioMenu = new javax.swing.JPanel();
        BtnUsuario = new javax.swing.JButton();
        Pane_HistorialMenu = new javax.swing.JPanel();
        BtnHistorial = new javax.swing.JButton();
        Pane_PacienteMenu = new javax.swing.JPanel();
        BtnPaciente = new javax.swing.JButton();
        Pane_InicioMenu = new javax.swing.JPanel();
        BtnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setForeground(new java.awt.Color(51, 0, 204));
        jPanel3.setEnabled(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(1280, 720));

        PANEL_CAMBIO.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PANEL_CAMBIOLayout = new javax.swing.GroupLayout(PANEL_CAMBIO);
        PANEL_CAMBIO.setLayout(PANEL_CAMBIOLayout);
        PANEL_CAMBIOLayout.setHorizontalGroup(
            PANEL_CAMBIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        PANEL_CAMBIOLayout.setVerticalGroup(
            PANEL_CAMBIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        panelRound2.setBackground(new java.awt.Color(64, 172, 159));
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);

        Pane_UsuarioMenu.setBackground(new java.awt.Color(64, 172, 159));

        BtnUsuario.setBackground(new java.awt.Color(64, 172, 159));
        BtnUsuario.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        BtnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BtnUsuario.setText("Usuario");
        BtnUsuario.setBorder(null);
        BtnUsuario.setBorderPainted(false);
        BtnUsuario.setContentAreaFilled(false);
        BtnUsuario.setFocusPainted(false);
        BtnUsuario.setFocusable(false);
        BtnUsuario.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pane_UsuarioMenuLayout = new javax.swing.GroupLayout(Pane_UsuarioMenu);
        Pane_UsuarioMenu.setLayout(Pane_UsuarioMenuLayout);
        Pane_UsuarioMenuLayout.setHorizontalGroup(
            Pane_UsuarioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Pane_UsuarioMenuLayout.setVerticalGroup(
            Pane_UsuarioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_UsuarioMenuLayout.createSequentialGroup()
                .addComponent(BtnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Pane_HistorialMenu.setBackground(new java.awt.Color(64, 172, 159));

        BtnHistorial.setBackground(new java.awt.Color(64, 172, 159));
        BtnHistorial.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        BtnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        BtnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/conversacion.png"))); // NOI18N
        BtnHistorial.setText("Historial Medico");
        BtnHistorial.setBorder(null);
        BtnHistorial.setBorderPainted(false);
        BtnHistorial.setContentAreaFilled(false);
        BtnHistorial.setFocusPainted(false);
        BtnHistorial.setFocusable(false);
        BtnHistorial.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pane_HistorialMenuLayout = new javax.swing.GroupLayout(Pane_HistorialMenu);
        Pane_HistorialMenu.setLayout(Pane_HistorialMenuLayout);
        Pane_HistorialMenuLayout.setHorizontalGroup(
            Pane_HistorialMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        Pane_HistorialMenuLayout.setVerticalGroup(
            Pane_HistorialMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_HistorialMenuLayout.createSequentialGroup()
                .addComponent(BtnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Pane_PacienteMenu.setBackground(new java.awt.Color(64, 172, 159));

        BtnPaciente.setBackground(new java.awt.Color(64, 172, 159));
        BtnPaciente.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        BtnPaciente.setForeground(new java.awt.Color(255, 255, 255));
        BtnPaciente.setText("Paciente");
        BtnPaciente.setBorder(null);
        BtnPaciente.setBorderPainted(false);
        BtnPaciente.setContentAreaFilled(false);
        BtnPaciente.setFocusPainted(false);
        BtnPaciente.setFocusable(false);
        BtnPaciente.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnPaciente.setMaximumSize(new java.awt.Dimension(74, 20));
        BtnPaciente.setMinimumSize(new java.awt.Dimension(74, 20));
        BtnPaciente.setPreferredSize(new java.awt.Dimension(74, 20));
        BtnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pane_PacienteMenuLayout = new javax.swing.GroupLayout(Pane_PacienteMenu);
        Pane_PacienteMenu.setLayout(Pane_PacienteMenuLayout);
        Pane_PacienteMenuLayout.setHorizontalGroup(
            Pane_PacienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_PacienteMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Pane_PacienteMenuLayout.setVerticalGroup(
            Pane_PacienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_PacienteMenuLayout.createSequentialGroup()
                .addComponent(BtnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Pane_InicioMenu.setBackground(new java.awt.Color(64, 172, 159));

        BtnInicio.setBackground(new java.awt.Color(64, 172, 159));
        BtnInicio.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        BtnInicio.setForeground(new java.awt.Color(255, 255, 255));
        BtnInicio.setText("Inicio");
        BtnInicio.setToolTipText("");
        BtnInicio.setBorder(null);
        BtnInicio.setBorderPainted(false);
        BtnInicio.setContentAreaFilled(false);
        BtnInicio.setFocusPainted(false);
        BtnInicio.setFocusable(false);
        BtnInicio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pane_InicioMenuLayout = new javax.swing.GroupLayout(Pane_InicioMenu);
        Pane_InicioMenu.setLayout(Pane_InicioMenuLayout);
        Pane_InicioMenuLayout.setHorizontalGroup(
            Pane_InicioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        Pane_InicioMenuLayout.setVerticalGroup(
            Pane_InicioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_InicioMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Pane_InicioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(Pane_PacienteMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(Pane_HistorialMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(Pane_UsuarioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Pane_InicioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pane_PacienteMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pane_HistorialMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pane_UsuarioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(PANEL_CAMBIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PANEL_CAMBIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel3, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnInicioActionPerformed

    private void BtnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPacienteActionPerformed

    private void BtnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHistorialActionPerformed

    private void BtnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPantallaPrincipal().setVisible(true);
            }
        });
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHistorial;
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton BtnPaciente;
    private javax.swing.JButton BtnUsuario;
    private javax.swing.JPanel PANEL_CAMBIO;
    private javax.swing.JPanel Pane_HistorialMenu;
    private javax.swing.JPanel Pane_InicioMenu;
    private javax.swing.JPanel Pane_PacienteMenu;
    private javax.swing.JPanel Pane_UsuarioMenu;
    private javax.swing.JPanel jPanel3;
    private Modelo.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
