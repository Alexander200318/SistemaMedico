
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Singleton;
import Vista.PanelDatosPaciente;
import Modelo.Conexion;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.Statement;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.ImageIcon;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class ControladorFrmPanelDatosPaciente {

    Singleton singleton;
    PanelDatosPaciente panelDatosPaciente;
    boolean primeraSeleccion = true;
    boolean editarHabilitado = false; 

    public ControladorFrmPanelDatosPaciente(PanelDatosPaciente panelDatosPaciente) {
        singleton = Singleton.getInstance();
        this.panelDatosPaciente = panelDatosPaciente;
        obtenerDatosPaciente();
        activarEdicion(false); // Bloquear la edición al iniciar el panel

        panelDatosPaciente.getBtnEditarDatos().addActionListener(e -> {
            activarEdicion(true);
            editarHabilitado = true; // Marca que la edición está habilitada
        });
        panelDatosPaciente.getBtnGuardarCambiosDatos().addActionListener(e -> {
            guardarCambios();
            activarEdicion(false);
            editarHabilitado = false; // Marca que la edición ya no está habilitada
        });

        // Obtener antecedentes familiares cuando cambie la selección en el combo box
        panelDatosPaciente.getComboBoxParentesco().addActionListener(e -> {
            if (!primeraSeleccion || editarHabilitado) {
                ObtenesAntecentesFamilares();
            }
            primeraSeleccion = false; // Marca como no primera selección después de la primera interacción
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
            ps.setString(2, TextoseleccionFamiliar());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Si hay datos, se actualizan los campos correspondientes
                panelDatosPaciente.getTxtAlergiasFamiliares().setText(rs.getString("Alergias"));
                panelDatosPaciente.getTxtClinicoFamiliares().setText(rs.getString("Clinico"));
                panelDatosPaciente.getTxtTraumatologiaFamiliares().setText(rs.getString("Traumatologico"));
                panelDatosPaciente.getTxFarmacologiaFamiliares().setText(rs.getString("Farmacologico"));
                panelDatosPaciente.getTxtEnfermedadesFamiliares().setText(rs.getString("Enfermedades"));
                panelDatosPaciente.getTxtCirugiasFamiliares().setText(rs.getString("Cirugias"));
            } else {
                // Si no hay datos, mostrar los campos vacíos
                panelDatosPaciente.getTxtAlergiasFamiliares().setText("");
                panelDatosPaciente.getTxtClinicoFamiliares().setText("");
                panelDatosPaciente.getTxtTraumatologiaFamiliares().setText("");
                panelDatosPaciente.getTxFarmacologiaFamiliares().setText("");
                panelDatosPaciente.getTxtEnfermedadesFamiliares().setText("");
                panelDatosPaciente.getTxtCirugiasFamiliares().setText("");

                // Solo mostrar el mensaje si la edición está habilitada
                if (editarHabilitado) {
                    int confirm = JOptionPane.showConfirmDialog(null,
                            "No se encontraron datos para el familiar seleccionado. ¿Desea agregar un nuevo registro?",
                            "Información",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE);

                    if (confirm == JOptionPane.YES_OPTION) {
                        guardarNuevoFamiliar();
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Error al obtener los datos del paciente",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardarNuevoFamiliar() {
        int idPaciente = singleton.getIdPaciente();
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();

        String insertQuery = "INSERT INTO familiar (Id_Paciente, Parentesco, Id_Antecedentes) "
                + "VALUES (?, ?, (SELECT Id_Antecedentes FROM antecedentes WHERE Id_Antecedentes = ? LIMIT 1))";

        try ( PreparedStatement ps = con.prepareStatement(insertQuery)) {
            ps.setInt(1, idPaciente);
            ps.setString(2, TextoseleccionFamiliar());
            ps.setInt(3, obtenerNuevoIdAntecedentes());

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el nuevo registro de familiar", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar el nuevo registro de familiar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private int obtenerNuevoIdAntecedentes() {
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();

        String insertQuery = "INSERT INTO antecedentes (Alergias, Clinico, Traumatologico, Farmacologico, Enfermedades, Cirugias) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try ( PreparedStatement ps = con.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
            // Aquí puedes establecer los valores por defecto o los valores que quieras inicializar
            ps.setString(1, ""); // Alergias
            ps.setString(2, ""); // Clínico
            ps.setString(3, ""); // Traumatológico
            ps.setString(4, ""); // Farmacológico
            ps.setString(5, ""); // Enfermedades
            ps.setString(6, ""); // Cirugías

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                try ( ResultSet generatedKeys = ps.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        return generatedKeys.getInt(1);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener el nuevo ID de antecedentes", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return -1;
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
        // Activar o desactivar los campos de texto y otros componentes
        panelDatosPaciente.getTxtIdentificacionPaciente().setEnabled(habilitar);
        panelDatosPaciente.getTxtNombrePaciente().setEnabled(habilitar);
        panelDatosPaciente.getTxtApellidoPaciente().setEnabled(habilitar);
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

    // Validaciones de los campos
    if (!validarCampos()) {
        return; // Si alguna validación falla, se detiene el método
    }

    String query = "UPDATE Persona p "
            + "JOIN Paciente pac ON p.Id_Persona = pac.Id_Persona "
            + "SET p.prim_Nombre = ?, "
            + "p.seg_Nombre = ?, "
            + "p.prim_Apellido = ?, "
            + "p.seg_Apellido = ?, "
            + "p.Fecha_Nacimiento = ?, "
            + "p.Sexo = ?, "
            + "p.Email = ?, "
            + "p.Telefono = ?, "
            + "p.Direccion = ? "
            + "WHERE pac.Id_Paciente = ?";

    String AntecedentesPersonales = "UPDATE Antecedentes ap "
            + "JOIN Personal a ON ap.Id_Antecedentes = a.Id_Antecedentes "
            + "SET ap.Alergias = ?, "
            + "ap.Clinico = ?, "
            + "ap.Ginecologico = ?, "
            + "ap.Traumatologico = ?, "
            + "ap.Farmacologico = ?, "
            + "ap.Enfermedades = ?, "
            + "ap.Cirugias = ?, "
            + "ap.Vacunas = ? "
            + "WHERE a.Id_Paciente = ?";

    String AntecedentesFamiliares = "UPDATE Antecedentes ap "
            + "JOIN Familiar a ON ap.Id_Antecedentes = a.Id_Antecedentes "
            + "SET ap.Alergias = ?, "
            + "ap.Clinico = ?, "
            + "ap.Traumatologico = ?, "
            + "ap.Farmacologico = ?, "
            + "ap.Enfermedades = ?, "
            + "ap.Cirugias = ? "
            + "WHERE a.Id_Paciente = ? "
            + "AND a.Parentesco = ?";

    try (PreparedStatement ps = con.prepareStatement(query)) {
        ps.setString(1, NullNinguno(panelDatosPaciente.getTxtNombrePaciente().getText().split(" ")[0])); // prim_Nombre
        ps.setString(2, NullNinguno(panelDatosPaciente.getTxtNombrePaciente().getText().split(" ").length > 1 ? panelDatosPaciente.getTxtNombrePaciente().getText().split(" ")[1] : ""));
        ps.setString(3, NullNinguno(panelDatosPaciente.getTxtApellidoPaciente().getText().split(" ")[0])); // prim_Apellido
        ps.setString(4, NullNinguno(panelDatosPaciente.getTxtApellidoPaciente().getText().split(" ").length > 1 ? panelDatosPaciente.getTxtApellidoPaciente().getText().split(" ")[1] : ""));
        ps.setString(5, NullNinguno(panelDatosPaciente.getTxtFechaNacimientoPaciente().getText())); // Fecha_Nacimiento
        ps.setString(6, NullNinguno(panelDatosPaciente.getTxtSexoPaciente().getText())); // Sexo
        ps.setString(7, NullNinguno(panelDatosPaciente.getTxtCorreoPaciente().getText())); // Email
        ps.setString(8, NullNinguno(panelDatosPaciente.getTxtCelularPaciente().getText())); // Telefono
        ps.setString(9, NullNinguno(panelDatosPaciente.getTxtDireccionPaciente().getText())); // Direccion
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
    }

    try (PreparedStatement AntPersonal = con.prepareStatement(AntecedentesPersonales)) {
        AntPersonal.setString(1, NullNinguno(panelDatosPaciente.getTxtAlergiasPersonales().getText())); // Alergias
        AntPersonal.setString(2, NullNinguno(panelDatosPaciente.getTxtClinicoPersonales().getText())); // Clinico
        AntPersonal.setString(3, NullNinguno(panelDatosPaciente.getTxtGinecologicoPersonales().getText())); // Ginecologico
        AntPersonal.setString(4, NullNinguno(panelDatosPaciente.getTxtTraumatologicoPersonales().getText())); // Traumatologico
        AntPersonal.setString(5, NullNinguno(panelDatosPaciente.getTxtFarmacologicoPersonales().getText())); // Farmacologico
        AntPersonal.setString(6, NullNinguno(panelDatosPaciente.getTxtEnfermedadesPersonales().getText())); // Enfermedades
        AntPersonal.setString(7, NullNinguno(panelDatosPaciente.getTxtCirugiasPersonales().getText())); // Cirugias
        AntPersonal.setString(8, NullNinguno(panelDatosPaciente.getTxtVacunasPersonales().getText())); // Vacunas
        AntPersonal.setInt(9, idPaciente);

        int filasAfectadas = AntPersonal.executeUpdate();
        if (filasAfectadas > 0) {
            // Los datos se actualizaron correctamente
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar los datos del antecedente Personal", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al actualizar los antecedentes personales", "Error", JOptionPane.ERROR_MESSAGE);
    }

    try (PreparedStatement AntFamiliar = con.prepareStatement(AntecedentesFamiliares)) {
        AntFamiliar.setString(1, NullNinguno(panelDatosPaciente.getTxtAlergiasFamiliares().getText())); // Alergias
        AntFamiliar.setString(2, NullNinguno(panelDatosPaciente.getTxtClinicoFamiliares().getText())); // Clinico
        AntFamiliar.setString(3, NullNinguno(panelDatosPaciente.getTxtTraumatologiaFamiliares().getText())); // Traumatologico
        AntFamiliar.setString(4, NullNinguno(panelDatosPaciente.getTxFarmacologiaFamiliares().getText())); // Farmacologico
        AntFamiliar.setString(5, NullNinguno(panelDatosPaciente.getTxtEnfermedadesFamiliares().getText())); // Enfermedades
        AntFamiliar.setString(6, NullNinguno(panelDatosPaciente.getTxtCirugiasFamiliares().getText())); // Cirugias
        AntFamiliar.setInt(7, idPaciente);
        AntFamiliar.setString(8, NullNinguno(TextoseleccionFamiliar()));

        int filasAfectadas = AntFamiliar.executeUpdate();
        if (filasAfectadas > 0) {
            // Los datos se actualizaron correctamente
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar los datos del antecedente Familiar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al actualizar los antecedentes familiares", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private boolean validarCampos() {
    String nombre = panelDatosPaciente.getTxtNombrePaciente().getText();
    String apellido = panelDatosPaciente.getTxtApellidoPaciente().getText();
    String fechaNacimiento = panelDatosPaciente.getTxtFechaNacimientoPaciente().getText();
    String sexo = panelDatosPaciente.getTxtSexoPaciente().getText();
    String email = panelDatosPaciente.getTxtCorreoPaciente().getText();
    String telefono = panelDatosPaciente.getTxtCelularPaciente().getText();
    String direccion = panelDatosPaciente.getTxtDireccionPaciente().getText();

    String alergiasPersonales = panelDatosPaciente.getTxtAlergiasPersonales().getText();
    String clinicoPersonales = panelDatosPaciente.getTxtClinicoPersonales().getText();
    String ginecologicoPersonales = panelDatosPaciente.getTxtGinecologicoPersonales().getText();
    String traumatologicoPersonales = panelDatosPaciente.getTxtTraumatologicoPersonales().getText();
    String farmacologicoPersonales = panelDatosPaciente.getTxtFarmacologicoPersonales().getText();
    String enfermedadesPersonales = panelDatosPaciente.getTxtEnfermedadesPersonales().getText();
    String cirugiasPersonales = panelDatosPaciente.getTxtCirugiasPersonales().getText();
    String vacunasPersonales = panelDatosPaciente.getTxtVacunasPersonales().getText();

    String alergiasFamiliares = panelDatosPaciente.getTxtAlergiasFamiliares().getText();
    String clinicoFamiliares = panelDatosPaciente.getTxtClinicoFamiliares().getText();
    String traumatologicoFamiliares = panelDatosPaciente.getTxtTraumatologiaFamiliares().getText();
    String farmacologicoFamiliares = panelDatosPaciente.getTxFarmacologiaFamiliares().getText();
    String enfermedadesFamiliares = panelDatosPaciente.getTxtEnfermedadesFamiliares().getText();
    String cirugiasFamiliares = panelDatosPaciente.getTxtCirugiasFamiliares().getText();

    // Validar que los campos no estén vacíos
    if (nombre.isEmpty() || apellido.isEmpty() || fechaNacimiento.isEmpty() || sexo.isEmpty() || email.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validar formato de fecha
    if (!fechaNacimiento.matches("\\d{4}-\\d{2}-\\d{2}")) {
        JOptionPane.showMessageDialog(null, "El formato de la fecha de nacimiento debe ser yyyy-MM-dd", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validar formato de email
    if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
        JOptionPane.showMessageDialog(null, "El formato del email es incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validar que el teléfono solo contenga números
    if (!telefono.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "El teléfono solo debe contener números", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validar que los campos de antecedentes solo contengan letras, números y espacios
    if (!alergiasPersonales.matches("[a-zA-Z0-9 ]*") || !clinicoPersonales.matches("[a-zA-Z0-9 ]*")
            || !ginecologicoPersonales.matches("[a-zA-Z0-9 ]*") || !traumatologicoPersonales.matches("[a-zA-Z0-9 ]*")
            || !farmacologicoPersonales.matches("[a-zA-Z0-9 ]*") || !enfermedadesPersonales.matches("[a-zA-Z0-9 ]*")
            || !cirugiasPersonales.matches("[a-zA-Z0-9 ]*") || !vacunasPersonales.matches("[a-zA-Z0-9 ]*")) {
        JOptionPane.showMessageDialog(null, "Los antecedentes personales solo deben contener letras, números y espacios", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    if (!alergiasFamiliares.matches("[a-zA-Z0-9 ]*") || !clinicoFamiliares.matches("[a-zA-Z0-9 ]*")
            || !traumatologicoFamiliares.matches("[a-zA-Z0-9 ]*") || !farmacologicoFamiliares.matches("[a-zA-Z0-9 ]*")
            || !enfermedadesFamiliares.matches("[a-zA-Z0-9 ]*") || !cirugiasFamiliares.matches("[a-zA-Z0-9 ]*")) {
        JOptionPane.showMessageDialog(null, "Los antecedentes familiares solo deben contener letras, números y espacios", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    return true;
}

private String NullNinguno(String value) {
    return value == null || value.trim().isEmpty() ? " " : value.trim();
}


    public String TextoseleccionFamiliar() {
        String valor = "";
        Object selectedItem = this.panelDatosPaciente.getComboBoxParentesco().getSelectedItem();
        System.out.println("Selected Item: " + selectedItem); // Agrega esta línea
        if (selectedItem != null) {
            String selectedItemString = String.valueOf(selectedItem);
            switch (selectedItemString.toLowerCase()) {
                case "otro":
                    valor = "Otro";
                    break;
                case "padres":
                    valor = "Padres";
                    break;
                case "hijos":
                    valor = "Hijos";
                    break;
                case "abuelos":
                    valor = "Abuelos";
                    break;
                case "hermanos":
                    valor = "Hermanos";
                    break;
            }
        }
        return valor;
    }
}
