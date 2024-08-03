/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Blob;
import java.sql.Date;

public class Persona {

    private int idPersona;
    private String identificacion;
    private String primNombre;
    private String segNombre;
    private String primApellido;
    private String segApellido;
    private String email;
    private String direccion;
    private String barrio;
    private String canton;
    private String provincia;
    private String telefono;
    private Date fechaNacimiento;
    private String lugar;
    private String pais;
    private String genero;
    private String estadoCivil;
    private String sexo;
    private byte[] foto;
    private String etnia;
    private Date fechaRegistro;
    
//    private String carnetConadis;
//    private boolean discapacidad;
//    private String tipoDiscapacidad;
//    private int porctDiscapacidad;
    
    private String contactoEmergencia;
    private boolean estadoActivo;
    private String tipo_sangre;

    // Constructor


    public Persona() {
    }

    public Persona(int idPersona, String identificacion, String primNombre, String segNombre, String primApellido, String segApellido, String email, String direccion, String barrio, String canton, String provincia, String telefono, Date fechaNacimiento, String lugar, String pais, String genero, String estadoCivil, String sexo, byte[] foto, String etnia, Date fechaRegistro, String contactoEmergencia, boolean estadoActivo, String tipo_sangre) {
        this.idPersona = idPersona;
        this.identificacion = identificacion;
        this.primNombre = primNombre;
        this.segNombre = segNombre;
        this.primApellido = primApellido;
        this.segApellido = segApellido;
        this.email = email;
        this.direccion = direccion;
        this.barrio = barrio;
        this.canton = canton;
        this.provincia = provincia;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.lugar = lugar;
        this.pais = pais;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.foto = foto;
        this.etnia = etnia;
        this.fechaRegistro = fechaRegistro;
        this.contactoEmergencia = contactoEmergencia;
        this.estadoActivo = estadoActivo;
        this.tipo_sangre = tipo_sangre;
    }

    

    
    // Getters y Setters

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPrimNombre() {
        return primNombre;
    }

    public void setPrimNombre(String primNombre) {
        this.primNombre = primNombre;
    }

    public String getSegNombre() {
        return segNombre;
    }

    public void setSegNombre(String segNombre) {
        this.segNombre = segNombre;
    }

    public String getPrimApellido() {
        return primApellido;
    }

    public void setPrimApellido(String primApellido) {
        this.primApellido = primApellido;
    }

    public String getSegApellido() {
        return segApellido;
    }

    public void setSegApellido(String segApellido) {
        this.segApellido = segApellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", identificacion=" + identificacion + ", primNombre=" + primNombre + ", segNombre=" + segNombre + ", primApellido=" + primApellido + ", segApellido=" + segApellido + ", email=" + email + ", direccion=" + direccion + ", barrio=" + barrio + ", canton=" + canton + ", provincia=" + provincia + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", lugar=" + lugar + ", pais=" + pais + ", genero=" + genero + ", estadoCivil=" + estadoCivil + ", sexo=" + sexo + ", foto=" + foto + ", etnia=" + etnia + ", fechaRegistro=" + fechaRegistro + ", contactoEmergencia=" + contactoEmergencia + ", estadoActivo=" + estadoActivo + ", tipo_sangre=" + tipo_sangre + '}';
    }

}
