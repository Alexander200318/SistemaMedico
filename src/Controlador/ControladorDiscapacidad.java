/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


    public class ControladorDiscapacidad {
    private final JTable table;
    private final Conexion conexion;

    public ControladorDiscapacidad(JTable table) {
        this.table = table;
        this.conexion = new Conexion();
    }

    public void cargarDatos(String fechaInicio, String fechaFin) {
        String sql = "SELECT " +
             "p.Identificacion AS Cedula, " +
             "CONCAT(p.prim_Nombre, ' ', IFNULL(p.seg_Nombre, ''), ' ', p.prim_Apellido, ' ', IFNULL(p.seg_Apellido, '')) AS NombreCompleto, " +
             "CASE " +
             "    WHEN a.Id_Estudiante IS NOT NULL THEN 'Alumno' " +
             "    WHEN d.Id_Docente IS NOT NULL THEN 'Docente' " +
             "    ELSE '' " +
             "END AS ActorEducativo, " +
             "TIMESTAMPDIFF(YEAR, p.Fecha_Nacimiento, CURDATE()) AS Edad, " +
             "DATE_FORMAT(p.Fecha_Nacimiento, '%d-%m-%Y') AS FechaNacimiento, " +
             "dp.D_Tipo_Discapacidad AS TipoDiscapacidad, " +
             "dp.D_Porct_Discapacidad AS PorcentajeDiscapacidad, " +
             "COALESCE(c.Nombre_Carrera, '') AS Carrera, " +
             "COALESCE(a.Ciclo, '') AS Ciclo, " +
             "'Matutino-Vespertino' AS Jornada, " +
             "'' AS HorarioClases, " +
             "dp.Observacion AS Observaciones, " +
             "CASE " +
             "    WHEN dp.D_Carnet_Conadis IS NOT NULL THEN 'Carnet CONADIS' " +
             "    ELSE 'NO TIENE CARNET' " +
             "END AS Documentacion " +
             "FROM Persona p " +
             "LEFT JOIN Paciente pa ON p.Id_Persona = pa.Id_Persona " +
             "LEFT JOIN Alumno a ON pa.Id_Paciente = a.Id_Paciente " +
             "LEFT JOIN Carrera c ON a.Id_Carrera = c.Id_Carrera " +
             "LEFT JOIN roles d ON pa.Id_Paciente = d.Id_Paciente " +
             "LEFT JOIN Discapacidad dp ON p.Id_Persona = dp.Id_Persona " +
             "WHERE dp.D_Tipo_Discapacidad IS NOT NULL " +
             "AND dp.D_Tipo_Discapacidad != '' " +
             "AND p.Fecha_Registro BETWEEN ? AND ?";

        try (Connection conn = conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, fechaInicio);
            stmt.setString(2, fechaFin);

            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);  

            int rowNumber = 1;

            while (rs.next()) {
                model.addRow(new Object[]{
                    rowNumber++,  // Número de fila
                    rs.getString("Cedula"),
                    rs.getString("NombreCompleto"),
                    rs.getString("ActorEducativo"),
                    rs.getInt("Edad"),
                    rs.getString("FechaNacimiento"),
                    rs.getString("TipoDiscapacidad"),
                    rs.getInt("PorcentajeDiscapacidad"),
                    rs.getString("Carrera"),
                    rs.getString("Ciclo"),
                    rs.getString("Jornada"),
                    rs.getString("HorarioClases"),
                    rs.getString("Documentacion"),  
                    rs.getString("Observaciones")
                });
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }

