/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jhony
 */
public class Personal {
    private int idAnPersonales;
    private Antecedentes antecedentes;
    private Paciente paciente;

    // Constructor
    public Personal(int idAnPersonales, Antecedentes antecedentes, Paciente paciente) {
        this.idAnPersonales = idAnPersonales;
        this.antecedentes = antecedentes;
        this.paciente = paciente;
    }

    public Personal() {}

    // Getters y Setters
    public int getIdAnPersonales() {
        return idAnPersonales;
    }

    public void setIdAnPersonales(int idAnPersonales) {
        this.idAnPersonales = idAnPersonales;
    }

    public Antecedentes getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(Antecedentes antecedentes) {
        this.antecedentes = antecedentes;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "idAnPersonales=" + idAnPersonales +
                ", antecedentes=" + antecedentes +
                ", paciente=" + paciente +
                '}';
    }
}

