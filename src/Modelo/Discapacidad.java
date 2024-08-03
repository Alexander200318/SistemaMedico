/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alexa
 */
public class Discapacidad {
    private boolean Carnet_Conadis;
    private String Tipo_Discapacidad; 
    private int Porct_Discapacidad;
    private String Observacion ;

    public Discapacidad() {
    }

    public Discapacidad(boolean Carnet_Conadis, String Tipo_Discapacidad, int Porct_Discapacidad, String Observacion) {
        this.Carnet_Conadis = Carnet_Conadis;
        this.Tipo_Discapacidad = Tipo_Discapacidad;
        this.Porct_Discapacidad = Porct_Discapacidad;
        this.Observacion = Observacion;
    }


    /**
     * @return the Carnet_Conadis
     */
    public boolean isCarnet_Conadis() {
        return Carnet_Conadis;
    }

    /**
     * @param Carnet_Conadis the Carnet_Conadis to set
     */
    public void setCarnet_Conadis(boolean Carnet_Conadis) {
        this.Carnet_Conadis = Carnet_Conadis;
    }

    /**
     * @return the Tipo_Discapacidad
     */
    public String getTipo_Discapacidad() {
        return Tipo_Discapacidad;
    }

    /**
     * @param Tipo_Discapacidad the Tipo_Discapacidad to set
     */
    public void setTipo_Discapacidad(String Tipo_Discapacidad) {
        this.Tipo_Discapacidad = Tipo_Discapacidad;
    }

    /**
     * @return the Porct_Discapacidad
     */
    public int getPorct_Discapacidad() {
        return Porct_Discapacidad;
    }

    /**
     * @param Porct_Discapacidad the Porct_Discapacidad to set
     */
    public void setPorct_Discapacidad(int Porct_Discapacidad) {
        this.Porct_Discapacidad = Porct_Discapacidad;
    }

    /**
     * @return the Observacion
     */
    public String getObservacion() {
        return Observacion;
    }

    /**
     * @param Observacion the Observacion to set
     */
    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

   
}
