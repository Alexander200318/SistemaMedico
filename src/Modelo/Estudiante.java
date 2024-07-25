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
    private String nivelAcademico;
    private String carrera;
    private String ciclo;
    private boolean estEstado;

    public Estudiante(String nivelAcademico, String carrera, String ciclo, boolean estEstado) {
        this.nivelAcademico = nivelAcademico;
        this.carrera = carrera;
        this.ciclo = ciclo;
        this.estEstado = estEstado;
    }
    
    

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
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
    
}
