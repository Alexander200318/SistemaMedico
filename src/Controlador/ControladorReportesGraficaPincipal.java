/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ControladorReportesGraficaPincipal {

    private JLabel labelReportesGenero;    // JLabel para el gráfico de género
    private JLabel labelReportesSexo;      // JLabel para el gráfico de sexo
    private JLabel labelTriagePrioridad;   // JLabel para el gráfico de prioridad de triage
    private JLabel labelRangoEdad;         // JLabel para el gráfico de rango de edad

    // Constructor que recibe cuatro JLabel
    public ControladorReportesGraficaPincipal(JLabel labelReportesGenero, JLabel labelReportesSexo, JLabel labelTriagePrioridad, JLabel labelRangoEdad) {
        this.labelReportesGenero = labelReportesGenero;
        this.labelReportesSexo = labelReportesSexo;
        this.labelTriagePrioridad = labelTriagePrioridad;
        this.labelRangoEdad = labelRangoEdad;
        cargarDatos();
    }

    private void cargarDatos() {
        // Crear y configurar datasets para los gráficos
        DefaultPieDataset datasetGenero = new DefaultPieDataset();
        DefaultPieDataset datasetSexo = new DefaultPieDataset();
        DefaultPieDataset datasetPrioridad = new DefaultPieDataset(); // Dataset para niveles de prioridad
        DefaultPieDataset datasetRangoEdad = new DefaultPieDataset(); // Dataset para rangos de edad

        Conexion conexion = new Conexion();
        try ( Connection connection = conexion.getConexion()) {
            // Consulta SQL para obtener la distribución por género
            String consultaGenero = "SELECT Genero, COUNT(*) AS Total FROM Persona GROUP BY Genero";
            try ( PreparedStatement statement = connection.prepareStatement(consultaGenero);  ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String genero = resultSet.getString("Genero");
                    int total = resultSet.getInt("Total");
                    System.out.println("Género: " + genero + ", Total: " + total); // Depuración
                    if (genero != null && !genero.trim().isEmpty()) {
                        datasetGenero.setValue(genero, total);
                    }
                }
            }

            // Consulta SQL para obtener la distribución por sexo
            String consultaSexo = "SELECT Sexo, COUNT(*) AS Total FROM Persona GROUP BY Sexo";
            try ( PreparedStatement statement = connection.prepareStatement(consultaSexo);  ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String sexo = resultSet.getString("Sexo");
                    int total = resultSet.getInt("Total");
                    System.out.println("Sexo: " + sexo + ", Total: " + total); // Depuración
                    if (sexo != null && !sexo.trim().isEmpty()) {
                        datasetSexo.setValue(sexo, total);
                    }
                }
            }

            // Consulta SQL para obtener la distribución por nivel de prioridad
            String consultaPrioridad = "SELECT Nivel_Prioridad, COUNT(*) AS Total_Pacientes FROM Triage GROUP BY Nivel_Prioridad ORDER BY Nivel_Prioridad";
            try ( PreparedStatement statement = connection.prepareStatement(consultaPrioridad);  ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String nivelPrioridad = resultSet.getString("Nivel_Prioridad");
                    int totalPacientes = resultSet.getInt("Total_Pacientes");
                    System.out.println("Nivel Prioridad: " + nivelPrioridad + ", Total Pacientes: " + totalPacientes); // Depuración
                    if (nivelPrioridad != null && !nivelPrioridad.trim().isEmpty()) {
                        datasetPrioridad.setValue(nivelPrioridad, totalPacientes);
                    }
                }
            }

            // Consulta SQL para obtener la distribución por rango de edad
            String consultaRangoEdad = "SELECT "
                    + "CASE "
                    + "WHEN TIMESTAMPDIFF(YEAR, p.Fecha_Nacimiento, CURDATE()) BETWEEN 0 AND 18 THEN '0-18 años' "
                    + "WHEN TIMESTAMPDIFF(YEAR, p.Fecha_Nacimiento, CURDATE()) BETWEEN 19 AND 35 THEN '19-35 años' "
                    + "WHEN TIMESTAMPDIFF(YEAR, p.Fecha_Nacimiento, CURDATE()) BETWEEN 36 AND 50 THEN '36-50 años' "
                    + "WHEN TIMESTAMPDIFF(YEAR, p.Fecha_Nacimiento, CURDATE()) >= 51 THEN '51+ años' "
                    + "END AS Rango_Edad, "
                    + "COUNT(*) AS Total_Pacientes "
                    + "FROM Paciente pa "
                    + "JOIN Persona p ON pa.Id_Persona = p.Id_Persona "
                    + "GROUP BY Rango_Edad "
                    + "ORDER BY FIELD(Rango_Edad, '0-18 años', '19-35 años', '36-50 años', '51+ años')";
            try ( PreparedStatement statement = connection.prepareStatement(consultaRangoEdad);  ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String rangoEdad = resultSet.getString("Rango_Edad");
                    int totalPacientes = resultSet.getInt("Total_Pacientes");
                    System.out.println("Rango Edad: " + rangoEdad + ", Total Pacientes: " + totalPacientes); // Depuración
                    if (rangoEdad != null && !rangoEdad.trim().isEmpty()) {
                        datasetRangoEdad.setValue(rangoEdad, totalPacientes);
                    }
                }
            }

            // Crear y establecer el gráfico de pastel para género
            JFreeChart graficoPastelGenero = ChartFactory.createPieChart(
                    "Distribución de Género",
                    datasetGenero,
                    true,
                    true, // Tooltips
                    false // URLs
            );

            // Crear y establecer el gráfico de pastel para sexo
            JFreeChart graficoPastelSexo = ChartFactory.createPieChart(
                    "Distribución de Sexo", // Título del gráfico
                    datasetSexo, // Conjunto de datos
                    true, // Incluir leyenda
                    true, // Tooltips
                    false // URLs
            );

            // Crear y establecer el gráfico de pastel para prioridad de triage
            JFreeChart graficoPastelPrioridad = ChartFactory.createPieChart(
                    "Distribución de Prioridad", // Título del gráfico
                    datasetPrioridad, // Conjunto de datos
                    true, // Incluir leyenda
                    true, // Tooltips
                    false // URLs
            );

            // Crear y establecer el gráfico de pastel para rango de edad
            JFreeChart graficoPastelRangoEdad = ChartFactory.createPieChart(
                    "Distribución por Edades", // Título del gráfico
                    datasetRangoEdad, // Conjunto de datos
                    true, // Incluir leyenda
                    true, // Tooltips
                    false // URLs
            );

            // Crear BufferedImage y ImageIcon para género
            BufferedImage bufferedImageGenero = graficoPastelGenero.createBufferedImage(280, 218);
            ImageIcon imageIconGenero = new ImageIcon(bufferedImageGenero);
            labelReportesGenero.setIcon(imageIconGenero);
            labelReportesGenero.setPreferredSize(new Dimension(280, 218));
            labelReportesGenero.revalidate();

            // Crear BufferedImage y ImageIcon para sexo
            BufferedImage bufferedImageSexo = graficoPastelSexo.createBufferedImage(280, 218);
            ImageIcon imageIconSexo = new ImageIcon(bufferedImageSexo);
            labelReportesSexo.setIcon(imageIconSexo);
            labelReportesSexo.setPreferredSize(new Dimension(280, 218));
            labelReportesSexo.revalidate();

            // Crear BufferedImage y ImageIcon para prioridad
            BufferedImage bufferedImagePrioridad = graficoPastelPrioridad.createBufferedImage(280, 218);
            ImageIcon imageIconPrioridad = new ImageIcon(bufferedImagePrioridad);
            labelTriagePrioridad.setIcon(imageIconPrioridad);
            labelTriagePrioridad.setPreferredSize(new Dimension(280, 218));
            labelTriagePrioridad.revalidate();

            // Crear BufferedImage y ImageIcon para rango de edad
            BufferedImage bufferedImageRangoEdad = graficoPastelRangoEdad.createBufferedImage(280, 218);
            ImageIcon imageIconRangoEdad = new ImageIcon(bufferedImageRangoEdad);
            labelRangoEdad.setIcon(imageIconRangoEdad);
            labelRangoEdad.setPreferredSize(new Dimension(280, 218));
            labelRangoEdad.revalidate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}