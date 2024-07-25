/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alexa
 */
public class AntecedentesPersonales extends Antecedentes{
     private int idPaciente;

    public AntecedentesPersonales(int idAntecedentes, String alergias, String clinico, String ginecologico, String traumatologico, String quirurgico, String farmacologico, String enfermedades, String cirugias, String vacunas) {
        super(idAntecedentes, alergias, clinico, ginecologico, traumatologico, quirurgico, farmacologico, enfermedades, cirugias, vacunas);
    }
     
     
     

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
     
    
}
