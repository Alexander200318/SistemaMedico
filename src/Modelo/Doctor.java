/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Doctor {
    
    private int idDoctor;
    private String Identificacion;
    private String Nombre;
    private String Apellido;
    private String Especialidad;
    private String Email;
    private String Contrasena; 
    private String Celular;
    private String Titulo;
    private boolean Doc_Est_Activo;
    private int Id_Persona; 

    // Getters y Setters

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public boolean isDoc_Est_Activo() {
        return Doc_Est_Activo;
    }

    public void setDoc_Est_Activo(boolean Doc_Est_Activo) {
        this.Doc_Est_Activo = Doc_Est_Activo;
    }

    public int getId_Persona() {
        return Id_Persona;
    }

    public void setId_Persona(int Id_Persona) {
        this.Id_Persona = Id_Persona;
    }

    public Doctor(int idDoctor, String Identificacion, String Nombre, String Apellido, String Especialidad, String Email, String Contrasena, String Celular, String Titulo, boolean Doc_Est_Activo, int Id_Persona) {
        this.idDoctor = idDoctor;
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Especialidad = Especialidad;
        this.Email = Email;
        this.Contrasena = Contrasena;
        this.Celular = Celular;
        this.Titulo = Titulo;
        this.Doc_Est_Activo = Doc_Est_Activo;
        this.Id_Persona = Id_Persona;
    }

    public Doctor() {
    }

    @Override
    public String toString() {
        return "Doctor{" + "idDoctor=" + idDoctor + ", Identificacion=" + Identificacion + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Especialidad=" + Especialidad + ", Email=" + Email + ", Contrasena=" + Contrasena + ", Celular=" + Celular + ", Titulo=" + Titulo + ", Doc_Est_Activo=" + Doc_Est_Activo + ", Id_Persona=" + Id_Persona + '}';
    }
}
