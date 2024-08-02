/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jhony
 */
public class SignosVitales {

    private int idSigVitales;
    private String presionArterial;
    private float peso;
    private float talla;
    private float indiceMasaCorporal;
    private int frecuenciaCardiaca;
    private int frecuenciaRespiratoria;
    private float temperatura;
    private float saturacionOxigeno;
    private int ocular;
    private int verbal;
    private int motora;
    private int total;
    private String llenadoCapilar;
    private String rPupilar;
    private int idTriage;

    public SignosVitales(int idSigVitales, String presionArterial, float peso, float talla, float indiceMasaCorporal, int frecuenciaCardiaca, int frecuenciaRespiratoria, float temperatura, float saturacionOxigeno, int ocular, int verbal, int motora, int total, String llenadoCapilar, String rPupilar, int idTriage) {
        this.idSigVitales = idSigVitales;
        this.presionArterial = presionArterial;
        this.peso = peso;
        this.talla = talla;
        this.indiceMasaCorporal = indiceMasaCorporal;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.temperatura = temperatura;
        this.saturacionOxigeno = saturacionOxigeno;
        this.ocular = ocular;
        this.verbal = verbal;
        this.motora = motora;
        this.total = total;
        this.llenadoCapilar = llenadoCapilar;
        this.rPupilar = rPupilar;
        this.idTriage = idTriage;
    }

    public SignosVitales(String presionArterial, float peso, float talla, float indiceMasaCorporal, int frecuenciaCardiaca, int frecuenciaRespiratoria, float temperatura, float saturacionOxigeno, int ocular, int verbal, int motora, int total, String llenadoCapilar, String rPupilar, int idTriage) {
        this.presionArterial = presionArterial;
        this.peso = peso;
        this.talla = talla;
        this.indiceMasaCorporal = indiceMasaCorporal;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.temperatura = temperatura;
        this.saturacionOxigeno = saturacionOxigeno;
        this.ocular = ocular;
        this.verbal = verbal;
        this.motora = motora;
        this.total = total;
        this.llenadoCapilar = llenadoCapilar;
        this.rPupilar = rPupilar;
        this.idTriage = idTriage;
    }

    
    
   
    public int getIdSigVitales() {
        return idSigVitales;
    }

    public void setIdSigVitales(int idSigVitales) {
        this.idSigVitales = idSigVitales;
    }

    public String getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(String presionArterial) {
        this.presionArterial = presionArterial;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }

    public float getIndiceMasaCorporal() {
        return indiceMasaCorporal;
    }

    public void setIndiceMasaCorporal(float indiceMasaCorporal) {
        this.indiceMasaCorporal = indiceMasaCorporal;
    }

    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public int getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(int frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getSaturacionOxigeno() {
        return saturacionOxigeno;
    }

    public void setSaturacionOxigeno(float saturacionOxigeno) {
        this.saturacionOxigeno = saturacionOxigeno;
    }

    public int getOcular() {
        return ocular;
    }

    public void setOcular(int ocular) {
        this.ocular = ocular;
    }

    public int getVerbal() {
        return verbal;
    }

    public void setVerbal(int verbal) {
        this.verbal = verbal;
    }

    public int getMotora() {
        return motora;
    }

    public void setMotora(int motora) {
        this.motora = motora;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getLlenadoCapilar() {
        return llenadoCapilar;
    }

    public void setLlenadoCapilar(String llenadoCapilar) {
        this.llenadoCapilar = llenadoCapilar;
    }

    public String getrPupilar() {
        return rPupilar;
    }

    public void setrPupilar(String rPupilar) {
        this.rPupilar = rPupilar;
    }

    public int getIdTriage() {
        return idTriage;
    }

    public void setIdTriage(int idTriage) {
        this.idTriage = idTriage;
    }

    @Override
    public String toString() {
        return "SignosVitales{" + "idSigVitales=" + idSigVitales + ", presionArterial=" + presionArterial + ", peso=" + peso + ", talla=" + talla + ", indiceMasaCorporal=" + indiceMasaCorporal + ", frecuenciaCardiaca=" + frecuenciaCardiaca + ", frecuenciaRespiratoria=" + frecuenciaRespiratoria + ", temperatura=" + temperatura + ", saturacionOxigeno=" + saturacionOxigeno + ", ocular=" + ocular + ", verbal=" + verbal + ", motora=" + motora + ", total=" + total + ", llenadoCapilar=" + llenadoCapilar + ", rPupilar=" + rPupilar + ", idTriage=" + idTriage + '}';
    }
    
}