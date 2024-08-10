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
public class ConsultaDatosPacienteAdmin extends AbstractTableModel {

    private String[] columnNames = {
        "IDENTIFICACIÓN", "PACIENTE", "TELEFONO", "ROL", "FECHA REGISTRO", "RESPONSABLE REGISTRO", "ESTADO"};

    private List< DatosPacienteAdminClass> consultas;

    public ConsultaDatosPacienteAdmin(List<DatosPacienteAdminClass> consultas) {
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
        DatosPacienteAdminClass datosTable = getConsultas().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return datosTable.getIdentificacion();
            case 1:
                return datosTable.getNombrePaciente();
            case 2:
                return datosTable.getTelefono();
            case 3:
                return datosTable.getRol();
            case 4:
                return datosTable.getFecha_registro();
            case 5:
                return datosTable.getNombreDoctor();
            case 6:
                String est=" ";
                if (datosTable.isEstado()) {
                    est="Habilitado";
                } else {
                    est="Deshabilitado";
                } 
                return est;
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
        return columnIndex == 7;
    }

    public List<DatosPacienteAdminClass> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<DatosPacienteAdminClass> consultas) {
        this.consultas = consultas;
    }
}
