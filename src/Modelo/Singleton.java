/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jhony
 */
public class Singleton {
 private static volatile Singleton instance; ////No borrar    IMPORTANTE
 
 private  int IdPaciente;
 private int Id_Doctor;
 private String Identificacion_Historial;
 private int IdDiagnostico;
 private int idtratamiento;

 
 
    public static synchronized Singleton getInstance() { ////No borrar    IMPORTANTE  (Te pego dijo el jhony)
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getIdentificacion_Historial() {
        return Identificacion_Historial;
    }

    public void setIdentificacion_Historial(String Identificacion_Historial) {
        this.Identificacion_Historial = Identificacion_Historial;
    }

    
    
    public int getId_Doctor() {
        return Id_Doctor;
    }

    public void setId_Doctor(int Id_Doctor) {
        this.Id_Doctor = Id_Doctor;
    }

    
    public int getIdPaciente() {
        return IdPaciente;
    }

    public void setIdPaciente(int IdPaciente) {
        this.IdPaciente = IdPaciente;
    }

    public int getIdDiagnostico() {
        return IdDiagnostico;
    }

    public void setIdDiagnostico(int IdDiagnostico) {
        this.IdDiagnostico = IdDiagnostico;
    }

    public int getIdtratamiento() {
        return idtratamiento;
    }

    public void setIdtratamiento(int idtratamiento) {
        this.idtratamiento = idtratamiento;
    }

    
}