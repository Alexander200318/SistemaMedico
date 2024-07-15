/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Paciente;
import java.sql.*;

/**
 *
 * @author alexa
 */
public class ControladorPaciente {

     public boolean registrar(Paciente paciente) {
        Conexion cnxt = new Conexion();
        PreparedStatement pS = null;
        Connection conectBase = cnxt.getConexion();
        
        String sqlPersona = "INSERT INTO Persona (nombre, apellido, fecha_nacimiento, tipo_persona, carrera, ciclo, cedula, direccion_domicilio, barrio, parroquia, canton, provincia, telefono, pais, edad, genero, estado_civil, tipo_sangre) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String sqlPaciente = "INSERT INTO Paciente (id_paciente, tipo_paciente) VALUES (?, ?)";

        try {
            conectBase.setAutoCommit(false); // Desactivar auto commit

            // Insertar en la tabla Persona
            pS = conectBase.prepareStatement(sqlPersona, PreparedStatement.RETURN_GENERATED_KEYS);
            pS.setString(1, paciente.getNombre());
            pS.setString(2, paciente.getApellido());
            pS.setDate(3, paciente.getFechaNacimiento());
            pS.setString(4, paciente.getTipoPersona());
            pS.setString(5, paciente.getCarrera());
            pS.setInt(6, paciente.getCiclo());
            pS.setString(7, paciente.getCedula());
            pS.setString(8, paciente.getDireccionDomicilio());
            pS.setString(9, paciente.getBarrio());
            pS.setString(10, paciente.getParroquia());
            pS.setString(11, paciente.getCanton());
            pS.setString(12, paciente.getProvincia());
            pS.setString(13, paciente.getTelefono());
            pS.setString(14, paciente.getPais());
            pS.setInt(15, paciente.getEdad());
            pS.setString(16, paciente.getGenero());
            pS.setString(17, paciente.getEstadoCivil());
            pS.setString(18, paciente.getTipoSangre());
            pS.executeUpdate();

            // Obtener el ID generado para Persona
            ResultSet generatedKeys = pS.getGeneratedKeys();
            if (generatedKeys.next()) {
                int idPersona = generatedKeys.getInt(1);
                paciente.setIdPersona(idPersona);
            } else {
                throw new SQLException("Error al obtener el ID generado para Persona.");
            }

            // Insertar en la tabla Paciente
            pS = conectBase.prepareStatement(sqlPaciente);
            pS.setInt(1, paciente.getIdPersona());
            pS.setString(2, paciente.getTipoPaciente());
            pS.executeUpdate();

            conectBase.commit(); // Realizar commit
            return true;
        } catch (SQLException e) {
            try {
                conectBase.rollback(); // Realizar rollback en caso de error
            } catch (SQLException ex) {
                System.err.println("Error al realizar rollback: " + ex.getMessage());
            }
            System.err.println("Error en la transacción: " + e.getMessage());
            return false;
        } finally {
            try {
                if (pS != null) pS.close();
                if (conectBase != null) conectBase.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

//     public boolean registrar(Cliente clie) {
//        Conexion cnxt = new Conexion();
//        PreparedStatement pS = null;
//        Connection conectBase = cnxt.getConexion();
//        String sql = "INSERT INTO cliente(cedula,nombre,direccion,celular) VALUES(?,?,?,?)";
//        try {
//            pS = conectBase.prepareStatement(sql);
//            pS.setString(1, clie.getCedula());
//            pS.setString(2, clie.getNombre());
//            pS.setString(3, clie.getDireccion());
//            pS.setString(4, clie.getCelular());
//            pS.execute();
//            return true;
//        } catch (SQLException e) {
//            System.out.println("Error" + e.getMessage());
//            return false;
//        } finally {
//            try {
//                conectBase.close();
//            } catch (SQLException e) {
//                System.err.println(e);
//
//            }
//        }
//
//    }
//    
}
