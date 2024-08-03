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
        try ( PreparedStatement stmt = connection.prepareStatement(query)) {
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
                        rs.getBytes("Foto"),
                        rs.getString("Etnia"),
                        rs.getDate("Fecha_Registro"),
                        rs.getString("Contacto_Emergencia"),
                        rs.getBoolean("Estado_Activo"),
                        rs.getString("Tipo_Sangre") // este campo estaba faltando
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
        try ( PreparedStatement stmt = connection.prepareStatement(query)) {
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

    public void actualizarHistorial(Historial historial) {
        String query = "UPDATE Historial SET Descripcion_Hist = ?, His_Est_Activo = ? WHERE Id_Historial = ?";
        try ( PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, historial.getDescripcionHist());
            stmt.setBoolean(2, historial.isHisEstActivo());
            stmt.setInt(3, historial.getIdHistorial());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para guardar consulta
    public void guardarConsulta(Consulta consulta, SignosVitales signosVitales, ExamenFisico examenFisico, Triage triage) {
        Connection con = null;
        PreparedStatement psTriage = null;
        PreparedStatement psConsulta = null;
        PreparedStatement psSignosVitales = null;
        PreparedStatement psExamenFisico = null;

        try {
            con.setAutoCommit(false);
            //insertar triage 
            String sqlTriage = "INSERT INTO Triage (Nivel_Prioridad, Tri_Est_Activo) VALUES (?,?)";
            psTriage = con.prepareStatement(sqlTriage);
            psTriage.setString(1, triage.getNivelPrioridad());
            psTriage.setBoolean(2, triage.isTriEstActivo());
            psTriage.executeUpdate();

            // Insertar en la tabla Consulta
            String sqlConsulta = "INSERT INTO Consulta (Enfermedad_Actual, Motivo, Cons_Est_Activo) VALUES (?, ?, ?)";
            psConsulta = con.prepareStatement(sqlConsulta);
            psConsulta.setString(1, consulta.getMotivo());
            psConsulta.setString(2, consulta.getMotivo());
            psConsulta.setBoolean(3, consulta.isConsEstActivo());
            psConsulta.executeUpdate();

            // Obtener el ID de la consulta recién insertada
            int idConsulta = obtenerUltimoId(con);

            // Insertar en la tabla Signos_Vitales
            String sqlSignosVitales = "INSERT INTO Signos_Vitales (Presion_Arterial, Peso, Talla, Indice_Masa_Corporal, Frecuencia_Cardiaca, Frecuencia_Respiratoria, Temperatura, Saturacion_Oxigeno, Glasgow, Ocular, Verbal, Motora, Total, Llenado_Capilar, R_Pupilar, Id_Triage) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            psSignosVitales = con.prepareStatement(sqlSignosVitales);
            psSignosVitales.setString(1, signosVitales.getPresionArterial());
            psSignosVitales.setFloat(2, signosVitales.getPeso());
            psSignosVitales.setFloat(3, signosVitales.getTalla());
            psSignosVitales.setFloat(4, signosVitales.getIndiceMasaCorporal());
            psSignosVitales.setInt(5, signosVitales.getFrecuenciaCardiaca());
            psSignosVitales.setInt(6, signosVitales.getFrecuenciaRespiratoria());
            psSignosVitales.setFloat(7, signosVitales.getTemperatura());
            psSignosVitales.setFloat(8, signosVitales.getSaturacionOxigeno());
            psSignosVitales.setInt(9, signosVitales.getOcular());
            psSignosVitales.setInt(10, signosVitales.getVerbal());
            psSignosVitales.setInt(11, signosVitales.getMotora());
            psSignosVitales.setInt(12, signosVitales.getTotal());
            psSignosVitales.setString(13, signosVitales.getLlenadoCapilar());
            psSignosVitales.setString(14, signosVitales.getrPupilar());
            psSignosVitales.setInt(15, signosVitales.getIdTriage());
            psSignosVitales.executeUpdate();

            // Insertar en la tabla Examen_Fisico
            String sqlExamenFisico = "INSERT INTO Examen_Fisico (Piel_y_Faneras, Cabeza, Cuello, Torax, Corazon, Abdomen, R_Inguinal, M_Superiores, M_Inferiores, Id_Triage) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            psExamenFisico = con.prepareStatement(sqlExamenFisico);
            psExamenFisico.setString(1, examenFisico.getPielYFaneras());
            psExamenFisico.setString(2, examenFisico.getCabeza());
            psExamenFisico.setString(3, examenFisico.getCuello());
            psExamenFisico.setString(4, examenFisico.getTorax());
            psExamenFisico.setString(5, examenFisico.getCorazon());
            psExamenFisico.setString(6, examenFisico.getAbdomen());
            psExamenFisico.setString(7, examenFisico.getRInguinal());
            psExamenFisico.setString(8, examenFisico.getMSuperiores());
            psExamenFisico.setString(9, examenFisico.getMInferiores());
            psExamenFisico.setInt(10, examenFisico.getIdTriage());
            psExamenFisico.executeUpdate();

            con.commit();
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (psConsulta != null) {
                    psConsulta.close();
                }
                if (psSignosVitales != null) {
                    psSignosVitales.close();
                }
                if (psExamenFisico != null) {
                    psExamenFisico.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Método para obtener el último ID insertado en la base de datos
    private int obtenerUltimoId(Connection con) throws SQLException {
        String sqlUltimoId = "SELECT LAST_INSERT_ID()";
        try ( PreparedStatement ps = con.prepareStatement(sqlUltimoId)) {
            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        }
        return 0;
    }

}
