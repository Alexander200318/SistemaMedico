/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alexa
 */
public class Encabezado_HistorialPaciente {
    private int id_historial;
    private String fecha_consulta;
    private String identificacion;
    private String nombre_doctor;
    private String diagnostico;
    private String trige;

    public Encabezado_HistorialPaciente(int id_historial, String fecha_consulta, String identificacion, String nombre_doctor, String diagnostico, String trige) {
        this.id_historial = id_historial;
        this.fecha_consulta = fecha_consulta;
        this.identificacion = identificacion;
        this.nombre_doctor = nombre_doctor;
        this.diagnostico = diagnostico;
        this.trige = trige;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

   

    public int getId_historial() {
        return id_historial;
    }

    public void setId_historial(int id_historial) {
        this.id_historial = id_historial;
    }

    public String getFecha_consulta() {
        return fecha_consulta;
    }

    public void setFecha_consulta(String fecha_consulta) {
        this.fecha_consulta = fecha_consulta;
    }

    public String getNombre_doctor() {
        return nombre_doctor;
    }

    public void setNombre_doctor(String nombre_doctor) {
        this.nombre_doctor = nombre_doctor;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTrige() {
        return trige;
    }

    public void setTrige(String trige) {
        this.trige = trige;
    }
 

}
