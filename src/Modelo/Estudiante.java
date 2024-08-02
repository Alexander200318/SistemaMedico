/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alexa
 */
public class Estudiante{
    
    private int idcarrera;
    private String ciclo;
    private boolean estEstado;

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public boolean isEstEstado() {
        return estEstado;
    }

    public void setEstEstado(boolean estEstado) {
        this.estEstado = estEstado;
    }

    public Estudiante(int idcarrera, String ciclo, boolean estEstado) {
        this.idcarrera = idcarrera;
        this.ciclo = ciclo;
        this.estEstado = estEstado;
    }

    public Estudiante() {
    }
}
