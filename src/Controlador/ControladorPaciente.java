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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorPaciente {

    public boolean registrar(Paciente paciente) {
        Conexion cnxt = new Conexion();
        PreparedStatement pS = null;
        Connection conectBase = cnxt.getConexion();
        
        String sqlPersona = "INSERT INTO Persona (Identificacion, prim_Nombre, prim_Apellido, Fecha_Nacimiento, Direccion, Canton, Provincia, Telefono, Pais, Genero, Estado_Civil, Sexo, Fecha_Registro, Estado_Activo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String sqlPaciente = "INSERT INTO Paciente (Id_Persona, Pac_Est_Activo) VALUES (?, ?)";

        try {
            conectBase.setAutoCommit(false); // Desactivar auto commit

            // Insertar en la tabla Persona
//            pS = conectBase.prepareStatement(sqlPersona, PreparedStatement.RETURN_GENERATED_KEYS);
//            pS.setString(1, paciente.getPersona().getIdentificacion());
//            pS.setString(2, paciente.getPersona().getPrimNombre());
//            pS.setString(3, paciente.getPersona().getPrimApellido());
//            pS.setDate(4, paciente.getPersona().getFechaNacimiento());
//            pS.setString(5, paciente.getPersona().getDireccion());
//            pS.setString(6, paciente.getPersona().getCanton());
//            pS.setString(7, paciente.getPersona().getProvincia());
//            pS.setString(8, paciente.getPersona().getTelefono());
//            pS.setString(9, paciente.getPersona().getPais());
//            pS.setString(10, paciente.getPersona().getGenero());
//            pS.setString(11, paciente.getPersona().getEstadoCivil());
//            pS.setString(12, paciente.getPersona().getSexo());
//            pS.setDate(13, paciente.getPersona().getFechaRegistro());
//            pS.setBoolean(14, paciente.getPersona().isEstadoActivo());
//            pS.executeUpdate();

            // Obtener el ID generado para Persona
            ResultSet generatedKeys = pS.getGeneratedKeys();
            if (generatedKeys.next()) {
                int idPersona = generatedKeys.getInt(1);
                //paciente.getPersona().setIdPersona(idPersona);
            } else {
                throw new SQLException("Error al obtener el ID generado para Persona.");
            }

            // Insertar en la tabla Paciente
            pS = conectBase.prepareStatement(sqlPaciente);
            //pS.setInt(1, paciente.getPersona().getIdPersona());
            pS.setBoolean(2, paciente.isEstadoActivo());
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
}