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
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ControladorFrmNuevaConsul {
    private FrmNuevaConsulta ventanaNvConsulta;
    private Singleton singleton;
    private PacienteDAO pacienteDao;
    private ConsultaDAO consultaDAO;

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
        this.consultaDAO = new ConsultaDAO(connection);

        // Cargar datos del paciente y antecedentes
        cargarDatosPaciente();
        veridpaciente();

        // Configurar el ActionListener del botón
        this.btnGuardarHistorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    actualizarDatos();
                    guardarConsulta();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    public void veridpaciente(){
        System.out.println("id recibido"+singleton.getIdPaciente());
    }

    //Metodo para cargar los datos del paciente en los jLbl
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

            // Cargar otros datos existentes relacionados
            cargarDatosExistentes(idPaciente);

        } catch (Exception e) {
            // Manejar excepciones y registrar errores
            e.printStackTrace();
        }
    }

    //Metodo para cargar los datos del paciente en el area de los antecedentes
    
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

    //Metodo para cargar los datos del paciente en los lbl
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

    //Accion del btnActualizar, area de antecedentes
    private void actualizarDatos() throws SQLException {
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
//Metodo para guardar los datos de la consulta
    private void guardarConsulta() throws SQLException {
        
        int idPaciente = singleton.getIdPaciente();
        Consulta consulta = new Consulta(
            ventanaNvConsulta.getTxtEnfermedades().getText(),
            ventanaNvConsulta.getTxtNotasConsulta().getText(),
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

    private int calcularEdad(String fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(fechaNacimiento, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
}