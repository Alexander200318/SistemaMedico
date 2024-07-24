/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Joel
 */
import java.sql.Date;

public class Historial {
    private int idHistorial;
    private Date fecha;
    private String descripcionHist;
    private boolean hisEstActivo;
    private Date fechaCierre;
    private String estado;
    private int idConsulta;
    private int idPaciente;
    private int idTriage;
    private int idDoctor;

    // Constructor sin argumentos
    public Historial() {
    
    }

    // Constructor con todos los parámetros
    public Historial(int idHistorial, Date fecha, String descripcionHist, boolean hisEstActivo, Date fechaCierre, String estado, int idConsulta, int idPaciente, int idTriage, int idDoctor) {
        this.idHistorial = idHistorial;
        this.fecha = fecha;
        this.descripcionHist = descripcionHist;
        this.hisEstActivo = hisEstActivo;
        this.fechaCierre = fechaCierre;
        this.estado = estado;
        this.idConsulta = idConsulta;
        this.idPaciente = idPaciente;
        this.idTriage = idTriage;
        this.idDoctor = idDoctor;
    }
    
    public Historial(Date fecha, String descripcionHist, boolean hisEstActivo, Date fechaCierre, String estado, int idConsulta, int idPaciente, int idTriage, int idDoctor) {
        this.fecha = fecha;
        this.descripcionHist = descripcionHist;
        this.hisEstActivo = hisEstActivo;
        this.fechaCierre = fechaCierre;
        this.estado = estado;
        this.idConsulta = idConsulta;
        this.idPaciente = idPaciente;
        this.idTriage = idTriage;
        this.idDoctor = idDoctor;
    }

    // Getters y setters
    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcionHist() {
        return descripcionHist;
    }

    public void setDescripcionHist(String descripcionHist) {
        this.descripcionHist = descripcionHist;
    }

    public boolean isHisEstActivo() {
        return hisEstActivo;
    }

    public void setHisEstActivo(boolean hisEstActivo) {
        this.hisEstActivo = hisEstActivo;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdTriage() {
        return idTriage;
    }

    public void setIdTriage(int idTriage) {
        this.idTriage = idTriage;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }
}

