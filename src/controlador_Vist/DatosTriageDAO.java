/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Modelo.Conexion;
import Modelo.Singleton;
import Vista.DatosTriage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author alexa
 */
public class DatosTriageDAO {

    DatosTriage vistaPanel;
    Singleton singleton = Singleton.getInstance();

    public DatosTriageDAO(DatosTriage vistaPanel) {
        this.vistaPanel = vistaPanel;

        MostrarConsultHistorial();
        validarSexoYDeshabilitarPagina(singleton.getIdentificacion_Historial());
    }

    public String SexoPacientePorIdentificacion(String identificacion) {
    Conexion cnxt = new Conexion();
    String sexo = "";

    String baseQuery = "SELECT \n"
            + "    p.Sexo\n"
            + "FROM \n"
            + "    Paciente pa\n"
            + "JOIN \n"
            + "    Persona p ON pa.Id_Persona = p.Id_Persona\n"
            + "WHERE \n"
            + "    p.Identificacion = ?;";

    try (Connection connection = cnxt.getConexion();
         PreparedStatement pstmt = connection.prepareStatement(baseQuery)) {
        pstmt.setString(1, identificacion);

        try (ResultSet resultSetCita = pstmt.executeQuery()) {
            if (resultSetCita.next()) {
                sexo = resultSetCita.getString("Sexo");
                return sexo;
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Ocurrió un error al realizar la consulta.");
    }
    return sexo;
}
    
    public void validarSexoYDeshabilitarPagina(String identificacion) {
    // Obtener el sexo del paciente por identificación
    String sexo = SexoPacientePorIdentificacion(identificacion);

    // Verificar si el sexo es igual a "M"
    if ("M".equals(sexo)) {
        // Deshabilitar la página 3 del JTabbedPane (índice 2, ya que los índices empiezan en 0)
        vistaPanel.getjTabbedPaneles_().setEnabledAt(2, false);
    } else {
        // Asegurarse de que la página 3 esté habilitada si el sexo no es "M"
        vistaPanel.getjTabbedPaneles_().setEnabledAt(2, true);
    }
}


    public void MostrarConsultHistorial() {
        Conexion cnxt = new Conexion();

        int IdHistorial = singleton.getId_historialPersonal();

        String baseQuery = "SELECT \n"
                + "    h.Id_Historial, \n"
                + "    h.Fecha, \n"
                + "    h.Descripcion_Hist, \n"
                + "    h.His_Est_Activo, \n"
                + "    h.Fecha_Cierre, \n"
                + "    h.Estado, \n"
                + "    h.Id_Consulta, \n"
                + "    h.Id_Paciente, \n"
                + "    h.Id_Triage, \n"
                + "    h.Id_Doctor, \n"
                + "    t.Id_Triage, \n"
                + "    t.Nivel_Prioridad, \n"
                + "    t.Tri_Est_Activo, \n"
                + "    eo.Id_Emer_Obstetrica, \n"
                + "    eo.Menarca, \n"
                + "    eo.Ciclos, \n"
                + "    eo.FUM, \n"
                + "    eo.Regularidad, \n"
                + "    eo.IVSA, \n"
                + "    eo.Numero_Parejas_Sexuales, \n"
                + "    eo.Gravides, \n"
                + "    eo.Abortos, \n"
                + "    eo.Mastodinia, \n"
                + "    eo.Disminorrea, \n"
                + "    eo.Partos, \n"
                + "    eo.Cesareas, \n"
                + "    eo.Campo, \n"
                + "    eo.FPP, \n"
                + "    eo.Semanas_Gestacion, \n"
                + "    eo.Dias_Gestacion, \n"
                + "    eo.Controles, \n"
                + "    eo.Inmunizaciones, \n"
                + "    eo.Embarazo, \n"
                + "    sv.Id_Sig_Vitales, \n"
                + "    sv.Presion_Arterial, \n"
                + "    sv.Peso, \n"
                + "    sv.Talla, \n"
                + "    sv.Indice_Masa_Corporal, \n"
                + "    sv.Frecuencia_Cardiaca, \n"
                + "    sv.Frecuencia_Respiratoria, \n"
                + "    sv.Temperatura, \n"
                + "    sv.Saturacion_Oxigeno, \n"
                + "    sv.Ocular, \n"
                + "    sv.Verbal, \n"
                + "    sv.Motora, \n"
                + "    sv.Total, \n"
                + "    sv.Llenado_Capilar, \n"
                + "    sv.R_Pupilar, \n"
                + "    ef.Id_Ex_Fisico, \n"
                + "    ef.Piel_y_Faneras, \n"
                + "    ef.Cabeza, \n"
                + "    ef.Cuello, \n"
                + "    ef.Torax, \n"
                + "    ef.Corazon, \n"
                + "    ef.Abdomen, \n"
                + "    ef.R_Inguinal, \n"
                + "    ef.M_Superiores, \n"
                + "    ef.M_Inferiores \n"
                + "FROM \n"
                + "    Historial h \n"
                + "LEFT JOIN \n"
                + "    Triage t ON h.Id_Triage = t.Id_Triage \n"
                + "LEFT JOIN \n"
                + "    Emergencia_Obstetrica eo ON t.Id_Triage = eo.Id_Triage \n"
                + "LEFT JOIN \n"
                + "    Signos_Vitales sv ON t.Id_Triage = sv.Id_Triage \n"
                + "LEFT JOIN \n"
                + "    Examen_Fisico ef ON t.Id_Triage = ef.Id_Triage \n"
                + "WHERE  \n"
                + "    h.Id_Historial = ?;";

        try ( Connection connection = cnxt.getConexion();  PreparedStatement pstmt = connection.prepareStatement(baseQuery)) {
            pstmt.setInt(1, IdHistorial);

            try ( ResultSet resultSetCita = pstmt.executeQuery()) {
                if (resultSetCita.next()) {

                    vistaPanel.getTxt_Nivel_Prioridad().setText(String.valueOf(resultSetCita.getString("Nivel_Prioridad")));
                    vistaPanel.getTxtAreaCabeza().setText(String.valueOf(resultSetCita.getString("Cabeza")));
                    vistaPanel.getTxtAreaCuello().setText(String.valueOf(resultSetCita.getString("Cuello")));
                    vistaPanel.getTxtAreaTorax().setText(String.valueOf(resultSetCita.getString("Torax")));
                    vistaPanel.getTxtAreaCorazon().setText(String.valueOf(resultSetCita.getString("Corazon")));
                    vistaPanel.getTxtAreaM_Inferior().setText(String.valueOf(resultSetCita.getString("M_Inferiores")));
                    vistaPanel.getTxtAreaM_Superior().setText(String.valueOf(resultSetCita.getString("M_Superiores")));
                    vistaPanel.getTxtAreaR_Inguinal().setText(String.valueOf(resultSetCita.getString("R_Inguinal")));
                    vistaPanel.getTxtAreaAbdomen().setText(String.valueOf(resultSetCita.getString("Abdomen")));
                    vistaPanel.getjTextAreaPiel_faneras().setText(String.valueOf(resultSetCita.getString("Piel_y_Faneras")));

                    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
                    vistaPanel.getTxt_Estatura().setText(String.valueOf(resultSetCita.getInt("Talla")));
                    vistaPanel.getTxt_MasaCorporal().setText(String.valueOf(resultSetCita.getInt("Indice_Masa_Corporal")));
                    vistaPanel.getTxt_FrecRespiratoria().setText(String.valueOf(resultSetCita.getInt("Frecuencia_Respiratoria")));
                    vistaPanel.getTxt_Saturacion().setText(String.valueOf(resultSetCita.getInt("Saturacion_Oxigeno")));
                    vistaPanel.getTxt_Temperatura().setText(String.valueOf(resultSetCita.getInt("Temperatura")));
                    vistaPanel.getTxt_PresionArterial().setText(String.valueOf(resultSetCita.getString("Presion_Arterial")));
                    vistaPanel.getTxt_LlenadoCapilar().setText(String.valueOf(resultSetCita.getString("Llenado_Capilar")));
                    vistaPanel.getTxt_Peso().setText(String.valueOf(resultSetCita.getInt("Peso")));
                    vistaPanel.getTxt_FreCardiaca().setText(String.valueOf(resultSetCita.getInt("Frecuencia_Cardiaca")));
                    vistaPanel.getTxt_ReaccionPupilar().setText(String.valueOf(resultSetCita.getString("R_Pupilar")));
                    vistaPanel.getTxt_Verbal().setText(String.valueOf(resultSetCita.getInt("Verbal")));
                    vistaPanel.getTxt_Ocular().setText(String.valueOf(resultSetCita.getInt("Ocular")));
                    vistaPanel.getTxt_Motora().setText(String.valueOf(resultSetCita.getInt("Motora")));
                    vistaPanel.getTxt_Total().setText(String.valueOf(resultSetCita.getInt("Total")));

                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    vistaPanel.getTxt_menarca().setText(String.valueOf(resultSetCita.getInt("Menarca")));
                    vistaPanel.getTxt_ciclos().setText(String.valueOf(resultSetCita.getInt("Ciclos")));
                    vistaPanel.getTxt_FechaMenstruacion().setText(String.valueOf(resultSetCita.getDate("FUM")));

                    if ("Regular".equalsIgnoreCase(resultSetCita.getString("Regularidad"))) {
                        vistaPanel.getBtnRegular().setSelected(true);
                        vistaPanel.getBtnIrregular().setSelected(false);

                    } else if ("irregular".equalsIgnoreCase(resultSetCita.getString("Regularidad"))) {
                        vistaPanel.getBtnRegular().setSelected(false);
                        vistaPanel.getBtnIrregular().setSelected(true);
                    }

                    vistaPanel.getTxt_InicioSexualidad().setText(String.valueOf(resultSetCita.getInt("IVSA")));
                    vistaPanel.getTxt_ParejasSexuales().setText(String.valueOf(resultSetCita.getInt("Numero_Parejas_Sexuales")));
                    vistaPanel.getTxt_gravides().setText(String.valueOf(resultSetCita.getInt("Gravides")));
                    vistaPanel.getTxt_abortos().setText(String.valueOf(resultSetCita.getInt("Abortos")));
                    vistaPanel.getTxt_NumeroPartos().setText(String.valueOf(resultSetCita.getInt("Partos")));
                    vistaPanel.getTxt_NumerosCesarias().setText(String.valueOf(resultSetCita.getInt("Cesareas")));
                    vistaPanel.getTxt_Mastodinia().setText(String.valueOf(resultSetCita.getInt("Mastodinia")));
                    vistaPanel.getTxt_Dismenorrea().setText(String.valueOf(resultSetCita.getInt("Disminorrea")));

                    if (resultSetCita.getBoolean("Embarazo")) {
                        vistaPanel.getBtnSiEmbarazo().setSelected(true);
                        vistaPanel.getBtnNoEmbarazo().setSelected(false);
                        if ("Activa".equalsIgnoreCase(resultSetCita.getString("Inmunizaciones"))) {
                            vistaPanel.getBtnActivaInmunizacion().setSelected(true);
                            vistaPanel.getBtnPasivaInmunizacion().setSelected(false);
                        } else if ("Pasiva".equalsIgnoreCase(resultSetCita.getString("Inmunizaciones"))) {
                            vistaPanel.getBtnActivaInmunizacion().setSelected(false);
                            vistaPanel.getBtnPasivaInmunizacion().setSelected(true);
                        }
                        vistaPanel.getTxt_FechaProbableParto().setText(String.valueOf(resultSetCita.getDate("FPP")));
                        vistaPanel.getTxt_SemanaGestacion().setText(String.valueOf(resultSetCita.getInt("Semanas_Gestacion")));
                        vistaPanel.getTxt_DiasGestacion().setText(String.valueOf(resultSetCita.getInt("Dias_Gestacion")));
                        vistaPanel.getTxt_NumeroControles().setText(String.valueOf(resultSetCita.getInt("Controles")));

                    } else {
                        vistaPanel.getBtnSiEmbarazo().setSelected(false);
                        vistaPanel.getBtnNoEmbarazo().setSelected(true);
                    }

                    //---------------------------------------------
                } else {
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ocurrió un error al realizar la consulta.");
        }

    }

}
