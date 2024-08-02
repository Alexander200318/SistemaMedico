/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorAñadirCarrera;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Jhony
 */
public class CrudCarrera extends javax.swing.JFrame {

    /**
     * Creates new form CrudCarrera
     */
    
    
    ControladorAñadirCarrera Carrera;
    public CrudCarrera() {
        initComponents();
        Carrera =new ControladorAñadirCarrera(this);
    }

    public JButton getBtnAñadirCarrera() {
        return BtnAñadirCarrera;
    }

    public void setBtnAñadirCarrera(JButton BtnAñadirCarrera) {
        this.BtnAñadirCarrera = BtnAñadirCarrera;
    }

    public JButton getBtnEliminarCarrera() {
        return BtnEliminarCarrera;
    }

    public void setBtnEliminarCarrera(JButton BtnEliminarCarrera) {
        this.BtnEliminarCarrera = BtnEliminarCarrera;
    }

    public JButton getBtnModificarCarrera() {
        return BtnModificarCarrera;
    }

    public void setBtnModificarCarrera(JButton BtnModificarCarrera) {
        this.BtnModificarCarrera = BtnModificarCarrera;
    }

    public JTable getTablaCarreras() {
        return TablaCarreras;
    }

    public void setTablaCarreras(JTable TablaCarreras) {
        this.TablaCarreras = TablaCarreras;
    }

    public JTextField getTxtNuevaCarrera() {
        return TxtNuevaCarrera;
    }

    public void setTxtNuevaCarrera(JTextField TxtNuevaCarrera) {
        this.TxtNuevaCarrera = TxtNuevaCarrera;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtNuevaCarrera = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCarreras = new javax.swing.JTable();
        BtnAñadirCarrera = new javax.swing.JButton();
        BtnEliminarCarrera = new javax.swing.JButton();
        BtnModificarCarrera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Carrera:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 20));
        jPanel1.add(TxtNuevaCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 220, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setText("AÑADIR CARRERAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, -1));

        TablaCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nombre Carrera"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaCarreras);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 710, 250));

        BtnAñadirCarrera.setText("Añadir ");
        jPanel1.add(BtnAñadirCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 90, 30));

        BtnEliminarCarrera.setText("Eliminar");
        jPanel1.add(BtnEliminarCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 100, 30));

        BtnModificarCarrera.setText("Modificar");
        BtnModificarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarCarreraActionPerformed(evt);
            }
        });
        jPanel1.add(BtnModificarCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnModificarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnModificarCarreraActionPerformed

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
            java.util.logging.Logger.getLogger(CrudCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudCarrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAñadirCarrera;
    private javax.swing.JButton BtnEliminarCarrera;
    private javax.swing.JButton BtnModificarCarrera;
    private javax.swing.JTable TablaCarreras;
    private javax.swing.JTextField TxtNuevaCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}