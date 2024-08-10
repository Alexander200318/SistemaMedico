/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Modelo.DatosPacienteAdminClass;
import Modelo.Paciente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexa
 */
public class ControladorDatosPacienteAdmin {

    public List<DatosPacienteAdminClass> obtenerPaciente(String identificacion, String nombreParte, String apellidoParte, String sexoPaciente, String rol) {
        Conexion cnxt = new Conexion();
        List<DatosPacienteAdminClass> pacientes = new ArrayList<>();

        // Base query con joins y concatenaciones para nombres y direcciones
        String baseQuery = "SELECT \n"
        + "    per.Identificacion AS Identificacion, \n"
        + "    CONCAT(per.prim_Nombre, ' ', IFNULL(per.seg_Nombre, ''), ' ', per.prim_Apellido, ' ', IFNULL(per.seg_Apellido, '')) AS nombrePaciente, \n"
        + "    per.Sexo AS Sexo ,\n"
        + "    per.Telefono AS Telefono ,\n"
        + "    pac.Pac_Est_Activo ,\n"
        + "   TRIM(CONCAT( \n"
        + "        IF(per.Direccion IS NOT NULL, per.Direccion, ''), \n"
        + "        IF(per.Direccion IS NOT NULL AND per.Barrio IS NOT NULL, ', ', ''), \n"
        + "        IF(per.Barrio IS NOT NULL, per.Barrio, ''),\n"
        + "        IF(per.Barrio IS NOT NULL AND per.Canton IS NOT NULL, ', ', ''), \n"
        + "        IF(per.Canton IS NOT NULL, per.Canton, ''),\n"
        + "        IF(per.Canton IS NOT NULL AND per.Provincia IS NOT NULL, ', ', ''), \n"
        + "        IF(per.Provincia IS NOT NULL, per.Provincia, ''),\n"
        + "        IF(per.Provincia IS NOT NULL AND per.Lugar IS NOT NULL, ', ', ''), \n"
        + "        IF(per.Lugar IS NOT NULL, per.Lugar, ''),\n"
        + "        IF(per.Lugar IS NOT NULL AND per.Pais IS NOT NULL, ', ', ''), \n"
        + "        IF(per.Pais IS NOT NULL, per.Pais, '') \n"
        + "    )) AS DireccionCompleta, \n"
        + "    COALESCE( \n"
        + "        roles.nombreRoles, \n"
        + "        CASE \n"
        + "            WHEN alumno.Id_Paciente IS NOT NULL THEN 'Alumno' \n"
        + "            ELSE 'Otros Roles' \n"
        + "        END \n"
        + "    ) AS Rol, \n"
        + "    registrapaciente.Fecha, \n"
        + "    CONCAT(doctPer.prim_Nombre, ' ', IFNULL(doctPer.prim_Apellido, '')) AS nombreDoctor, \n"
        + "    pac.Id_Paciente AS idPaciente \n"
        + "FROM \n"
        + "    Paciente pac \n"
        + "JOIN \n"
        + "    Persona per ON pac.Id_Persona = per.Id_Persona \n"
        + "LEFT JOIN \n"
        + "    roles ON pac.Id_Paciente = roles.Id_Paciente \n"
        + "LEFT JOIN \n"
        + "    alumno ON pac.Id_Paciente = alumno.Id_Paciente \n"
        + "LEFT JOIN \n"
        + "    registrapaciente ON pac.Id_Paciente = registrapaciente.Id_Paciente \n"
        + "LEFT JOIN \n"
        + "    doctor ON doctor.Id_Doctor = registrapaciente.Id_Doctor \n"
        + "LEFT JOIN \n"
        + "    Persona doctPer ON doctPer.Id_Persona = doctor.Id_Persona \n"
        + "WHERE 1=1 ";

        StringBuilder queryBuilder = new StringBuilder(baseQuery);
        List<String> parameters = new ArrayList<>();
        List<String> appliedFilters = new ArrayList<>();

        // Añadir filtros adicionales
        if (identificacion != null && !identificacion.trim().isEmpty()) {
            queryBuilder.append(" AND per.Identificacion = ?");
            parameters.add( identificacion );
            appliedFilters.add("Identificación: " + identificacion);
        }

        if (nombreParte != null && !nombreParte.trim().isEmpty()) {
            queryBuilder.append(" AND (per.prim_Nombre LIKE ? OR per.seg_Nombre LIKE ?)");
            parameters.add("%" + nombreParte + "%");
            parameters.add("%" + nombreParte + "%");
            appliedFilters.add("Parte del nombre: " + nombreParte);
        }

        if (apellidoParte != null && !apellidoParte.trim().isEmpty()) {
            queryBuilder.append(" AND (per.prim_Apellido LIKE ? OR per.seg_Apellido LIKE ?)");
            parameters.add("%" + apellidoParte + "%");
            parameters.add("%" + apellidoParte + "%");
            appliedFilters.add("Parte del apellido: " + apellidoParte);
        }

        if (sexoPaciente != null && !sexoPaciente.trim().isEmpty()) {
            queryBuilder.append(" AND per.Sexo LIKE ?");
            parameters.add("%" + sexoPaciente + "%");
            appliedFilters.add("Sexo del paciente: " + sexoPaciente);
        }

        if (rol != null && !rol.trim().isEmpty()) {
            queryBuilder.append(" AND (roles.nombreRoles LIKE ? OR "
                    + "(alumno.Id_Paciente IS NOT NULL AND 'Alumno' LIKE ?))");
            parameters.add("%" + rol + "%");
            parameters.add("%" + rol + "%");
            appliedFilters.add("Rol: " + rol);
        }

        try ( Connection connection = cnxt.getConexion();  PreparedStatement statement = connection.prepareStatement(queryBuilder.toString())) {

            // Establecer los parámetros en el PreparedStatement
            for (int i = 0; i < parameters.size(); i++) {
                statement.setString(i + 1, parameters.get(i));
            }

            try ( ResultSet resultSet = statement.executeQuery()) {
                boolean found = false;
                while (resultSet.next()) {
                    found = true;
                    int idPaciente = resultSet.getInt("idPaciente");
                    String identificacionPaciente = resultSet.getString("Identificacion");
                    String nombrePaciente = resultSet.getString("nombrePaciente");
                    String sexo = resultSet.getString("Sexo");
                    String telefono = resultSet.getString("Telefono");
                    String direccionCompleta = resultSet.getString("DireccionCompleta");
                    String rolPaciente = resultSet.getString("Rol");
                    String FechaRegistro = resultSet.getString("Fecha");
                    String NomDoctor = resultSet.getString("nombreDoctor");
                    boolean Estado = resultSet.getBoolean("Pac_Est_Activo");
                    

                    pacientes.add(new DatosPacienteAdminClass(idPaciente, identificacionPaciente, nombrePaciente, sexo, telefono, direccionCompleta, rolPaciente, FechaRegistro, NomDoctor, Estado));
                }
                if (found) {
                    System.out.println("Se encontraron registros para la consulta realizada con los siguientes filtros: " + String.join(", ", appliedFilters));
                } else {
                    System.out.println("No se encontraron registros para la consulta realizada con los siguientes filtros: " + String.join(", ", appliedFilters));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ocurrió un error al realizar la consulta.");
        }
        return pacientes;
    }

}
