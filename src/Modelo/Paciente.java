/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date; 

/**
 *
 * @author alexa
 */
public class Paciente extends Persona{
    private String tipoPaciente;

    public Paciente(int idPersona, String cedula, String nombre, String apellido, Date fechaNacimiento, String tipoPersona, String carrera, int ciclo, String direccionDomicilio, String barrio, String parroquia, String canton, String provincia, String telefono, String pais, int edad, String genero, String estadoCivil, String tipoSangre, String tipoPaciente ) {
        super(idPersona, cedula, nombre, apellido, fechaNacimiento, tipoPersona, carrera, ciclo, direccionDomicilio, barrio, parroquia, canton, provincia, telefono, pais, edad, genero, estadoCivil, tipoSangre);
        this.tipoPaciente = tipoPaciente;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }
    
    
  
    
}
