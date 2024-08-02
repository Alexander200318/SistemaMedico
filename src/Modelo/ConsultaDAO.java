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
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaDAO {
    private Connection connection;

    public ConsultaDAO(Connection connection) {
        this.connection = connection;
    }

public void guardarConsulta(Consulta consulta, Historial historial, Diagnostico diagnostico, Tratamiento tratamiento, Receta receta, RegistraConsulta registraConsulta, SignosVitales signos, ExamenFisico examenFisico, EmergenciaObstetrica obstetrica, ExamenComplementario examenComplementario) throws SQLException {
    try {
        connection.setAutoCommit(false);

        // Guardar Consulta
        String consultaSQL = "INSERT INTO Consulta (Motivo, Cons_Est_Activo) VALUES (?, ?)";
        int consultaId;
        try (PreparedStatement consultaStmt = connection.prepareStatement(consultaSQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
            consultaStmt.setString(1, consulta.getMotivo());
            consultaStmt.setBoolean(2, consulta.isConsEstActivo());
            consultaStmt.executeUpdate();
            try (ResultSet rs = consultaStmt.getGeneratedKeys()) {
                if (rs.next()) {
                    consultaId = rs.getInt(1);
                    consulta.setIdConsulta(consultaId);
                } else {
                    throw new SQLException("Failed to retrieve consulta ID.");
                }
            }
        }

        // Guardar Historial
        String historialSQL = "INSERT INTO Historial (Fecha, Descripcion_Hist, His_Est_Activo, Fecha_Cierre, Estado, Id_Consulta, Id_Paciente, Id_Triage, Id_Doctor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int historialId;
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
            try (ResultSet rs = historialStmt.getGeneratedKeys()) {
                if (rs.next()) {
                    historialId = rs.getInt(1);
                    historial.setIdHistorial(historialId);
                } else {
                    throw new SQLException("Failed to retrieve historial ID.");
                }
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

        // Guardar Tratamiento
        String tratamientoSQL = "INSERT INTO Tratamiento (Descripcion, Id_Historial) VALUES (?, ?)";
        int tratamientoId;
        try (PreparedStatement tratamientoStmt = connection.prepareStatement(tratamientoSQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
            tratamientoStmt.setString(1, tratamiento.getDescripcion());
            tratamientoStmt.setInt(2, historial.getIdHistorial());
            tratamientoStmt.executeUpdate();
            try (ResultSet rs = tratamientoStmt.getGeneratedKeys()) {
                if (rs.next()) {
                    tratamientoId = rs.getInt(1);
                    tratamiento.setIdTratamiento(tratamientoId);
                } else {
                    throw new SQLException("Failed to retrieve tratamiento ID.");
                }
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

        // Guardar SignosVitales
        String signosSQL = "INSERT INTO Signos_Vitales (Presion_Arterial, Peso, Talla, Indice_Masa_Corporal, Frecuencia_Cardiaca, Frecuencia_Respiratoria, Temperatura, Saturacion_Oxigeno, Ocular, Verbal, Motora, Total, Llenado_Capilar, R_Pupilar, Id_Triage) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement signosStmt = connection.prepareStatement(signosSQL)) {
            signosStmt.setString(1, signos.getPresionArterial());
            signosStmt.setFloat(2, signos.getPeso());
            signosStmt.setFloat(3, signos.getTalla());
            signosStmt.setFloat(4, signos.getIndiceMasaCorporal());
            signosStmt.setInt(5, signos.getFrecuenciaCardiaca());
            signosStmt.setInt(6, signos.getFrecuenciaRespiratoria());
            signosStmt.setFloat(7, signos.getTemperatura());
            signosStmt.setFloat(8, signos.getSaturacionOxigeno());
            signosStmt.setInt(9, signos.getOcular());
            signosStmt.setInt(10, signos.getVerbal());
            signosStmt.setInt(11, signos.getMotora());
            signosStmt.setInt(12, signos.getTotal());
            signosStmt.setString(13, signos.getLlenadoCapilar());
            signosStmt.setString(14, signos.getrPupilar());
            signosStmt.setInt(15, signos.getIdTriage());
            signosStmt.executeUpdate();
        }

        // Guardar ExamenFisico
        String examenFisicoSQL = "INSERT INTO Examen_Fisico (Piel_y_Faneras, Cabeza, Cuello, Torax, Corazon, Abdomen, R_Inguinal, M_Superiores, M_Inferiores, Id_Triage) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement examenFisicoStmt = connection.prepareStatement(examenFisicoSQL)) {
            examenFisicoStmt.setString(1, examenFisico.getPielYFaneras());
            examenFisicoStmt.setString(2, examenFisico.getCabeza());
            examenFisicoStmt.setString(3, examenFisico.getCuello());
            examenFisicoStmt.setString(4, examenFisico.getTorax());
            examenFisicoStmt.setString(5, examenFisico.getCorazon());
            examenFisicoStmt.setString(6, examenFisico.getAbdomen());
            examenFisicoStmt.setString(7, examenFisico.getRInguinal());
            examenFisicoStmt.setString(8, examenFisico.getMSuperiores());
            examenFisicoStmt.setString(9, examenFisico.getMInferiores());
            examenFisicoStmt.setInt(10, examenFisico.getIdTriage());
            examenFisicoStmt.executeUpdate();
        }

        // Guardar EmergenciaObstetrica
        String obstetricaSQL = "INSERT INTO Emergencia_Obstetrica (Menarca, Ciclos, FUM, Regularidad, IVSA, Numero_Parejas_Sexuales, Gravides, Abortos, Partos, Cesareas, Mastodinia, Disminorrea, FPP, Semanas_Gestacion, Dias_Gestacion, Controles, Inmunizaciones, Id_Triage, Embarazo) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement obstetricaStmt = connection.prepareStatement(obstetricaSQL)) {
            obstetricaStmt.setInt(1, obstetrica.getMenarca());
            obstetricaStmt.setInt(2, obstetrica.getCiclos());
            obstetricaStmt.setDate(3, obstetrica.getFum());
            obstetricaStmt.setString(4, obstetrica.getRegularidad());
            obstetricaStmt.setInt(5, obstetrica.getIvsa());
            obstetricaStmt.setInt(6, obstetrica.getNumeroParejasSexuales());
            obstetricaStmt.setInt(7, obstetrica.getGravides());
            obstetricaStmt.setInt(8, obstetrica.getAbortos());
            obstetricaStmt.setInt(9, obstetrica.getPartos());
            obstetricaStmt.setInt(10, obstetrica.getCesareas());
            obstetricaStmt.setInt(11, obstetrica.getMastodinia());
            obstetricaStmt.setInt(12, obstetrica.getDisminorrea());
            obstetricaStmt.setDate(13, obstetrica.getFpp());
            obstetricaStmt.setInt(14, obstetrica.getSemanasGestacion());
            obstetricaStmt.setInt(15, obstetrica.getDiasGestacion());
            obstetricaStmt.setInt(16, obstetrica.getControles());
            obstetricaStmt.setString(17, obstetrica.getInmunizaciones());
            obstetricaStmt.setInt(18, obstetrica.getIdTriage());
            obstetricaStmt.setBoolean(19, obstetrica.isEmbarazo());
            obstetricaStmt.executeUpdate();
        }

        // Guardar ExamenComplementario
        String examenComplementarioSQL = "INSERT INTO Examen_Complementario (Examen, Resultado, Id_Historial) VALUES (?, ?, ?)";
        try (PreparedStatement examenComplementarioStmt = connection.prepareStatement(examenComplementarioSQL)) {
            examenComplementarioStmt.setString(1, examenComplementario.getResultados());
            examenComplementarioStmt.setInt(2, examenComplementario.getIdConsulta());
            examenComplementarioStmt.setInt(3, historial.getIdHistorial());
            examenComplementarioStmt.executeUpdate();
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