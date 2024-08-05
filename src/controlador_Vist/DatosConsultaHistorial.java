/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Modelo.Conexion;
import Modelo.Singleton;
import Vista.DatosConsulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alexa
 */
public class DatosConsultaHistorial {

    DatosConsulta vistaPanel;
    Singleton singleton = Singleton.getInstance();

    public DatosConsultaHistorial(DatosConsulta vistaPanel) {
        this.vistaPanel = vistaPanel;

        MostrarConsultHistorial();

    }

    public void MostrarConsultHistorial() {
        Conexion cnxt = new Conexion();
        int IdHistorial = singleton.getId_historialPersonal();
        String baseQuery = "SELECT \n"
                + "    c.Motivo,\n"
                + "    ec.Aplica,\n"
                + "    ec.Resultados,\n"
                + "    d.Descrip_diag,\n"
                + "    d.CIE_10,\n"
                + "    d.D_Presuntivo,\n"
                + "    d.D_Definitivo,\n"
                + "    r.Descripcion, \n"
                + "    t.Descripcion AS DesTratamiento   \n"
                + "FROM \n"
                + "    Historial h\n"
                + "JOIN \n"
                + "    Consulta c ON h.Id_Consulta = c.Id_Consulta\n"
                + "LEFT JOIN \n"
                + "    Examen_Complementario ec ON c.Id_Consulta = ec.Id_Consulta\n"
                + "LEFT JOIN \n"
                + "    Diagnostico d ON h.Id_Historial = d.Id_Historial\n"
                + "LEFT JOIN \n"
                + "    Tratamiento t ON h.Id_Historial = t.Id_Historial\n"
                + "LEFT JOIN \n"
                + "    Receta r ON t.Id_Tratamiento = r.Id_Tratamiento\n"
                + "WHERE \n"
                + "    h.Id_Historial = ?";

        try ( Connection connection = cnxt.getConexion();  PreparedStatement pstmt = connection.prepareStatement(baseQuery)) {
            pstmt.setInt(1, IdHistorial);

            try ( ResultSet resultSetCita = pstmt.executeQuery()) {
                if (resultSetCita.next()) {
                    vistaPanel.getTxtNotasConsulta().setText(String.valueOf(resultSetCita.getString("Motivo")));
                    vistaPanel.getTxtAreaDiagnostico().setText(String.valueOf(resultSetCita.getString("Descrip_diag")));
                    vistaPanel.getTxtAreaPlanTrat().setText(String.valueOf(resultSetCita.getString("DesTratamiento")));
                    vistaPanel.getTxtAreaInstrucciones().setText(String.valueOf(resultSetCita.getString("Descripcion")));

                    vistaPanel.getTxt_CIE().setText(String.valueOf(resultSetCita.getInt("CIE_10")));

                    if (resultSetCita.getBoolean("D_Definitivo")) {
                        vistaPanel.getBtnDefinitivo().setSelected(true);
                        vistaPanel.getBtnPresuntivo().setSelected(false);
                    } else if (resultSetCita.getBoolean("D_Presuntivo")) {
                        vistaPanel.getBtnDefinitivo().setSelected(false);
                        vistaPanel.getBtnPresuntivo().setSelected(true);
                    }

                    if (resultSetCita.getBoolean("Aplica")) {
                        vistaPanel.getBtnSiAplica().setSelected(true);
                        vistaPanel.getBtnNoAplica().setSelected(false);
                        vistaPanel.getTxtAreaExComplemetario().setText(String.valueOf(resultSetCita.getString("Resultados")));
                    } else {
                        vistaPanel.getBtnSiAplica().setSelected(false);
                        vistaPanel.getBtnNoAplica().setSelected(true);
                    }

                } else {
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ocurrió un error al realizar la consulta.");
        }

    }

}
