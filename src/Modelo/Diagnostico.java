/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Joel
 */
public class Diagnostico {
    private int idDiagnostico;
    private String descripDiag;
    private int cie10;
    private boolean dPresuntivo;
    private boolean dDefinitivo;
    private int idHistorial;

    public Diagnostico(String descripDiag, int cie10, boolean dPresuntivo, boolean dDefinitivo, int idHistorial) {
        this.descripDiag = descripDiag;
        this.cie10 = cie10;
        this.dPresuntivo = dPresuntivo;
        this.dDefinitivo = dDefinitivo;
        this.idHistorial = idHistorial;
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getDescripDiag() {
        return descripDiag;
    }

    public void setDescripDiag(String descripDiag) {
        this.descripDiag = descripDiag;
    }

    public int getCie10() {
        return cie10;
    }

    public void setCie10(int cie10) {
        this.cie10 = cie10;
    }

    public boolean isdPresuntivo() {
        return dPresuntivo;
    }

    public void setdPresuntivo(boolean dPresuntivo) {
        this.dPresuntivo = dPresuntivo;
    }

    public boolean isdDefinitivo() {
        return dDefinitivo;
    }

    public void setdDefinitivo(boolean dDefinitivo) {
        this.dDefinitivo = dDefinitivo;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    @Override
    public String toString() {
        return "Diagnostico{" + "idDiagnostico=" + idDiagnostico + ", descripDiag=" + descripDiag + ", cie10=" + cie10 + ", dPresuntivo=" + dPresuntivo + ", dDefinitivo=" + dDefinitivo + ", idHistorial=" + idHistorial + '}';
    }
 
}
