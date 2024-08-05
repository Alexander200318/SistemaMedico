/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorFrmNuevaConsul;
import com.toedter.calendar.JDateChooser;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Joel
 */
public class FrmNuevaConsulta extends javax.swing.JFrame {

    /**
     * Creates new form FrmNuevaConsulta
     */
ControladorFrmNuevaConsul controlador;

    public FrmNuevaConsulta() {
        initComponents();
        controlador = new ControladorFrmNuevaConsul(this);
        // Inicialización de componentes
        btnSiEmbarazo = new JRadioButton("Si");
        JChFechaProbableParto = new JDateChooser();
        SpinnerDiasGestacion = new JSpinner();
        SpinnerNumControles = new JSpinner();
        btnActivaInmunizacion = new JRadioButton("Activa");
        btnPasivaInmunizacion = new JRadioButton("Pasiva");
        btnSiguiente = new JButton("Siguiente");
        btnTerminarConsulta = new JButton("Terminar Consulta");
        jTabbedPane = new JTabbedPane();
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
                addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                manejarCierreVentana();
            }
        });
        
    }

private void manejarCierreVentana() {
        // Opciones personalizadas
        String[] opciones = {"Salir", "Continuar"};
        
        // Mostrar cuadro de diálogo de confirmación con opciones personalizadas
        int opcion = JOptionPane.showOptionDialog(
            this,
            "¿Está seguro que desea salir?",
            "Confirmar salida",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[1] // opción predeterminada es "Continuar"
        );

        // Si el usuario selecciona "Salir", cerrar la ventana
        if (opcion == JOptionPane.YES_OPTION) {
            System.out.println("Cerrando FrmNuevaConsulta...");
            dispose();
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpRegularidad = new javax.swing.ButtonGroup();
        btnGrpInmunizaciones = new javax.swing.ButtonGroup();
        btnGrpTipoDiagnostico = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelRound2 = new Modelo.PanelRound();
        btnTerminarConsulta = new javax.swing.JButton();
        lblFecha_Actual = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblFecha_Nacimiento = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblNumeroCel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotasConsulta = new javax.swing.JTextArea();
        jPanel22 = new javax.swing.JPanel();
        lblSatOxigeno = new javax.swing.JLabel();
        lblEstatura = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblTemperatura = new javax.swing.JLabel();
        lblFrecRespiratoria = new javax.swing.JLabel();
        lblFreCardiaca = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        txtEstatura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        txtPresionArterial = new javax.swing.JTextField();
        txtFrecRespiratoria = new javax.swing.JTextField();
        txtFreCardiaca = new javax.swing.JTextField();
        txtSaturacion = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        txtLlenadoCapilar = new javax.swing.JTextField();
        txtReaccionPupilar = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        txtOcular = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        txtMotora = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        txtVerbal = new javax.swing.JTextField();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator49 = new javax.swing.JSeparator();
        jSeparator50 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblMasaCorporal = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaCabeza = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaCuello = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAreaTorax = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAreaCorazon = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtAreaAbdomen = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtAreaR_Inguinal = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtAreaM_Superior = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtAreaM_Inferior = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        CmbBoxTriage = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtAreaPielYFaneras = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jSeparator22 = new javax.swing.JSeparator();
        lblFrecRespiratoria2 = new javax.swing.JLabel();
        lblFrecRespiratoria3 = new javax.swing.JLabel();
        lblFrecRespiratoria4 = new javax.swing.JLabel();
        lblFrecRespiratoria5 = new javax.swing.JLabel();
        lblFrecRespiratoria6 = new javax.swing.JLabel();
        lblFrecRespiratoria7 = new javax.swing.JLabel();
        txtCiclo = new javax.swing.JTextField();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        JChFechaUltMenstruacion = new com.toedter.calendar.JDateChooser();
        btnIrregular = new javax.swing.JRadioButton();
        btnRegular = new javax.swing.JRadioButton();
        SpinnerNumParejasSexuales = new javax.swing.JSpinner();
        SpIniVidSexualActiva = new javax.swing.JSpinner();
        SpinnerMenarca = new javax.swing.JSpinner();
        jPanel15 = new javax.swing.JPanel();
        lblFrecRespiratoria9 = new javax.swing.JLabel();
        lblFrecRespiratoria10 = new javax.swing.JLabel();
        lblFrecRespiratoria11 = new javax.swing.JLabel();
        lblFrecRespiratoria12 = new javax.swing.JLabel();
        jSeparator35 = new javax.swing.JSeparator();
        jSeparator36 = new javax.swing.JSeparator();
        jSeparator37 = new javax.swing.JSeparator();
        jSeparator38 = new javax.swing.JSeparator();
        SpinnerMastodinia = new javax.swing.JSpinner();
        SpinnerAbortos = new javax.swing.JSpinner();
        SpinnerPartos = new javax.swing.JSpinner();
        SpinnerCesarias = new javax.swing.JSpinner();
        SpinnerDismenorrea = new javax.swing.JSpinner();
        lblFrecRespiratoria20 = new javax.swing.JLabel();
        jSeparator46 = new javax.swing.JSeparator();
        lblFrecRespiratoria8 = new javax.swing.JLabel();
        jSeparator40 = new javax.swing.JSeparator();
        SpinnerGravides = new javax.swing.JSpinner();
        jPanel16 = new javax.swing.JPanel();
        lblFrecRespiratoria1 = new javax.swing.JLabel();
        lblFrecRespiratoria14 = new javax.swing.JLabel();
        lblFrecRespiratoria15 = new javax.swing.JLabel();
        lblFrecRespiratoria16 = new javax.swing.JLabel();
        lblFrecRespiratoria17 = new javax.swing.JLabel();
        jSeparator41 = new javax.swing.JSeparator();
        jSeparator42 = new javax.swing.JSeparator();
        jSeparator43 = new javax.swing.JSeparator();
        jSeparator44 = new javax.swing.JSeparator();
        jSeparator45 = new javax.swing.JSeparator();
        btnSiEmbarazo = new javax.swing.JRadioButton();
        lblFrecRespiratoria19 = new javax.swing.JLabel();
        JChFechaProbableParto = new com.toedter.calendar.JDateChooser();
        SpinnerSemGestacion = new javax.swing.JSpinner();
        SpinnerDiasGestacion = new javax.swing.JSpinner();
        SpinnerNumControles = new javax.swing.JSpinner();
        btnActivaInmunizacion = new javax.swing.JRadioButton();
        btnPasivaInmunizacion = new javax.swing.JRadioButton();
        jSeparator28 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaInstrucciones = new javax.swing.JTextArea();
        BtnImprimirReceta = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaPlanTrat = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        txtAreaExComplemetario = new javax.swing.JTextArea();
        btnSiAplica = new javax.swing.JRadioButton();
        jSeparator48 = new javax.swing.JSeparator();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        txtAreaDiagnostico = new javax.swing.JTextArea();
        btnDefinitivo = new javax.swing.JRadioButton();
        btnPresuntivo = new javax.swing.JRadioButton();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator34 = new javax.swing.JSeparator();
        lblFrecRespiratoria18 = new javax.swing.JLabel();
        SpinnerCIE10 = new javax.swing.JSpinner();
        jSeparator26 = new javax.swing.JSeparator();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS GENERALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTerminarConsulta.setBackground(new java.awt.Color(64, 172, 159));
        btnTerminarConsulta.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnTerminarConsulta.setText("TERMINAR CONSULTA");
        panelRound2.add(btnTerminarConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 210, 30));

        lblFecha_Actual.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        panelRound2.add(lblFecha_Actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 190, 20));

        lblNombre.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        panelRound2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 20));

        lblFecha_Nacimiento.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        panelRound2.add(lblFecha_Nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 190, 20));

        lblEdad.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        panelRound2.add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 90, 20));

        lblSexo.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        panelRound2.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 90, 20));

        lblEmail.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        panelRound2.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 190, 20));

        lblNumeroCel.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        panelRound2.add(lblNumeroCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 190, 20));
        panelRound2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 190, 10));
        panelRound2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, 10));
        panelRound2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 90, 10));
        panelRound2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));
        panelRound2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 190, 10));
        panelRound2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 190, 10));
        panelRound2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 190, 10));
        panelRound2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 90, 10));

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1040, 130));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane.setBackground(new java.awt.Color(64, 172, 159));
        jTabbedPane.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOTAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Motivo de consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNotasConsulta.setColumns(20);
        txtNotasConsulta.setLineWrap(true);
        txtNotasConsulta.setRows(5);
        txtNotasConsulta.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtNotasConsulta);

        jPanel12.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 33, 290, 260));

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 320, 310));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOTAS DE PADECIMIENTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSatOxigeno.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblSatOxigeno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cuidado-de-la-salud.png"))); // NOI18N
        lblSatOxigeno.setText("Saturación de Oxígeno:");
        jPanel22.add(lblSatOxigeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 180, -1));

        lblEstatura.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblEstatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Estatura.png"))); // NOI18N
        lblEstatura.setText("Estatura:");
        jPanel22.add(lblEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, -1));

        lblPeso.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblPeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Peso.png"))); // NOI18N
        lblPeso.setText("Peso:");
        jPanel22.add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 180, -1));

        lblTemperatura.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblTemperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/control-de-temperatura.png"))); // NOI18N
        lblTemperatura.setText("Temperatura:");
        jPanel22.add(lblTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 180, -1));

        lblFrecRespiratoria.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Frecuenca respiratoria.png"))); // NOI18N
        lblFrecRespiratoria.setText("Frecuencia Respiratoria:");
        jPanel22.add(lblFrecRespiratoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, -1));

        lblFreCardiaca.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFreCardiaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/monitor-de-pulso-cardiaco.png"))); // NOI18N
        lblFreCardiaca.setText("Frecuencia Cardíaca:");
        jPanel22.add(lblFreCardiaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 180, -1));
        jPanel22.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 600, 10));

        jLabel15.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/presion-arterial.png"))); // NOI18N
        jLabel15.setText("Presión Arterial:");
        jPanel22.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 180, -1));

        jLabel18.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/indice-de-masa-corporal (1).png"))); // NOI18N
        jLabel18.setText("Masa Corporal:");
        jPanel22.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 180, -1));

        jLabel55.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/formulario-de-llenado.png"))); // NOI18N
        jLabel55.setText("Llenado Capilar:");
        jPanel22.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, -1));

        jLabel56.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/totalmente.png"))); // NOI18N
        jLabel56.setText("Total:");
        jPanel22.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 130, -1));

        jLabel42.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/discurso.png"))); // NOI18N
        jLabel42.setText("Verbal:");
        jPanel22.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, -1));

        jLabel41.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/reconocimiento-ocular.png"))); // NOI18N
        jLabel41.setText("Ocular:");
        jPanel22.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 90, -1));

        jLabel23.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salud-mental.png"))); // NOI18N
        jPanel22.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 40, 30));

        jLabel58.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pupila-del-ojo.png"))); // NOI18N
        jLabel58.setText("Reacción Pupilar:");
        jPanel22.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 180, -1));

        jLabel57.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salud.png"))); // NOI18N
        jLabel57.setText("Motora:");
        jPanel22.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 90, -1));

        txtTemperatura.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtTemperatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTemperatura.setBorder(null);
        txtTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperaturaActionPerformed(evt);
            }
        });
        jPanel22.add(txtTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 70, 20));

        txtEstatura.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtEstatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEstatura.setBorder(null);
        jPanel22.add(txtEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 70, 20));

        txtPeso.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPeso.setBorder(null);
        jPanel22.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 70, 20));
        jPanel22.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 70, 10));
        jPanel22.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 70, 10));
        jPanel22.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 70, 10));
        jPanel22.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 70, 10));

        txtPresionArterial.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtPresionArterial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPresionArterial.setBorder(null);
        txtPresionArterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPresionArterialActionPerformed(evt);
            }
        });
        jPanel22.add(txtPresionArterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 70, 20));

        txtFrecRespiratoria.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtFrecRespiratoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFrecRespiratoria.setBorder(null);
        jPanel22.add(txtFrecRespiratoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 70, 20));

        txtFreCardiaca.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtFreCardiaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFreCardiaca.setBorder(null);
        jPanel22.add(txtFreCardiaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 70, 20));

        txtSaturacion.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtSaturacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaturacion.setBorder(null);
        jPanel22.add(txtSaturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 70, 20));
        jPanel22.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 70, 10));
        jPanel22.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 70, 10));
        jPanel22.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 70, 10));
        jPanel22.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 70, 10));

        txtLlenadoCapilar.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtLlenadoCapilar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLlenadoCapilar.setBorder(null);
        jPanel22.add(txtLlenadoCapilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 70, 20));

        txtReaccionPupilar.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtReaccionPupilar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReaccionPupilar.setBorder(null);
        jPanel22.add(txtReaccionPupilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 70, 20));
        jPanel22.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 70, 10));
        jPanel22.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 70, 10));

        txtOcular.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtOcular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOcular.setBorder(null);
        txtOcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOcularActionPerformed(evt);
            }
        });
        jPanel22.add(txtOcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 70, 20));
        jPanel22.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 70, 10));

        txtMotora.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtMotora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMotora.setBorder(null);
        jPanel22.add(txtMotora, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 70, 20));
        jPanel22.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 70, 10));
        jPanel22.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 70, 10));
        jPanel22.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 70, 10));

        txtVerbal.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtVerbal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVerbal.setBorder(null);
        jPanel22.add(txtVerbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 70, 20));
        jPanel22.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 600, 10));
        jPanel22.add(jSeparator49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 600, 10));
        jPanel22.add(jSeparator50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 600, 10));

        jLabel24.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Glasgow");
        jPanel22.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 110, 30));

        jLabel25.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salud-mental.png"))); // NOI18N
        jPanel22.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 40, 30));
        jPanel22.add(lblMasaCorporal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 70, 20));
        jPanel22.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 70, 20));

        jPanel3.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 600, 310));

        jTabbedPane.addTab("Notas de Padecimiento", jPanel3);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cuerpo_1.png"))); // NOI18N
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 170, 360));

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel3.setText("Cabeza");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, -1));

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel4.setText("Cuello");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 50, 20));

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel5.setText("Torax");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 60, 20));

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel6.setText("Corazón");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 20));

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel7.setText("Abdomen");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, 20));

        jLabel8.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel8.setText("Región inguinal");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, 20));

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel9.setText("Miembro Inferior");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, -1, 20));

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel10.setText("Miembro superior");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, -1, 20));

        txtAreaCabeza.setColumns(20);
        txtAreaCabeza.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        txtAreaCabeza.setLineWrap(true);
        txtAreaCabeza.setRows(5);
        txtAreaCabeza.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtAreaCabeza);

        jPanel8.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, 50));

        txtAreaCuello.setColumns(20);
        txtAreaCuello.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        txtAreaCuello.setLineWrap(true);
        txtAreaCuello.setRows(5);
        txtAreaCuello.setWrapStyleWord(true);
        jScrollPane6.setViewportView(txtAreaCuello);

        jPanel8.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 340, 50));

        txtAreaTorax.setColumns(20);
        txtAreaTorax.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        txtAreaTorax.setLineWrap(true);
        txtAreaTorax.setRows(5);
        txtAreaTorax.setWrapStyleWord(true);
        jScrollPane7.setViewportView(txtAreaTorax);

        jPanel8.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 340, 50));

        txtAreaCorazon.setColumns(20);
        txtAreaCorazon.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        txtAreaCorazon.setLineWrap(true);
        txtAreaCorazon.setRows(5);
        txtAreaCorazon.setWrapStyleWord(true);
        jScrollPane8.setViewportView(txtAreaCorazon);

        jPanel8.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 340, 50));

        txtAreaAbdomen.setColumns(20);
        txtAreaAbdomen.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        txtAreaAbdomen.setLineWrap(true);
        txtAreaAbdomen.setRows(5);
        txtAreaAbdomen.setWrapStyleWord(true);
        jScrollPane9.setViewportView(txtAreaAbdomen);

        jPanel8.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 330, 50));

        txtAreaR_Inguinal.setColumns(20);
        txtAreaR_Inguinal.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        txtAreaR_Inguinal.setLineWrap(true);
        txtAreaR_Inguinal.setRows(5);
        txtAreaR_Inguinal.setWrapStyleWord(true);
        jScrollPane10.setViewportView(txtAreaR_Inguinal);

        jPanel8.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 330, 50));

        txtAreaM_Superior.setColumns(20);
        txtAreaM_Superior.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        txtAreaM_Superior.setLineWrap(true);
        txtAreaM_Superior.setRows(5);
        txtAreaM_Superior.setWrapStyleWord(true);
        jScrollPane11.setViewportView(txtAreaM_Superior);

        jPanel8.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 330, 50));

        txtAreaM_Inferior.setColumns(20);
        txtAreaM_Inferior.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        txtAreaM_Inferior.setLineWrap(true);
        txtAreaM_Inferior.setRows(5);
        txtAreaM_Inferior.setWrapStyleWord(true);
        jScrollPane12.setViewportView(txtAreaM_Inferior);

        jPanel8.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 330, 50));

        jLabel11.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel11.setText("Nivel de prioridad");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        CmbBoxTriage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No prioritario", "Prioritario", "Emergencia" }));
        jPanel8.add(CmbBoxTriage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 140, -1));

        jLabel12.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel12.setText("Piel y faneras");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 100, -1));

        txtAreaPielYFaneras.setColumns(20);
        txtAreaPielYFaneras.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        txtAreaPielYFaneras.setLineWrap(true);
        txtAreaPielYFaneras.setRows(5);
        txtAreaPielYFaneras.setWrapStyleWord(true);
        jScrollPane13.setViewportView(txtAreaPielYFaneras);

        jPanel8.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 250, 40));

        jScrollPane16.setViewportView(jPanel8);

        jPanel2.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 370));

        jTabbedPane.addTab("Exámen físico", jPanel2);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMERGENCIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        jPanel13.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel14.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 200, 10));

        lblFrecRespiratoria2.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria2.setText("Menarca:");
        jPanel14.add(lblFrecRespiratoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 20));

        lblFrecRespiratoria3.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria3.setText("Ciclos:");
        jPanel14.add(lblFrecRespiratoria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 20));

        lblFrecRespiratoria4.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria4.setText("Fecha Última Menstruación:");
        jPanel14.add(lblFrecRespiratoria4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, 20));

        lblFrecRespiratoria5.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria5.setText("Regularidad:");
        jPanel14.add(lblFrecRespiratoria5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, 20));

        lblFrecRespiratoria6.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria6.setText("Inicio de Vida Sexual Activa:");
        jPanel14.add(lblFrecRespiratoria6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, 20));

        lblFrecRespiratoria7.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria7.setText("Número Parejas Sexuales:");
        jPanel14.add(lblFrecRespiratoria7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 160, 20));

        txtCiclo.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtCiclo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCiclo.setBorder(null);
        jPanel14.add(txtCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 200, 20));
        jPanel14.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 200, 10));
        jPanel14.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 200, 10));
        jPanel14.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 100, 10));
        jPanel14.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 120, 10));

        JChFechaUltMenstruacion.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        jPanel14.add(JChFechaUltMenstruacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, -1));

        btnGrpRegularidad.add(btnIrregular);
        btnIrregular.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnIrregular.setText("Irregular");
        btnIrregular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrregularActionPerformed(evt);
            }
        });
        jPanel14.add(btnIrregular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        btnGrpRegularidad.add(btnRegular);
        btnRegular.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnRegular.setText("Regular");
        jPanel14.add(btnRegular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        SpinnerNumParejasSexuales.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        SpinnerNumParejasSexuales.setBorder(null);
        jPanel14.add(SpinnerNumParejasSexuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 120, -1));

        SpIniVidSexualActiva.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        SpIniVidSexualActiva.setBorder(null);
        jPanel14.add(SpIniVidSexualActiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 100, -1));

        SpinnerMenarca.setModel(new javax.swing.SpinnerNumberModel(0, 0, 70, 1));
        SpinnerMenarca.setBorder(null);
        jPanel14.add(SpinnerMenarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 20, 100, -1));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 320, 300));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFrecRespiratoria9.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria9.setText("Abortos:");
        jPanel15.add(lblFrecRespiratoria9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 20));

        lblFrecRespiratoria10.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria10.setText("Número De Partos:");
        jPanel15.add(lblFrecRespiratoria10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, 20));

        lblFrecRespiratoria11.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria11.setText("Número De Cesarias:");
        jPanel15.add(lblFrecRespiratoria11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, 20));

        lblFrecRespiratoria12.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria12.setText("Mastodinia:");
        jPanel15.add(lblFrecRespiratoria12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 20));
        jPanel15.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 210, 10));
        jPanel15.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 170, 10));
        jPanel15.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 150, 10));
        jPanel15.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 210, 10));

        SpinnerMastodinia.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        SpinnerMastodinia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        SpinnerMastodinia.setBorder(null);
        jPanel15.add(SpinnerMastodinia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 210, -1));

        SpinnerAbortos.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        SpinnerAbortos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        SpinnerAbortos.setBorder(null);
        jPanel15.add(SpinnerAbortos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 210, -1));

        SpinnerPartos.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        SpinnerPartos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        SpinnerPartos.setBorder(null);
        jPanel15.add(SpinnerPartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 170, -1));

        SpinnerCesarias.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        SpinnerCesarias.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        SpinnerCesarias.setBorder(null);
        jPanel15.add(SpinnerCesarias, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 150, -1));

        SpinnerDismenorrea.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        SpinnerDismenorrea.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        SpinnerDismenorrea.setBorder(null);
        jPanel15.add(SpinnerDismenorrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 200, -1));

        lblFrecRespiratoria20.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria20.setText("Dismenorrea:");
        jPanel15.add(lblFrecRespiratoria20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 90, 20));
        jPanel15.add(jSeparator46, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 200, 10));

        lblFrecRespiratoria8.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria8.setText("Gravides:");
        jPanel15.add(lblFrecRespiratoria8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 20));
        jPanel15.add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 200, 10));

        SpinnerGravides.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        SpinnerGravides.setBorder(null);
        jPanel15.add(SpinnerGravides, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 70, -1));

        jPanel13.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 330, 300));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFrecRespiratoria1.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria1.setText("Inmunizaciones:");
        jPanel16.add(lblFrecRespiratoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 20));

        lblFrecRespiratoria14.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria14.setText("Fecha Probable de Parto:");
        jPanel16.add(lblFrecRespiratoria14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, 20));

        lblFrecRespiratoria15.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria15.setText("Semanas De Gestación:");
        jPanel16.add(lblFrecRespiratoria15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 20));

        lblFrecRespiratoria16.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria16.setText("Dias De Gestación:");
        jPanel16.add(lblFrecRespiratoria16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 20));

        lblFrecRespiratoria17.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria17.setText("Número De Controles:");
        jPanel16.add(lblFrecRespiratoria17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 20));
        jPanel16.add(jSeparator41, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 130, 10));
        jPanel16.add(jSeparator42, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, 10));
        jPanel16.add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 170, 10));
        jPanel16.add(jSeparator44, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 130, 10));
        jPanel16.add(jSeparator45, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 180, 10));

        btnSiEmbarazo.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnSiEmbarazo.setText("Sí");
        jPanel16.add(btnSiEmbarazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, 20));

        lblFrecRespiratoria19.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria19.setText("¿Se encuentra actualmente embarazada?");
        jPanel16.add(lblFrecRespiratoria19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 260, 30));

        JChFechaProbableParto.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        jPanel16.add(JChFechaProbableParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 90, 120, -1));

        SpinnerSemGestacion.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        SpinnerSemGestacion.setModel(new javax.swing.SpinnerNumberModel(0, 0, 42, 1));
        SpinnerSemGestacion.setBorder(null);
        jPanel16.add(SpinnerSemGestacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 130, -1));

        SpinnerDiasGestacion.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        SpinnerDiasGestacion.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));
        SpinnerDiasGestacion.setBorder(null);
        jPanel16.add(SpinnerDiasGestacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 150, -1));

        SpinnerNumControles.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        SpinnerNumControles.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        SpinnerNumControles.setBorder(null);
        jPanel16.add(SpinnerNumControles, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 120, -1));

        btnGrpInmunizaciones.add(btnActivaInmunizacion);
        btnActivaInmunizacion.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnActivaInmunizacion.setText("Activa");
        jPanel16.add(btnActivaInmunizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 20));

        btnGrpInmunizaciones.add(btnPasivaInmunizacion);
        btnPasivaInmunizacion.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnPasivaInmunizacion.setText("Pasiva");
        jPanel16.add(btnPasivaInmunizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jPanel13.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 330, 300));
        jPanel13.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1000, 10));

        jTabbedPane.addTab("Emergencia Obstetrica", jPanel13);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INSTRUCCIONES MÉDICAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaInstrucciones.setColumns(20);
        txtAreaInstrucciones.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAreaInstrucciones.setLineWrap(true);
        txtAreaInstrucciones.setRows(5);
        txtAreaInstrucciones.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtAreaInstrucciones);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 100));

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 330, 130));

        BtnImprimirReceta.setBackground(new java.awt.Color(64, 172, 159));
        BtnImprimirReceta.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        BtnImprimirReceta.setText("IMPRIMIR RECETA");
        BtnImprimirReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImprimirRecetaActionPerformed(evt);
            }
        });
        jPanel6.add(BtnImprimirReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, 30));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PLAN DE TRATAMIENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaPlanTrat.setColumns(20);
        txtAreaPlanTrat.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAreaPlanTrat.setLineWrap(true);
        txtAreaPlanTrat.setRows(5);
        txtAreaPlanTrat.setWrapStyleWord(true);
        jScrollPane5.setViewportView(txtAreaPlanTrat);

        jPanel9.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 100));

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 330, 130));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXÁMEN COMPLEMENTARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaExComplemetario.setColumns(20);
        txtAreaExComplemetario.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAreaExComplemetario.setLineWrap(true);
        txtAreaExComplemetario.setRows(5);
        txtAreaExComplemetario.setWrapStyleWord(true);
        jScrollPane23.setViewportView(txtAreaExComplemetario);

        jPanel11.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 290, 180));

        btnSiAplica.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnSiAplica.setText("Aplica");
        jPanel11.add(btnSiAplica, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));
        jPanel11.add(jSeparator48, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, 10));

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 310, 270));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIAGNÓSTICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaDiagnostico.setColumns(20);
        txtAreaDiagnostico.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAreaDiagnostico.setLineWrap(true);
        txtAreaDiagnostico.setRows(5);
        txtAreaDiagnostico.setWrapStyleWord(true);
        jScrollPane24.setViewportView(txtAreaDiagnostico);

        jPanel17.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, 150));

        btnGrpTipoDiagnostico.add(btnDefinitivo);
        btnDefinitivo.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnDefinitivo.setText("D. Definitivo");
        jPanel17.add(btnDefinitivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        btnGrpTipoDiagnostico.add(btnPresuntivo);
        btnPresuntivo.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnPresuntivo.setText("D. Presuntivo");
        jPanel17.add(btnPresuntivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));
        jPanel17.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 110, 10));
        jPanel17.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 10));

        lblFrecRespiratoria18.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria18.setText("CIE-10");
        jPanel17.add(lblFrecRespiratoria18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 50, 20));

        SpinnerCIE10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        SpinnerCIE10.setBorder(null);
        jPanel17.add(SpinnerCIE10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 100, -1));
        jPanel17.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, 10));

        jPanel6.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 310, 270));

        jTabbedPane.addTab("Diagnóstico y Tratamiento", jPanel6);

        jPanel5.add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1000, 390));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1040, 440));

        btnSiguiente.setBackground(new java.awt.Color(64, 172, 159));
        btnSiguiente.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 580, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void txtTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperaturaActionPerformed

    private void txtPresionArterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPresionArterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPresionArterialActionPerformed

    private void txtOcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOcularActionPerformed

    private void btnIrregularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrregularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIrregularActionPerformed

    private void BtnImprimirRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImprimirRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnImprimirRecetaActionPerformed

    public JLabel getLblTotal() {
        return lblTotal;
    }

    public void setLblTotal(JLabel lblTotal) {
        this.lblTotal = lblTotal;
    }

