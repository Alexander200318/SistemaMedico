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
public class Seguimiento {
    private int idSeguimiento;
    private String notas;
    private Date fechaSeg;
    private int numSeg;
    private int idHistorial;
    private int idSeguimientoAnterior;
    private int idDoctor;

    public Seguimiento(String notas, Date fechaSeg, int numSeg, int idHistorial, int idSeguimientoAnterior, int idDoctor) {
        this.notas = notas;
        this.fechaSeg = fechaSeg;
        this.numSeg = numSeg;
        this.idHistorial = idHistorial;
        this.idSeguimientoAnterior = idSeguimientoAnterior;
        this.idDoctor = idDoctor;
    }

    public int getIdSeguimiento() {
        return idSeguimiento;
    }

    public void setIdSeguimiento(int idSeguimiento) {
        this.idSeguimiento = idSeguimiento;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Date getFechaSeg() {
        return fechaSeg;
    }

    public void setFechaSeg(Date fechaSeg) {
        this.fechaSeg = fechaSeg;
    }

    public int getNumSeg() {
        return numSeg;
    }

    public void setNumSeg(int numSeg) {
        this.numSeg = numSeg;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public int getIdSeguimientoAnterior() {
        return idSeguimientoAnterior;
    }

    public void setIdSeguimientoAnterior(int idSeguimientoAnterior) {
        this.idSeguimientoAnterior = idSeguimientoAnterior;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    @Override
    public String toString() {
        return "Seguimiento{" + "idSeguimiento=" + idSeguimiento + ", notas=" + notas + ", fechaSeg=" + fechaSeg + ", numSeg=" + numSeg + ", idHistorial=" + idHistorial + ", idSeguimientoAnterior=" + idSeguimientoAnterior + ", idDoctor=" + idDoctor + '}';
    }
    
}
