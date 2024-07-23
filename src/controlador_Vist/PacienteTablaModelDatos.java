/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Modelo.Paciente;
import Modelo.Persona;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jhony
 */
public class PacienteTablaModelDatos extends AbstractTableModel {

    private String[] NombreColumnas = {
        "identificacion", "Nombre", "Apellido", "Sexo", "Celular", "direccion",};

    private List<Paciente> Datos;

    public PacienteTablaModelDatos(List<Paciente> Datos) {
        this.Datos = Datos;
    }

    @Override
    public int getRowCount() {
        return getDatos().size();
    }

    @Override
    public int getColumnCount() {
        return NombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paciente datospacien = getDatos().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return datospacien.getIdentificacion();
            case 1:
                return datospacien.getPrimNombre();
            case 2:
                return datospacien.getPrimApellido();
            case 3:
                return datospacien.getSexo();
            case 4:
                return datospacien.getTelefono();
            case 5:
                return datospacien.getDireccion();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        return NombreColumnas[column];
    }

    public List<Paciente> getDatos() {
        return Datos;
    }

    public void setDatos(List<Paciente> Datos) {
        this.Datos = Datos;
    }

}