//-------------------------------------------------------------------------------------------------------------------------------------
    
    //Getter y setter de nota de padecimiento y diagnostico
    


    public JComboBox<String> getjComboBox1() {
        return CmbBoxTriage;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.CmbBoxTriage = jComboBox1;
    }

    public JLabel getLblEstatura() {
        return lblEstatura;
    }

    public void setLblEstatura(JLabel lblEstatura) {
        this.lblEstatura = lblEstatura;
    }

    public JLabel getLblFreCardiaca() {
        return lblFreCardiaca;
    }

    public void setLblFreCardiaca(JLabel lblFreCardiaca) {
        this.lblFreCardiaca = lblFreCardiaca;
    }

    public JLabel getLblFrecRespiratoria() {
        return lblFrecRespiratoria;
    }

    public void setLblFrecRespiratoria(JLabel lblFrecRespiratoria) {
        this.lblFrecRespiratoria = lblFrecRespiratoria;
    }

    public JLabel getLblPeso() {
        return lblPeso;
    }

    public void setLblPeso(JLabel lblPeso) {
        this.lblPeso = lblPeso;
    }

    public JLabel getLblSatOxigeno() {
        return lblSatOxigeno;
    }

    public void setLblSatOxigeno(JLabel lblSatOxigeno) {
        this.lblSatOxigeno = lblSatOxigeno;
    }

    public JLabel getLblTemperatura() {
        return lblTemperatura;
    }

    public void setLblTemperatura(JLabel lblTemperatura) {
        this.lblTemperatura = lblTemperatura;
    }

    public JTextArea getTxtAreaAbdomen() {
        return txtAreaAbdomen;
    }

    public void setTxtAreaAbdomen(JTextArea txtAreaAbdomen) {
        this.txtAreaAbdomen = txtAreaAbdomen;
    }

    public JTextArea getTxtAreaCabeza() {
        return txtAreaCabeza;
    }

    public void setTxtAreaCabeza(JTextArea txtAreaCabeza) {
        this.txtAreaCabeza = txtAreaCabeza;
    }

    public JTextArea getTxtAreaCorazon() {
        return txtAreaCorazon;
    }

    public void setTxtAreaCorazon(JTextArea txtAreaCorazon) {
        this.txtAreaCorazon = txtAreaCorazon;
    }

    public JTextArea getTxtAreaCuello() {
        return txtAreaCuello;
    }

    public void setTxtAreaCuello(JTextArea txtAreaCuello) {
        this.txtAreaCuello = txtAreaCuello;
    }


    public JTextArea getTxtAreaInstrucciones() {
        return txtAreaInstrucciones;
    }

    public void setTxtAreaInstrucciones(JTextArea txtAreaInstrucciones) {
        this.txtAreaInstrucciones = txtAreaInstrucciones;
    }

    public JTextArea getTxtAreaM_Inferior() {
        return txtAreaM_Inferior;
    }

    public void setTxtAreaM_Inferior(JTextArea txtAreaM_Inferior) {
        this.txtAreaM_Inferior = txtAreaM_Inferior;
    }

    public JTextArea getTxtAreaM_Superior() {
        return txtAreaM_Superior;
    }

    public void setTxtAreaM_Superior(JTextArea txtAreaM_Superior) {
        this.txtAreaM_Superior = txtAreaM_Superior;
    }

    public JTextArea getTxtAreaPlanTrat() {
        return txtAreaPlanTrat;
    }

    public void setTxtAreaPlanTrat(JTextArea txtAreaPlanTrat) {
        this.txtAreaPlanTrat = txtAreaPlanTrat;
    }

    public JTextArea getTxtAreaR_Inguinal() {
        return txtAreaR_Inguinal;
    }

    public void setTxtAreaR_Inguinal(JTextArea txtAreaR_Inguinal) {
        this.txtAreaR_Inguinal = txtAreaR_Inguinal;
    }

    public JTextArea getTxtAreaTorax() {
        return txtAreaTorax;
    }

    public void setTxtAreaTorax(JTextArea txtAreaTorax) {
        this.txtAreaTorax = txtAreaTorax;
    }

    public JTextField getTxtEstatura() {
        return txtEstatura;
    }

    public void setTxtEstatura(JTextField txtEstatura) {
        this.txtEstatura = txtEstatura;
    }

    public JTextField getTxtFreCardiaca() {
        return txtFreCardiaca;
    }

    public void setTxtFreCardiaca(JTextField txtFreCardiaca) {
        this.txtFreCardiaca = txtFreCardiaca;
    }

    public JTextField getTxtFrecRespiratoria() {
        return txtFrecRespiratoria;
    }

    public void setTxtFrecRespiratoria(JTextField txtFrecRespiratoria) {
        this.txtFrecRespiratoria = txtFrecRespiratoria;
    }

    public JButton getBtnImprimirReceta() {
        return BtnImprimirReceta;
    }

    public void setBtnImprimirReceta(JButton BtnImprimirReceta) {
        this.BtnImprimirReceta = BtnImprimirReceta;
    }


    public JTextField getTxtLlenadoCapilar() {
        return txtLlenadoCapilar;
    }

    public void setTxtLlenadoCapilar(JTextField txtLlenadoCapilar) {
        this.txtLlenadoCapilar = txtLlenadoCapilar;
    }

    public JLabel getLblMasaCorporal() {
        return lblMasaCorporal;
    }

    public void setLblMasaCorporal(JLabel lblMasaCorporal) {
        this.lblMasaCorporal = lblMasaCorporal;
    }

    public JTextField getTxtMotora() {
        return txtMotora;
    }

    public void setTxtMotora(JTextField txtMotora) {
        this.txtMotora = txtMotora;
    }

    public JTextArea getTxtNotasConsulta() {
        return txtNotasConsulta;
    }

    public void setTxtNotasConsulta(JTextArea txtNotasConsulta) {
        this.txtNotasConsulta = txtNotasConsulta;
    }

    public JTextField getTxtOcular() {
        return txtOcular;
    }

    public void setTxtOcular(JTextField txtOcular) {
        this.txtOcular = txtOcular;
    }

    public JTextField getTxtPeso() {
        return txtPeso;
    }

    public void setTxtPeso(JTextField txtPeso) {
        this.txtPeso = txtPeso;
    }

    public JTextField getTxtPresionArterial() {
        return txtPresionArterial;
    }

    public void setTxtPresionArterial(JTextField txtPresionArterial) {
        this.txtPresionArterial = txtPresionArterial;
    }

    public JTextField getTxtReaccionPupilar() {
        return txtReaccionPupilar;
    }

    public void setTxtReaccionPupilar(JTextField txtReaccionPupilar) {
        this.txtReaccionPupilar = txtReaccionPupilar;
    }

    public JTextField getTxtSaturacion() {
        return txtSaturacion;
    }

    public void setTxtSaturacion(JTextField txtSaturacion) {
        this.txtSaturacion = txtSaturacion;
    }

    public JTextField getTxtTemperatura() {
        return txtTemperatura;
    }

    public void setTxtTemperatura(JTextField txtTemperatura) {
        this.txtTemperatura = txtTemperatura;
    }

    public JTextField getTxtVerbal() {
        return txtVerbal;
    }

    public void setTxtVerbal(JTextField txtVerbal) {
        this.txtVerbal = txtVerbal;
    }

    public JDateChooser getJChFechaProbableParto() {
        return JChFechaProbableParto;
    }

    public void setJChFechaProbableParto(JDateChooser JChFechaProbableParto) {
        this.JChFechaProbableParto = JChFechaProbableParto;
    }

    public JDateChooser getJChFechaUltMenstruacion() {
        return JChFechaUltMenstruacion;
    }

    public void setJChFechaUltMenstruacion(JDateChooser JChFechaUltMenstruacion) {
        this.JChFechaUltMenstruacion = JChFechaUltMenstruacion;
    }

    public JSpinner getSpIniVidSexualActiva() {
        return SpIniVidSexualActiva;
    }

    public void setSpIniVidSexualActiva(JSpinner SpIniVidSexualActiva) {
        this.SpIniVidSexualActiva = SpIniVidSexualActiva;
    }

    public JSpinner getSpinnerAbortos() {
        return SpinnerAbortos;
    }

    public void setSpinnerAbortos(JSpinner SpinnerAbortos) {
        this.SpinnerAbortos = SpinnerAbortos;
    }

    public JSpinner getSpinnerCIE10() {
        return SpinnerCIE10;
    }

    public void setSpinnerCIE10(JSpinner SpinnerCIE10) {
        this.SpinnerCIE10 = SpinnerCIE10;
    }

    public JSpinner getSpinnerCesarias() {
        return SpinnerCesarias;
    }

    public void setSpinnerCesarias(JSpinner SpinnerCesarias) {
        this.SpinnerCesarias = SpinnerCesarias;
    }

    public JSpinner getSpinnerDiasGestacion() {
        return SpinnerDiasGestacion;
    }

    public void setSpinnerDiasGestacion(JSpinner SpinnerDiasGestacion) {
        this.SpinnerDiasGestacion = SpinnerDiasGestacion;
    }

    public JSpinner getSpinnerDismenorrea() {
        return SpinnerDismenorrea;
    }

    public void setSpinnerDismenorrea(JSpinner SpinnerDismenorrea) {
        this.SpinnerDismenorrea = SpinnerDismenorrea;
    }

    public JSpinner getSpinnerMastodinia() {
        return SpinnerMastodinia;
    }

    public void setSpinnerMastodinia(JSpinner SpinnerMastodinia) {
        this.SpinnerMastodinia = SpinnerMastodinia;
    }

    public JSpinner getSpinnerNumControles() {
        return SpinnerNumControles;
    }

    public void setSpinnerNumControles(JSpinner SpinnerNumControles) {
        this.SpinnerNumControles = SpinnerNumControles;
    }

    public JSpinner getSpinnerNumParejasSexuales() {
        return SpinnerNumParejasSexuales;
    }

    public void setSpinnerNumParejasSexuales(JSpinner SpinnerNumParejasSexuales) {
        this.SpinnerNumParejasSexuales = SpinnerNumParejasSexuales;
    }

    public JSpinner getSpinnerPartos() {
        return SpinnerPartos;
    }

    public void setSpinnerPartos(JSpinner SpinnerPartos) {
        this.SpinnerPartos = SpinnerPartos;
    }

    public JSpinner getSpinnerSemGestacion() {
        return SpinnerSemGestacion;
    }

    public void setSpinnerSemGestacion(JSpinner SpinnerSemGestacion) {
        this.SpinnerSemGestacion = SpinnerSemGestacion;
    }

    public JRadioButton getBtnActivaInmunizacion() {
        return btnActivaInmunizacion;
    }

    public void setBtnActivaInmunizacion(JRadioButton btnActivaInmunizacion) {
        this.btnActivaInmunizacion = btnActivaInmunizacion;
    }

    public JRadioButton getBtnDefinitivo() {
        return btnDefinitivo;
    }

    public void setBtnDefinitivo(JRadioButton btnDefinitivo) {
        this.btnDefinitivo = btnDefinitivo;
    }

    public ButtonGroup getBtnGrpInmunizaciones() {
        return btnGrpInmunizaciones;
    }

    public void setBtnGrpInmunizaciones(ButtonGroup btnGrpInmunizaciones) {
        this.btnGrpInmunizaciones = btnGrpInmunizaciones;
    }

    public ButtonGroup getBtnGrpRegularidad() {
        return btnGrpRegularidad;
    }

    public void setBtnGrpRegularidad(ButtonGroup btnGrpRegularidad) {
        this.btnGrpRegularidad = btnGrpRegularidad;
    }

    public ButtonGroup getBtnGrpTipoDiagnostico() {
        return btnGrpTipoDiagnostico;
    }

    public void setBtnGrpTipoDiagnostico(ButtonGroup btnGrpTipoDiagnostico) {
        this.btnGrpTipoDiagnostico = btnGrpTipoDiagnostico;
    }

    public JRadioButton getBtnIrregular() {
        return btnIrregular;
    }

    public void setBtnIrregular(JRadioButton btnIrregular) {
        this.btnIrregular = btnIrregular;
    }

    public JRadioButton getBtnPasivaInmunizacion() {
        return btnPasivaInmunizacion;
    }

    public void setBtnPasivaInmunizacion(JRadioButton btnPasivaInmunizacion) {
        this.btnPasivaInmunizacion = btnPasivaInmunizacion;
    }

    public JRadioButton getBtnPresuntivo() {
        return btnPresuntivo;
    }

    public void setBtnPresuntivo(JRadioButton btnPresuntivo) {
        this.btnPresuntivo = btnPresuntivo;
    }

    public JRadioButton getBtnRegular() {
        return btnRegular;
    }

    public void setBtnRegular(JRadioButton btnRegular) {
        this.btnRegular = btnRegular;
    }

    public JRadioButton getBtnSiAplica() {
        return btnSiAplica;
    }

    public void setBtnSiAplica(JRadioButton btnSiAplica) {
        this.btnSiAplica = btnSiAplica;
    }

    public JRadioButton getBtnSiEmbarazo() {
        return btnSiEmbarazo;
    }

    public void setBtnSiEmbarazo(JRadioButton btnSiEmbarazo) {
        this.btnSiEmbarazo = btnSiEmbarazo;
    }

    public JTextArea getTxtAreaDiagnostico() {
        return txtAreaDiagnostico;
    }

    public void setTxtAreaDiagnostico(JTextArea txtAreaDiagnostico) {
        this.txtAreaDiagnostico = txtAreaDiagnostico;
    }

    public JTextArea getTxtAreaExComplemetario() {
        return txtAreaExComplemetario;
    }

    public void setTxtAreaExComplemetario(JTextArea txtAreaExComplemetario) {
        this.txtAreaExComplemetario = txtAreaExComplemetario;
    }

    public JTextField getTxtCiclo() {
        return txtCiclo;
    }

    public void setTxtCiclo(JTextField txtCiclo) {
        this.txtCiclo = txtCiclo;
    }

    public JSpinner getSpinnerGravides() {
        return SpinnerGravides;
    }

    public void setSpinnerGravides(JSpinner SpinnerGravides) {
        this.SpinnerGravides = SpinnerGravides;
    }

    public JSpinner getSpinnerMenarca() {
        return SpinnerMenarca;
    }

    public void setSpinnerMenarca(JSpinner SpinnerMenarca) {
        this.SpinnerMenarca = SpinnerMenarca;
    }

    

    public JComboBox<String> getCmbBoxTriage() {
        return CmbBoxTriage;
    }

    public void setCmbBoxTriage(JComboBox<String> CmbBoxTriage) {
        this.CmbBoxTriage = CmbBoxTriage;
    }

    public JTextArea getTxtAreaPielYFaneras() {
        return txtAreaPielYFaneras;
    }

    public void setTxtAreaPielYFaneras(JTextArea txtAreaPielYFaneras) {
        this.txtAreaPielYFaneras = txtAreaPielYFaneras;
    }
    
    
    
