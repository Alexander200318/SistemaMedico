/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Familiar {
    private int idAntFamiliares;
    private String parentesco;
    private int idAntecedentes;
    private int idPaciente;

    public Familiar() {
    }

    // Constructor
    public Familiar(int idAntFamiliares, String parentesco, int idAntecedentes, int idPaciente) {
        this.idAntFamiliares = idAntFamiliares;
        this.parentesco = parentesco;
        this.idAntecedentes = idAntecedentes;
        this.idPaciente = idPaciente;
    }

    // Getters y setters
    public int getIdAntFamiliares() {
        return idAntFamiliares;
    }

    public void setIdAntFamiliares(int idAntFamiliares) {
        this.idAntFamiliares = idAntFamiliares;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public int getIdAntecedentes() {
        return idAntecedentes;
    }

    public void setIdAntecedentes(int idAntecedentes) {
        this.idAntecedentes = idAntecedentes;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
}
