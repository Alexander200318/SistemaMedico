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
public class Registro_PacienteDAO {

    ControladorPaciente control;
    private Paciente modeloPaciente;

    private REGISTRO_PACIENTE vistaPrincipal;

    public Registro_PacienteDAO(REGISTRO_PACIENTE vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;

        this.vistaPrincipal.getBtn_Guardar_pac().addActionListener((e) -> {
            guardarPasiente();
        });

    }

    private void guardarPasiente() {
        
                modeloPaciente = new Paciente(
            0, // idPersona - puede ser 0 o null si es AUTO_INCREMENT en la base de datos
            vistaPrincipal.getText_Cedula_pac().getText(),
            vistaPrincipal.getText_Nombre_pac().getText(),
            vistaPrincipal.getText_Apellido_pac().getText(),
            utilDateToSqlDate(new java.util.Date()), // fecha de nacimiento, ajustar según corresponda
            "Paciente", // tipo de persona, ajustar según corresponda
            "Desarrollo", // carrera, ajustar según corresponda
            3, // ciclo, ajustar según corresponda
            vistaPrincipal.getText_Direccion_pac().getText(),
            "Desarrollo", // barrio, ajustar según corresponda
            "Baños", // parroquia, ajustar según corresponda
            vistaPrincipal.getText_Canton_pac().getText(),
            "Azuay", // provincia, ajustar según corresponda
            vistaPrincipal.getText_Telefono_pac().getText(),
            vistaPrincipal.getText_Pais_pac().getText(),
            30, // edad, ajustar según corresponda
            "M", // género, ajustar según corresponda
            "Soltero", // estado civil, ajustar según corresponda
            "O Rh+", // tipo de sangre, ajustar según corresponda
            "Estudiante" // tipo de paciente, ajustar según corresponda
        );
//            Date fecha = new Date();
//            this.modeloPaciente= new Paciente();
//            control = new ControladorPaciente();
//            modeloPaciente.setCedula(vistaPrincipal.getText_Cedula_pac().getText());
//            modeloPaciente.setNombre(vistaPrincipal.getText_Nombre_pac().getText());
//            modeloPaciente.setApellido(vistaPrincipal.getText_Apellido_pac().getText());
//            modeloPaciente.setFechaNacimiento(fecha);
//            modeloPaciente.setFechaNacimiento(new Date());
//            modeloPaciente.setTipoPersona("Pacinete");
//            modeloPaciente.setCarrera("Desarrollo");
//            modeloPaciente.setCiclo(3);
//            modeloPaciente.setDireccionDomicilio(vistaPrincipal.getText_Direccion_pac().getText());
//            modeloPaciente.setBarrio("Desarrollo");
//            modeloPaciente.setParroquia("baños");
//            modeloPaciente.setCanton(vistaPrincipal.getText_Canton_pac().getText());
//            modeloPaciente.setProvincia("Azuay");
//            modeloPaciente.setTelefono(vistaPrincipal.getText_Telefono_pac().getText());
//            modeloPaciente.setPais(vistaPrincipal.getText_Pais_pac().getText());
//            modeloPaciente.setEdad(3);
//            modeloPaciente.setGenero("M");
//            modeloPaciente.setEstadoCivil("soleta");
//            modeloPaciente.setTipoSangre("orh");
//            modeloPaciente.setTipoPaciente("Bueno");

//            control.registrar(modeloPaciente);
//            System.out.println("Se guardo");
//        } catch (Exception e) {
//            System.out.println("" + e.getMessage());
//        }
            try {
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
