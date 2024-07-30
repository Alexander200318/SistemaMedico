/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Blob;
import java.sql.Date;

public class Paciente extends Persona {
    private int idPaciente;
    private boolean pacEstActivo;

    // Constructor completo

    public Paciente(int idPaciente, boolean pacEstActivo, int idPersona, String identificacion, String primNombre, String segNombre, String primApellido, String segApellido, String email, String direccion, String barrio, String canton, String provincia, String telefono, Date fechaNacimiento, String lugar, String pais, String genero, String estadoCivil, String sexo, byte[] foto, String etnia, Date fechaRegistro, String carnetConadis, boolean discapacidad, String tipoDiscapacidad, int porctDiscapacidad, String contactoEmergencia, boolean estadoActivo, String tipo_sangre) {
        super(idPersona, identificacion, primNombre, segNombre, primApellido, segApellido, email, direccion, barrio, canton, provincia, telefono, fechaNacimiento, lugar, pais, genero, estadoCivil, sexo, foto, etnia, fechaRegistro, carnetConadis, discapacidad, tipoDiscapacidad, porctDiscapacidad, contactoEmergencia, estadoActivo, tipo_sangre);
        this.idPaciente = idPaciente;
        this.pacEstActivo = pacEstActivo;
    }

    public Paciente(boolean pacEstActivo) {
        this.pacEstActivo = pacEstActivo;
    }

    public Paciente(boolean pacEstActivo, int idPersona, String identificacion, String primNombre, String segNombre, String primApellido, String segApellido, String email, String direccion, String barrio, String canton, String provincia, String telefono, Date fechaNacimiento, String lugar, String pais, String genero, String estadoCivil, String sexo, byte[] foto, String etnia, Date fechaRegistro, String carnetConadis, boolean discapacidad, String tipoDiscapacidad, int porctDiscapacidad, String contactoEmergencia, boolean estadoActivo, String tipo_sangre) {
        super(idPersona, identificacion, primNombre, segNombre, primApellido, segApellido, email, direccion, barrio, canton, provincia, telefono, fechaNacimiento, lugar, pais, genero, estadoCivil, sexo, foto, etnia, fechaRegistro, carnetConadis, discapacidad, tipoDiscapacidad, porctDiscapacidad, contactoEmergencia, estadoActivo, tipo_sangre);
        this.pacEstActivo = pacEstActivo;
    }

    public Paciente(int idPaciente, int idPersona, String identificacion, String primNombre, String segNombre, String primApellido, String segApellido, String email, String direccion, String barrio, String canton, String provincia, String telefono, Date fechaNacimiento, String lugar, String pais, String genero, String estadoCivil, String sexo, byte[] foto, String etnia, Date fechaRegistro, String carnetConadis, boolean discapacidad, String tipoDiscapacidad, int porctDiscapacidad, String contactoEmergencia, boolean estadoActivo, String tipoSangre) {
    super(idPersona, identificacion, primNombre, segNombre, primApellido, segApellido, email, direccion, barrio, canton, provincia, telefono, fechaNacimiento, lugar, pais, genero, estadoCivil, sexo, foto, etnia, fechaRegistro, carnetConadis, discapacidad, tipoDiscapacidad, porctDiscapacidad, contactoEmergencia, estadoActivo, tipoSangre);
    this.idPaciente = idPaciente;
    this.pacEstActivo = estadoActivo;
}

    
    // Constructor por defecto
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

    public boolean isPacEstActivo() {
        return pacEstActivo;
    }

    public void setPacEstActivo(boolean pacEstActivo) {
        this.pacEstActivo = pacEstActivo;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente=" + idPaciente +
                ", pacEstActivo=" + pacEstActivo +
                "} " + super.toString();
    }
}
