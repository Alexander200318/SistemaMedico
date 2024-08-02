/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Joel
 */
public class EmergenciaObstetrica {
    private int idEmerObstetrica;
    private int menarca;
    private int ciclos;
    private Date fum;
    private String regularidad;
    private int ivsa;
    private int numeroParejasSexuales;
    private int gravides;
    private int abortos;
    private int partos;
    private int cesareas;
    private int mastodinia;
    private int disminorrea;
    private Date fpp;
    private int semanasGestacion;
    private int diasGestacion;
    private int controles;
    private String inmunizaciones;
    private int idTriage;
    private boolean embarazo;

    // Constructor completo

    public EmergenciaObstetrica(int menarca, int ciclos, Date fum, String regularidad, int ivsa, int numeroParejasSexuales, int gravides, int abortos, int partos, int cesareas, int mastodinia, int disminorrea, Date fpp, int semanasGestacion, int diasGestacion, int controles, String inmunizaciones, int idTriage, boolean embarazo) {
        this.menarca = menarca;
        this.ciclos = ciclos;
        this.fum = fum;
        this.regularidad = regularidad;
        this.ivsa = ivsa;
        this.numeroParejasSexuales = numeroParejasSexuales;
        this.gravides = gravides;
        this.abortos = abortos;
        this.partos = partos;
        this.cesareas = cesareas;
        this.mastodinia = mastodinia;
        this.disminorrea = disminorrea;
        this.fpp = fpp;
        this.semanasGestacion = semanasGestacion;
        this.diasGestacion = diasGestacion;
        this.controles = controles;
        this.inmunizaciones = inmunizaciones;
        this.idTriage = idTriage;
        this.embarazo = embarazo;
    }

    

    public int getIdEmerObstetrica() {
        return idEmerObstetrica;
    }

    public void setIdEmerObstetrica(int idEmerObstetrica) {
        this.idEmerObstetrica = idEmerObstetrica;
    }

    public int getMenarca() {
        return menarca;
    }

    public void setMenarca(int menarca) {
        this.menarca = menarca;
    }

    public int getCiclos() {
        return ciclos;
    }

    public void setCiclos(int ciclos) {
        this.ciclos = ciclos;
    }

    public Date getFum() {
        return fum;
    }

    public void setFum(Date fum) {
        this.fum = fum;
    }

    public String getRegularidad() {
        return regularidad;
    }

    public void setRegularidad(String regularidad) {
        this.regularidad = regularidad;
    }

    public int getIvsa() {
        return ivsa;
    }

    public void setIvsa(int ivsa) {
        this.ivsa = ivsa;
    }

    public int getNumeroParejasSexuales() {
        return numeroParejasSexuales;
    }

    public void setNumeroParejasSexuales(int numeroParejasSexuales) {
        this.numeroParejasSexuales = numeroParejasSexuales;
    }

    public int getGravides() {
        return gravides;
    }

    public void setGravides(int gravides) {
        this.gravides = gravides;
    }

    public int getAbortos() {
        return abortos;
    }

    public void setAbortos(int abortos) {
        this.abortos = abortos;
    }

    public int getPartos() {
        return partos;
    }

    public void setPartos(int partos) {
        this.partos = partos;
    }

    public int getCesareas() {
        return cesareas;
    }

    public void setCesareas(int cesareas) {
        this.cesareas = cesareas;
    }

    public int getMastodinia() {
        return mastodinia;
    }

    public void setMastodinia(int mastodinia) {
        this.mastodinia = mastodinia;
    }

    public int getDisminorrea() {
        return disminorrea;
    }

    public void setDisminorrea(int disminorrea) {
        this.disminorrea = disminorrea;
    }
    
    public Date getFpp() {
        return fpp;
    }

    public void setFpp(Date fpp) {
        this.fpp = fpp;
    }

    public int getSemanasGestacion() {
        return semanasGestacion;
    }

    public void setSemanasGestacion(int semanasGestacion) {
        this.semanasGestacion = semanasGestacion;
    }

    public int getDiasGestacion() {
        return diasGestacion;
    }

    public void setDiasGestacion(int diasGestacion) {
        this.diasGestacion = diasGestacion;
    }

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public String getInmunizaciones() {
        return inmunizaciones;
    }

    public void setInmunizaciones(String inmunizaciones) {
        this.inmunizaciones = inmunizaciones;
    }

    public int getIdTriage() {
        return idTriage;
    }

    public void setIdTriage(int idTriage) {
        this.idTriage = idTriage;
    }

    public boolean isEmbarazo() {
        return embarazo;
    }

    public void setEmbarazo(boolean embarazo) {
        this.embarazo = embarazo;
    }
     
}


