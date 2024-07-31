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

    // Consulta base con la condición siempre aplicable
    String baseQuery = "SELECT " +
            "    h.Id_Historial, " +
            "    pac.Identificacion, " +
           
            
          
            "    h.Fecha, " +
           
            "    t.Nivel_Prioridad, " +
            "    h.Descripcion_Hist " +
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
        queryBuilder.append(" AND pac.Identificacion = ?");
        parameters.add(identificacion);
        appliedFilters.add("Identificación: " + identificacion);
    }

    if (fecha != null && !fecha.isEmpty()) {
        queryBuilder.append(" AND h.Fecha = ?");
        parameters.add(fecha);
        appliedFilters.add("Fecha: " + fecha);
    }

   

  

    

    if (nombreDoctor != null && !nombreDoctor.isEmpty()) {
        queryBuilder.append(" AND (doc.prim_Nombre LIKE ? OR doc.seg_Nombre LIKE ? OR doc.prim_Apellido LIKE ? OR doc.seg_Apellido LIKE ?)");
        parameters.add("%" + nombreDoctor + "%");
        parameters.add("%" + nombreDoctor + "%");
        parameters.add("%" + nombreDoctor + "%");
        parameters.add("%" + nombreDoctor + "%");
        appliedFilters.add("Nombre del doctor: " + nombreDoctor);
    }

    if (nivelPrioridad != null && !nivelPrioridad.isEmpty()) {
        queryBuilder.append(" AND t.Nivel_Prioridad LIKE ?");
        parameters.add("%" + nivelPrioridad + "%");
        appliedFilters.add("Nivel de prioridad: " + nivelPrioridad);
    }

    if (fechaInicio != null && !fechaInicio.isEmpty() && fechaFin != null && !fechaFin.isEmpty()) {
        queryBuilder.append(" AND h.Fecha BETWEEN ? AND ?");
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
                String nombre_paciente = resultSet.getString("nombrePaciente");
                String fecha_nacimiento_str = resultSet.getString("Fecha_Nacimiento");
                
                // Convertir la fecha de nacimiento a LocalDate
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate fecha_nacimiento = LocalDate.parse(fecha_nacimiento_str, formatter);
                
                // Calcular la edad
                LocalDate fecha_actual = LocalDate.now();
                Period periodo = Period.between(fecha_nacimiento, fecha_actual);
                int edad = periodo.getYears();
                String Edad=String.valueOf(edad);
                
                String sexo = resultSet.getString("Sexo");
                String fecha_consulta = resultSet.getString("Fecha");
                String nombre_doctor = resultSet.getString("nombreDoctor");
                String nivel_prioridad = resultSet.getString("Nivel_Prioridad");
                String diagnostico = resultSet.getString("Descripcion_Hist");

                consultas.add(new Encabezado_HistorialPaciente(id_historial,fecha_consulta, nombre_doctor, diagnostico, nivel_prioridad));
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
