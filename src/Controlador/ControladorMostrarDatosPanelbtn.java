/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Singleton;
import Vista.PanelDatosPaciente;
import Vista.PanelDatosHISTORIAL;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;

/**
 * Controlador para mostrar datos del panel.
 */
public class ControladorMostrarDatosPanelbtn {

    private Conexion conexion;
    private PanelDatosPaciente panelDatosPaciente;

    public ControladorMostrarDatosPanelbtn(PanelDatosPaciente panelDatosPaciente) {
        this.panelDatosPaciente = panelDatosPaciente;
        this.conexion = new Conexion();
        mostrarDatos();

        // Añadir MouseListener a Panelbtn para cambiar el panel al hacer clic
        panelDatosPaciente.getPanelbtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Verificar si hay registros previos antes de cambiar de panel
                if (!panelDatosPaciente.getLabelDocNombreMostrarDatos().getText().equals("No existen registros previos")) {
                    cambiarAPanelHistorial();
                }
            }
        });
    }

    private void mostrarDatos() {
        int idPaciente = Singleton.getInstance().getIdPaciente();

        try (Connection con = conexion.getConexion()) {
            // Obtener detalles de la última cita del paciente
            String sqlCita = "SELECT "
                    + "DAY(rc.Fecha_Consult) AS Dia_Ultima_Cita, "
                    + "CASE MONTH(rc.Fecha_Consult) "
                    + "    WHEN 1 THEN 'Enero' "
                    + "    WHEN 2 THEN 'Febrero' "
                    + "    WHEN 3 THEN 'Marzo' "
                    + "    WHEN 4 THEN 'Abril' "
                    + "    WHEN 5 THEN 'Mayo' "
                    + "    WHEN 6 THEN 'Junio' "
                    + "    WHEN 7 THEN 'Julio' "
                    + "    WHEN 8 THEN 'Agosto' "
                    + "    WHEN 9 THEN 'Septiembre' "
                    + "    WHEN 10 THEN 'Octubre' "
                    + "    WHEN 11 THEN 'Noviembre' "
                    + "    WHEN 12 THEN 'Diciembre' "
                    + "END AS Mes_Ultima_Cita, "
                    + "YEAR(rc.Fecha_Consult) AS Anio_Ultima_Cita, "
                    + "CONCAT(p.prim_Nombre, ' ', IFNULL(p.seg_Nombre, ''), ' ', p.prim_Apellido, ' ', IFNULL(p.seg_Apellido, '')) AS Nombre_Doctor, "
                    + "c.Motivo AS Motivo_Consulta "
                    + "FROM RegistraConsulta rc "
                    + "JOIN Doctor d ON rc.Id_Doctor = d.Id_Doctor "
                    + "JOIN Persona p ON d.Id_Persona = p.Id_Persona "
                    + "JOIN Consulta c ON rc.Id_Consulta = c.Id_Consulta "
                    + "WHERE rc.Id_Paciente = ? "
                    + "ORDER BY rc.Fecha_Consult DESC "
                    + "LIMIT 1";

            try (PreparedStatement statementCita = con.prepareStatement(sqlCita)) {
                statementCita.setInt(1, idPaciente);

                try (ResultSet resultSetCita = statementCita.executeQuery()) {
                    if (resultSetCita.next()) {
                        panelDatosPaciente.getLabelAñoUltimaCita().setText(String.valueOf(resultSetCita.getInt("Anio_Ultima_Cita")));
                        panelDatosPaciente.getLabelDiaUltimaCita().setText(String.valueOf(resultSetCita.getInt("Dia_Ultima_Cita")));
                        panelDatosPaciente.getLabelMesUltimaCita().setText(resultSetCita.getString("Mes_Ultima_Cita"));
                        panelDatosPaciente.getLabelMotivoCita().setText(resultSetCita.getString("Motivo_Consulta"));
                        panelDatosPaciente.getLabelDocNombreMostrarDatos().setText(resultSetCita.getString("Nombre_Doctor"));
                    } else {
                        panelDatosPaciente.getLabelDocNombreMostrarDatos().setText("No existen registros previos");
                        panelDatosPaciente.getLabelAñoUltimaCita().setText("");
                        panelDatosPaciente.getLabelDiaUltimaCita().setText("");
                        panelDatosPaciente.getLabelMesUltimaCita().setText("");
                        panelDatosPaciente.getLabelMotivoCita().setText("");
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void cambiarAPanelHistorial() {
        PanelDatosHISTORIAL panelHistorial = new PanelDatosHISTORIAL();
        panelHistorial.setSize(1280, 680);
        panelHistorial.setLocation(0, 0);

        JPanel parent = (JPanel) panelDatosPaciente.getParent();
        parent.removeAll();
        parent.add(panelHistorial, BorderLayout.CENTER);
        parent.revalidate();
        parent.repaint();
    }
}
