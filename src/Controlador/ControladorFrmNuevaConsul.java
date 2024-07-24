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
import Modelo.Personal;
import Modelo.Singleton;
import Vista.FrmNuevaConsulta;
import controlador_Vist.PacienteDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
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
    private PacienteDAO pacienteDao;

    // Campos de la ventana
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
        Conexion conexion = new Conexion();
        Connection connection = conexion.getConexion();
        this.pacienteDao = new PacienteDAO(connection);

        // Cargar datos del paciente y antecedentes
        cargarDatosExistentes(0);
        actualizarDatos();
        cargarDatosPaciente();

        // Configurar el ActionListener del botón
        this.btnGuardarHistorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarDatos();
            }
        });
    }

    private void cargarDatosPaciente() {
        int idPaciente = singleton.getIdPaciente();
        Paciente paciente = pacienteDao.obtenerPacientePorId(idPaciente);
        if (paciente != null) {
            recibirDatosPaciente(paciente);
        }
        
        cargarDatosExistentes(idPaciente);
    }

    private void cargarDatosExistentes(int idPaciente) {
        Personal antecedentesPersonales = pacienteDao.obtenerAntecedentesPersonalesPorIdPaciente(idPaciente);
        Familiar antecedentesFamiliares = pacienteDao.obtenerAntecedentesFamiliaresPorIdPaciente(idPaciente);

        if (antecedentesPersonales != null) {
            Antecedentes personales = antecedentesPersonales.getAntecedentes();
            txtAntecedentesFarmacologicos.setText(personales.getFarmacologico());
            txtAntecedentes_Clinicos.setText(personales.getClinico());
            txtAntecedentesGinecologicos.setText(personales.getGinecologico());
            txtAntecedentesTraumatologicos.setText(personales.getTraumatologico());
            txt_Alergias.setText(personales.getAlergias());
            txtEnfermedades.setText(personales.getEnfermedades());
            txtCirujias.setText(personales.getCirugias());
            txtVacunas.setText(personales.getVacunas());
        }

        if (antecedentesFamiliares != null) {
            Antecedentes familiares = pacienteDao.obtenerAntecedentesPorId(antecedentesFamiliares.getIdAntecedentes());
            txtParentesco.setText(antecedentesFamiliares.getParentesco());
            txtAntecedentesClinicosFamiliar.setText(familiares.getClinico());
            txtAntecedentesFarmacologicosFamiliar.setText(familiares.getFarmacologico());
            txtAntecedentesGinecologicosFamiliar.setText(familiares.getGinecologico());
            txtAntecedentesTraumatologicosFamiliar.setText(familiares.getTraumatologico());
        }
    }

    private void recibirDatosPaciente(Paciente paciente) {
    ventanaNvConsulta.getLblNombre().setText(paciente.getPrimNombre() + " " + paciente.getPrimApellido());
    ventanaNvConsulta.getLblEdad().setText(String.valueOf(calcularEdad(paciente.getFechaNacimiento().toString())));
    ventanaNvConsulta.getLblEmail().setText(paciente.getEmail());
    ventanaNvConsulta.getLblFecha_Nacimiento().setText(paciente.getFechaNacimiento().toString());
    ventanaNvConsulta.getLblNumeroCel().setText(paciente.getTelefono());
    ventanaNvConsulta.getLblSexo().setText(paciente.getSexo());

    // Formatear la fecha actual
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    String fechaActual = formatter.format(new Date());
    ventanaNvConsulta.getLblFecha_Actual().setText(fechaActual);
}

    private void actualizarDatos() {
        // Crear y actualizar un historial
        Historial historial = new Historial();
        historial.setDescripcionHist(txtAreaDiagnostico.getText());
        historial.setHisEstActivo(true);

        // Actualizar el historial
        pacienteDao.actualizarHistorial(historial);

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
        pacienteDao.actualizarAntecedentes(antecedentesPersonales);

        // Crear y actualizar antecedentes familiares
        Antecedentes antecedentesFamiliares = new Antecedentes();
        antecedentesFamiliares.setClinico(txtAntecedentesClinicosFamiliar.getText());
        antecedentesFamiliares.setFarmacologico(txtAntecedentesFarmacologicosFamiliar.getText());
        antecedentesFamiliares.setGinecologico(txtAntecedentesGinecologicosFamiliar.getText());
        antecedentesFamiliares.setTraumatologico(txtAntecedentesTraumatologicosFamiliar.getText());

        Familiar familiar = new Familiar();
        familiar.setParentesco(txtParentesco.getText());
        familiar.setIdAntecedentes(antecedentesFamiliares.getIdAntecedentes());

        // Actualizar familiar
        pacienteDao.actualizarFamiliar(familiar);
    }

    private int calcularEdad(String fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(fechaNacimiento, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
}