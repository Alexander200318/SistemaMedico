/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jhony
 */
public class Triage {
    private int idTriage;
    private String nivelPrioridad;
    private boolean triEstActivo;

    public int getIdTriage() {
        return idTriage;
    }

    public void setIdTriage(int idTriage) {
        this.idTriage = idTriage;
    }

    public String getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(String nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    public boolean isTriEstActivo() {
        return triEstActivo;
    }

    public void setTriEstActivo(boolean triEstActivo) {
        this.triEstActivo = triEstActivo;
    }
    
    

    public Triage(int idTriage, String nivelPrioridad, boolean triEstActivo) {
        this.idTriage = idTriage;
        this.nivelPrioridad = nivelPrioridad;
        this.triEstActivo = triEstActivo;
    }

    public Triage() {
    }

    @Override
    public String toString() {
        return "Triage{" + "idTriage=" + idTriage + ", nivelPrioridad=" + nivelPrioridad + ", triEstActivo=" + triEstActivo + '}';
    }
    
}
