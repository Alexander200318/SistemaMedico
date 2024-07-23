/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ConsultaTableModel;
import Modelo.Encabezado_tabla_Histrl;
import Vista.PANEL_PRINCIPAL_HISTORIAL;
import Vista.PanelDatosHISTORIAL;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.AbstractCellEditor;
import javax.swing.table.TableCellEditor;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
    private JButton button;
    private String label;
    private boolean isPushed;
    private JTable table;
    public ButtonEditor(JTable table) {
        this.table = table;
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(this);
        ImageIcon icon = new ImageIcon("src/Iconos/historial-de-pedidos.png"); // Reemplaza con la ruta a tu ícono
        button.setIcon(icon);
        
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
                                                 boolean isSelected, int row, int column) {
       label = (value == null) ? "" : value.toString();
        button.setText(label);
         
        
        isPushed = true;

        // Guardar el id_historial en el botón
        Encabezado_tabla_Histrl consulta = ((ConsultaTableModel) table.getModel()).getConsultas().get(table.convertRowIndexToModel(row));
        button.putClientProperty("id_historial", consulta.getId_historial());

        
       
        return button;
    }

    @Override
    public Object getCellEditorValue() {
       if (isPushed) {
            // Recuperar el id_historial del botón
            int idHistorial = (int) button.getClientProperty("id_historial");
            System.out.println("Button clicked! Id_Historial: " + idHistorial);
            // Aquí puedes agregar la acción que quieras realizar con el idHistorial
            
          
            
            
            
        }
        isPushed = false;
        return label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fireEditingStopped();
    }
    
    
    
  
}