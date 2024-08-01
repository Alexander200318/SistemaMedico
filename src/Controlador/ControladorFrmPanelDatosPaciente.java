
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package Controlador;

import Modelo.Singleton;
import Vista.PanelDatosPaciente;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.ImageIcon;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class ControladorFrmPanelDatosPaciente {

    private Singleton singleton;
    private PanelDatosPaciente panelDatosPaciente;

    public ControladorFrmPanelDatosPaciente(PanelDatosPaciente panelDatosPaciente) {
        singleton = Singleton.getInstance();
        this.panelDatosPaciente = panelDatosPaciente;
        obtenerDatosPaciente();
    }

    private int calcularEdad(String fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(fechaNacimiento, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    private void mostrarImagenEnLabel(byte[] fotoBytes, javax.swing.JLabel label) {
        if (label.getWidth() <= 0 || label.getHeight() <= 0) {

            label.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    mostrarImagenEnLabel(fotoBytes, label);
                }
            });
            return;
        }

        if (fotoBytes != null) {
            ImageIcon fotoIcon = new ImageIcon(fotoBytes);
            Image foto = fotoIcon.getImage().getScaledInstance(
                    label.getWidth(),
                    label.getHeight(),
                    Image.SCALE_SMOOTH
            );
            label.setIcon(new ImageIcon(foto));
        } else {
            label.setIcon(null);
        }
    }

    public void obtenerDatosPaciente() {
        int idPaciente = singleton.getIdPaciente();
        System.out.println("ID del paciente: " + idPaciente);

        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();

        String query = "SELECT "
                + "p.Identificacion AS Cedula, "
                + "CONCAT(p.prim_Nombre, ' ', p.seg_Nombre, ' ', p.prim_Apellido, ' ', p.seg_Apellido) AS Nombre, "
                + "p.Fecha_Nacimiento AS Fecha_Nacimiento, "
                + "p.Sexo, "
                + "p.Email, "
                + "p.Telefono AS Telefono, "
                + "p.Direccion, "
                + "p.Foto AS Foto, "
                + "sv.Presion_Arterial, "
                + "sv.Peso, "
                + "sv.Talla, "
                + "sv.Indice_Masa_Corporal, "
                + "sv.Frecuencia_Cardiaca, "
                + "sv.Frecuencia_Respiratoria, "
                + "sv.Temperatura, "
                + "sv.Saturacion_Oxigeno, "
                + "sv.Glasgow, "
                + "sv.Ocular, "
                + "sv.Verbal, "
                + "sv.Motora, "
                + "sv.Total, "
                + "sv.Llenado_Capilar, "
                + "sv.R_Pupilar, "
                + "ap.Alergias AS Personal_Alergias, "
                + "ap.Clinico AS Personal_Clinico, "
                + "ap.Ginecologico AS Personal_Ginecologico, "
                + "ap.Traumatologico AS Personal_Traumatologico, "
                + "ap.Farmacologico AS Personal_Farmacologico, "
                + "ap.Enfermedades AS Personal_Enfermedades, "
                + "ap.Cirugias AS Personal_Cirugias, "
                + "ap.Vacunas AS Personal_Vacunas, "
                + "f.Parentesco, "
                + "fa.Alergias AS Familiar_Alergias, "
                + "fa.Clinico AS Familiar_Clinico, "
                + "fa.Traumatologico AS Familiar_Traumatologico, "
                + "fa.Farmacologico AS Familiar_Farmacologico, "
                + "fa.Enfermedades AS Familiar_Enfermedades, "
                + "fa.Cirugias AS Familiar_Cirugias "
                + "FROM Paciente pac "
                + "JOIN Persona p ON pac.Id_Persona = p.Id_Persona "
                + "LEFT JOIN RegistraTriage rt ON pac.Id_Paciente = rt.Id_Paciente "
                + "LEFT JOIN Triage t ON rt.Id_Triage = t.Id_Triage "
                + "LEFT JOIN Signos_Vitales sv ON t.Id_Triage = sv.Id_Triage "
                + "JOIN Personal pe ON pac.Id_Paciente = pe.Id_Paciente "
                + "JOIN Antecedentes ap ON pe.Id_Antecedentes = ap.Id_Antecedentes "
                + "LEFT JOIN Familiar f ON pac.Id_Paciente = f.Id_Paciente "
                + "LEFT JOIN Antecedentes fa ON f.Id_Antecedentes = fa.Id_Antecedentes "
                + "WHERE pac.Pac_Est_Activo = TRUE "
                + "AND pac.Id_Paciente = ? "
                + "AND (rt.Fecha_Triage IS NULL OR rt.Fecha_Triage = (SELECT MAX(Fecha_Triage) FROM RegistraTriage WHERE Id_Paciente = pac.Id_Paciente))";

        try ( PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Datos del paciente obtenidos:");
                System.out.println("Cedula: " + rs.getString("Cedula"));
                System.out.println("Nombre: " + rs.getString("Nombre"));
                System.out.println("Fecha de Nacimiento: " + rs.getString("Fecha_Nacimiento"));
                System.out.println("Sexo: " + rs.getString("Sexo"));
                System.out.println("Email: " + rs.getString("Email"));
                System.out.println("Telefono: " + rs.getString("Telefono"));
                System.out.println("Direccion: " + rs.getString("Direccion"));

                InputStream fotoStream = rs.getBinaryStream("Foto");
                if (fotoStream != null) {
                    try {
                        byte[] fotoBytes = fotoStream.readAllBytes();
                        mostrarImagenEnLabel(fotoBytes, panelDatosPaciente.getLblFotoConsu());
                    } catch (IOException e) {
                        e.printStackTrace();
                        // Manejo de la excepción, como mostrar un mensaje de error
                        JOptionPane.showMessageDialog(null, "Error al cargar la imagen", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    panelDatosPaciente.getLblFotoConsu().setIcon(null);
                }
                singleton.setIdentificacion_Historial(rs.getString("Cedula"));
                 
                panelDatosPaciente.getTxtIdentificacionPaciente().setText(rs.getString("Cedula"));
                panelDatosPaciente.getTxtNombrePaciente().setText(rs.getString("Nombre"));
                String fechaNacimiento = rs.getString("Fecha_Nacimiento");
                panelDatosPaciente.getTxtFechaNacimientoPaciente().setText(fechaNacimiento);
                panelDatosPaciente.getLabelEdadConsu().setText(String.valueOf(calcularEdad(fechaNacimiento)));
                panelDatosPaciente.getTxtSexoPaciente().setText(rs.getString("Sexo"));
                panelDatosPaciente.getTxtCorreoPaciente().setText(rs.getString("Email"));
                panelDatosPaciente.getTxtCelularPaciente().setText(rs.getString("Telefono"));
                panelDatosPaciente.getTxtDireccionPaciente().setText(rs.getString("Direccion"));

                // Signos Vitales
                panelDatosPaciente.getLabelPresion_ArterialConsu().setText(rs.getString("Presion_Arterial"));
                panelDatosPaciente.getLabelPesoConsu().setText(rs.getString("Peso"));
                panelDatosPaciente.getLabelTallaConsu().setText(rs.getString("Talla"));
                panelDatosPaciente.getLabelIndice_Masa_CorporalConsu().setText(rs.getString("Indice_Masa_Corporal"));
                panelDatosPaciente.getLabelFrecuencia_CardiacaConsu().setText(rs.getString("Frecuencia_Cardiaca"));
                panelDatosPaciente.getLabelFrecuencia_RespiratoriaConsu().setText(rs.getString("Frecuencia_Respiratoria"));
                panelDatosPaciente.getLabelTemperaturaConsu().setText(rs.getString("Temperatura"));
                panelDatosPaciente.getLabelSaturacion_OxigenoConsu().setText(rs.getString("Saturacion_Oxigeno"));
                panelDatosPaciente.getLabelGlasgowConsu().setText(rs.getString("Glasgow"));
                panelDatosPaciente.getLabelOcularConsu().setText(rs.getString("Ocular"));
                panelDatosPaciente.getLabelVerbalConsu().setText(rs.getString("Verbal"));
                panelDatosPaciente.getLabelMotoraConsu().setText(rs.getString("Motora"));
                panelDatosPaciente.getLabelTotalConsu().setText(rs.getString("Total"));
                panelDatosPaciente.getLabelLlenado_CapilarConsu().setText(rs.getString("Llenado_Capilar"));
                panelDatosPaciente.getLabelR_PupilarConsu().setText(rs.getString("R_Pupilar"));

                // Antecedentes Personales
                panelDatosPaciente.getTxtAlergiasPersonales().setText(rs.getString("Personal_Alergias"));
                panelDatosPaciente.getTxtClinicoPersonales().setText(rs.getString("Personal_Clinico"));
                panelDatosPaciente.getTxtGinecologicoPersonales().setText(rs.getString("Personal_Ginecologico"));
                panelDatosPaciente.getTxtTraumatologicoPersonales().setText(rs.getString("Personal_Traumatologico"));
                panelDatosPaciente.getTxtFarmacologicoPersonales().setText(rs.getString("Personal_Farmacologico"));
                panelDatosPaciente.getTxtEnfermedadesPersonales().setText(rs.getString("Personal_Enfermedades"));
                panelDatosPaciente.getTxtCirugiasPersonales().setText(rs.getString("Personal_Cirugias"));
                panelDatosPaciente.getTxtVacunasPersonales().setText(rs.getString("Personal_Vacunas"));

                // Antecedentes Familiares
                panelDatosPaciente.getTxtAlergiasFamiliares().setText(rs.getString("Familiar_Alergias"));
                panelDatosPaciente.getTxtClinicoFamiliares().setText(rs.getString("Familiar_Clinico"));
                panelDatosPaciente.getTxtTraumatologiaFamiliares().setText(rs.getString("Familiar_Traumatologico"));
                panelDatosPaciente.getTxFarmacologiaFamiliares().setText(rs.getString("Familiar_Farmacologico"));
                panelDatosPaciente.getTxtEnfermedadesFamiliares().setText(rs.getString("Familiar_Enfermedades"));
                panelDatosPaciente.getTxtCirugiasFamiliares().setText(rs.getString("Familiar_Cirugias"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de la excepción SQL
            JOptionPane.showMessageDialog(null, "Error al obtener los datos del paciente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarCampos() {
        panelDatosPaciente.getTxtIdentificacionPaciente().setText("");
        panelDatosPaciente.getTxtNombrePaciente().setText("");
        panelDatosPaciente.getTxtFechaNacimientoPaciente().setText("");
        panelDatosPaciente.getLabelEdadConsu().setText("");
        panelDatosPaciente.getTxtSexoPaciente().setText("");
        panelDatosPaciente.getTxtCorreoPaciente().setText("");
        panelDatosPaciente.getTxtCelularPaciente().setText("");
        panelDatosPaciente.getTxtDireccionPaciente().setText("");
        panelDatosPaciente.getLblFotoConsu().setIcon(null);

        panelDatosPaciente.getLabelPresion_ArterialConsu().setText("");
        panelDatosPaciente.getLabelPesoConsu().setText("");
        panelDatosPaciente.getLabelTallaConsu().setText("");
        panelDatosPaciente.getLabelIndice_Masa_CorporalConsu().setText("");
        panelDatosPaciente.getLabelFrecuencia_CardiacaConsu().setText("");
        panelDatosPaciente.getLabelFrecuencia_RespiratoriaConsu().setText("");
        panelDatosPaciente.getLabelTemperaturaConsu().setText("");
        panelDatosPaciente.getLabelSaturacion_OxigenoConsu().setText("");
        panelDatosPaciente.getLabelGlasgowConsu().setText("");
        panelDatosPaciente.getLabelOcularConsu().setText("");
        panelDatosPaciente.getLabelVerbalConsu().setText("");
        panelDatosPaciente.getLabelMotoraConsu().setText("");
        panelDatosPaciente.getLabelTotalConsu().setText("");
        panelDatosPaciente.getLabelLlenado_CapilarConsu().setText("");
        panelDatosPaciente.getLabelR_PupilarConsu().setText("");

        panelDatosPaciente.getTxtAlergiasPersonales().setText("");
        panelDatosPaciente.getTxtClinicoPersonales().setText("");
        panelDatosPaciente.getTxtGinecologicoPersonales().setText("");
        panelDatosPaciente.getTxtTraumatologicoPersonales().setText("");
        panelDatosPaciente.getTxtFarmacologicoPersonales().setText("");
        panelDatosPaciente.getTxtEnfermedadesPersonales().setText("");
        panelDatosPaciente.getTxtCirugiasPersonales().setText("");
        panelDatosPaciente.getTxtVacunasPersonales().setText("");

        panelDatosPaciente.getComboBoxParentesco().setSelectedItem("");
        panelDatosPaciente.getTxtAlergiasFamiliares().setText("");
        panelDatosPaciente.getTxtCirugiasFamiliares().setText("");
        panelDatosPaciente.getTxtClinicoFamiliares().setText("");
        panelDatosPaciente.getTxtEnfermedadesFamiliares().setText("");
        panelDatosPaciente.getTxFarmacologiaFamiliares().setText("");
        panelDatosPaciente.getTxtTraumatologiaFamiliares().setText("");
    }

    public void guardarAntecedentes() {
        int idPaciente = singleton.getIdPaciente();
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();

        try {
            con.setAutoCommit(false);

            String sqlAntecedentes = "INSERT INTO Antecedentes (Alergias, Clinico, Ginecologico, Traumatologico, Farmacologico, Enfermedades, Cirugias, Vacunas) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            String sqlFamiliar = "INSERT INTO Familiar (Id_Paciente, Parentesco, Id_Antecedentes) VALUES (?, ?, ?)";
            String sqlPersonal = "INSERT INTO Personal (Id_Paciente, Id_Antecedentes) VALUES (?, ?)";

            // Guardar antecedentes personales
            try ( PreparedStatement psAntecedentes = con.prepareStatement(sqlAntecedentes, PreparedStatement.RETURN_GENERATED_KEYS)) {
                psAntecedentes.setString(1, panelDatosPaciente.getTxtAlergiasPersonales().getText());
                psAntecedentes.setString(2, panelDatosPaciente.getTxtClinicoPersonales().getText());
                psAntecedentes.setString(3, panelDatosPaciente.getTxtGinecologicoPersonales().getText());
                psAntecedentes.setString(4, panelDatosPaciente.getTxtTraumatologicoPersonales().getText());
                psAntecedentes.setString(5, panelDatosPaciente.getTxtFarmacologicoPersonales().getText());
                psAntecedentes.setString(6, panelDatosPaciente.getTxtEnfermedadesPersonales().getText());
                psAntecedentes.setString(7, panelDatosPaciente.getTxtCirugiasPersonales().getText());
                psAntecedentes.setString(8, panelDatosPaciente.getTxtVacunasPersonales().getText());

                psAntecedentes.executeUpdate();
                ResultSet rs = psAntecedentes.getGeneratedKeys();
                if (rs.next()) {
                    int idAntecedentesPersonales = rs.getInt(1);

                    // Guardar en la tabla Personal
                    try ( PreparedStatement psPersonal = con.prepareStatement(sqlPersonal)) {
                        psPersonal.setInt(1, idPaciente);
                        psPersonal.setInt(2, idAntecedentesPersonales);
                        psPersonal.executeUpdate();
                    }
                }
            }

            // Guardar antecedentes familiares
            try ( PreparedStatement psAntecedentes = con.prepareStatement(sqlAntecedentes, PreparedStatement.RETURN_GENERATED_KEYS)) {
                psAntecedentes.setString(1, panelDatosPaciente.getTxtAlergiasFamiliares().getText());
                psAntecedentes.setString(2, panelDatosPaciente.getTxtClinicoFamiliares().getText());
                psAntecedentes.setString(3, null);  // No se usa en familiares
                psAntecedentes.setString(4, panelDatosPaciente.getTxtTraumatologiaFamiliares().getText());
                psAntecedentes.setString(5, panelDatosPaciente.getTxFarmacologiaFamiliares().getText());
                psAntecedentes.setString(6, panelDatosPaciente.getTxtEnfermedadesFamiliares().getText());
                psAntecedentes.setString(7, panelDatosPaciente.getTxtCirugiasFamiliares().getText());
                psAntecedentes.setString(8, null);  // No se usa en familiares

                psAntecedentes.executeUpdate();
                ResultSet rs = psAntecedentes.getGeneratedKeys();
                if (rs.next()) {
                    int idAntecedentesFamiliares = rs.getInt(1);

                    // Guardar en la tabla Familiar
                    try ( PreparedStatement psFamiliar = con.prepareStatement(sqlFamiliar)) {
                        psFamiliar.setInt(1, idPaciente);
                        psFamiliar.setString(2, panelDatosPaciente.getComboBoxParentesco().getSelectedItem().toString());
                        psFamiliar.setInt(3, idAntecedentesFamiliares);
                        psFamiliar.executeUpdate();
                    }
                }
            }

            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}