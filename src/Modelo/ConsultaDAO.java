/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Joel
 */
import java.sql.Connection;
import java.sql.Date; 
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultaDAO {
    private Connection connection;

    public ConsultaDAO(Connection connection) {
        this.connection = connection;
    }

    public void guardarConsulta(Consulta consulta, Historial historial, Diagnostico diagnostico, Seguimiento seguimiento, Tratamiento tratamiento, Receta receta, RegistraConsulta registraConsulta) throws SQLException {
        try {
            connection.setAutoCommit(false);

            // Guardar Consulta
            String consultaSQL = "INSERT INTO Consulta (Enfermedad_Actual, Motivo, Cons_Est_Activo) VALUES (?, ?, ?)";
            try (PreparedStatement consultaStmt = connection.prepareStatement(consultaSQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                consultaStmt.setString(1, consulta.getEnfermedadActual());
                consultaStmt.setString(2, consulta.getMotivo());
                consultaStmt.setBoolean(3, consulta.isConsEstActivo());
                consultaStmt.executeUpdate();
                var rs = consultaStmt.getGeneratedKeys();
                if (rs.next()) {
                    consulta.setIdConsulta(rs.getInt(1));
                }
            }

            // Guardar Historial
            String historialSQL = "INSERT INTO Historial (Fecha, Descripcion_Hist, His_Est_Activo, Fecha_Cierre, Estado, Id_Consulta, Id_Paciente, Id_Triage, Id_Doctor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement historialStmt = connection.prepareStatement(historialSQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                historialStmt.setDate(1, historial.getFecha());
                historialStmt.setString(2, historial.getDescripcionHist());
                historialStmt.setBoolean(3, historial.isHisEstActivo());
                historialStmt.setDate(4, historial.getFechaCierre());
                historialStmt.setString(5, historial.getEstado());
                historialStmt.setInt(6, consulta.getIdConsulta());
                historialStmt.setInt(7, historial.getIdPaciente());
                historialStmt.setInt(8, historial.getIdTriage());
                historialStmt.setInt(9, historial.getIdDoctor());
                historialStmt.executeUpdate();
                var rs = historialStmt.getGeneratedKeys();
                if (rs.next()) {
                    historial.setIdHistorial(rs.getInt(1));
                }
            }

            // Guardar Diagnostico
            String diagnosticoSQL = "INSERT INTO Diagnostico (Descrip_diag, CIE_10, D_Presuntivo, D_Definitivo, Id_Historial) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement diagnosticoStmt = connection.prepareStatement(diagnosticoSQL)) {
                diagnosticoStmt.setString(1, diagnostico.getDescripDiag());
                diagnosticoStmt.setInt(2, diagnostico.getCie10());
                diagnosticoStmt.setBoolean(3, diagnostico.isdPresuntivo());
                diagnosticoStmt.setBoolean(4, diagnostico.isdDefinitivo());
                diagnosticoStmt.setInt(5, historial.getIdHistorial());
                diagnosticoStmt.executeUpdate();
            }

            // Guardar Seguimiento
            String seguimientoSQL = "INSERT INTO Seguimiento (Notas, Fecha_Seg, Num_Seg, Id_Historial, Id_Seguimiento_Anterior, Id_Doctor) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement seguimientoStmt = connection.prepareStatement(seguimientoSQL)) {
                seguimientoStmt.setString(1, seguimiento.getNotas());
                seguimientoStmt.setDate(2, seguimiento.getFechaSeg());
                seguimientoStmt.setInt(3, seguimiento.getNumSeg());
                seguimientoStmt.setInt(4, seguimiento.getIdHistorial());
                seguimientoStmt.setInt(5, seguimiento.getIdSeguimientoAnterior());
                seguimientoStmt.setInt(6, seguimiento.getIdDoctor());
                seguimientoStmt.executeUpdate();
            }

            // Guardar Tratamiento
            String tratamientoSQL = "INSERT INTO Tratamiento (Descripcion, Id_Historial) VALUES (?, ?)";
            try (PreparedStatement tratamientoStmt = connection.prepareStatement(tratamientoSQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                tratamientoStmt.setString(1, tratamiento.getDescripcion());
                tratamientoStmt.setInt(2, historial.getIdHistorial());
                tratamientoStmt.executeUpdate();
                var rs = tratamientoStmt.getGeneratedKeys();
                if (rs.next()) {
                    tratamiento.setIdTratamiento(rs.getInt(1));
                }
            }

            // Guardar Receta
            String recetaSQL = "INSERT INTO Receta (Medicamentos, Descripcion, Id_Tratamiento) VALUES (?, ?, ?)";
            try (PreparedStatement recetaStmt = connection.prepareStatement(recetaSQL)) {
                recetaStmt.setString(1, receta.getMedicamentos());
                recetaStmt.setString(2, receta.getDescripcion());
                recetaStmt.setInt(3, tratamiento.getIdTratamiento());
                recetaStmt.executeUpdate();
            }

            // Guardar RegistraConsulta
            String registraConsultaSQL = "INSERT INTO RegistraConsulta (Fecha_Consult, Id_Consulta, Id_Doctor, Id_Paciente) VALUES (?, ?, ?, ?)";
            try (PreparedStatement registraConsultaStmt = connection.prepareStatement(registraConsultaSQL)) {
                registraConsultaStmt.setDate(1, registraConsulta.getFechaConsult());
                registraConsultaStmt.setInt(2, consulta.getIdConsulta());
                registraConsultaStmt.setInt(3, registraConsulta.getIdDoctor());
                registraConsultaStmt.setInt(4, registraConsulta.getIdPaciente());
                registraConsultaStmt.executeUpdate();
            }

            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }
}
