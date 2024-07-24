/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Joel
 */
public class Receta {
    private int idReceta;
    private String medicamentos;
    private String descripcion;
    private int idTratamiento;

    public Receta(String medicamentos, String descripcion, int idTratamiento) {
        this.medicamentos = medicamentos;
        this.descripcion = descripcion;
        this.idTratamiento = idTratamiento;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    @Override
    public String toString() {
        return "Receta{" + "idReceta=" + idReceta + ", medicamentos=" + medicamentos + ", descripcion=" + descripcion + ", idTratamiento=" + idTratamiento + '}';
    }
    
}
