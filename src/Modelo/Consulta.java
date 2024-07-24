/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Joel
 */
public class Consulta {
    private int idConsulta;
    private String enfermedadActual;
    private String motivo;
    private boolean consEstActivo;

    public Consulta() {
    }
    
    public Consulta(String enfermedadActual, String motivo, boolean consEstActivo) {
        this.enfermedadActual = enfermedadActual;
        this.motivo = motivo;
        this.consEstActivo = consEstActivo;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getEnfermedadActual() {
        return enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isConsEstActivo() {
        return consEstActivo;
    }

    public void setConsEstActivo(boolean consEstActivo) {
        this.consEstActivo = consEstActivo;
    }

    
    @Override
    public String toString() {
        return "Consulta{" + "idConsulta=" + idConsulta + ", enfermedadActual=" + enfermedadActual + ", motivo=" + motivo + ", consEstActivo=" + consEstActivo + '}';
    }
    
    

}
