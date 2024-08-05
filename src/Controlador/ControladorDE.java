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
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ControladorDE {
    private final JTable table;
    private final Conexion conexion;

    private static final String[] MES_NOMBRES = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    public ControladorDE(JTable table) {
        this.table = table;
        this.conexion = new Conexion();
    }

    public void cargarDatos() {
        String sql = "SELECT " +
                     "MONTH(rc.Fecha_Consult) AS Mes, " +
                     "YEAR(rc.Fecha_Consult) AS Año, " +
                     "SUM(CASE WHEN EXISTS (SELECT 1 FROM roles d WHERE d.Id_Paciente = rc.Id_Paciente) THEN 1 ELSE 0 END) AS Docentes, " +
                     "SUM(CASE WHEN EXISTS (SELECT 1 FROM Alumno a WHERE a.Id_Paciente = rc.Id_Paciente) THEN 1 ELSE 0 END) AS Alumnos " +
                     "FROM RegistraConsulta rc " +
                     "WHERE YEAR(rc.Fecha_Consult) IN (2023, 2024) " +
                     "GROUP BY Mes, Año " +
                     "ORDER BY Año, Mes;";

        Map<Integer, int[]> dataMap = new HashMap<>();
        for (int month = 1; month <= 12; month++) {
            dataMap.put(month, new int[]{0, 0, 0, 0});
        }

        try (Connection conn = conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("Conexión exitosa y consulta ejecutada.");

            while (rs.next()) {
                int mes = rs.getInt("Mes");
                int año = rs.getInt("Año");
                int docentes = rs.getInt("Docentes");
                int estudiantes = rs.getInt("Alumnos");

                System.out.printf("Mes: %d, Año: %d, Docentes: %d, Alumnos: %d%n", mes, año, docentes, estudiantes);

                if (año == 2023) {
                    dataMap.get(mes)[0] = docentes;
                    dataMap.get(mes)[1] = estudiantes;
                } else if (año == 2024) {
                    dataMap.get(mes)[2] = docentes;
                    dataMap.get(mes)[3] = estudiantes;
                }
            }

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            int[] totals = new int[4];

            for (int month = 1; month <= 12; month++) {
                int[] values = dataMap.get(month);
                int docentes2023 = values[0];
                int estudiantes2023 = values[1];
                int docentes2024 = values[2];
                int estudiantes2024 = values[3];

                totals[0] += docentes2023;
                totals[1] += estudiantes2023;
                totals[2] += docentes2024;
                totals[3] += estudiantes2024;

                model.addRow(new Object[]{MES_NOMBRES[month - 1], docentes2023, estudiantes2023, docentes2024, estudiantes2024});
            }

            model.addRow(new Object[]{"Total", totals[0], totals[1], totals[2], totals[3]});
            System.out.println("Datos cargados correctamente en la tabla.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
