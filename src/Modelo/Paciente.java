/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date; 

public class Paciente {
    private int idPaciente;
    private Persona persona;
    private boolean pacEstActivo;

    // Constructor
    public Paciente(int idPaciente, Persona persona, boolean pacEstActivo) {
        this.idPaciente = idPaciente;
        this.persona = persona;
        this.pacEstActivo = pacEstActivo;
    }

    // Getters and Setters
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
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
                ", persona=" + persona +
                ", pacEstActivo=" + pacEstActivo +
                '}';
    }
}

