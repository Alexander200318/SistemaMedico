/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Encabezado_HistorialPaciente;
import Modelo.Encabezado_tabla_Histrl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexa
 */
public class ControladorHistorialPaciente {
  public List<Encabezado_HistorialPaciente> obtenerHistoriaPaciente(
    String identificacion, 
    String fecha,
    String nombreParte,
    String apellidoParte,
    String sexoPaciente,
    String nombreDoctor,
    String nivelPrioridad,
    String fechaInicio,
    String fechaFin) {

    Conexion cnxt = new Conexion();
    List<Encabezado_HistorialPaciente> consultas = new ArrayList<>();

    String baseQuery = "SELECT " +
            "    h.Id_Historial, " +
            "    pac.Identificacion, " +
            "    CONCAT(pac.prim_Nombre, ' ', IFNULL(pac.seg_Nombre, ''), ' ', pac.prim_Apellido, ' ', IFNULL(pac.seg_Apellido, '')) AS nombrePaciente, " +
            "    pac.Fecha_Nacimiento, " +
            "    pac.Sexo, " +
            "    h.Fecha, " +
            "    CONCAT(doc.prim_Nombre, ' ', IFNULL(doc.seg_Nombre, ''), ' ', doc.prim_Apellido, ' ', IFNULL(doc.seg_Apellido, '')) AS nombreDoctor, " +
            "    t.Nivel_Prioridad, " +
            "    c.Motivo " +
            "FROM historial h " +
            "JOIN paciente pc ON pc.Id_Paciente = h.Id_Paciente " +
            "JOIN persona pac ON pac.Id_Persona = pc.Id_Persona " +
            "JOIN doctor d ON h.Id_Doctor = d.Id_Doctor " +
            "JOIN persona doc ON doc.Id_Persona = d.Id_Persona " +
            "JOIN consulta c ON h.Id_Consulta = c.Id_Consulta " +
            "JOIN triage t ON h.Id_Triage = t.Id_Triage " +
            "WHERE h.His_Est_Activo = '1'";

    StringBuilder queryBuilder = new StringBuilder(baseQuery);
    List<String> parameters = new ArrayList<>();
    List<String> appliedFilters = new ArrayList<>();

    // Añadir filtros adicionales
    if (identificacion != null && !identificacion.isEmpty()) {
        queryBuilder.append(" AND pac.Identificacion = ?"); // Correcto: Añadir espacio antes de "AND"
        parameters.add(identificacion);
        appliedFilters.add("Identificación: " + identificacion);
    }

    if (fecha != null && !fecha.isEmpty()) {
        queryBuilder.append(" AND h.Fecha = ?"); // Correcto: Añadir espacio antes de "AND"
        parameters.add(fecha);
        appliedFilters.add("Fecha: " + fecha);
    }

    if (nombreParte != null && !nombreParte.isEmpty()) {
        queryBuilder.append(" AND (pac.prim_Nombre LIKE ? OR pac.seg_Nombre LIKE ?)"); // Correcto: Añadir espacio antes de "AND"
        parameters.add("%" + nombreParte + "%");
        parameters.add("%" + nombreParte + "%");
        appliedFilters.add("Parte del nombre: " + nombreParte);
    }

    if (apellidoParte != null && !apellidoParte.isEmpty()) {
        queryBuilder.append(" AND (pac.prim_Apellido LIKE ? OR pac.seg_Apellido LIKE ?)"); // Correcto: Añadir espacio antes de "AND"
        parameters.add("%" + apellidoParte + "%");
        parameters.add("%" + apellidoParte + "%");
        appliedFilters.add("Parte del apellido: " + apellidoParte);
    }

    if (sexoPaciente != null && !sexoPaciente.isEmpty()) {
        queryBuilder.append(" AND pac.Sexo = ?"); // Correcto: Añadir espacio antes de "AND"
        parameters.add(sexoPaciente);
        appliedFilters.add("Sexo del paciente: " + sexoPaciente);
    }

    if (nombreDoctor != null && !nombreDoctor.isEmpty()) {
        queryBuilder.append(" AND (doc.prim_Nombre LIKE ? OR doc.seg_Nombre LIKE ? OR doc.prim_Apellido LIKE ? OR doc.seg_Apellido LIKE ?)"); // Correcto: Añadir espacio antes de "AND"
        parameters.add("%" + nombreDoctor + "%");
        parameters.add("%" + nombreDoctor + "%");
        parameters.add("%" + nombreDoctor + "%");
        parameters.add("%" + nombreDoctor + "%");
        appliedFilters.add("Nombre del doctor: " + nombreDoctor);
    }

    if (nivelPrioridad != null && !nivelPrioridad.isEmpty()) {
        queryBuilder.append(" AND t.Nivel_Prioridad LIKE ?"); // Correcto: Añadir espacio antes de "AND"
        parameters.add("%" + nivelPrioridad + "%");
        appliedFilters.add("Nivel de prioridad: " + nivelPrioridad);
    }

    if (fechaInicio != null && !fechaInicio.isEmpty() && fechaFin != null && !fechaFin.isEmpty()) {
        queryBuilder.append(" AND h.Fecha BETWEEN ? AND ?"); // Correcto: Añadir espacio antes de "AND"
        parameters.add(fechaInicio);
        parameters.add(fechaFin);
        appliedFilters.add("Rango de fechas: " + fechaInicio + " a " + fechaFin);
    }

    try (Connection connection = cnxt.getConexion();
         PreparedStatement pstmt = connection.prepareStatement(queryBuilder.toString())) {

        // Establecer los parámetros en el PreparedStatement
        for (int i = 0; i < parameters.size(); i++) {
            pstmt.setString(i + 1, parameters.get(i));
        }

        try (ResultSet resultSet = pstmt.executeQuery()) {
            boolean found = false;
            while (resultSet.next()) {
                found = true;
                int id_historial = resultSet.getInt("Id_Historial");
                String identificacionPaciente = resultSet.getString("Identificacion");
                String fecha_consulta = resultSet.getString("Fecha");
                String nombre_doctor = resultSet.getString("nombreDoctor");
                String nivel_prioridad = resultSet.getString("Nivel_Prioridad");
                String motivo = resultSet.getString("Motivo");

                consultas.add(new Encabezado_HistorialPaciente(id_historial, fecha_consulta, identificacionPaciente, nombre_doctor, motivo, nivel_prioridad));
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
    return consultas;
}

}
