/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorFrmNuevaConsul;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
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
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRound2 = new Modelo.PanelRound();
        btnOpciones = new javax.swing.JButton();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        panelRound4 = new Modelo.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAntecedentes_Clinicos = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txt_Alergias = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtCirujias = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtAntecedentesTraumatologicos = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtAntecedentesFarmacologicos = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtEnfermedades = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtVacunas = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtAntecedentesGinecologicos = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtMedicamentosActivos = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        panelRound6 = new Modelo.PanelRound();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtAntecedentesClinicosFamiliar = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        txtParentesco = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtAntecedentesGinecologicosFamiliar = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        txtAntecedentesTraumatologicosFamiliar = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        txtAntecedentesFarmacologicosFamiliar = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        btnGuardarHistorial = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        panelRound1 = new Modelo.PanelRound();
        lblSatOxigeno = new javax.swing.JLabel();
        lblEstatura = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblRefSatOxigeno = new javax.swing.JLabel();
        lblTemperatura = new javax.swing.JLabel();
        lblFrecRespiratoria = new javax.swing.JLabel();
        lblFreCardiaca = new javax.swing.JLabel();
        lblRefEstatura = new javax.swing.JLabel();
        lblRefPeso = new javax.swing.JLabel();
        lblRefTemperatura = new javax.swing.JLabel();
        lblRefFrecResp = new javax.swing.JLabel();
        lblRefFreCardiaca = new javax.swing.JLabel();
        txtSaturacion = new javax.swing.JTextField();
        txtEstatura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtTemperatura = new javax.swing.JTextField();
        txtFrecRespiratoria = new javax.swing.JTextField();
        txtFreCardiaca = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        panelRound3 = new Modelo.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotasConsulta = new javax.swing.JTextArea();
        btnSiguiente = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtExamenFisico = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaInstrucciones = new javax.swing.JTextArea();
        txtImprimirReceta = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaPlanTrat = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        txtAreaMedicacion = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        txtAreaDiagnostico = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS GENERALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOpciones.setBackground(new java.awt.Color(64, 172, 159));
        btnOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionesActionPerformed(evt);
            }
        });
        panelRound2.add(btnOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 40, 30));

        btnTerminarConsulta.setBackground(new java.awt.Color(64, 172, 159));
        btnTerminarConsulta.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnTerminarConsulta.setText("TERMINAR CONSULTA");
        panelRound2.add(btnTerminarConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 180, 30));

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

        jTabbedPane1.setBackground(new java.awt.Color(64, 172, 159));
        jTabbedPane1.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANTECEDENTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PERSONAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        panelRound4.setMinimumSize(new java.awt.Dimension(398, 840));
        panelRound4.setPreferredSize(new java.awt.Dimension(398, 840));
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel1.setText("ANTECEDENTES TRAUMATOLOGICO:");
        panelRound4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txtAntecedentes_Clinicos.setColumns(20);
        txtAntecedentes_Clinicos.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAntecedentes_Clinicos.setLineWrap(true);
        txtAntecedentes_Clinicos.setRows(5);
        txtAntecedentes_Clinicos.setWrapStyleWord(true);
        jScrollPane6.setViewportView(txtAntecedentes_Clinicos);

        panelRound4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 370, 60));

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel3.setText("ALERGIAS:");
        panelRound4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txt_Alergias.setColumns(20);
        txt_Alergias.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txt_Alergias.setLineWrap(true);
        txt_Alergias.setRows(5);
        txt_Alergias.setWrapStyleWord(true);
        jScrollPane7.setViewportView(txt_Alergias);

        panelRound4.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 370, 60));

        txtCirujias.setColumns(20);
        txtCirujias.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtCirujias.setLineWrap(true);
        txtCirujias.setRows(5);
        txtCirujias.setWrapStyleWord(true);
        jScrollPane8.setViewportView(txtCirujias);

        panelRound4.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 370, 60));

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel4.setText("CIRUGIAS:");
        panelRound4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel5.setText("ANTECEDENTES CLINICOS:");
        panelRound4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txtAntecedentesTraumatologicos.setColumns(20);
        txtAntecedentesTraumatologicos.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAntecedentesTraumatologicos.setLineWrap(true);
        txtAntecedentesTraumatologicos.setRows(5);
        txtAntecedentesTraumatologicos.setWrapStyleWord(true);
        jScrollPane10.setViewportView(txtAntecedentesTraumatologicos);

        panelRound4.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 370, 60));

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel7.setText("ANTECEDENTES FARMACOLOGICOS:");
        panelRound4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        txtAntecedentesFarmacologicos.setColumns(20);
        txtAntecedentesFarmacologicos.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAntecedentesFarmacologicos.setLineWrap(true);
        txtAntecedentesFarmacologicos.setRows(5);
        txtAntecedentesFarmacologicos.setWrapStyleWord(true);
        jScrollPane11.setViewportView(txtAntecedentesFarmacologicos);

        panelRound4.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 370, 60));

        jLabel14.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel14.setText("ENFERMEDADES:");
        panelRound4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        txtEnfermedades.setColumns(20);
        txtEnfermedades.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtEnfermedades.setLineWrap(true);
        txtEnfermedades.setRows(5);
        txtEnfermedades.setWrapStyleWord(true);
        jScrollPane15.setViewportView(txtEnfermedades);

        panelRound4.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 370, 60));

        txtVacunas.setColumns(20);
        txtVacunas.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtVacunas.setLineWrap(true);
        txtVacunas.setRows(5);
        txtVacunas.setWrapStyleWord(true);
        jScrollPane13.setViewportView(txtVacunas);

        panelRound4.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 370, 60));

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel10.setText("VACUNAS:");
        panelRound4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 80, -1));

        jLabel15.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel15.setText("ANTECEDENTES GINECOLOGICOS:");
        panelRound4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 210, -1));

        txtAntecedentesGinecologicos.setColumns(20);
        txtAntecedentesGinecologicos.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAntecedentesGinecologicos.setLineWrap(true);
        txtAntecedentesGinecologicos.setRows(5);
        txtAntecedentesGinecologicos.setWrapStyleWord(true);
        jScrollPane16.setViewportView(txtAntecedentesGinecologicos);

        panelRound4.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 370, 60));

        txtMedicamentosActivos.setColumns(20);
        txtMedicamentosActivos.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtMedicamentosActivos.setLineWrap(true);
        txtMedicamentosActivos.setRows(5);
        txtMedicamentosActivos.setWrapStyleWord(true);
        jScrollPane17.setViewportView(txtMedicamentosActivos);

        panelRound4.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 770, 370, 50));

        jLabel16.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel16.setText("MEDICAMENTOS ACTIVOS:");
        panelRound4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 750, 170, -1));

        jScrollPane9.setViewportView(panelRound4);

        jPanel2.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 410, 330));

        panelRound6.setBackground(new java.awt.Color(255, 255, 255));
        panelRound6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FAMILIAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        panelRound6.setRoundBottomLeft(20);
        panelRound6.setRoundBottomRight(20);
        panelRound6.setRoundTopLeft(20);
        panelRound6.setRoundTopRight(20);
        panelRound6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel18.setText("PARENTESCO");
        panelRound6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtAntecedentesClinicosFamiliar.setColumns(20);
        txtAntecedentesClinicosFamiliar.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAntecedentesClinicosFamiliar.setLineWrap(true);
        txtAntecedentesClinicosFamiliar.setRows(5);
        txtAntecedentesClinicosFamiliar.setWrapStyleWord(true);
        jScrollPane19.setViewportView(txtAntecedentesClinicosFamiliar);

        panelRound6.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 250, 80));

        jLabel19.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel19.setText("ANTECEDENTES CLINICOS");
        panelRound6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 10));

        txtParentesco.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtParentesco.setBorder(null);
        txtParentesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParentescoActionPerformed(evt);
            }
        });
        panelRound6.add(txtParentesco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 180, 20));

        txtAntecedentesGinecologicosFamiliar.setColumns(20);
        txtAntecedentesGinecologicosFamiliar.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAntecedentesGinecologicosFamiliar.setLineWrap(true);
        txtAntecedentesGinecologicosFamiliar.setRows(5);
        txtAntecedentesGinecologicosFamiliar.setWrapStyleWord(true);
        jScrollPane12.setViewportView(txtAntecedentesGinecologicosFamiliar);

        panelRound6.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 260, 80));

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel9.setText("ANTECEDENTES GINECOLOGICOS");
        panelRound6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, 10));

        txtAntecedentesTraumatologicosFamiliar.setColumns(20);
        txtAntecedentesTraumatologicosFamiliar.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAntecedentesTraumatologicosFamiliar.setLineWrap(true);
        txtAntecedentesTraumatologicosFamiliar.setRows(5);
        txtAntecedentesTraumatologicosFamiliar.setWrapStyleWord(true);
        jScrollPane18.setViewportView(txtAntecedentesTraumatologicosFamiliar);

        panelRound6.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 250, 70));

        jLabel20.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel20.setText("ANTECEDENTES TRAUMATOLOGICO");
        panelRound6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 10));

        txtAntecedentesFarmacologicosFamiliar.setColumns(20);
        txtAntecedentesFarmacologicosFamiliar.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAntecedentesFarmacologicosFamiliar.setLineWrap(true);
        txtAntecedentesFarmacologicosFamiliar.setRows(5);
        txtAntecedentesFarmacologicosFamiliar.setWrapStyleWord(true);
        jScrollPane20.setViewportView(txtAntecedentesFarmacologicosFamiliar);

        panelRound6.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 260, 70));

        jLabel21.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel21.setText("ANTECEDENTES FARMALOGICOS");
        panelRound6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, 10));
        panelRound6.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 180, 10));

        jPanel2.add(panelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 560, 270));

        btnGuardarHistorial.setBackground(new java.awt.Color(64, 172, 159));
        btnGuardarHistorial.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnGuardarHistorial.setText("ACTUALIZAR");
        btnGuardarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarHistorialActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardarHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 130, 30));

        jTabbedPane1.addTab("Historial", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOTAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOTAS DE PADECIMIENTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSatOxigeno.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        lblSatOxigeno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Estatura.png"))); // NOI18N
        lblSatOxigeno.setText("Saturación de Oxígeno:");
        panelRound1.add(lblSatOxigeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        lblEstatura.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        lblEstatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Estatura.png"))); // NOI18N
        lblEstatura.setText("Estarura:");
        panelRound1.add(lblEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        lblPeso.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        lblPeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Peso.png"))); // NOI18N
        lblPeso.setText("Peso:");
        panelRound1.add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblRefSatOxigeno.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        lblRefSatOxigeno.setText("80.00");
        panelRound1.add(lblRefSatOxigeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, 20));

        lblTemperatura.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        lblTemperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/control-de-temperatura.png"))); // NOI18N
        lblTemperatura.setText("Temperatura:");
        panelRound1.add(lblTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 150, -1));

        lblFrecRespiratoria.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        lblFrecRespiratoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Frecuenca respiratoria.png"))); // NOI18N
        lblFrecRespiratoria.setText("Frecuencia Respiratoria:");
        panelRound1.add(lblFrecRespiratoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        lblFreCardiaca.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        lblFreCardiaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Estatura.png"))); // NOI18N
        lblFreCardiaca.setText("Frecuencia Cardiaca:");
        panelRound1.add(lblFreCardiaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        lblRefEstatura.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        lblRefEstatura.setText("1.80m");
        panelRound1.add(lblRefEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, 20));

        lblRefPeso.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        lblRefPeso.setText("80.00kg");
        panelRound1.add(lblRefPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, 20));

        lblRefTemperatura.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        lblRefTemperatura.setText("36.5°C");
        panelRound1.add(lblRefTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, 20));

        lblRefFrecResp.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        lblRefFrecResp.setText("170r/m");
        panelRound1.add(lblRefFrecResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, 20));

        lblRefFreCardiaca.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        lblRefFreCardiaca.setText("80.00 bmp");
        panelRound1.add(lblRefFreCardiaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, 20));

        txtSaturacion.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtSaturacion.setBorder(null);
        panelRound1.add(txtSaturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, 20));

        txtEstatura.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtEstatura.setBorder(null);
        txtEstatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstaturaActionPerformed(evt);
            }
        });
        panelRound1.add(txtEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, 20));

        txtPeso.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtPeso.setBorder(null);
        panelRound1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, 20));

        txtTemperatura.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtTemperatura.setBorder(null);
        panelRound1.add(txtTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, 20));

        txtFrecRespiratoria.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtFrecRespiratoria.setBorder(null);
        panelRound1.add(txtFrecRespiratoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, 20));

        txtFreCardiaca.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtFreCardiaca.setBorder(null);
        panelRound1.add(txtFreCardiaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, 20));
        panelRound1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 380, 10));
        panelRound1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 60, 10));
        panelRound1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 60, 10));
        panelRound1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 60, 10));
        panelRound1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 60, 10));
        panelRound1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 60, 10));
        panelRound1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 60, 10));

        jPanel3.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 385, 300));

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MOTIVO DE CONSULTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        panelRound3.setRoundBottomLeft(40);
        panelRound3.setRoundBottomRight(40);
        panelRound3.setRoundTopLeft(40);
        panelRound3.setRoundTopRight(40);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNotasConsulta.setColumns(20);
        txtNotasConsulta.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtNotasConsulta.setLineWrap(true);
        txtNotasConsulta.setRows(5);
        txtNotasConsulta.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtNotasConsulta);

        panelRound3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 540, 90));

        jPanel3.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 560, 130));

        btnSiguiente.setBackground(new java.awt.Color(64, 172, 159));
        btnSiguiente.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 130, 30));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXAMEN FÍSICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtExamenFisico.setColumns(20);
        txtExamenFisico.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtExamenFisico.setLineWrap(true);
        txtExamenFisico.setRows(5);
        txtExamenFisico.setWrapStyleWord(true);
        jScrollPane14.setViewportView(txtExamenFisico);

        jPanel7.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 540, 100));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 560, 130));

        jTabbedPane1.addTab("Notas de Padecimiento", jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIAGNÓSTICO Y TRATAMIENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
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

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 610, 60));

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 630, 90));

        txtImprimirReceta.setBackground(new java.awt.Color(64, 172, 159));
        txtImprimirReceta.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        txtImprimirReceta.setText("IMPRIMIR RECETA");
        txtImprimirReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImprimirRecetaActionPerformed(evt);
            }
        });
        jPanel6.add(txtImprimirReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, -1, 30));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PLAN DE TRATAMIENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaPlanTrat.setColumns(20);
        txtAreaPlanTrat.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAreaPlanTrat.setLineWrap(true);
        txtAreaPlanTrat.setRows(5);
        txtAreaPlanTrat.setWrapStyleWord(true);
        jScrollPane5.setViewportView(txtAreaPlanTrat);

        jPanel9.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 220));

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 330, 250));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MEDICACIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaMedicacion.setColumns(20);
        txtAreaMedicacion.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAreaMedicacion.setLineWrap(true);
        txtAreaMedicacion.setRows(5);
        txtAreaMedicacion.setWrapStyleWord(true);
        jScrollPane22.setViewportView(txtAreaMedicacion);

        jPanel10.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 610, 60));

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 630, 100));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIAGNÓSTICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaDiagnostico.setColumns(20);
        txtAreaDiagnostico.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAreaDiagnostico.setLineWrap(true);
        txtAreaDiagnostico.setRows(5);
        txtAreaDiagnostico.setWrapStyleWord(true);
        jScrollPane23.setViewportView(txtAreaDiagnostico);

        jPanel11.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 610, 60));

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 630, 90));

        jTabbedPane1.addTab("Diagnóstico y Tratamiento", jPanel6);

        jPanel5.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1000, 390));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1040, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOpcionesActionPerformed

    private void txtEstaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstaturaActionPerformed

    private void txtImprimirRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImprimirRecetaActionPerformed

    private void btnGuardarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarHistorialActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void txtParentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParentescoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParentescoActionPerformed
    
    //Geter y seter de los componentes de historial
    public JButton getBtnGuardarHistorial() {
        return btnGuardarHistorial;
    }

    public void setBtnGuardarHistorial(JButton btnGuardarHistorial) {
        this.btnGuardarHistorial = btnGuardarHistorial;
    }

    public JTextArea getTxtAntecedentesFarmacologicos() {
        return txtAntecedentesFarmacologicos;
    }

    public void setTxtAntecedentesFarmacologicos(JTextArea txtAntecedentesFarmacologicos) {
        this.txtAntecedentesFarmacologicos = txtAntecedentesFarmacologicos;
    }
    
    public JTextArea getTxtAntecedentesClinicosFamiliar() {
        return txtAntecedentesClinicosFamiliar;
    }

    public void setTxtAntecedentesClinicosFamiliar(JTextArea txtAntecedentesClinicosFamiliar) {
        this.txtAntecedentesClinicosFamiliar = txtAntecedentesClinicosFamiliar;
    }

    public JTextArea getTxtAntecedentesFarmacologicosFamiliar() {
        return txtAntecedentesFarmacologicosFamiliar;
    }

    public void setTxtAntecedentesFarmacologicosFamiliar(JTextArea txtAntecedentesFarmacologicosFamiliar) {
        this.txtAntecedentesFarmacologicosFamiliar = txtAntecedentesFarmacologicosFamiliar;
    }
    
    public JTextArea getTxtAntecedentesGinecologicosFamiliar() {
        return txtAntecedentesGinecologicosFamiliar;
    }

    public void setTxtAntecedentesGinecologicosFamiliar(JTextArea txtAntecedentesGinecologicosFamiliar) {
        this.txtAntecedentesGinecologicosFamiliar = txtAntecedentesGinecologicosFamiliar;
    }
    
    public JTextArea getTxtAntecedentesTraumatologicosFamiliar() {
        return txtAntecedentesTraumatologicosFamiliar;
    }

    public void setTxtAntecedentesTraumatologicosFamiliar(JTextArea txtAntecedentesTraumatologicosFamiliar) {
        this.txtAntecedentesTraumatologicosFamiliar = txtAntecedentesTraumatologicosFamiliar;
    }

       public JTextField getTxtParentesco() {
        return txtParentesco;
    }

    public void setTxtParentesco(JTextField txtParentesco) {
        this.txtParentesco = txtParentesco;
    }
    
    public JTextArea getTxtAntecedentesGinecologicos() {
        return txtAntecedentesGinecologicos;
    }

    public void setTxtAntecedentesGinecologicos(JTextArea txtAntecedentesGinecologicos) {
        this.txtAntecedentesGinecologicos = txtAntecedentesGinecologicos;
    }

    public JTextArea getTxtAntecedentesTraumatologicos() {
        return txtAntecedentesTraumatologicos;
    }

    public void setTxtAntecedentesTraumatologicos(JTextArea txtAntecedentesTraumatologicos) {
        this.txtAntecedentesTraumatologicos = txtAntecedentesTraumatologicos;
    }

    public JTextArea getTxtAntecedentes_Clinicos() {
        return txtAntecedentes_Clinicos;
    }

    public void setTxtAntecedentes_Clinicos(JTextArea txtAntecedentes_Clinicos) {
        this.txtAntecedentes_Clinicos = txtAntecedentes_Clinicos;
    }

    public JTextArea getTxtCirujias() {
        return txtCirujias;
    }

    public void setTxtCirujias(JTextArea txtCirujias) {
        this.txtCirujias = txtCirujias;
    }

    public JTextArea getTxtEnfermedades() {
        return txtEnfermedades;
    }

    public void setTxtEnfermedades(JTextArea txtEnfermedades) {
        this.txtEnfermedades = txtEnfermedades;
    }

    public JTextArea getTxtVacunas() {
        return txtVacunas;
    }

    public void setTxtVacunas(JTextArea txtVacunas) {
        this.txtVacunas = txtVacunas;
    }

    public JTextArea getTxt_Alergias() {
        return txt_Alergias;
    }

    public void setTxt_Alergias(JTextArea txt_Alergias) {
        this.txt_Alergias = txt_Alergias;
    }

    public JTextArea getTxtMedicamentosActivos() {
        return txtMedicamentosActivos;
    }

    public void setTxtMedicamentosActivos(JTextArea txtMedicamentosActivos) {
        this.txtMedicamentosActivos = txtMedicamentosActivos;
    }

    public JTextArea getTxtExamenFisico() {
        return txtExamenFisico;
    }

    public void setTxtExamenFisico(JTextArea txtExamenFisico) {
        this.txtExamenFisico = txtExamenFisico;
    }
    
