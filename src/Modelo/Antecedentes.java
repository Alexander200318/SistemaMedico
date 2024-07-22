/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Joel
 */
public class Antecedentes {
    private int idAntecedentes;
    private String alergias;
    private String clinico;
    private String ginecologico;
    private String traumatologico;
    private String quirurgico;
    private String farmacologico;
    private String enfermedades;
    private String cirugias;
    private String vacunas;

    public Antecedentes() {
    }

    // Constructor
    public Antecedentes(int idAntecedentes, String alergias, String clinico, String ginecologico, String traumatologico, String quirurgico, String farmacologico, String enfermedades, String cirugias, String vacunas) {
        this.idAntecedentes = idAntecedentes;
        this.alergias = alergias;
        this.clinico = clinico;
        this.ginecologico = ginecologico;
        this.traumatologico = traumatologico;
        this.quirurgico = quirurgico;
        this.farmacologico = farmacologico;
        this.enfermedades = enfermedades;
        this.cirugias = cirugias;
        this.vacunas = vacunas;
    }

    // Getters y setters
    public int getIdAntecedentes() {
        return idAntecedentes;
    }

    public void setIdAntecedentes(int idAntecedentes) {
        this.idAntecedentes = idAntecedentes;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getClinico() {
        return clinico;
    }

    public void setClinico(String clinico) {
        this.clinico = clinico;
    }

    public String getGinecologico() {
        return ginecologico;
    }

    public void setGinecologico(String ginecologico) {
        this.ginecologico = ginecologico;
    }

    public String getTraumatologico() {
        return traumatologico;
    }

    public void setTraumatologico(String traumatologico) {
        this.traumatologico = traumatologico;
    }

    public String getQuirurgico() {
        return quirurgico;
    }

    public void setQuirurgico(String quirurgico) {
        this.quirurgico = quirurgico;
    }

    public String getFarmacologico() {
        return farmacologico;
    }

    public void setFarmacologico(String farmacologico) {
        this.farmacologico = farmacologico;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getCirugias() {
        return cirugias;
    }

    public void setCirugias(String cirugias) {
        this.cirugias = cirugias;
    }

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }
}
