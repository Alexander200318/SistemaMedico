/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Controlador.ControladorPaciente;
import Modelo.Paciente;
import Modelo.Persona;
import Vista.REGISTRO_PACIENTE;
import java.sql.Date;

/**
 *
 * @author alexa
 */
import java.sql.Date;

public class Registro_PacienteDAO {

    private ControladorPaciente control;
    private Paciente modeloPaciente;
    private REGISTRO_PACIENTE vistaPrincipal;

    public Registro_PacienteDAO(REGISTRO_PACIENTE vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;

        this.vistaPrincipal.getBtn_Guardar_pac().addActionListener((e) -> {
            guardarPaciente();
        });
    }

    private void guardarPaciente() {
        try {
            modeloPaciente = new Paciente(
                0, // idPaciente, puede ser 0 si es auto-increment en la base de datos
                new Persona(
                    0, // idPersona, puede ser 0 si es auto-increment en la base de datos
                    vistaPrincipal.getText_Cedula_pac().getText(),
                    vistaPrincipal.getText_Nombre_pac().getText(),
                    "", // Segundo nombre
                    vistaPrincipal.getText_Apellido_pac().getText(),
                    "", // Segundo apellido
                    "", // Email
                    vistaPrincipal.getText_Direccion_pac().getText(),
                    "", // Barrio
                    vistaPrincipal.getText_Canton_pac().getText(),
                    "Azuay", // Provincia
                    vistaPrincipal.getText_Telefono_pac().getText(),
                    utilDateToSqlDate(new java.util.Date()), // Fecha de nacimiento
                    "", // Lugar
                    vistaPrincipal.getText_Pais_pac().getText(),
                    "M", // Género
                    "Soltero", // Estado civil
                    "M", // Sexo
                    null, // Foto
                    "", // Etnia
                    utilDateToSqlDate(new java.util.Date()), // Fecha de registro
                    "", // Carnet Conadis
                    false, // Discapacidad
                    "", // Tipo de discapacidad
                    0, // Porcentaje de discapacidad
                    "", // Contacto de emergencia
                    true // Estado activo
                ),
                true // Estado activo del paciente
            );

            control = new ControladorPaciente();

            // Llamar al método registrar del controlador para guardar el paciente
            control.registrar(modeloPaciente);
            System.out.println("Se guardó correctamente.");
        } catch (Exception e) {
            System.out.println("Error al guardar paciente: " + e.getMessage());
        }
    }

    public Date utilDateToSqlDate(java.util.Date utilDate) {
        return new Date(utilDate.getTime());
    }
}
