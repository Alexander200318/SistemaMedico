/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Singleton;
import Modelo.Conexion;
import Vista.FrmImpresion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class ControladorPanelImpresion {

    private FrmImpresion frmImpresion;
    private Singleton singleton;

    public ControladorPanelImpresion(FrmImpresion frmImpresion) {
        this.frmImpresion = frmImpresion;
        this.singleton = Singleton.getInstance();
        cargarDatos();
    }

    public void cargarDatos() {
        int idPaciente = singleton.getIdPaciente();
        int idDoctor = singleton.getId_Doctor();

        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();

        try {
            // Cargar nombre del doctor
            String sqlDoctor = "SELECT CONCAT(p.prim_Nombre, ' ', IFNULL(p.seg_Nombre, ''), ' ', p.prim_Apellido, ' ', IFNULL(p.seg_Apellido, '')) AS nombreCompleto " +
                               "FROM Doctor d " +
                               "JOIN Persona p ON d.Id_Persona = p.Id_Persona " +
                               "WHERE d.Id_Doctor = ?";
            try (PreparedStatement psDoctor = con.prepareStatement(sqlDoctor)) {
                psDoctor.setInt(1, idDoctor);
                try (ResultSet rsDoctor = psDoctor.executeQuery()) {
                    if (rsDoctor.next()) {
                        frmImpresion.getLblNombreDocImprimir().setText(rsDoctor.getString("nombreCompleto"));
                    } else {
                        frmImpresion.getLblNombreDocImprimir().setText("No existen registros previos");
                    }
                }
            }

            // Cargar nombre y edad del paciente
            String sqlPaciente = "SELECT CONCAT(p.prim_Nombre, ' ', IFNULL(p.seg_Nombre, ''), ' ', p.prim_Apellido, ' ', IFNULL(p.seg_Apellido, '')) AS nombreCompleto, " +
                                 "TIMESTAMPDIFF(YEAR, p.Fecha_Nacimiento, CURDATE()) AS edad " +
                                 "FROM Paciente pac " +
                                 "JOIN Persona p ON pac.Id_Persona = p.Id_Persona " +
                                 "WHERE pac.Id_Paciente = ?";
            try (PreparedStatement psPaciente = con.prepareStatement(sqlPaciente)) {
                psPaciente.setInt(1, idPaciente);
                try (ResultSet rsPaciente = psPaciente.executeQuery()) {
                    if (rsPaciente.next()) {
                        frmImpresion.getLblPacienteNombreImprimir().setText(rsPaciente.getString("nombreCompleto"));
                        frmImpresion.getLblEdadPacienteImprimir().setText(String.valueOf(rsPaciente.getInt("edad")));
                    }
                }
            }

            // Cargar fecha actual
            frmImpresion.getLblFechaPacienteImprimir().setText(LocalDate.now().toString());

            // Cargar diagnóstico y tratamiento del historial más reciente
            String sqlDiagnostico = "SELECT d.Descrip_diag AS diagnostico, t.Descripcion AS tratamiento " +
                                    "FROM Diagnostico d " +
                                    "JOIN Tratamiento t ON d.Id_Historial = t.Id_Historial " +
                                    "WHERE d.Id_Historial = (" +
                                    "    SELECT h.Id_Historial " +
                                    "    FROM Historial h " +
                                    "    WHERE h.Id_Paciente = ? " +
                                    "    ORDER BY h.Fecha DESC " +
                                    "    LIMIT 1" +
                                    ")";
            try (PreparedStatement psDiagnostico = con.prepareStatement(sqlDiagnostico)) {
                psDiagnostico.setInt(1, idPaciente);
                try (ResultSet rsDiagnostico = psDiagnostico.executeQuery()) {
                    if (rsDiagnostico.next()) {
                        String diagnostico = rsDiagnostico.getString("diagnostico");
                        String tratamiento = rsDiagnostico.getString("tratamiento");
                        frmImpresion.getTxtAreaDiagnosticoPacienteImprimir().setText(diagnostico + "\n\n" + tratamiento);
                    } else {
                        frmImpresion.getTxtAreaDiagnosticoPacienteImprimir().setText("No hay diagnóstico o tratamiento disponible");
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener los datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

