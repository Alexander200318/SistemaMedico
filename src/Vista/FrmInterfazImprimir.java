 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorInterfazImprimir;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class FrmInterfazImprimir extends javax.swing.JInternalFrame {

    ControladorInterfazImprimir control;
    public FrmInterfazImprimir() {
        initComponents();
        control=new ControladorInterfazImprimir(this);
    }
    

    public JButton getBtnImprimir() {
        return BtnImprimir;
    }

    public void setBtnImprimir(JButton BtnImprimir) {
        this.BtnImprimir = BtnImprimir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnImprimir = new javax.swing.JButton();
        frmImpresion1 = new Vista.FrmImpresion();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(577, 349));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnImprimir.setText("Imprimir");
        BtnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));
        getContentPane().add(frmImpresion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImprimirActionPerformed

    }//GEN-LAST:event_BtnImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnImprimir;
    private Vista.FrmImpresion frmImpresion1;
    // End of variables declaration//GEN-END:variables

}
