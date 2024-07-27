/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Singleton;
import Vista.PanelDatosPaciente;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.ImageIcon;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

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

    
    
    public void obtenerDatosPaciente() {
    int idPaciente = singleton.getIdPaciente();
    System.out.println("ID del paciente: " + idPaciente);

    Conexion conexion = new Conexion();
    Connection con = conexion.getConexion();

    // Ajusta la consulta SQL para filtrar por el ID del paciente
    String query = "SELECT " +
            "p.Identificacion AS Cedula, " +
            "CONCAT(p.prim_Nombre, ' ', p.seg_Nombre, ' ', p.prim_Apellido, ' ', p.seg_Apellido) AS Nombre, " +
            "p.Fecha_Nacimiento AS Fecha_Nacimiento, " +
            "p.Sexo, " +
            "p.Email, " +
            "p.Telefono AS Telefono, " +
            "p.Direccion, " +
            "p.Foto AS Foto, " + 
            "sv.Presion_Arterial, " +
            "sv.Peso, " +
            "sv.Talla, " +
            "sv.Indice_Masa_Corporal, " +
            "sv.Frecuencia_Cardiaca, " +
            "sv.Frecuencia_Respiratoria, " +
            "sv.Temperatura, " +
            "sv.Saturacion_Oxigeno, " +
            "sv.Glasgow, " +
            "sv.Ocular, " +
            "sv.Verbal, " +
            "sv.Motora, " +
            "sv.Total, " +
            "sv.Llenado_Capilar, " +
            "sv.R_Pupilar, " +
            "ap.Alergias AS Personal_Alergias, " +
            "ap.Clinico AS Personal_Clinico, " +
            "ap.Ginecologico AS Personal_Ginecologico, " +
            "ap.Traumatologico AS Personal_Traumatologico, " +
            "ap.Farmacologico AS Personal_Farmacologico, " +
            "ap.Enfermedades AS Personal_Enfermedades, " +
            "ap.Cirugias AS Personal_Cirugias, " +
            "ap.Vacunas AS Personal_Vacunas, " +
            "f.Parentesco, " +
            "fa.Alergias AS Familiar_Alergias, " +
            "fa.Clinico AS Familiar_Clinico, " +
            "fa.Traumatologico AS Familiar_Traumatologico, " +
            "fa.Farmacologico AS Familiar_Farmacologico, " +
            "fa.Enfermedades AS Familiar_Enfermedades, " +
            "fa.Cirugias AS Familiar_Cirugias " +
            "FROM Paciente pac " +
            "JOIN Persona p ON pac.Id_Persona = p.Id_Persona " +
            "JOIN RegistraTriage rt ON pac.Id_Paciente = rt.Id_Paciente " +
            "JOIN Triage t ON rt.Id_Triage = t.Id_Triage " +
            "JOIN Signos_Vitales sv ON t.Id_Triage = sv.Id_Triage " +
            "JOIN Personal pe ON pac.Id_Paciente = pe.Id_Paciente " +
            "JOIN Antecedentes ap ON pe.Id_Antecedentes = ap.Id_Antecedentes " +
            "LEFT JOIN Familiar f ON pac.Id_Paciente = f.Id_Paciente " +
            "LEFT JOIN Antecedentes fa ON f.Id_Antecedentes = fa.Id_Antecedentes " +
            "WHERE pac.Pac_Est_Activo = TRUE " +
            "AND pac.Id_Paciente = ? " + // Agregado para filtrar por ID de paciente
            "AND rt.Fecha_Triage = (SELECT MAX(Fecha_Triage) FROM RegistraTriage WHERE Id_Paciente = pac.Id_Paciente) " +
            "LIMIT 0, 1000";

    try (PreparedStatement ps = con.prepareStatement(query)) {
        ps.setInt(1, idPaciente); // Establece el parámetro del ID del paciente
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            // Resto del código para procesar los datos
            System.out.println("Datos del paciente obtenidos:");
            System.out.println("Cedula: " + rs.getString("Cedula"));
            System.out.println("Nombre: " + rs.getString("Nombre"));
            System.out.println("Fecha de Nacimiento: " + rs.getString("Fecha_Nacimiento"));
            System.out.println("Sexo: " + rs.getString("Sexo"));
            System.out.println("Email: " + rs.getString("Email"));
            System.out.println("Telefono: " + rs.getString("Telefono"));
            System.out.println("Direccion: " + rs.getString("Direccion"));

            // Cargar la foto del paciente
            InputStream fotoStream = rs.getBinaryStream("Foto");
            if (fotoStream != null) {
                Image foto = new ImageIcon(fotoStream.readAllBytes()).getImage();
                ImageIcon fotoIcon = new ImageIcon(foto.getScaledInstance(
                        panelDatosPaciente.getLblFotoConsu().getWidth(),
                        panelDatosPaciente.getLblFotoConsu().getHeight(),
                        Image.SCALE_SMOOTH));
                panelDatosPaciente.getLblFotoConsu().setIcon(fotoIcon);
            } else {
                panelDatosPaciente.getLblFotoConsu().setIcon(null); // No hay foto disponible
            }

            panelDatosPaciente.getLabelCedulaConsu().setText(rs.getString("Cedula"));
            panelDatosPaciente.getLabelNombreConsu().setText(rs.getString("Nombre"));
            String fechaNacimiento = rs.getString("Fecha_Nacimiento");
            panelDatosPaciente.getLabelNacimientoConsu().setText(fechaNacimiento);
            panelDatosPaciente.getLabelEdadConsu().setText(String.valueOf(calcularEdad(fechaNacimiento)));
            panelDatosPaciente.getLabelSexoConsu().setText(rs.getString("Sexo"));
            panelDatosPaciente.getLabelCorreoConsu().setText(rs.getString("Email"));
            panelDatosPaciente.getLabelCelularConsu().setText(rs.getString("Telefono"));
            panelDatosPaciente.getLabelDirecciónConsu().setText(rs.getString("Direccion"));

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
            panelDatosPaciente.getLabelAlergiasConsuPersonales().setText(rs.getString("Personal_Alergias"));
            panelDatosPaciente.getLabelClinicoConsuPersonales().setText(rs.getString("Personal_Clinico"));
            panelDatosPaciente.getLabelGinecologicoConsuPersonales().setText(rs.getString("Personal_Ginecologico"));
            panelDatosPaciente.getLabelTraumatologicoConsuPersonales().setText(rs.getString("Personal_Traumatologico"));
            panelDatosPaciente.getLabelFarmacologicoConsuPersonales().setText(rs.getString("Personal_Farmacologico"));
            panelDatosPaciente.getLabelEnfermedadesConsuPersonales().setText(rs.getString("Personal_Enfermedades"));
            panelDatosPaciente.getLabelCirugiasConsuPersonales().setText(rs.getString("Personal_Cirugias"));
            panelDatosPaciente.getLabelVacunasConsuPersonales().setText(rs.getString("Personal_Vacunas"));

            // Antecedentes Familiares
//            panelDatosPaciente.getLabelParentescoConsuFamiliar().setText(rs.getString("Parentesco"));
            panelDatosPaciente.getLabelAlergiasConsuFamiliar().setText(rs.getString("Familiar_Alergias"));
            panelDatosPaciente.getLabelClinicoConsuFamiliar().setText(rs.getString("Familiar_Clinico"));
            panelDatosPaciente.getLabelTraumatologicoConsuFamiliar().setText(rs.getString("Familiar_Traumatologico"));
            panelDatosPaciente.getLabelFarmacologicoConsuFamiliar().setText(rs.getString("Familiar_Farmacologico"));
            panelDatosPaciente.getLabelEnfermedadesConsuFamiliar().setText(rs.getString("Familiar_Enfermedades"));
            panelDatosPaciente.getLabelCirugiasConsuFamiliar().setText(rs.getString("Familiar_Cirugias"));
        } else {
            System.out.println("No se encontraron datos para el paciente con ID: " + idPaciente);
            // Limpiar los campos en el panel si no se encuentran datos
            panelDatosPaciente.getLblFotoConsu().setIcon(null);
            panelDatosPaciente.getLabelCedulaConsu().setText("");
            panelDatosPaciente.getLabelNombreConsu().setText("");
            panelDatosPaciente.getLabelNacimientoConsu().setText("");
            panelDatosPaciente.getLabelEdadConsu().setText("");
            panelDatosPaciente.getLabelSexoConsu().setText("");
            panelDatosPaciente.getLabelCorreoConsu().setText("");
            panelDatosPaciente.getLabelCelularConsu().setText("");
            panelDatosPaciente.getLabelDirecciónConsu().setText("");

            // Limpiar los signos vitales
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

            // Limpiar antecedentes personales
            panelDatosPaciente.getLabelAlergiasConsuPersonales().setText("");
            panelDatosPaciente.getLabelClinicoConsuPersonales().setText("");
            panelDatosPaciente.getLabelGinecologicoConsuPersonales().setText("");
            panelDatosPaciente.getLabelTraumatologicoConsuPersonales().setText("");
            panelDatosPaciente.getLabelFarmacologicoConsuPersonales().setText("");
            panelDatosPaciente.getLabelEnfermedadesConsuPersonales().setText("");
            panelDatosPaciente.getLabelCirugiasConsuPersonales().setText("");
            panelDatosPaciente.getLabelVacunasConsuPersonales().setText("");

            // Limpiar antecedentes familiares
//            panelDatosPaciente.getLabelParentescoConsuFamiliar().setText("");
            panelDatosPaciente.getLabelAlergiasConsuFamiliar().setText("");
            panelDatosPaciente.getLabelClinicoConsuFamiliar().setText("");
            panelDatosPaciente.getLabelTraumatologicoConsuFamiliar().setText("");
            panelDatosPaciente.getLabelFarmacologicoConsuFamiliar().setText("");
            panelDatosPaciente.getLabelEnfermedadesConsuFamiliar().setText("");
            panelDatosPaciente.getLabelCirugiasConsuFamiliar().setText("");
        }
    } catch (SQLException | IOException e) {
        System.out.println(e.toString());
    }
}
}
