/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.FrmImpresion;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;

public class ControladorImpresion {

    public ControladorImpresion() {

    }

    public void imprimirReceta(FrmImpresion frmImpresion) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(frmImpresion);

        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, "Error al imprimir: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "La impresión se canceló", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
