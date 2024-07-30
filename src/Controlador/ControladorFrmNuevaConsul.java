/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.*;
import Vista.FrmNuevaConsulta;
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
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ControladorFrmNuevaConsul {
    private FrmNuevaConsulta ventanaNvConsulta;
    private Singleton singleton;
    private PacienteDAO pacienteDao;
    private ConsultaDAO consultaDAO;

    // Campos de la ventana
    private JButton btnGuardarHistorial;
    private JButton btnSiguiente;
    private JButton btnTerminarConsulta;
    private JTabbedPane tabbedPane;

    public ControladorFrmNuevaConsul(FrmNuevaConsulta ventanaNvConsulta) {
        this.ventanaNvConsulta = ventanaNvConsulta;
        this.singleton = Singleton.getInstance();

        // Inicialización de componentes
        this.btnSiguiente = ventanaNvConsulta.getBtnSiguiente();
        this.btnTerminarConsulta = ventanaNvConsulta.getBtnTerminarConsulta();
        this.tabbedPane = ventanaNvConsulta.getjTabbedPane();

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

    // Método para guardar los datos de la consulta
    
    private void guardarConsulta() throws SQLException {
    int idPaciente = singleton.getIdPaciente();
    int idDoctor = singleton.getId_Doctor();
    int CIE10 = (int) ventanaNvConsulta.getSpinnerCIE10().getValue();
    
    String triageSeleccionado = (String) ventanaNvConsulta.getCmbBoxTriage().getSelectedItem();
    int idTriage = obtenerIdTriage(triageSeleccionado);
    
    // Determinar los valores de D_Presuntivo y D_Definitivo
    boolean D_Presuntivo = ventanaNvConsulta.getBtnPresuntivo().isSelected();
    boolean D_Definitivo = ventanaNvConsulta.getBtnDefinitivo().isSelected();

    Consulta consulta = new Consulta(
    ventanaNvConsulta.getTxtNotasConsulta().getText(),
            true
    );
    
    Historial historial = new Historial(
            Date.valueOf(LocalDate.now()),
        ventanaNvConsulta.getTxtNotasConsulta().getText(), 
        true,
        Date.valueOf(LocalDate.now()), 
        "En proceso", // Estado de la consulta
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
    
    consultaDAO.guardarConsulta(consulta, historial, diagnostico, tratamiento, receta, registraConsulta);
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
    switch (triage.toLowerCase()) {
        case "No prioritario":
            return 1;
        case "Prioritario":
            return 2;
        case "Emergencia":
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