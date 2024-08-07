/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import Vista.FrmInterfazImprimir;
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
    private JButton btnimprimir;
    boolean sexoPaciente=true;

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
        this.btnimprimir = ventanaNvConsulta.getBtnImprimirReceta();

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
                    
                    // Habilitar el botón de imprimir después de guardar la consulta
                    btnimprimir.setEnabled(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al guardar la consulta: " + ex.getMessage());
                }
            }
        });

        // Inicialmente, el botón de imprimir debe estar deshabilitado
        btnimprimir.setEnabled(false);

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
        // Suponiendo que tienes un botón BtnImprimirReceta
        btnimprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una nueva instancia de FrmInterfazImprimir
                FrmInterfazImprimir interfazImprimir = new FrmInterfazImprimir();

                // Hacer visible el formulario
                interfazImprimir.setVisible(true);
            }
        });
        
        
        
        
        
        
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
    
  
    public String Seleccion_Nivel_Prioridad() {
        String valor = "";
        Object selectedItem = this.ventanaNvConsulta.getCmbBoxTriage().getSelectedItem();
        if (selectedItem != null) {
            String selectedItemString = String.valueOf(selectedItem);
            if (selectedItemString.equalsIgnoreCase("No prioritario")) {
                valor = "No prioritario";
            } else if (selectedItemString.equalsIgnoreCase("Prioritario")) {
                valor = "Prioritario";
            } else if (selectedItemString.equalsIgnoreCase("Emergencia")) {
                valor = "Emergencia";
            }    
            
        }
        return valor;

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
                    
                    validarSexoYDeshabilitarPagina();
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

        // Validar que los campos de texto no estén vacíos y que contengan solo números
        if (!esNumero(ventanaNvConsulta.getTxtPeso().getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números en el campo de peso.");
            return;
        }
        if (!esNumero(ventanaNvConsulta.getTxtEstatura().getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números en el campo de estatura.");
            return;
        }
        if (!esNumero(ventanaNvConsulta.getTxtFreCardiaca().getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números en el campo de frecuencia cardiaca.");
            return;
        }
        if (!esNumero(ventanaNvConsulta.getTxtFrecRespiratoria().getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números en el campo de frecuencia respiratoria.");
            return;
        }
        if (!esNumero(ventanaNvConsulta.getTxtTemperatura().getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números en el campo de temperatura.");
            return;
        }
        if (!esNumero(ventanaNvConsulta.getTxtSaturacion().getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números en el campo de saturación.");
            return;
        }
        if (!esNumero(ventanaNvConsulta.getTxtOcular().getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números en el campo de respuesta ocular.");
            return;
        }
        if (!esNumero(ventanaNvConsulta.getTxtVerbal().getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números en el campo de respuesta verbal.");
            return;
        }
        if (!esNumero(ventanaNvConsulta.getTxtMotora().getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números en el campo de respuesta motora.");
            return;
        }
        
        if (!esNumero(ventanaNvConsulta.getTxtPresionArterial().getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números en el campo de presión arterial.");
            return;
        }
        if (!esNumero(ventanaNvConsulta.getTxtLlenadoCapilar().getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números en el campo de llenado capilar.");
            return;
        }

        if (!esNumero(ventanaNvConsulta.getTxtLlenadoCapilar().getText())) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números en el campo de llenado capilar.");
        return;
        }
        
        if (!esReaccionPupilarValida(ventanaNvConsulta.getTxtReaccionPupilar().getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una reacción pupilar válida (normal, anormal, lenta, ausente).");
            return;
        }

        // Validaciones específicas de rango
        if (!validarRango(ventanaNvConsulta.getTxtPeso().getText(), 30, 200)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor de peso entre 30 y 200.");
            return;
        }
        if (!validarRango(ventanaNvConsulta.getTxtEstatura().getText(), 100, 250)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor de estatura entre 100 y 250.");
            return;
        }
        if (!validarRango(ventanaNvConsulta.getTxtFreCardiaca().getText(), 40, 200)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor de frecuencia cardiaca entre 40 y 200.");
            return;
        }
        if (!validarRango(ventanaNvConsulta.getTxtFrecRespiratoria().getText(), 10, 60)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor de frecuencia respiratoria entre 10 y 60.");
            return;
        }
        if (!validarRango(ventanaNvConsulta.getTxtTemperatura().getText(), 35, 42)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor de temperatura entre 35 y 42.");
            return;
        }
        if (!validarRango(ventanaNvConsulta.getTxtSaturacion().getText(), 70, 100)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor de saturación entre 70 y 100.");
            return;
        }
        if (!validarRango(ventanaNvConsulta.getTxtOcular().getText(), 0, 10)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor de respuesta ocular entre 0 y 10.");
            return;
        }
        if (!validarRango(ventanaNvConsulta.getTxtVerbal().getText(), 0, 10)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor de respuesta verbal entre 0 y 10.");
            return;
        }
        if (!validarRango(ventanaNvConsulta.getTxtMotora().getText(), 0, 10)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor de respuesta motora entre 0 y 10.");
            return;
        }
        
        if(!validarRango(ventanaNvConsulta.getTxtPresionArterial().getText(), 70, 190)){
             JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor de presion arterial entre 70 y 190.");
             return;
        }
        
        if(!validarRango(ventanaNvConsulta.getTxtLlenadoCapilar().getText(), 0, 5)){
             JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor de llenado capilar entre 0 y 5.");
             return;
        }
        
        if (!validarRango(ventanaNvConsulta.getTxtLlenadoCapilar().getText(), 1, 5)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor de llenado capilar entre 1 y 5 segundos.");
            return;
        }

        // Manejo de conversiones con validación
        String presionarterial = ventanaNvConsulta.getTxtPresionArterial().getText();
        float peso = obtenerFloatDesdeCampo(ventanaNvConsulta.getTxtPeso());
        float estaturaCm = obtenerFloatDesdeCampo(ventanaNvConsulta.getTxtEstatura());
        float estaturaM = estaturaCm / 100; 
        float imc = peso / (estaturaM * estaturaM);
        ventanaNvConsulta.getLblMasaCorporal().setText(String.format("%.2f", imc));

        int verbal = obtenerIntDesdeCampo(ventanaNvConsulta.getTxtVerbal());
        int motora = obtenerIntDesdeCampo(ventanaNvConsulta.getTxtMotora());
        int ocular = obtenerIntDesdeCampo(ventanaNvConsulta.getTxtOcular());
        int total = (verbal + motora + ocular) / 3;
        ventanaNvConsulta.getLblTotal().setText(String.format("%d", total));

        int cardiaca = obtenerIntDesdeCampo(ventanaNvConsulta.getTxtFreCardiaca());
        int respiratoria = obtenerIntDesdeCampo(ventanaNvConsulta.getTxtFrecRespiratoria());
        float temperatura = obtenerFloatDesdeCampo(ventanaNvConsulta.getTxtTemperatura());
        float saturacion = obtenerFloatDesdeCampo(ventanaNvConsulta.getTxtSaturacion());
        

        Consulta consulta = new Consulta(ventanaNvConsulta.getTxtNotasConsulta().getText(), true);

        SignosVitales signos = new SignosVitales();
        signos.setPresionArterial(presionarterial);
        signos.setPeso(peso);
        signos.setTalla(imc);
        signos.setIndiceMasaCorporal(imc);
        signos.setFrecuenciaCardiaca(cardiaca);
        signos.setFrecuenciaRespiratoria(respiratoria);
        signos.setTemperatura(temperatura);
        signos.setSaturacionOxigeno(saturacion);
        signos.setOcular(ocular);
        signos.setVerbal(verbal);
        signos.setMotora(motora);
        signos.setTotal(total);
        signos.setLlenadoCapilar(ventanaNvConsulta.getTxtLlenadoCapilar().getText());
        signos.setrPupilar(ventanaNvConsulta.getTxtReaccionPupilar().getText());
        signos.setIdTriage(idTriage);            
                
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

        Historial historial = new Historial();
        historial.setFecha(Date.valueOf(LocalDate.now()));
        historial.setDescripcionHist(  ventanaNvConsulta.getTxtNotasConsulta().getText());
                historial.setHisEstActivo(true);
        historial.setEstado("En proceso");
        historial.setIdPaciente(idPaciente);
        historial.setIdDoctor(idDoctor);

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
            Triage triage=new Triage();
            triage.setNivelPrioridad(Seleccion_Nivel_Prioridad());
           

        // Guardar los datos en la base de datos usando ConsultaDAO
        consultaDAO.guardarConsulta(triage,consulta, historial, diagnostico, tratamiento, receta, registraConsulta, signos, exFisico, obstetrica, exComplementario,sexoPaciente); 
        
        JOptionPane.showMessageDialog(null, "Consulta guardada exitosamente.");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error de formato numérico: " + e.getMessage());
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar la consulta: " + e.getMessage());
        throw e;
    }
}
    
    private boolean esNumero(String texto) {
    return texto.matches("\\d*\\.?\\d+"); // Permite números enteros y decimales
}

    
    private boolean esReaccionPupilarValida(String texto) {
    String[] validas = {"normal", "anormal", "lenta", "ausente"};
    for (String valida : validas) {
        if (valida.equalsIgnoreCase(texto)) {
            return true;
        }
    }
    return false;
}
    
public void validarSexoYDeshabilitarPagina() {
    // Obtener el texto del JLabel lblSexo
    String sexo = ventanaNvConsulta.getLblSexo().getText().trim().toUpperCase();

    // Verificar si el sexo es igual a "M"
    if (sexo.equals("M")) {
        // Deshabilitar la página 3 del JTabbedPane (índice 2, ya que los índices empiezan en 0)
        tabbedPane.setEnabledAt(2, false);
        sexoPaciente=false;
    } else {
        // Asegurarse de que la página 3 esté habilitada si el sexo no es "M"
        tabbedPane.setEnabledAt(2, true);
          sexoPaciente=true;
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

    // Obtener el texto del JLabel que contiene el sexo
    String sexo = ventanaNvConsulta.getLblSexo().getText().trim().toUpperCase();

    // Comprobar si el paciente es masculino
    boolean esMasculino = sexo.equals("M");

    // Verificar si el siguiente índice está dentro del rango válido
    if (nextIndex < tabbedPane.getTabCount()) {
        // Si el paciente es masculino y el siguiente panel es la página 3 (índice 2) y está deshabilitado
        if (esMasculino && nextIndex == 2 && !tabbedPane.isEnabledAt(2)) {
            // Intentar avanzar dos paneles en lugar de uno
            nextIndex++;
        }

        // Verificar si el siguiente panel está deshabilitado y avanzar dos paneles si es necesario
        if (!tabbedPane.isEnabledAt(nextIndex) && (nextIndex + 1) < tabbedPane.getTabCount()) {
            nextIndex++;
        }

        // Si después de ajustar el nextIndex, aún es válido, cambiar al siguiente panel
        if (nextIndex < tabbedPane.getTabCount()) {
            tabbedPane.setSelectedIndex(nextIndex);
        } else {
            JOptionPane.showMessageDialog(null, "No hay más paneles disponibles.");
        }
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

        private boolean validarRango(String valor, int min, int max) {
    try {
        int numero = Integer.parseInt(valor);
        return numero >= min && numero <= max;
    } catch (NumberFormatException e) {
        return false;
    }
}
    private int calcularEdad(String fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(fechaNacimiento, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
    

}