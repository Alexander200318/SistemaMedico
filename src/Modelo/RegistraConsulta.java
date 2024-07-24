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
public class RegistraConsulta {
    private int idRegistConsultas;
    private Date fechaConsult;
    private int idConsulta;
    private int idDoctor;
    private int idPaciente;

    public RegistraConsulta(Date fechaConsult, int idConsulta, int idDoctor, int idPaciente) {
        this.fechaConsult = fechaConsult;
        this.idConsulta = idConsulta;
        this.idDoctor = idDoctor;
        this.idPaciente = idPaciente;
    }

    public int getIdRegistConsultas() {
        return idRegistConsultas;
    }

    public void setIdRegistConsultas(int idRegistConsultas) {
        this.idRegistConsultas = idRegistConsultas;
    }

    public Date getFechaConsult() {
        return fechaConsult;
    }

    public void setFechaConsult(Date fechaConsult) {
        this.fechaConsult = fechaConsult;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public String toString() {
        return "RegistraConsulta{" + "idRegistConsultas=" + idRegistConsultas + ", fechaConsult=" + fechaConsult + ", idConsulta=" + idConsulta + ", idDoctor=" + idDoctor + ", idPaciente=" + idPaciente + '}';
    }
}
