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
    private JTextArea txtExamenFisico;
    private JButton btnGuardarHistorial;
    private JButton btnSiguiente;
    private JButton btnTerminarConsulta;
    private JTabbedPane tabbedPane;

    public ControladorFrmNuevaConsul(FrmNuevaConsulta ventanaNvConsulta) {
        this.ventanaNvConsulta = ventanaNvConsulta;
        this.singleton = Singleton.getInstance();

        // Inicialización de componentes
        this.txtExamenFisico = ventanaNvConsulta.getTxtExamenFisico();
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
        Consulta consulta = new Consulta(
            ventanaNvConsulta.getTxtNotasConsulta().getText(),
            ventanaNvConsulta.getTxtAreaDiagnostico().getText(),
            true
        );

        Historial historial = new Historial(
            Date.valueOf(LocalDate.now()),
            "Descripción del historial", // Ajustar según corresponda
            true,
            null, // Fecha de cierre, puede ser null inicialmente
            "En proceso", // Estado
            consulta.getIdConsulta(),
            idPaciente,
            1, // Id_Triage (reemplazar con el ID real)
            1 // Id_Doctor (reemplazar con el ID real)
        );

        Diagnostico diagnostico = new Diagnostico(
            ventanaNvConsulta.getTxtAreaDiagnostico().getText(),
            0, // CIE_10 (reemplazar con el código real)
            true, // D_Presuntivo (reemplazar según corresponda)
            false, // D_Definitivo (reemplazar según corresponda)
            historial.getIdHistorial()
        );

        Seguimiento seguimiento = new Seguimiento(
            "Notas de seguimiento", // Ajustar según corresponda
            Date.valueOf(LocalDate.now()),
            1, // Num_Seg (reemplazar con el número real)
            historial.getIdHistorial(),
            0, // Id_Seguimiento_Anterior (reemplazar con el ID real)
            1 // Id_Doctor (reemplazar con el ID real)
        );

        Tratamiento tratamiento = new Tratamiento(
            ventanaNvConsulta.getTxtAreaPlanTrat().getText(),
            historial.getIdHistorial()
        );

        Receta receta = new Receta(
            ventanaNvConsulta.getTxtAreaMedicacion().getText(),
            "Descripción de la receta", // Ajustar según corresponda
            tratamiento.getIdTratamiento()
        );

        RegistraConsulta registraConsulta = new RegistraConsulta(
            Date.valueOf(LocalDate.now()),
            consulta.getIdConsulta(),
            1, // Id_Doctor (reemplazar con el ID real)
            idPaciente
        );

        consultaDAO.guardarConsulta(consulta, historial, diagnostico, seguimiento, tratamiento, receta, registraConsulta);
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

    private int calcularEdad(String fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(fechaNacimiento, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
}