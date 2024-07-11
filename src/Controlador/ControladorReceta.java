/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.FrmReceta;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.print.*;
import javax.print.attribute.*;
import javax.print.attribute.standard.*;
import javax.swing.*;
import java.awt.print.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorReceta {
    private FrmReceta frmReceta;

    public ControladorReceta(FrmReceta frmReceta) {
        this.frmReceta = frmReceta;
        this.frmReceta.getBtnImprimir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imprimirReceta();
            }
        });
    }

    public void iniciar() {
        frmReceta.setVisible(true);
    }

    private void imprimirReceta() {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("Imprimir Receta");

        printerJob.setPrintable(new Printable() {
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) {
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2d = (Graphics2D) graphics;
                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                frmReceta.getContentPane().printAll(graphics);
                return Printable.PAGE_EXISTS;
            }
        });

        if (printerJob.printDialog()) {
            try {
                printerJob.print();
            } catch (PrinterException e) {
                JOptionPane.showMessageDialog(frmReceta, "Error de impresión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
