/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Modelo.Antecedentes;
import Modelo.Conexion;
import Modelo.Familiar;
import Modelo.Historial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PaginaNuevaConsultaDAO {

    private Connection connection;
    private Conexion conect = new Conexion();

    public PaginaNuevaConsultaDAO() {
        // Inicializa la conexión
        connection = conect.getConexion();
    }

    public void actualizarHistorial(Historial historial) {
        String sql = "UPDATE historial SET descripcionHist = ?, idConsulta = ?, idPaciente = ?, idTriage = ?, idDoctor = ? WHERE idHistorial = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, historial.getDescripcionHist());
            stmt.setInt(2, historial.getIdConsulta());
            stmt.setInt(3, historial.getIdPaciente());
            stmt.setInt(4, historial.getIdTriage());
            stmt.setInt(5, historial.getIdDoctor());
            stmt.setInt(6, historial.getIdHistorial());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones
        }
    }

    public void actualizarAntecedentes(Antecedentes antecedentes) {
        String sql = "UPDATE antecedentes SET alergias = ?, clinico = ?, ginecologico = ?, traumatologico = ?, quirurgico = ?, farmacologico = ?, enfermedades = ?, cirugias = ?, vacunas = ? WHERE idAntecedentes = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, antecedentes.getAlergias());
            stmt.setString(2, antecedentes.getClinico());
            stmt.setString(3, antecedentes.getGinecologico());
            stmt.setString(4, antecedentes.getTraumatologico());
            stmt.setString(5, antecedentes.getQuirurgico());
            stmt.setString(6, antecedentes.getFarmacologico());
            stmt.setString(7, antecedentes.getEnfermedades());
            stmt.setString(8, antecedentes.getCirugias());
            stmt.setString(9, antecedentes.getVacunas());
            stmt.setInt(10, antecedentes.getIdAntecedentes());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones
        }
    }

    public void actualizarFamiliar(Familiar familiar) {
        String sql = "UPDATE familiar SET parentesco = ?, idAntecedentes = ?, idPaciente = ? WHERE idAntFamiliares = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, familiar.getParentesco());
            stmt.setInt(2, familiar.getIdAntecedentes());
            stmt.setInt(3, familiar.getIdPaciente());
            stmt.setInt(4, familiar.getIdAntFamiliares());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones
        }
    }
    
    
}
