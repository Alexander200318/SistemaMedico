/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;
import Modelo.Encabezado_tabla_Histrl;
import java.util.AbstractList;
import javax.swing.table.AbstractTableModel; 
import java.util.List;

/**
 *
 * @author alexa
 */
public class ConsultaTableModel extends AbstractTableModel {

    private String[] columnNames = { // Nombres de las columnas de la tabla
        "Identificasión", "Nombre Paciente", "Edad", "Sexo", "Fecha Consulta", "Nombre del Doctor", "Diagnóstico","Nvl Prioridad","Accion"
    };

     private List< Encabezado_tabla_Histrl> consultas;

    public ConsultaTableModel(List<Encabezado_tabla_Histrl> consultas) {
        this.consultas = consultas;
    }

    @Override
    public int getRowCount() {
        return getConsultas().size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Encabezado_tabla_Histrl datosTable = getConsultas().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return datosTable.getIdentiificasion();
            case 1:
            return datosTable.getNombre_paciente();
        case 2:
            return datosTable.getEdad();
        case 3:
            return datosTable.getSexo();
        case 4:
            return datosTable.getFecha_consulta();
        case 5:
            return datosTable.getNombre_doctor();
        case 6:
            return datosTable.getDiagnostico();
        case 7:
            return datosTable.getTrige();
            case 8:
                return ""; // Texto del botón
        default:
            return null;
    }
}

    @Override
    public String getColumnName(int column) {
        return columnNames[column]; // Devuelve el nombre de la columna correspondiente
    }
     @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 8; // Solo la columna del botón es editable
    }
    
   

    /**
     * @return the consultas
     */
    public List< Encabezado_tabla_Histrl> getConsultas() {
        return consultas;
    }

}
