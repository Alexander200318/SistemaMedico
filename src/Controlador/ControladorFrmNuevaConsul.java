/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import Vista.FrmNuevaConsulta;
import com.toedter.calendar.JDateChooser;
import controlador_Vist.PacienteDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import javax.swing.SwingUtilities;

public class ControladorFrmNuevaConsul {

    private FrmNuevaConsulta ventanaNvConsulta;
    private Singleton singleton;
    private PacienteDAO pacienteDao;
    private ConsultaDAO consultaDAO;

    // Campos de la ventana
    private JButton btnSiguiente;
    private JButton btnTerminarConsulta;
    private JTabbedPane tabbedPane;
    private JRadioButton btnSiEmbarazo;
    private JRadioButton btnSiAplica;
    private JDateChooser jChFechaProbableParto;
    private JSpinner SpinnerSemGestacion;
    private JSpinner SpinnerDiasGestacion;
    private JSpinner spinnerNumControles;
    private JRadioButton btnActivaInmunizacion;
    private JRadioButton btnPasivaInmunizacion;

    public ControladorFrmNuevaConsul(FrmNuevaConsulta ventanaNvConsulta) {
        this.ventanaNvConsulta = ventanaNvConsulta;
        this.singleton = Singleton.getInstance();

        // Inicialización de componentes
        this.btnSiguiente = ventanaNvConsulta.getBtnSiguiente();
        this.btnTerminarConsulta = ventanaNvConsulta.getBtnTerminarConsulta();
        this.tabbedPane = ventanaNvConsulta.getjTabbedPane();
        this.btnSiEmbarazo = ventanaNvConsulta.getBtnSiEmbarazo();
        this.jChFechaProbableParto = ventanaNvConsulta.getJChFechaProbableParto();
        this.SpinnerSemGestacion = ventanaNvConsulta.getSpinnerSemGestacion();
        this.SpinnerDiasGestacion = ventanaNvConsulta.getSpinnerDiasGestacion();
        this.spinnerNumControles = ventanaNvConsulta.getSpinnerNumControles();
        this.btnActivaInmunizacion = ventanaNvConsulta.getBtnActivaInmunizacion();
        this.btnPasivaInmunizacion = ventanaNvConsulta.getBtnPasivaInmunizacion();
        this.btnSiAplica = ventanaNvConsulta.getBtnSiAplica();

        // Inicializar el DAO
        Conexion conexion = new Conexion();
        Connection connection = conexion.getConexion();
        this.pacienteDao = new PacienteDAO(connection);
        this.consultaDAO = new ConsultaDAO(connection);

        // Cargar datos del paciente
        cargarDatosPaciente();
        veridpaciente();

        // Configurar el ActionListener del botón "Siguiente"
        this.btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarAlSiguientePanel();
            }
        });

        // Configurar el ActionListener del botón "Terminar Consulta"
        this.btnTerminarConsulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    guardarConsulta();
                    JOptionPane.showMessageDialog(null, "Consulta guardada con éxito");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al guardar la consulta: " + ex.getMessage());
                }
            }
        });

        ventanaNvConsulta.getTxtAreaExComplemetario().setEnabled(false);

        btnSiAplica.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isSelected = false;
                isSelected = btnSiAplica.isSelected();

                if (!isSelected) {
                    ventanaNvConsulta.getTxtAreaExComplemetario().setEnabled(false);
                } else {
                    ventanaNvConsulta.getTxtAreaExComplemetario().setEnabled(true);

                }
            }
        });
        jChFechaProbableParto.setEnabled(false);
        SpinnerSemGestacion.setEnabled(false);
        SpinnerDiasGestacion.setEnabled(false);
        spinnerNumControles.setEnabled(false);
        btnActivaInmunizacion.setEnabled(false);
        btnPasivaInmunizacion.setEnabled(false);
        btnSiEmbarazo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isSelected = false;
                isSelected = btnSiEmbarazo.isSelected();

                if (!isSelected) {
                    jChFechaProbableParto.setEnabled(false);
                    SpinnerSemGestacion.setEnabled(false);
                    SpinnerDiasGestacion.setEnabled(false);
                    spinnerNumControles.setEnabled(false);
                    btnActivaInmunizacion.setEnabled(false);
                    btnPasivaInmunizacion.setEnabled(false);
                } else {
                    jChFechaProbableParto.setEnabled(true);
                    SpinnerSemGestacion.setEnabled(true);
                    SpinnerDiasGestacion.setEnabled(true);
                    spinnerNumControles.setEnabled(true);
                    btnActivaInmunizacion.setEnabled(true);
                    btnPasivaInmunizacion.setEnabled(true);
                }
            }
        });
    }

    public void veridpaciente() {
        System.out.println("id recibido" + singleton.getIdPaciente());
    }

    // Método para cargar los datos del paciente en los JLabel
    private void cargarDatosPaciente() {
        try {
            int idPaciente = singleton.getIdPaciente();

            // Obtener datos del paciente desde la base de datos
            Paciente paciente = pacienteDao.obtenerPacientePorId(idPaciente);

            // Verificar si el paciente se obtuvo correctamente
            if (paciente != null) {
                // Pasar los datos del paciente a otra función para su procesamiento
                recibirDatosPaciente(paciente);
            } else {
                // Manejar el caso donde no se encontró el paciente
                System.out.println("Paciente no encontrado con ID: " + idPaciente);
            }

        } catch (Exception e) {
            // Manejar excepciones y registrar errores
            e.printStackTrace();
        }
    }

    // Método para recibir los datos del paciente y mostrarlos en los JLabel correspondientes
    private void recibirDatosPaciente(Paciente paciente) {
        if (paciente != null) {
            if (ventanaNvConsulta != null) {
                SwingUtilities.invokeLater(() -> {
                    ventanaNvConsulta.getLblNombre().setText(paciente.getPrimNombre() + " " + paciente.getPrimApellido());
                    ventanaNvConsulta.getLblEdad().setText(String.valueOf(calcularEdad(paciente.getFechaNacimiento().toString())));
                    ventanaNvConsulta.getLblEmail().setText(paciente.getEmail());
                    ventanaNvConsulta.getLblFecha_Nacimiento().setText(paciente.getFechaNacimiento().toString());
                    ventanaNvConsulta.getLblNumeroCel().setText(paciente.getTelefono());
                    ventanaNvConsulta.getLblSexo().setText(paciente.getSexo());

                    // Formatear la fecha actual
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    String fechaActual = LocalDate.now().format(formatter);
                    ventanaNvConsulta.getLblFecha_Actual().setText(fechaActual);
                });
            } else {
                System.out.println("ventanaNvConsulta es null");
            }
        } else {
            System.out.println("paciente es null");
        }
    }

    private void guardarConsulta() throws SQLException {
        try {
            int idPaciente = singleton.getIdPaciente();
            int idDoctor = singleton.getId_Doctor();
            int CIE10 = (int) ventanaNvConsulta.getSpinnerCIE10().getValue();

            String triageSeleccionado = (String) ventanaNvConsulta.getCmbBoxTriage().getSelectedItem();
            int idTriage = obtenerIdTriage(triageSeleccionado);

            boolean D_Presuntivo = ventanaNvConsulta.getBtnPresuntivo().isSelected();
            boolean D_Definitivo = ventanaNvConsulta.getBtnDefinitivo().isSelected();

            // Validar que los campos de texto no estén vacíos antes de convertirlos
            if (ventanaNvConsulta.getTxtPeso().getText().isEmpty()
                    || ventanaNvConsulta.getTxtEstatura().getText().isEmpty()
                    || ventanaNvConsulta.getTxtFreCardiaca().getText().isEmpty()
                    || ventanaNvConsulta.getTxtFrecRespiratoria().getText().isEmpty()
                    || ventanaNvConsulta.getTxtTemperatura().getText().isEmpty()
                    || ventanaNvConsulta.getTxtSaturacion().getText().isEmpty()
                    || ventanaNvConsulta.getTxtOcular().getText().isEmpty()
                    || ventanaNvConsulta.getTxtVerbal().getText().isEmpty()
                    || ventanaNvConsulta.getTxtMotora().getText().isEmpty()
                    || ventanaNvConsulta.getTxtTotal().getText().isEmpty()
                    || ventanaNvConsulta.getTxtCiclo().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos requeridos.");
                return;
            }

            // Manejo de conversiones con validación
            float peso = obtenerFloatDesdeCampo(ventanaNvConsulta.getTxtPeso());
            float estatura = obtenerFloatDesdeCampo(ventanaNvConsulta.getTxtEstatura());
            float imc = peso / (estatura * estatura);
            ventanaNvConsulta.getTxtMasaCorporal().setText(String.format("%.2f", imc));

            int cardiaca = obtenerIntDesdeCampo(ventanaNvConsulta.getTxtFreCardiaca());
            int respiratoria = obtenerIntDesdeCampo(ventanaNvConsulta.getTxtFrecRespiratoria());
            float temperatura = obtenerFloatDesdeCampo(ventanaNvConsulta.getTxtTemperatura());
            float saturacion = obtenerFloatDesdeCampo(ventanaNvConsulta.getTxtSaturacion());

            int ocular = obtenerIntDesdeCampo(ventanaNvConsulta.getTxtOcular());
            int verbal = obtenerIntDesdeCampo(ventanaNvConsulta.getTxtVerbal());
            int motora = obtenerIntDesdeCampo(ventanaNvConsulta.getTxtMotora());
            int total = obtenerIntDesdeCampo(ventanaNvConsulta.getTxtTotal());

            Consulta consulta = new Consulta(ventanaNvConsulta.getTxtNotasConsulta().getText(), true);

            SignosVitales signos = new SignosVitales(
                    ventanaNvConsulta.getTxtPresionArterial().getText(),
                    peso,
                    estatura,
                    imc,
                    cardiaca,
                    respiratoria,
                    temperatura,
                    saturacion,
                    ocular,
                    verbal,
                    motora,
                    total,
                    ventanaNvConsulta.getTxtLlenadoCapilar().getText(),
                    ventanaNvConsulta.getTxtReaccionPupilar().getText(),
                    idTriage
            );

            String regularidad = ventanaNvConsulta.getBtnRegular().isSelected() ? "Regular" : "Irregular";
            String inmunizaciones = ventanaNvConsulta.getBtnActivaInmunizacion().isSelected() ? "Activa" : "Pasiva";

            boolean estaEmbarazada = ventanaNvConsulta.getBtnSiEmbarazo().isSelected();

            EmergenciaObstetrica obstetrica = new EmergenciaObstetrica(
                    estaEmbarazada ? (int) ventanaNvConsulta.getSpinnerMenarca().getValue() : 0,
                    estaEmbarazada ? Integer.parseInt(ventanaNvConsulta.getTxtCiclo().getText()) : 0,
                    estaEmbarazada ? (ventanaNvConsulta.getJChFechaUltMenstruacion().getDate() != null ? new Date(ventanaNvConsulta.getJChFechaUltMenstruacion().getDate().getTime()) : null) : null,
                    regularidad,
                    estaEmbarazada ? (int) ventanaNvConsulta.getSpIniVidSexualActiva().getValue() : 0,
                    estaEmbarazada ? (int) ventanaNvConsulta.getSpinnerNumParejasSexuales().getValue() : 0,
                    estaEmbarazada ? (int) ventanaNvConsulta.getSpinnerGravides().getValue() : 0,
                    estaEmbarazada ? (int) ventanaNvConsulta.getSpinnerAbortos().getValue() : 0,
                    estaEmbarazada ? (int) ventanaNvConsulta.getSpinnerPartos().getValue() : 0,
                    estaEmbarazada ? (int) ventanaNvConsulta.getSpinnerCesarias().getValue() : 0,
                    estaEmbarazada ? (int) ventanaNvConsulta.getSpinnerMastodinia().getValue() : 0,
                    estaEmbarazada ? (int) ventanaNvConsulta.getSpinnerDismenorrea().getValue() : 0,
                    estaEmbarazada ? (ventanaNvConsulta.getJChFechaProbableParto().getDate() != null ? new Date(ventanaNvConsulta.getJChFechaProbableParto().getDate().getTime()) : null) : null,
                    estaEmbarazada ? (int) ventanaNvConsulta.getSpinnerSemGestacion().getValue() : 0,
                    estaEmbarazada ? (int) ventanaNvConsulta.getSpinnerDiasGestacion().getValue() : 0,
                    estaEmbarazada ? (int) ventanaNvConsulta.getSpinnerNumControles().getValue() : 0,
                    inmunizaciones,
                    idTriage,
                    estaEmbarazada
            );

            ExamenFisico exFisico = new ExamenFisico(
                    ventanaNvConsulta.getTxtAreaPielYFaneras().getText(),
                    ventanaNvConsulta.getTxtAreaCabeza().getText(),
                    ventanaNvConsulta.getTxtAreaCuello().getText(),
                    ventanaNvConsulta.getTxtAreaTorax().getText(),
                    ventanaNvConsulta.getTxtAreaCorazon().getText(),
                    ventanaNvConsulta.getTxtAreaAbdomen().getText(),
                    ventanaNvConsulta.getTxtAreaR_Inguinal().getText(),
                    ventanaNvConsulta.getTxtAreaM_Superior().getText(),
                    ventanaNvConsulta.getTxtAreaM_Inferior().getText(),
                    idTriage
            );

            ExamenComplementario exComplementario = new ExamenComplementario(
                    ventanaNvConsulta.getTxtAreaExComplemetario().getText(),
                    ventanaNvConsulta.getBtnSiAplica().isSelected(),
                    consulta.getIdConsulta()
            );

            Historial historial = new Historial(
                    Date.valueOf(LocalDate.now()),
                    ventanaNvConsulta.getTxtNotasConsulta().getText(),
                    true,
                    Date.valueOf(LocalDate.now()),
                    "En proceso",
                    consulta.getIdConsulta(),
                    idPaciente,
                    idTriage,
                    idDoctor
            );

            Diagnostico diagnostico = new Diagnostico(
                    ventanaNvConsulta.getTxtAreaDiagnostico().getText(),
                    CIE10,
                    D_Presuntivo,
                    D_Definitivo,
                    historial.getIdHistorial()
            );

            Tratamiento tratamiento = new Tratamiento(
                    ventanaNvConsulta.getTxtAreaPlanTrat().getText(),
                    historial.getIdHistorial()
            );

            Receta receta = new Receta(
                    ventanaNvConsulta.getTxtAreaPlanTrat().getText(),
                    ventanaNvConsulta.getTxtAreaInstrucciones().getText(),
                    tratamiento.getIdTratamiento()
            );

            RegistraConsulta registraConsulta = new RegistraConsulta(
                    Date.valueOf(LocalDate.now()),
                    consulta.getIdConsulta(),
                    idDoctor,
                    idPaciente
            );

            consultaDAO.guardarConsulta(consulta, historial, diagnostico, tratamiento, receta, registraConsulta, signos, exFisico, obstetrica, exComplementario);

            JOptionPane.showMessageDialog(null, "Consulta guardada con éxito");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en la conversión de datos: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la consulta: " + e.getMessage());
            e.printStackTrace(); // Imprimir traza para depuración
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
            e.printStackTrace(); // Imprimir traza para depuración
        }
    }

// Método auxiliar para convertir el texto del campo a float
    private float obtenerFloatDesdeCampo(JTextField campo) throws NumberFormatException {
        return Float.parseFloat(campo.getText());
    }

// Método auxiliar para convertir el texto del campo a int
    private int obtenerIntDesdeCampo(JTextField campo) throws NumberFormatException {
        return Integer.parseInt(campo.getText());
    }

// Método para cambiar al siguiente panel del JTabbedPane
    private void cambiarAlSiguientePanel() {
        int currentIndex = tabbedPane.getSelectedIndex();
        int nextIndex = currentIndex + 1;
        if (nextIndex < tabbedPane.getTabCount()) {
            tabbedPane.setSelectedIndex(nextIndex);
        } else {
            JOptionPane.showMessageDialog(null, "No hay más paneles disponibles.");
        }
    }

    private int obtenerIdTriage(String triage) {
        System.out.println("Valor de triage: " + triage);
        switch (triage.toLowerCase()) {
            case "no prioritario":
                return 1;
            case "prioritario":
                return 2;
            case "emergencia":
                return 3;
            default:
                throw new IllegalArgumentException("Triage no válido: " + triage);
        }
    }

    private int calcularEdad(String fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(fechaNacimiento, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
}
