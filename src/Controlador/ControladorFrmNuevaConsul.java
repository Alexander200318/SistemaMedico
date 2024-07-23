/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Antecedentes;
import Modelo.Conexion;
import Modelo.Familiar;
import Modelo.Historial;
import Modelo.Paciente;
import Modelo.Singleton;
import Vista.FrmNuevaConsulta;
import controlador_Vist.PaginaNuevaConsultaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControladorFrmNuevaConsul {
    private FrmNuevaConsulta ventanaNvConsulta;
    private Singleton singleton;
    private JTextArea txtAntecedentesFarmacologicos;
    private JTextArea txtAntecedentesClinicosFamiliar;
    private JTextArea txtAntecedentesFarmacologicosFamiliar;
    private JTextArea txtAntecedentesGinecologicosFamiliar;
    private JTextArea txtAntecedentesTraumatologicosFamiliar;
    private JTextField txtParentesco;
    private JTextArea txtAntecedentesGinecologicos;
    private JTextArea txtAntecedentesTraumatologicos;
    private JTextArea txtAntecedentes_Clinicos;
    private JTextArea txtCirujias;
    private JTextArea txtEnfermedades;
    private JTextArea txtVacunas;
    private JTextArea txt_Alergias;
    private JTextArea txtMedicamentosActivos;
    private JTextArea txtExamenFisico;
    private JTextArea txtAreaDiagnostico;
    private JButton btnGuardarHistorial;
    private PaginaNuevaConsultaDAO dao;

    public ControladorFrmNuevaConsul(FrmNuevaConsulta ventanaNvConsulta) {
        this.ventanaNvConsulta = ventanaNvConsulta;
        this.singleton = Singleton.getInstance();
        

        // Inicialización de componentes
        this.txtAntecedentesFarmacologicos = ventanaNvConsulta.getTxtAntecedentesFarmacologicos();
        this.txtAntecedentesClinicosFamiliar = ventanaNvConsulta.getTxtAntecedentesClinicosFamiliar();
        this.txtAntecedentesFarmacologicosFamiliar = ventanaNvConsulta.getTxtAntecedentesFarmacologicosFamiliar();
        this.txtAntecedentesGinecologicosFamiliar = ventanaNvConsulta.getTxtAntecedentesGinecologicosFamiliar();
        this.txtAntecedentesTraumatologicosFamiliar = ventanaNvConsulta.getTxtAntecedentesTraumatologicosFamiliar();
        this.txtParentesco = ventanaNvConsulta.getTxtParentesco();
        this.txtAntecedentesGinecologicos = ventanaNvConsulta.getTxtAntecedentesGinecologicos();
        this.txtAntecedentesTraumatologicos = ventanaNvConsulta.getTxtAntecedentesTraumatologicos();
        this.txtAntecedentes_Clinicos = ventanaNvConsulta.getTxtAntecedentes_Clinicos();
        this.txtCirujias = ventanaNvConsulta.getTxtCirujias();
        this.txtEnfermedades = ventanaNvConsulta.getTxtEnfermedades();
        this.txtVacunas = ventanaNvConsulta.getTxtVacunas();
        this.txt_Alergias = ventanaNvConsulta.getTxt_Alergias();
        this.txtMedicamentosActivos = ventanaNvConsulta.getTxtMedicamentosActivos();
        this.txtExamenFisico = ventanaNvConsulta.getTxtExamenFisico();
        this.txtAreaDiagnostico = ventanaNvConsulta.getTxtAreaDiagnostico();
        this.btnGuardarHistorial = ventanaNvConsulta.getBtnGuardarHistorial();

         // Inicializar el DAO
        this.dao = new PaginaNuevaConsultaDAO();

        // Cargar datos existentes
        cargarDatosExistentes();

        // Configurar el ActionListener del botón
        this.btnGuardarHistorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarDatos();
            }
        });
    }

    private void cargarDatosExistentes() {
        Paciente paciente = dao.obtenerPacientePorId(/* id del paciente */);
        Antecedentes antecedentesPersonales = dao.obtenerAntecedentesPersonalesPorIdPaciente(/* id del paciente */);
        Familiar antecedentesFamiliares = dao.obtenerAntecedentesFamiliaresPorIdPaciente(/* id del paciente */);

        // Rellenar los campos con los datos obtenidos
        if (paciente != null) {
            recibirDatosPaciente(paciente);
        }
        if (antecedentesPersonales != null) {
            txtAntecedentesFarmacologicos.setText(antecedentesPersonales.getFarmacologico());
            txtAntecedentes_Clinicos.setText(antecedentesPersonales.getClinico());
            txtAntecedentesGinecologicos.setText(antecedentesPersonales.getGinecologico());
            txtAntecedentesTraumatologicos.setText(antecedentesPersonales.getTraumatologico());
            txt_Alergias.setText(antecedentesPersonales.getAlergias());
            txtEnfermedades.setText(antecedentesPersonales.getEnfermedades());
            txtCirujias.setText(antecedentesPersonales.getCirugias());
            txtVacunas.setText(antecedentesPersonales.getVacunas());
        }
        if (antecedentesFamiliares != null) {
            txtParentesco.setText(antecedentesFamiliares.getParentesco());
            txtAntecedentesClinicosFamiliar.setText(antecedentesFamiliares.get().getClinico());
            txtAntecedentesFarmacologicosFamiliar.setText(antecedentesFamiliares.getAntecedentes().getFarmacologico());
            txtAntecedentesGinecologicosFamiliar.setText(antecedentesFamiliares.getAntecedentes().getGinecologico());
            txtAntecedentesTraumatologicosFamiliar.setText(antecedentesFamiliares.getAntecedentes().getTraumatologico());
        }
    }

    private void actualizarDatos() {
        // Crear y actualizar un historial
        Historial historial = new Historial();
        historial.setDescripcionHist(txtAreaDiagnostico.getText());
        historial.setHisEstActivo(true);

        // Actualizar el historial
        dao.actualizarHistorial(historial);

        // Crear y actualizar antecedentes personales
        Antecedentes antecedentesPersonales = new Antecedentes();
        antecedentesPersonales.setFarmacologico(txtAntecedentesFarmacologicos.getText());
        antecedentesPersonales.setClinico(txtAntecedentes_Clinicos.getText());
        antecedentesPersonales.setGinecologico(txtAntecedentesGinecologicos.getText());
        antecedentesPersonales.setTraumatologico(txtAntecedentesTraumatologicos.getText());
        antecedentesPersonales.setAlergias(txt_Alergias.getText());
        antecedentesPersonales.setEnfermedades(txtEnfermedades.getText());
        antecedentesPersonales.setCirugias(txtCirujias.getText());
        antecedentesPersonales.setVacunas(txtVacunas.getText());

        // Actualizar antecedentes personales
        dao.actualizarAntecedentes(antecedentesPersonales);

        // Crear y actualizar antecedentes familiares
        Antecedentes antecedentesFamiliares = new Antecedentes();
        antecedentesFamiliares.setClinico(txtAntecedentesClinicosFamiliar.getText());
        antecedentesFamiliares.setFarmacologico(txtAntecedentesFarmacologicosFamiliar.getText());
        antecedentesFamiliares.setGinecologico(txtAntecedentesGinecologicosFamiliar.getText());
        antecedentesFamiliares.setTraumatologico(txtAntecedentesTraumatologicosFamiliar.getText());

        Familiar familiar = new Familiar();
        familiar.setParentesco(txtParentesco.getText());
        familiar.setIdAntFamiliares(antecedentesFamiliares);

        // Actualizar familiar
        dao.actualizarFamiliar(familiar);
    }
    
    private void cargarDatosPaciente() {
        int idPaciente = singleton.getIdPaciente();
        Conexion conexion = new Conexion();
        String query = "SELECT " +
                "p.Email, " +
                "p.Fecha_Nacimiento, " +
                "p.Sexo, " +
                "p.Telefono AS Telefono, " +
                "CONCAT(p.prim_Nombre, ' ', p.prim_Apellido) AS Nombre " +
                "FROM Paciente pac " +
                "JOIN Persona p ON pac.Id_Persona = p.Id_Persona " +
                "WHERE pac.Id_Paciente = ?";

        try (Connection con = conexion.getConexion(); 
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ventanaNvConsulta.getLblEmail().setText(rs.getString("Email"));
                ventanaNvConsulta.getLblFecha_Nacimiento().setText(rs.getString("Fecha_Nacimiento"));
                ventanaNvConsulta.getLblNombre().setText(rs.getString("Nombre"));
                ventanaNvConsulta.getLblNumeroCel().setText(rs.getString("Telefono"));
                ventanaNvConsulta.getLblSexo().setText(rs.getString("Sexo"));
                ventanaNvConsulta.getLblEdad().setText(String.valueOf(calcularEdad(rs.getString("Fecha_Nacimiento"))));
                // Formatear la fecha actual
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String fechaActual = formatter.format(new Date());
                ventanaNvConsulta.getLblFecha_Actual().setText(fechaActual);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener los datos del paciente: " + e.toString());
        }
    }

    private int calcularEdad(String fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(fechaNacimiento, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
}