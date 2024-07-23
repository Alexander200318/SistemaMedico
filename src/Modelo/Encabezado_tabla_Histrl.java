/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alexa
 */
public class Encabezado_tabla_Histrl {
    private int id_historial;
    private String identiificasion;
    private String nombre_paciente;
    private String edad;
    private String sexo;
    private String fecha_consulta;
    private String nombre_doctor;
    private String diagnostico;
    private String trige;

    public Encabezado_tabla_Histrl() {
    }

    public Encabezado_tabla_Histrl(int id_historial, String identiificasion, String nombre_paciente, String edad, String sexo, String fecha_consulta, String nombre_doctor, String diagnostico, String trige) {
        this.id_historial = id_historial;
        this.identiificasion = identiificasion;
        this.nombre_paciente = nombre_paciente;
        this.edad = edad;
        this.sexo = sexo;
        this.fecha_consulta = fecha_consulta;
        this.nombre_doctor = nombre_doctor;
        this.diagnostico = diagnostico;
        this.trige = trige;
    }


    

    public String getTrige() {
        return trige;
    }

    public void setTrige(String trige) {
        this.trige = trige;
    }

   

    public int getId_historial() {
        return id_historial;
    }

    public void setId_historial(int id_historial) {
        this.id_historial = id_historial;
    }

    public String getIdentiificasion() {
        return identiificasion;
    }

    public void setIdentiificasion(String identiificasion) {
        this.identiificasion = identiificasion;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    
    


}
