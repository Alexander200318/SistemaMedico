package Controlador;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorFM {
    private Conexion conexion;
    private JPanel panel;
    private JTable table;
    
    // arrary parfa meses
    private static final String[] MES_NOMBRES = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    public ControladorFM(JPanel panel, JTable table) {
        this.conexion = new Conexion();
        this.panel = panel;
        this.table = table;
    }

    public void cargarDatos() {
    String sql = "SELECT MONTH(rc.Fecha_Consult) AS Mes, " +
                 "YEAR(rc.Fecha_Consult) AS Año, " +
                 "SUM(CASE WHEN p.Sexo = 'Masculino' THEN 1 ELSE 0 END) AS Hombres, " +
                 "SUM(CASE WHEN p.Sexo = 'Femenino' THEN 1 ELSE 0 END) AS Mujeres " +
                 "FROM RegistraConsulta rc " +
                 "JOIN Paciente pa ON rc.Id_Paciente = pa.Id_Paciente " +
                 "JOIN Persona p ON pa.Id_Persona = p.Id_Persona " +
                 "WHERE YEAR(rc.Fecha_Consult) IN (2023, 2024) " +
                 "GROUP BY Mes, Año " +
                 "ORDER BY Año, Mes";

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
            int hombres = rs.getInt("Hombres");
            int mujeres = rs.getInt("Mujeres");

            System.out.printf("Mes: %d, Año: %d, Hombres: %d, Mujeres: %d%n", mes, año, hombres, mujeres);

            if (año == 2023) {
                dataMap.get(mes)[0] = hombres;
                dataMap.get(mes)[1] = mujeres;
            } else if (año == 2024) {
                dataMap.get(mes)[2] = hombres;
                dataMap.get(mes)[3] = mujeres;
            }
        }

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        int[] totals = new int[4];

        for (int month = 1; month <= 12; month++) {
            int[] values = dataMap.get(month);
            int hombres2023 = values[0];
            int mujeres2023 = values[1];
            int hombres2024 = values[2];
            int mujeres2024 = values[3];

            totals[0] += hombres2023;
            totals[1] += mujeres2023;
            totals[2] += hombres2024;
            totals[3] += mujeres2024;

            model.addRow(new Object[]{MES_NOMBRES[month - 1], hombres2023, mujeres2023, hombres2024, mujeres2024});
        }

        model.addRow(new Object[]{"Total", totals[0], totals[1], totals[2], totals[3]});
        System.out.println("Datos cargados correctamente en la tabla");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}

