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
    String query = "SELECT p.*, pa.* FROM Persona p JOIN Paciente pa ON p.idPersona = pa.idPersona WHERE pa.idPaciente = ?";
    try (PreparedStatement stmt = connection.prepareStatement(query)) {
        stmt.setInt(1, idPaciente);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            paciente = new Paciente(
                rs.getInt("idPaciente"),
                rs.getInt("idPersona"),
                rs.getString("identificacion"),
                rs.getString("primNombre"),
                rs.getString("segNombre"),
                rs.getString("primApellido"),
                rs.getString("segApellido"),
                rs.getString("email"),
                rs.getString("direccion"),
                rs.getString("barrio"),
                rs.getString("canton"),
                rs.getString("provincia"),
                rs.getString("telefono"),
                rs.getDate("fechaNacimiento"),
                rs.getString("lugar"),
                rs.getString("pais"),
                rs.getString("genero"),
                rs.getString("estadoCivil"),
                rs.getString("sexo"),
                rs.getBlob("foto"),
                rs.getString("etnia"),
                rs.getDate("fechaRegistro"),
                rs.getString("carnetConadis"),
                rs.getBoolean("discapacidad"),
                rs.getString("tipoDiscapacidad"),
                rs.getInt("porctDiscapacidad"),
                rs.getString("contactoEmergencia"),
                rs.getBoolean("estadoActivo"),
                rs.getBoolean("pacEstActivo")
            );
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return paciente;
}

    public Personal obtenerAntecedentesPersonalesPorIdPaciente(int idPaciente) {
        Personal personal = null;
        String query = "SELECT * FROM Personal WHERE idPaciente = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, idPaciente);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Antecedentes antecedentes = new Antecedentes(
                    rs.getInt("idAntecedentes"),
                    rs.getString("alergias"),
                    rs.getString("clinico"),
                    rs.getString("ginecologico"),
                    rs.getString("traumatologico"),
                    rs.getString("quirurgico"),
                    rs.getString("farmacologico"),
                    rs.getString("enfermedades"),
                    rs.getString("cirugias"),
                    rs.getString("vacunas")
                );
                Paciente paciente = obtenerPacientePorId(idPaciente); // O una forma más eficiente de obtener el paciente
                personal = new Personal(
                    rs.getInt("idAnPersonales"),
                    antecedentes,
                    paciente
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personal;
    }

    public Familiar obtenerAntecedentesFamiliaresPorIdPaciente(int idPaciente) {
        Familiar familiar = null;
        String query = "SELECT * FROM Familiar WHERE idPaciente = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, idPaciente);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                familiar = new Familiar(
                    rs.getInt("idAntFamiliares"),
                    rs.getString("parentesco"),
                    rs.getInt("idAntecedentes"),
                    rs.getInt("idPaciente")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return familiar;
    }

    public Antecedentes obtenerAntecedentesPorId(int idAntecedentes) {
        Antecedentes antecedentes = null;
        String query = "SELECT * FROM Antecedentes WHERE idAntecedentes = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, idAntecedentes);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                antecedentes = new Antecedentes(
                    rs.getInt("idAntecedentes"),
                    rs.getString("alergias"),
                    rs.getString("clinico"),
                    rs.getString("ginecologico"),
                    rs.getString("traumatologico"),
                    rs.getString("quirurgico"),
                    rs.getString("farmacologico"),
                    rs.getString("enfermedades"),
                    rs.getString("cirugias"),
                    rs.getString("vacunas")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return antecedentes;
    }

    public void actualizarHistorial(Historial historial) {
        String query = "UPDATE Historial SET descripcionHist = ?, hisEstActivo = ? WHERE idHistorial = ?";
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
        String query = "UPDATE Antecedentes SET alergias = ?, clinico = ?, ginecologico = ?, traumatologico = ?, quirurgico = ?, farmacologico = ?, enfermedades = ?, cirugias = ?, vacunas = ? WHERE idAntecedentes = ?";
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
        String query = "UPDATE Familiar SET parentesco = ?, idAntecedentes = ? WHERE idAntFamiliares = ?";
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