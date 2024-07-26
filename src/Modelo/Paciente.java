/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Blob;
import java.sql.Date;

public class Paciente extends Persona {
    private int idPaciente;

    // Constructor sin Integer, usa int para evitar problemas con valores nulos
    public Paciente(int idPaciente, Integer idPersona, String identificacion, String primNombre, String segNombre, String primApellido, String segApellido, String email, String direccion, String barrio, String canton, String provincia, String telefono, Date fechaNacimiento, String lugar, String pais, String genero, String estadoCivil, String sexo, Blob foto, String etnia, Date fechaRegistro, String carnetConadis, boolean discapacidad, String tipoDiscapacidad, int porctDiscapacidad, String contactoEmergencia, boolean estadoActivo) {
        super(idPersona, identificacion, primNombre, segNombre, primApellido, segApellido, email, direccion, barrio, canton, provincia, telefono, fechaNacimiento, lugar, pais, genero, estadoCivil, sexo, foto, etnia, fechaRegistro, carnetConadis, discapacidad, tipoDiscapacidad, porctDiscapacidad, contactoEmergencia, estadoActivo);
        this.idPaciente = idPaciente;
    }

    public Paciente() {
        super();
    }

    // Getters y Setters
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }


    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente=" + idPaciente +
                "} " + super.toString();
    }
}

