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

public class Controladoranual {
    private final Conexion conexion;
    private final JTable table;

    private static final String[] MES_NOMBRES = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    public Controladoranual(JTable table) {
        this.conexion = new Conexion();
        this.table = table;
    }

    public void cargarDatos() {
        String sql = "SELECT MONTH(rc.Fecha_Consult) AS Mes, " +
                     "YEAR(rc.Fecha_Consult) AS Año, " +
                     "COUNT(*) AS TotalConsultas " +
                     "FROM RegistraConsulta rc " +
                     "WHERE YEAR(rc.Fecha_Consult) IN (2023, 2024) " +
                     "GROUP BY Mes, Año " +
                     "ORDER BY Año, Mes";

        
        Map<Integer, int[]> dataMap = new HashMap<>();
        for (int month = 1; month <= 12; month++) {
            dataMap.put(month, new int[]{0, 0}); 
        }

        try (Connection conn = conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int mes = rs.getInt("Mes");
                int año = rs.getInt("Año");
                int totalConsultas = rs.getInt("TotalConsultas");

                if (año == 2023) {
                    dataMap.get(mes)[0] = totalConsultas;
                } else if (año == 2024) {
                    dataMap.get(mes)[1] = totalConsultas;
                }
            }

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            int[] totals = new int[2]; 

            for (int month = 1; month <= 12; month++) {
                int[] values = dataMap.get(month);
                int consultas2023 = values[0];
                int consultas2024 = values[1];

                totals[0] += consultas2023;
                totals[1] += consultas2024;

                model.addRow(new Object[]{MES_NOMBRES[month - 1], consultas2023, consultas2024});
            }

            model.addRow(new Object[]{"Total", totals[0], totals[1]});
            System.out.println("Datos cargados correctamente en la tabla.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
