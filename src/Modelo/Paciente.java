/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.mysql.cj.jdbc.Blob;
import java.sql.Date; 

/**
 *
 * @author alexa
 */
import java.sql.Date;

public class Paciente extends Persona {
    private String tipoPaciente;

    // Constructor
    public Paciente(int idPersona, String identificacion, String primNombre, String segNombre, String primApellido, String segApellido, String email, String direccion, String barrio, String canton, String provincia, String telefono, Date fechaNacimiento, String lugar, String pais, String genero, String estadoCivil, String sexo, Blob foto, String etnia, Date fechaRegistro, String carnetConadis, boolean discapacidad, String tipoDiscapacidad, int porctDiscapacidad, String contactoEmergencia, boolean estadoActivo, String tipoPaciente) {
        super(idPersona, identificacion, primNombre, segNombre, primApellido, segApellido, email, direccion, barrio, canton, provincia, telefono, fechaNacimiento, lugar, pais, genero, estadoCivil, sexo, foto, etnia, fechaRegistro, carnetConadis, discapacidad, tipoDiscapacidad, porctDiscapacidad, contactoEmergencia, estadoActivo);
        this.tipoPaciente = tipoPaciente;
    }

    // Getter y Setter para tipoPaciente
    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }
}

