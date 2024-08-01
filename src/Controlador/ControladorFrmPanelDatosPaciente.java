
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Singleton;
import Vista.PanelDatosPaciente;
import Modelo.Conexion;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

        panelDatosPaciente.getBtnEditarDatos().addActionListener(e -> activarEdicion(true));
        panelDatosPaciente.getBtnGuardarCambiosDatos().addActionListener(e -> {
            guardarCambios();
            activarEdicion(false);
        });
        activarEdicion(false);
        ObtenesAntecentesFamilares();
        panelDatosPaciente.getComboBoxParentesco().addActionListener((e) -> {
             ObtenesAntecentesFamilares();
        });
    }
////////////////////////////////////////////////////////////////////////////////////////////////

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

    public void ObtenesAntecentesFamilares() {
        int idPaciente = singleton.getIdPaciente();
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
        
       String query = "SELECT ap.Alergias, "
               + "ap.Clinico, "
               + "ap.Traumatologico, "
               + "ap.Farmacologico, "
                + "ap.Enfermedades, "
               + "ap.Cirugias "
                + "FROM Antecedentes ap "
                + "LEFT JOIN familiar f ON f.Id_Antecedentes = ap.Id_Antecedentes "
                + "WHERE f.Id_Paciente = ? "
                + "AND f.Parentesco = ?";

        try ( PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, idPaciente);
            ps.setString(2,TextoseleccionFamiliar());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
//                System.out.println("Datos del paciente obtenidos:");
//                System.out.println("Cedula: " + rs.getString("Cedula"));
//                System.out.println("Nombre: " + rs.getString("Nombre"));
//                System.out.println("Fecha de Nacimiento: " + rs.getString("Fecha_Nacimiento"));
//                System.out.println("Sexo: " + rs.getString("Sexo"));
//                System.out.println("Email: " + rs.getString("Email"));
//                System.out.println("Telefono: " + rs.getString("Telefono"));
//                System.out.println("Direccion: " + rs.getString("Direccion"));
//
//                InputStream fotoStream = rs.getBinaryStream("Foto");
//                if (fotoStream != null) {
//                    try {
//                        byte[] fotoBytes = fotoStream.readAllBytes();
//                        mostrarImagenEnLabel(fotoBytes, panelDatosPaciente.getLblFotoConsu());
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                        JOptionPane.showMessageDialog(null, "Error al cargar la imagen", "Error", JOptionPane.ERROR_MESSAGE);
//                    }
//                } else {
//                    panelDatosPaciente.getLblFotoConsu().setIcon(null);
//                }
//                singleton.setIdentificacion_Historial(rs.getString("Cedula"));
//                
//
//                panelDatosPaciente.getTxtIdentificacionPaciente().setText(rs.getString("Cedula"));
//                panelDatosPaciente.getTxtNombrePaciente().setText(rs.getString("Nombre"));
//                panelDatosPaciente.getTxtApellidoPaciente().setText(rs.getString("Apellidos"));
//                String fechaNacimiento = rs.getString("Fecha_Nacimiento");
//                panelDatosPaciente.getTxtFechaNacimientoPaciente().setText(fechaNacimiento);
//                panelDatosPaciente.getLabelEdadConsu().setText(String.valueOf(calcularEdad(fechaNacimiento)));
//                panelDatosPaciente.getTxtSexoPaciente().setText(rs.getString("Sexo"));
//                panelDatosPaciente.getTxtCorreoPaciente().setText(rs.getString("Email"));
//                panelDatosPaciente.getTxtCelularPaciente().setText(rs.getString("Telefono"));
//                panelDatosPaciente.getTxtDireccionPaciente().setText(rs.getString("Direccion"));
//
//                // Signos Vitales
//                panelDatosPaciente.getLabelPresion_ArterialConsu().setText(rs.getString("Presion_Arterial"));
//                panelDatosPaciente.getLabelPesoConsu().setText(rs.getString("Peso"));
//                panelDatosPaciente.getLabelTallaConsu().setText(rs.getString("Talla"));
//                panelDatosPaciente.getLabelIndice_Masa_CorporalConsu().setText(rs.getString("Indice_Masa_Corporal"));
//                panelDatosPaciente.getLabelFrecuencia_CardiacaConsu().setText(rs.getString("Frecuencia_Cardiaca"));
//                panelDatosPaciente.getLabelFrecuencia_RespiratoriaConsu().setText(rs.getString("Frecuencia_Respiratoria"));
//                panelDatosPaciente.getLabelTemperaturaConsu().setText(rs.getString("Temperatura"));
//                panelDatosPaciente.getLabelSaturacion_OxigenoConsu().setText(rs.getString("Saturacion_Oxigeno"));
//                panelDatosPaciente.getLabelGlasgowConsu().setText(rs.getString("Glasgow"));
//                panelDatosPaciente.getLabelOcularConsu().setText(rs.getString("Ocular"));
//                panelDatosPaciente.getLabelVerbalConsu().setText(rs.getString("Verbal"));
//                panelDatosPaciente.getLabelMotoraConsu().setText(rs.getString("Motora"));
//                panelDatosPaciente.getLabelTotalConsu().setText(rs.getString("Total"));
//                panelDatosPaciente.getLabelLlenado_CapilarConsu().setText(rs.getString("Llenado_Capilar"));
//                panelDatosPaciente.getLabelR_PupilarConsu().setText(rs.getString("R_Pupilar"));
//
//                // Antecedentes Personales
//                panelDatosPaciente.getTxtAlergiasPersonales().setText(rs.getString("Personal_Alergias"));
//                panelDatosPaciente.getTxtClinicoPersonales().setText(rs.getString("Personal_Clinico"));
//                panelDatosPaciente.getTxtGinecologicoPersonales().setText(rs.getString("Personal_Ginecologico"));
//                panelDatosPaciente.getTxtTraumatologicoPersonales().setText(rs.getString("Personal_Traumatologico"));
//                panelDatosPaciente.getTxtFarmacologicoPersonales().setText(rs.getString("Personal_Farmacologico"));
//                panelDatosPaciente.getTxtEnfermedadesPersonales().setText(rs.getString("Personal_Enfermedades"));
//                panelDatosPaciente.getTxtCirugiasPersonales().setText(rs.getString("Personal_Cirugias"));
//                panelDatosPaciente.getTxtVacunasPersonales().setText(rs.getString("Personal_Vacunas"));

                // Antecedentes Familiares
//                panelDatosPaciente.getComboBoxParentesco().setSelectedItem(rs.getString("Parentesco"));
                panelDatosPaciente.getTxtAlergiasFamiliares().setText(rs.getString("Alergias"));
                panelDatosPaciente.getTxtClinicoFamiliares().setText(rs.getString("Clinico"));
                panelDatosPaciente.getTxtTraumatologiaFamiliares().setText(rs.getString("Traumatologico"));
                panelDatosPaciente.getTxFarmacologiaFamiliares().setText(rs.getString("Farmacologico"));
                panelDatosPaciente.getTxtEnfermedadesFamiliares().setText(rs.getString("Enfermedades"));
                panelDatosPaciente.getTxtCirugiasFamiliares().setText(rs.getString("Cirugias"));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron datos para el paciente con ID: " + idPaciente, "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener los datos del paciente", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void obtenerDatosPaciente() {
        int idPaciente = singleton.getIdPaciente();
        System.out.println("ID del paciente: " + idPaciente);

        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();

        String query = "SELECT "
                + "p.Identificacion AS Cedula, "
                + "CONCAT(p.prim_Nombre, ' ', p.seg_Nombre) AS Nombre, "
                + "CONCAT( p.prim_Apellido, ' ', p.seg_Apellido) AS Apellidos, "
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
                        JOptionPane.showMessageDialog(null, "Error al cargar la imagen", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    panelDatosPaciente.getLblFotoConsu().setIcon(null);
                }
                singleton.setIdentificacion_Historial(rs.getString("Cedula"));
                panelDatosPaciente.getTxtIdentificacionPaciente().setText(rs.getString("Cedula"));
                panelDatosPaciente.getTxtNombrePaciente().setText(rs.getString("Nombre"));
                panelDatosPaciente.getTxtApellidoPaciente().setText(rs.getString("Apellidos"));
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
                panelDatosPaciente.getComboBoxParentesco().setSelectedItem(rs.getString("Parentesco"));
                panelDatosPaciente.getTxtAlergiasFamiliares().setText(rs.getString("Familiar_Alergias"));
                panelDatosPaciente.getTxtClinicoFamiliares().setText(rs.getString("Familiar_Clinico"));
                panelDatosPaciente.getTxtTraumatologiaFamiliares().setText(rs.getString("Familiar_Traumatologico"));
                panelDatosPaciente.getTxFarmacologiaFamiliares().setText(rs.getString("Familiar_Farmacologico"));
                panelDatosPaciente.getTxtEnfermedadesFamiliares().setText(rs.getString("Familiar_Enfermedades"));
                panelDatosPaciente.getTxtCirugiasFamiliares().setText(rs.getString("Familiar_Cirugias"));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron datos para el paciente con ID: " + idPaciente, "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener los datos del paciente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void activarEdicion(boolean habilitar) {
        panelDatosPaciente.getTxtIdentificacionPaciente().setEnabled(habilitar);
        panelDatosPaciente.getTxtNombrePaciente().setEnabled(habilitar);
        panelDatosPaciente.getTxtFechaNacimientoPaciente().setEnabled(habilitar);
        panelDatosPaciente.getTxtSexoPaciente().setEnabled(habilitar);
        panelDatosPaciente.getTxtCorreoPaciente().setEnabled(habilitar);
        panelDatosPaciente.getTxtCelularPaciente().setEnabled(habilitar);
        panelDatosPaciente.getTxtDireccionPaciente().setEnabled(habilitar);
        panelDatosPaciente.getTxtAlergiasPersonales().setEnabled(habilitar);
        panelDatosPaciente.getTxtClinicoPersonales().setEnabled(habilitar);
        panelDatosPaciente.getTxtGinecologicoPersonales().setEnabled(habilitar);
        panelDatosPaciente.getTxtTraumatologicoPersonales().setEnabled(habilitar);
        panelDatosPaciente.getTxtFarmacologicoPersonales().setEnabled(habilitar);
        panelDatosPaciente.getTxtEnfermedadesPersonales().setEnabled(habilitar);
        panelDatosPaciente.getTxtCirugiasPersonales().setEnabled(habilitar);
        panelDatosPaciente.getTxtVacunasPersonales().setEnabled(habilitar);
//        panelDatosPaciente.getComboBoxParentesco().setEnabled(habilitar);
        panelDatosPaciente.getTxtAlergiasFamiliares().setEnabled(habilitar);
        panelDatosPaciente.getTxtClinicoFamiliares().setEnabled(habilitar);
        panelDatosPaciente.getTxtTraumatologiaFamiliares().setEnabled(habilitar);
        panelDatosPaciente.getTxFarmacologiaFamiliares().setEnabled(habilitar);
        panelDatosPaciente.getTxtEnfermedadesFamiliares().setEnabled(habilitar);
        panelDatosPaciente.getTxtCirugiasFamiliares().setEnabled(habilitar);
        panelDatosPaciente.getBtnGuardarCambiosDatos().setEnabled(habilitar);
    }

    private void guardarCambios() {
        int idPaciente = singleton.getIdPaciente();
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();

        if (con == null) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = "UPDATE Persona p "
                + "JOIN Paciente pac ON p.Id_Persona = pac.Id_Persona "
                + "SET p.prim_Nombre = ?, "
                + "p.seg_Nombre = ?, "
                + "p.prim_Apellido = ?, "
                + "p.seg_Apellido = ?, "
                + "p.Fecha_Nacimiento = ? , "
                + "p.Sexo = ?, "
                + "p.Email = ?, "
                + "p.Telefono = ?, "
                + "p.Direccion = ? "
                + "WHERE pac.Id_Paciente = ?";

        String AntecedentesPersonales = "UPDATE antecedentes ap "
                + "JOIN personal a ON ap.Id_Antecedentes = a.Id_Antecedentes "
                + "SET ap.Alergias = ?, "
                + "ap.Clinico = ?, "
                + "ap.Ginecologico = ?, "
                + "ap.Traumatologico = ?, "
                + "ap.Farmacologico = ?, "
                + "ap.Enfermedades = ?, "
                + "ap.Cirugias = ?, "
                + "ap.Vacunas = ? "
                + "WHERE a.Id_Paciente = ?";

        String AntecedentesFamiliares = "UPDATE antecedentes ap "
                + "JOIN familiar a ON ap.Id_Antecedentes = a.Id_Antecedentes "
                + "SET ap.Alergias = ?, "
                + "ap.Clinico = ?, "
                //      + "ap.Ginecologico = ?, "
                + "ap.Traumatologico = ?, "
                + "ap.Farmacologico = ?, "
                + "ap.Enfermedades = ?, "
                + "ap.Cirugias = ? "
                //+ "ap.Vacunas = ?, "
                + "WHERE a.Id_Paciente = ? "
                + "AND a.Parentesco = ?";

        try ( PreparedStatement ps = con.prepareStatement(query)) {
            // Verifica que panelDatosPaciente y sus componentes no sean null
            if (panelDatosPaciente == null) {
                JOptionPane.showMessageDialog(null, "El panel de datos del paciente no está inicializado", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (panelDatosPaciente.getTxtNombrePaciente() == null || panelDatosPaciente.getTxtNombrePaciente().getText() == null) {
                JOptionPane.showMessageDialog(null, "El campo de nombre del paciente no está inicializado", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Asigna valores a los parámetros de la consulta
            ps.setString(1, getOrDefault(panelDatosPaciente.getTxtNombrePaciente().getText().split(" ")[0])); // prim_Nombre
            ps.setString(2, getOrDefault(panelDatosPaciente.getTxtNombrePaciente().getText().split(" ").length > 1 ? panelDatosPaciente.getTxtNombrePaciente().getText().split(" ")[1] : ""));
            ps.setString(3, getOrDefault(panelDatosPaciente.getTxtApellidoPaciente().getText().split(" ")[0])); // prim_Apellido
            ps.setString(4, getOrDefault(panelDatosPaciente.getTxtApellidoPaciente().getText().split(" ").length > 1 ? panelDatosPaciente.getTxtApellidoPaciente().getText().split(" ")[1] : ""));
            ps.setString(5, getOrDefault(panelDatosPaciente.getTxtFechaNacimientoPaciente().getText())); // Fecha_Nacimiento
            ps.setString(6, getOrDefault(panelDatosPaciente.getTxtSexoPaciente().getText())); // Sexo
            ps.setString(7, getOrDefault(panelDatosPaciente.getTxtCorreoPaciente().getText())); // Email
            ps.setString(8, getOrDefault(panelDatosPaciente.getTxtCelularPaciente().getText())); // Telefono
            ps.setString(9, getOrDefault(panelDatosPaciente.getTxtDireccionPaciente().getText())); // Direccion
            ps.setInt(10, idPaciente); // Id_Paciente
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar los datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos del paciente", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("panelDatosPaciente: " + panelDatosPaciente);
            System.out.println("ComboBoxParentesco: " + panelDatosPaciente.getComboBoxParentesco());
            System.out.println("Selected Item: " + panelDatosPaciente.getComboBoxParentesco().getSelectedItem());

        }

        try ( PreparedStatement AntPersonal = con.prepareStatement(AntecedentesPersonales)) {

            AntPersonal.setString(1, getOrDefault(panelDatosPaciente.getTxtAlergiasPersonales().getText())); // Alergias
            AntPersonal.setString(2, getOrDefault(panelDatosPaciente.getTxtClinicoPersonales().getText())); // Clinico
            AntPersonal.setString(3, getOrDefault(panelDatosPaciente.getTxtGinecologicoPersonales().getText())); // Ginecologico
            AntPersonal.setString(4, getOrDefault(panelDatosPaciente.getTxtTraumatologicoPersonales().getText())); // Traumatologico
            AntPersonal.setString(5, getOrDefault(panelDatosPaciente.getTxtFarmacologicoPersonales().getText())); // Farmacologico
            AntPersonal.setString(6, getOrDefault(panelDatosPaciente.getTxtEnfermedadesPersonales().getText())); // Enfermedades
            AntPersonal.setString(7, getOrDefault(panelDatosPaciente.getTxtCirugiasPersonales().getText())); // Cirugias
            AntPersonal.setString(8, getOrDefault(panelDatosPaciente.getTxtVacunasPersonales().getText())); // Vacunas
            AntPersonal.setInt(9, idPaciente);
//            if (panelDatosPaciente.getComboBoxParentesco() == null || panelDatosPaciente.getComboBoxParentesco().getSelectedItem() == null) {
//                JOptionPane.showMessageDialog(null, "El combo box de parentesco no está inicializado", "Error", JOptionPane.ERROR_MESSAGE);
//                System.out.println("1_____");
//                return;
//                
//            }
            System.out.println("2_____");
            int filasAfectadas = AntPersonal.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente el antecedente Personal", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar los datos del antecedente Personal", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        try ( PreparedStatement AntFamiliar = con.prepareStatement(AntecedentesFamiliares)) {

            AntFamiliar.setString(1, getOrDefault(panelDatosPaciente.getTxtAlergiasFamiliares().getText())); // Alergias
            AntFamiliar.setString(2, getOrDefault(panelDatosPaciente.getTxtClinicoFamiliares().getText())); // Clinico
            // AntFamiliar.setString(3, getOrDefault(panelDatosPaciente.getTxtGinecologicoPersonales().getText())); // Ginecologico
            AntFamiliar.setString(3, getOrDefault(panelDatosPaciente.getTxtTraumatologiaFamiliares().getText())); // Traumatologico
            AntFamiliar.setString(4, getOrDefault(panelDatosPaciente.getTxFarmacologiaFamiliares().getText())); // Farmacologico
            AntFamiliar.setString(5, getOrDefault(panelDatosPaciente.getTxtEnfermedadesFamiliares().getText())); // Enfermedades
            AntFamiliar.setString(6, getOrDefault(panelDatosPaciente.getTxtCirugiasFamiliares().getText())); // Cirugias
            // AntFamiliar.setString(8, getOrDefault(panelDatosPaciente.getTxtVacunasPersonales().getText())); // Vacunas
            AntFamiliar.setInt(7, idPaciente);
            AntFamiliar.setString(8, getOrDefault(TextoseleccionFamiliar()));

            int filasAfectadas = AntFamiliar.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente el antecedente Familiares", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar los datos del antecedente Familiares", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    private String getOrDefault(String value) {
        return value == null || value.trim().isEmpty() ? "Ninguno" : value.trim();
    }

    public String TextoseleccionFamiliar() {
        String valor = "";
        Object selectedItem = this.panelDatosPaciente.getComboBoxParentesco().getSelectedItem();
        if (selectedItem != null) {
            String selectedItemString = String.valueOf(selectedItem);
            if (selectedItemString.equalsIgnoreCase("Otro")) {
                valor = "Otro";
            } else if (selectedItemString.equalsIgnoreCase("Padres")) {
                valor = "Padres";
            } else if (selectedItemString.equalsIgnoreCase("Hijos")) {
                valor = "Hijos";
            } else if (selectedItemString.equalsIgnoreCase("Abuelos")) {
                valor = "Abuelos";
            } else if (selectedItemString.equalsIgnoreCase("Hermanos")) {
                valor = "Hermanos";
            }
        }
        return valor;

    }
}
