
package Controlador;

import Vista.FrmImpresion;
import Vista.FrmInterfazImprimir;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ControladorInterfazImprimir {

    private FrmInterfazImprimir vistaInterfaz;
    private FrmImpresion frmImpresion;
    private JButton btnImprimir;

    public ControladorInterfazImprimir(FrmInterfazImprimir vistaInterfaz, FrmImpresion frmImpresion) {
        this.vistaInterfaz = vistaInterfaz;
        this.frmImpresion = frmImpresion;

        vistaInterfaz.setVisible(true);
        btnImprimir = vistaInterfaz.getBtnImprimir();
        this.vistaInterfaz.getBtnImprimir().addActionListener((e) -> {
            imprimir();
        });
    }

    private void imprimir() {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(frmImpresion);

        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(vistaInterfaz, "Error en la impresión: " + ex.getMessage(), "Error de impresión", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(vistaInterfaz, "La impresión se canceló", "Cancelado", JOptionPane.WARNING_MESSAGE);
        }
    }
}
