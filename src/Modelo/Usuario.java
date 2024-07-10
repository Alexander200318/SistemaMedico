/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Jhony
 */
public class Usuario {

    String Cedula;
    String Nombre;
    String Apellido;
    String Telefono;
    String Contraseña;
    String Correo;
    boolean Estado;
    Date Fecha_Creacion;

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public Usuario(String Cedula, String Nombre, String Apellido, String Telefono, String Contraseña, String Correo, boolean Estado) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Contraseña = Contraseña;
        this.Correo = Correo;
        this.Estado = Estado;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" + "Cedula=" + Cedula + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Telefono=" + Telefono + ", Contrase\u00f1a=" + Contraseña + ", Correo=" + Correo + ", Estado=" + Estado + '}';
    }

}
