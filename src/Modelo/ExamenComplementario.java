/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Joel
 */
public class ExamenComplementario {
    private int idExamenCom;
    private String resultados;
    private boolean aplica;
    private int idConsulta;

    public ExamenComplementario(String resultados, boolean aplica, int idConsulta) {
        this.resultados = resultados;
        this.aplica = aplica;
        this.idConsulta = idConsulta;
    }

    
    // Constructor
    public ExamenComplementario(int idExamenCom, String resultados, boolean aplica, int idConsulta) {
        this.idExamenCom = idExamenCom;
        this.resultados = resultados;
        this.aplica = aplica;
        this.idConsulta = idConsulta;
    }

    // Getters and Setters
    public int getIdExamenCom() {
        return idExamenCom;
    }

    public void setIdExamenCom(int idExamenCom) {
        this.idExamenCom = idExamenCom;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    public boolean isAplica() {
        return aplica;
    }

    public void setAplica(boolean aplica) {
        this.aplica = aplica;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }
}