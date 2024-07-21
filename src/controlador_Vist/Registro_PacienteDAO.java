/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

//import Controlador.ControladorPaciente;
//import Modelo.Paciente;
//import Modelo.Persona;
//import Vista.REGISTRO_PACIENTE;
//import java.sql.Date;
//
///**
// *
// * @author alexa
// */
//public class Registro_PacienteDAO {
//
//    ControladorPaciente control;
//    private Paciente modeloPaciente;
//
//    private REGISTRO_PACIENTE vistaPrincipal;
//
//    public Registro_PacienteDAO(REGISTRO_PACIENTE vistaPrincipal) {
//        this.vistaPrincipal = vistaPrincipal;
//
//        this.vistaPrincipal.getBtn_Guardar_pac().addActionListener((e) -> {
//            guardarPaciente();
//        });s
//    }
//
//    private void guardarPaciente() {
//        // Crear una instancia de Persona con los datos proporcionados
//        Persona persona = new Persona(
//            0, // idPersona - puede ser 0 o null si es AUTO_INCREMENT en la base de datos
//            vistaPrincipal.getText_Cedula_pac().getText(),
//            vistaPrincipal.getText_Nombre_pac().getText(),
//            vistaPrincipal.getText_Apellido_pac().getText(),
//            utilDateToSqlDate(new java.util.Date()), // fecha de nacimiento, ajustar según corresponda
//            vistaPrincipal.getText_Direccion_pac().getText(),
//            vistaPrincipal.getText_Barrio_pac().getText(),
//            vistaPrincipal.getText_Canton_pac().getText(),
//            vistaPrincipal.getText_Provincia_pac().getText(),
//            vistaPrincipal.getText_Telefono_pac().getText(),
//            vistaPrincipal.getText_Pais_pac().getText(),
//            "M", // género, ajustar según corresponda
//            vistaPrincipal.getText_EstadoCivil_pac().getText(),
//            vistaPrincipal.getText_Sexo_pac().getText(),
//            null, // foto, ajustar según corresponda
//            vistaPrincipal.getText_Etnia_pac().getText(),
//            utilDateToSqlDate(new java.util.Date()), // fechaRegistro, ajustar según corresponda
//            vistaPrincipal.getText_CarnetConadis_pac().getText(),
//            false, // discapacidad, ajustar según corresponda
//            vistaPrincipal.getText_TipoDiscapacidad_pac().getText(),
//            Integer.parseInt(vistaPrincipal.getText_PorctDiscapacidad_pac().getText()), // porcentaje discapacidad
//            vistaPrincipal.getText_ContactoEmergencia_pac().getText(),
//            true // estadoActivo, ajustar según corresponda
//        );
//
//        // Crear una instancia de Paciente con los datos proporcionados y la instancia de Persona
//        modeloPaciente = new Paciente(
//            persona.getIdPersona(),
//            persona.getIdentificacion(),
//            persona.getPrimNombre(),
//            persona.getPrimApellido(),
//            persona.getFechaNacimiento(),
//            "Paciente", // tipoPersona, ajustar según corresponda
//            "Desarrollo", // carrera, ajustar según corresponda
//            3, // ciclo, ajustar según corresponda
//            persona.getDireccion(),
//            persona.getBarrio(),
//            persona.getCanton(),
//            persona.getProvincia(),
//            persona.getTelefono(),
//            persona.getPais(),
//            30, // edad, ajustar según corresponda
//            persona.getGenero(),
//            persona.getEstadoCivil(),
//            "O Rh+", // tipoSangre, ajustar según corresponda
//            "Estudiante" // tipoPaciente, ajustar según corresponda
//        );
//
//        try {
//            control = new ControladorPaciente();
//
//            // Llamar al método registrar del controlador para guardar el paciente
//            control.registrar(modeloPaciente);
//            System.out.println("Se guardó correctamente.");
//        } catch (Exception e) {
//            System.out.println("Error al guardar paciente: " + e.getMessage());
//        }
//    }
//
//    public Date utilDateToSqlDate(java.util.Date utilDate) {
//        return new Date(utilDate.getTime());
//    }
//}
