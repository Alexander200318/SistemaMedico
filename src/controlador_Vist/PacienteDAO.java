/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PacienteDAO {
    
    private Connection connection;

    public PacienteDAO(Connection connection) {
        this.connection = connection;
    }

    public Paciente obtenerPacientePorId(int idPaciente) {
        Paciente paciente = null;
        String query = "SELECT * FROM Paciente pa JOIN Persona pe ON pa.Id_Persona = pe.Id_Persona WHERE pa.Id_Paciente = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, idPaciente);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                paciente = new Paciente(
                    rs.getInt("Id_Paciente"),
                    rs.getInt("Id_Persona"),
                    rs.getString("Identificacion"),
                    rs.getString("prim_Nombre"),
                    rs.getString("seg_Nombre"),
                    rs.getString("prim_Apellido"),
                    rs.getString("seg_Apellido"),
                    rs.getString("Email"),
                    rs.getString("Direccion"),
                    rs.getString("Barrio"),
                    rs.getString("Canton"),
                    rs.getString("Provincia"),
                    rs.getString("Telefono"),
                    rs.getDate("Fecha_Nacimiento"),
                    rs.getString("Lugar"),
                    rs.getString("Pais"),
                    rs.getString("Genero"),
                    rs.getString("Estado_Civil"),
                    rs.getString("Sexo"),
                    rs.getBlob("Foto"),
                    rs.getString("Etnia"),
                    rs.getDate("Fecha_Registro"),
                    rs.getString("Carnet_Conadis"),
                    rs.getBoolean("Discapacidad"),
                    rs.getString("Tipo_Discapacidad"),
                    rs.getInt("Porct_Discapacidad"),
                    rs.getString("Contacto_Emergencia"),
                    rs.getBoolean("Estado_Activo")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return paciente;
    }

    public Personal obtenerAntecedentesPersonalesPorIdPaciente(int idPaciente) {
    Personal personal = null;
    String query = "SELECT * FROM AntecedentePersonal WHERE Id_Paciente = ?";
    try (PreparedStatement stmt = connection.prepareStatement(query)) {
        stmt.setInt(1, idPaciente);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            Antecedentes antecedentes = new Antecedentes(
                rs.getInt("Id_Antecedentes"),
                rs.getString("Alergias"),
                rs.getString("Clinico"),
                rs.getString("Ginecologico"),
                rs.getString("Traumatologico"),
                rs.getString("Quirurgico"),
                rs.getString("Farmacologico"),
                rs.getString("Enfermedades"),
                rs.getString("Cirugias"),
                rs.getString("Vacunas")
            );
            Paciente paciente = obtenerPacientePorId(idPaciente);
            personal = new Personal(
                rs.getInt("Id_AnPersonales"),
                antecedentes,
                paciente
            );
        }
    } catch (SQLException e) {
        System.err.println("Error al obtener antecedentes personales: " + e.getMessage());
        e.printStackTrace();
    }
    return personal;
}

    public Familiar obtenerAntecedentesFamiliaresPorIdPaciente(int idPaciente) {
        Familiar familiar = null;
        String query = "SELECT * FROM AntecedentesFamiliar af WHERE af.Id_Paciente = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, idPaciente);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                familiar = new Familiar(
                    rs.getInt("Id_AntFamiliares"),
                    rs.getString("Parentesco"),
                    rs.getInt("Id_Antecedentes"),
                    rs.getInt("Id_Paciente")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return familiar;
    }

    public Antecedentes obtenerAntecedentesPorId(int idAntecedentes) {
        Antecedentes antecedentes = null;
        String query = "SELECT * FROM Antecedentes WHERE Id_Antecedentes = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, idAntecedentes);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                antecedentes = new Antecedentes(
                    rs.getInt("Id_Antecedentes"),
                    rs.getString("Alergias"),
                    rs.getString("Clinico"),
                    rs.getString("Ginecologico"),
                    rs.getString("Traumatologico"),
                    rs.getString("Quirurgico"),
                    rs.getString("Farmacologico"),
                    rs.getString("Enfermedades"),
                    rs.getString("Cirugias"),
                    rs.getString("Vacunas")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return antecedentes;
    }

    public void actualizarHistorial(Historial historial) {
        String query = "UPDATE Historial SET Descripcion_Hist = ?, His_Est_Activo = ? WHERE Id_Historial = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, historial.getDescripcionHist());
            stmt.setBoolean(2, historial.isHisEstActivo());
            stmt.setInt(3, historial.getIdHistorial());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarAntecedentes(Antecedentes antecedentes) {
        String query = "UPDATE Antecedentes SET Alergias = ?, Clinico = ?, Ginecologico = ?, Traumatologico = ?, Quirurgico = ?, Farmacologico = ?, Enfermedades = ?, Cirugias = ?, Vacunas = ? WHERE Id_Antecedentes = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
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
        }
    }

    public void actualizarFamiliar(Familiar familiar) {
        String query = "UPDATE AntecedentesFamiliar SET Parentesco = ?, Id_Antecedentes = ? WHERE Id_AntFamiliares = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, familiar.getParentesco());
            stmt.setInt(2, familiar.getIdAntecedentes());
            stmt.setInt(3, familiar.getIdAntFamiliares());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}