//-------------------------------------------------------------------------------------------------------------------------------------
    
    //Getter y setter de nota de padecimiento y diagnostico

    public JTextArea getTxtAreaDiagnostico() {
        return txtAreaDiagnostico;
    }

    public void setTxtAreaDiagnostico(JTextArea txtAreaDiagnostico) {
        this.txtAreaDiagnostico = txtAreaDiagnostico;
    }

    public JTextArea getTxtAreaInstrucciones() {
        return txtAreaInstrucciones;
    }

    public void setTxtAreaInstrucciones(JTextArea txtAreaInstrucciones) {
        this.txtAreaInstrucciones = txtAreaInstrucciones;
    }

    public JTextArea getTxtAreaMedicacion() {
        return txtAreaMedicacion;
    }

    public void setTxtAreaMedicacion(JTextArea txtAreaMedicacion) {
        this.txtAreaMedicacion = txtAreaMedicacion;
    }

    public JTextArea getTxtAreaPlanTrat() {
        return txtAreaPlanTrat;
    }

    public void setTxtAreaPlanTrat(JTextArea txtAreaPlanTrat) {
        this.txtAreaPlanTrat = txtAreaPlanTrat;
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

    public JButton getTxtImprimirReceta() {
        return txtImprimirReceta;
    }

    public void setTxtImprimirReceta(JButton txtImprimirReceta) {
        this.txtImprimirReceta = txtImprimirReceta;
    }

    public JTextArea getTxtNotasConsulta() {
        return txtNotasConsulta;
    }

    public void setTxtNotasConsulta(JTextArea txtNotasConsulta) {
        this.txtNotasConsulta = txtNotasConsulta;
    }

    public JTextField getTxtPeso() {
        return txtPeso;
    }

    public void setTxtPeso(JTextField txtPeso) {
        this.txtPeso = txtPeso;
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

    public JButton getBtnOpciones() {
        return btnOpciones;
    }

    public void setBtnOpciones(JButton btnOpciones) {
        this.btnOpciones = btnOpciones;
    }

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNuevaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarHistorial;
    private javax.swing.JButton btnOpciones;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnTerminarConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane3;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstatura;
    private javax.swing.JLabel lblFecha_Actual;
    private javax.swing.JLabel lblFecha_Nacimiento;
    private javax.swing.JLabel lblFreCardiaca;
    private javax.swing.JLabel lblFrecRespiratoria;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroCel;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblRefEstatura;
    private javax.swing.JLabel lblRefFreCardiaca;
    private javax.swing.JLabel lblRefFrecResp;
    private javax.swing.JLabel lblRefPeso;
    private javax.swing.JLabel lblRefSatOxigeno;
    private javax.swing.JLabel lblRefTemperatura;
    private javax.swing.JLabel lblSatOxigeno;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTemperatura;
    private Modelo.PanelRound panelRound1;
    private Modelo.PanelRound panelRound2;
    private Modelo.PanelRound panelRound3;
    private Modelo.PanelRound panelRound4;
    private Modelo.PanelRound panelRound6;
    private javax.swing.JTextArea txtAntecedentesClinicosFamiliar;
    private javax.swing.JTextArea txtAntecedentesFarmacologicos;
    private javax.swing.JTextArea txtAntecedentesFarmacologicosFamiliar;
    private javax.swing.JTextArea txtAntecedentesGinecologicos;
    private javax.swing.JTextArea txtAntecedentesGinecologicosFamiliar;
    private javax.swing.JTextArea txtAntecedentesTraumatologicos;
    private javax.swing.JTextArea txtAntecedentesTraumatologicosFamiliar;
    private javax.swing.JTextArea txtAntecedentes_Clinicos;
    private javax.swing.JTextArea txtAreaDiagnostico;
    private javax.swing.JTextArea txtAreaInstrucciones;
    private javax.swing.JTextArea txtAreaMedicacion;
    private javax.swing.JTextArea txtAreaPlanTrat;
    private javax.swing.JTextArea txtCirujias;
    private javax.swing.JTextArea txtEnfermedades;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextArea txtExamenFisico;
    private javax.swing.JTextField txtFreCardiaca;
    private javax.swing.JTextField txtFrecRespiratoria;
    private javax.swing.JButton txtImprimirReceta;
    private javax.swing.JTextArea txtMedicamentosActivos;
    private javax.swing.JTextArea txtNotasConsulta;
    private javax.swing.JTextField txtParentesco;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtSaturacion;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextArea txtVacunas;
    private javax.swing.JTextArea txt_Alergias;
    // End of variables declaration//GEN-END:variables
}