//getters y setter de los lbl autocompletables

    public JLabel getLblEdad() {
        return lblEdad;
    }

    public void setLblEdad(JLabel lblEdad) {
        this.lblEdad = lblEdad;
    }

    public JLabel getLblEmail() {
        return lblEmail;
    }

    public void setLblEmail(JLabel lblEmail) {
        this.lblEmail = lblEmail;
    }

    public JLabel getLblFecha_Actual() {
        return lblFecha_Actual;
    }

    public void setLblFecha_Actual(JLabel lblFecha_Actual) {
        this.lblFecha_Actual = lblFecha_Actual;
    }

    public JLabel getLblFecha_Nacimiento() {
        return lblFecha_Nacimiento;
    }

    public void setLblFecha_Nacimiento(JLabel lblFecha_Nacimiento) {
        this.lblFecha_Nacimiento = lblFecha_Nacimiento;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblNumeroCel() {
        return lblNumeroCel;
    }

    public void setLblNumeroCel(JLabel lblNumeroCel) {
        this.lblNumeroCel = lblNumeroCel;
    }

    public JLabel getLblSexo() {
        return lblSexo;
    }

    public void setLblSexo(JLabel lblSexo) {
        this.lblSexo = lblSexo;
    }

    //get y set de botones

    public JButton getBtnSiguiente() {
        return btnSiguiente;
    }

    public void setBtnSiguiente(JButton btnSiguiente) {
        this.btnSiguiente = btnSiguiente;
    }

    public JButton getBtnTerminarConsulta() {
        return btnTerminarConsulta;
    }

    public void setBtnTerminarConsulta(JButton btnTerminarConsulta) {
        this.btnTerminarConsulta = btnTerminarConsulta;
    }

    public JTabbedPane getjTabbedPane() {
        return jTabbedPane;
    }

    public void setjTabbedPane(JTabbedPane jTabbedPane) {
        this.jTabbedPane = jTabbedPane;
    }

    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmNuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNuevaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnImprimirReceta;
    private javax.swing.JComboBox<String> CmbBoxTriage;
    private com.toedter.calendar.JDateChooser JChFechaProbableParto;
    private com.toedter.calendar.JDateChooser JChFechaUltMenstruacion;
    private javax.swing.JSpinner SpIniVidSexualActiva;
    private javax.swing.JSpinner SpinnerAbortos;
    private javax.swing.JSpinner SpinnerCIE10;
    private javax.swing.JSpinner SpinnerCesarias;
    private javax.swing.JSpinner SpinnerDiasGestacion;
    private javax.swing.JSpinner SpinnerDismenorrea;
    public javax.swing.JSpinner SpinnerGravides;
    private javax.swing.JSpinner SpinnerMastodinia;
    public javax.swing.JSpinner SpinnerMenarca;
    private javax.swing.JSpinner SpinnerNumControles;
    private javax.swing.JSpinner SpinnerNumParejasSexuales;
    private javax.swing.JSpinner SpinnerPartos;
    private javax.swing.JSpinner SpinnerSemGestacion;
    private javax.swing.JRadioButton btnActivaInmunizacion;
    private javax.swing.JRadioButton btnDefinitivo;
    private javax.swing.ButtonGroup btnGrpInmunizaciones;
    private javax.swing.ButtonGroup btnGrpRegularidad;
    private javax.swing.ButtonGroup btnGrpTipoDiagnostico;
    private javax.swing.JRadioButton btnIrregular;
    private javax.swing.JRadioButton btnPasivaInmunizacion;
    private javax.swing.JRadioButton btnPresuntivo;
    private javax.swing.JRadioButton btnRegular;
    private javax.swing.JRadioButton btnSiAplica;
    private javax.swing.JRadioButton btnSiEmbarazo;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnTerminarConsulta;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator45;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JSeparator jSeparator49;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator50;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstatura;
    private javax.swing.JLabel lblFecha_Actual;
    private javax.swing.JLabel lblFecha_Nacimiento;
    private javax.swing.JLabel lblFreCardiaca;
    private javax.swing.JLabel lblFrecRespiratoria;
    private javax.swing.JLabel lblFrecRespiratoria1;
    private javax.swing.JLabel lblFrecRespiratoria10;
    private javax.swing.JLabel lblFrecRespiratoria11;
    private javax.swing.JLabel lblFrecRespiratoria12;
    private javax.swing.JLabel lblFrecRespiratoria14;
    private javax.swing.JLabel lblFrecRespiratoria15;
    private javax.swing.JLabel lblFrecRespiratoria16;
    private javax.swing.JLabel lblFrecRespiratoria17;
    private javax.swing.JLabel lblFrecRespiratoria18;
    private javax.swing.JLabel lblFrecRespiratoria19;
    private javax.swing.JLabel lblFrecRespiratoria2;
    private javax.swing.JLabel lblFrecRespiratoria20;
    private javax.swing.JLabel lblFrecRespiratoria3;
    private javax.swing.JLabel lblFrecRespiratoria4;
    private javax.swing.JLabel lblFrecRespiratoria5;
    private javax.swing.JLabel lblFrecRespiratoria6;
    private javax.swing.JLabel lblFrecRespiratoria7;
    private javax.swing.JLabel lblFrecRespiratoria8;
    private javax.swing.JLabel lblFrecRespiratoria9;
    private javax.swing.JLabel lblMasaCorporal;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroCel;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblSatOxigeno;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTemperatura;
    private javax.swing.JLabel lblTotal;
    private Modelo.PanelRound panelRound2;
    private javax.swing.JTextArea txtAreaAbdomen;
    private javax.swing.JTextArea txtAreaCabeza;
    private javax.swing.JTextArea txtAreaCorazon;
    private javax.swing.JTextArea txtAreaCuello;
    private javax.swing.JTextArea txtAreaDiagnostico;
    private javax.swing.JTextArea txtAreaExComplemetario;
    private javax.swing.JTextArea txtAreaInstrucciones;
    private javax.swing.JTextArea txtAreaM_Inferior;
    private javax.swing.JTextArea txtAreaM_Superior;
    private javax.swing.JTextArea txtAreaPielYFaneras;
    private javax.swing.JTextArea txtAreaPlanTrat;
    private javax.swing.JTextArea txtAreaR_Inguinal;
    private javax.swing.JTextArea txtAreaTorax;
    private javax.swing.JTextField txtCiclo;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtFreCardiaca;
    private javax.swing.JTextField txtFrecRespiratoria;
    private javax.swing.JTextField txtLlenadoCapilar;
    private javax.swing.JTextField txtMotora;
    private javax.swing.JTextArea txtNotasConsulta;
    private javax.swing.JTextField txtOcular;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPresionArterial;
    private javax.swing.JTextField txtReaccionPupilar;
    private javax.swing.JTextField txtSaturacion;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextField txtVerbal;
    // End of variables declaration//GEN-END:variables
}
