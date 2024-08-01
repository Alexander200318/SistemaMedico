/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author alexa
 */
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Modelo.Encabezado_tabla_Histrl;
import java.sql.DriverManager;
import java.sql.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter; // Asegúrate de importar esta clase

public class ControladorPrincHistorial {

    public List<Encabezado_tabla_Histrl> obtenerConsultasHistorila(
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
        List<Encabezado_tabla_Histrl> consultas = new ArrayList<>();

        // Consulta base con la condición siempre aplicable
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
            queryBuilder.append(" AND pac.Identificacion = ?");
            parameters.add(identificacion);
            appliedFilters.add("Identificación: " + identificacion);
        }

        if (fecha != null && !fecha.isEmpty()) {
            queryBuilder.append(" AND h.Fecha = ?");
            parameters.add(fecha);
            appliedFilters.add("Fecha: " + fecha);
        }

        if (nombreParte != null && !nombreParte.isEmpty()) {
            queryBuilder.append(" AND (pac.prim_Nombre LIKE ? OR pac.seg_Nombre LIKE ?)");
            parameters.add("%" + nombreParte + "%");
            parameters.add("%" + nombreParte + "%");
            appliedFilters.add("Parte del nombre: " + nombreParte);
        }

        if (apellidoParte != null && !apellidoParte.isEmpty()) {
            queryBuilder.append(" AND (pac.prim_Apellido LIKE ? OR pac.seg_Apellido LIKE ?)");
            parameters.add("%" + apellidoParte + "%");
            parameters.add("%" + apellidoParte + "%");
            appliedFilters.add("Parte del apellido: " + apellidoParte);
        }

        if (sexoPaciente != null && !sexoPaciente.isEmpty()) {
            queryBuilder.append(" AND pac.Sexo = ?");
            parameters.add(sexoPaciente);
            appliedFilters.add("Sexo: " + sexoPaciente);
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

        try ( Connection connection = cnxt.getConexion();  PreparedStatement pstmt = connection.prepareStatement(queryBuilder.toString())) {

            // Establecer los parámetros en el PreparedStatement
            for (int i = 0; i < parameters.size(); i++) {
                pstmt.setString(i + 1, parameters.get(i));
            }

            try ( ResultSet resultSet = pstmt.executeQuery()) {
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
                    String Edad = String.valueOf(edad);

                    String sexo = resultSet.getString("Sexo");
                    String fecha_consulta = resultSet.getString("Fecha");
                    String nombre_doctor = resultSet.getString("nombreDoctor");
                    String nivel_prioridad = resultSet.getString("Nivel_Prioridad");
                    String motivo = resultSet.getString("Motivo");

                    consultas.add(new Encabezado_tabla_Histrl(id_historial, identificacionPaciente, nombre_paciente, Edad, sexo, fecha_consulta, nombre_doctor, motivo, nivel_prioridad));
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

//    public List<Encabezado_tabla_Histrl> obtenerConsultasHistorila() {
//        Conexion cnxt = new Conexion();
//
//        List<Encabezado_tabla_Histrl> consultas = new ArrayList<>();
//
//        String query = "SELECT \n"
//                + "    h.Id_Historial,\n"
//                + "    pac.Identificacion,\n"
//                + "    CONCAT(pac.prim_Nombre, ' ', pac.seg_Nombre, ' ', pac.prim_Apellido, ' ', pac.seg_Apellido) AS nombrePaciente,\n"
//                + "    pac.Fecha_Nacimiento,\n" // Añadida la coma aquí
//                + "    pac.Sexo,\n" // Añadida la coma aquí
//                + "    h.Fecha,\n" // Añadida la coma aquí
//                + "    CONCAT(doc.prim_Nombre, ' ', doc.seg_Nombre, ' ', doc.prim_Apellido, ' ', doc.seg_Apellido) AS nombreDoctor,\n"
//                + "    c.Motivo,\n"
//                + "    h.Descripcion_Hist\n"
//                + "FROM historial h\n"
//                + "JOIN paciente pc ON pc.Id_Paciente = h.Id_Paciente\n"
//                + "JOIN persona pac ON pac.Id_Persona = pc.Id_Persona\n"
//                + "JOIN doctor d ON h.Id_Doctor = d.Id_Doctor\n"
//                + "JOIN persona doc ON doc.Id_Persona = d.Id_Persona\n"
//                + "JOIN consulta c ON h.Id_Consulta = c.Id_Consulta;";
//        try ( Connection connection = cnxt.getConexion();  Statement statement = connection.createStatement();  ResultSet resultSet = statement.executeQuery(query)) { // Ejecuta la consulta SQL
//
//            if (connection == null) {
//                System.out.println("Conexión a la base de datos fallida.");
//            } else {
//                System.out.println("Conexión a la base de datos exitosa.");
//            }
//
//            // Itera sobre el ResultSet y crea objetos Consulta
//            while (resultSet.next()) {
//
//                int id_historial = resultSet.getInt("Id_Historial");
//                String identiificasion = resultSet.getString("Identificacion");
//                String nombre_paciente = resultSet.getString("nombrePaciente");
//                String edad = resultSet.getString("Fecha_Nacimiento");
//                String sexo = resultSet.getString("Sexo");
//                String fecha_consulta = resultSet.getString("Fecha");
//                String nombre_doctor = resultSet.getString("nombreDoctor");
//                String motivo = resultSet.getString("Motivo");
//                String diagnostico = resultSet.getString("Descripcion_Hist");
//
//                consultas.add(new Encabezado_tabla_Histrl(id_historial, identiificasion, nombre_paciente, edad, sexo, fecha_consulta, nombre_doctor, motivo, diagnostico));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace(); // Imprime el error si ocurre una excepción SQL
//        }
//        return consultas; // Devuelve la lista de consultas
//    }
}
