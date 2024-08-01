/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alexa
 */
public class ConsultaHistorialPaciente extends AbstractTableModel {

    private String[] columnNames = {
        "FECHA CONSULTA", "MEDICO", "MOTIVO", "PRIORIDAD",};

    private List< Encabezado_HistorialPaciente> consultas;

    public ConsultaHistorialPaciente(List<Encabezado_HistorialPaciente> consultas) {
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
        Encabezado_HistorialPaciente datosTable = getConsultas().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return datosTable.getFecha_consulta();
            case 1:
                return datosTable.getNombre_doctor();
            case 2:
                return datosTable.getDiagnostico();
            case 3:
                return datosTable.getTrige();

            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 3;
    }

    public List<Encabezado_HistorialPaciente> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Encabezado_HistorialPaciente> consultas) {
        this.consultas = consultas;
    }
}