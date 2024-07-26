/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author Joel
 */
public class ExamenFisico {
    private int idExFisico;
    private String pielYFaneras;
    private String cabeza;
    private String cuello;
    private String torax;
    private String corazon;
    private String abdomen;
    private String rInguinal;
    private String mSuperiores;
    private String mInferiores;
    private int idTriage;

    // Constructor vacío
    public ExamenFisico() {
    
    }

    // Constructor con todos los atributos
    public ExamenFisico(int idExFisico, String pielYFaneras, String cabeza, String cuello, String torax, 
                        String corazon, String abdomen, String rInguinal, String mSuperiores, 
                        String mInferiores, int idTriage) {
        this.idExFisico = idExFisico;
        this.pielYFaneras = pielYFaneras;
        this.cabeza = cabeza;
        this.cuello = cuello;
        this.torax = torax;
        this.corazon = corazon;
        this.abdomen = abdomen;
        this.rInguinal = rInguinal;
        this.mSuperiores = mSuperiores;
        this.mInferiores = mInferiores;
        this.idTriage = idTriage;
    }

    // Getters y setters
    public int getIdExFisico() {
        return idExFisico;
    }

    public void setIdExFisico(int idExFisico) {
        this.idExFisico = idExFisico;
    }

    public String getPielYFaneras() {
        return pielYFaneras;
    }

    public void setPielYFaneras(String pielYFaneras) {
        this.pielYFaneras = pielYFaneras;
    }

    public String getCabeza() {
        return cabeza;
    }

    public void setCabeza(String cabeza) {
        this.cabeza = cabeza;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public String getTorax() {
        return torax;
    }

    public void setTorax(String torax) {
        this.torax = torax;
    }

    public String getCorazon() {
        return corazon;
    }

    public void setCorazon(String corazon) {
        this.corazon = corazon;
    }

    public String getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }

    public String getRInguinal() {
        return rInguinal;
    }

    public void setRInguinal(String rInguinal) {
        this.rInguinal = rInguinal;
    }

    public String getMSuperiores() {
        return mSuperiores;
    }

    public void setMSuperiores(String mSuperiores) {
        this.mSuperiores = mSuperiores;
    }

    public String getMInferiores() {
        return mInferiores;
    }

    public void setMInferiores(String mInferiores) {
        this.mInferiores = mInferiores;
    }

    public int getIdTriage() {
        return idTriage;
    }

    public void setIdTriage(int idTriage) {
        this.idTriage = idTriage;
    }
   
}
