/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorFrmNuevaConsul;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
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
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        panelRound3 = new Modelo.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotasConsulta = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtExamenFisico = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelRound1 = new Modelo.PanelRound();
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
        txtMasaCorporal = new javax.swing.JTextField();
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
        jSeparator18 = new javax.swing.JSeparator();
        txtLlenadoCapilar = new javax.swing.JTextField();
        txtReaccionPupilar = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        txtGlasgow = new javax.swing.JTextField();
        txtOcular = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        txtMotora = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        txtVerbal = new javax.swing.JTextField();
        TxtTotal = new javax.swing.JTextField();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
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

        jTabbedPane.setBackground(new java.awt.Color(64, 172, 159));
        jTabbedPane.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOTAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelRound3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 580, 90));

        jPanel3.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 620, 130));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXAMEN FÍSICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtExamenFisico.setColumns(20);
        txtExamenFisico.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtExamenFisico.setLineWrap(true);
        txtExamenFisico.setRows(5);
        txtExamenFisico.setWrapStyleWord(true);
        jScrollPane14.setViewportView(txtExamenFisico);

        jPanel7.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 580, 100));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 620, 130));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOTAS DE PADECIMIENTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSatOxigeno.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblSatOxigeno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cuidado-de-la-salud.png"))); // NOI18N
        lblSatOxigeno.setText("Saturación de Oxígeno:");
        panelRound1.add(lblSatOxigeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 180, -1));

        lblEstatura.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblEstatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Estatura.png"))); // NOI18N
        lblEstatura.setText("Estarura:");
        panelRound1.add(lblEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, -1));

        lblPeso.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblPeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Peso.png"))); // NOI18N
        lblPeso.setText("Peso:");
        panelRound1.add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, -1));

        lblTemperatura.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblTemperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/control-de-temperatura.png"))); // NOI18N
        lblTemperatura.setText("Temperatura:");
        panelRound1.add(lblTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, -1));

        lblFrecRespiratoria.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Frecuenca respiratoria.png"))); // NOI18N
        lblFrecRespiratoria.setText("Frecuencia Respiratoria:");
        panelRound1.add(lblFrecRespiratoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, -1));

        lblFreCardiaca.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFreCardiaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/monitor-de-pulso-cardiaco.png"))); // NOI18N
        lblFreCardiaca.setText("Frecuencia Cardiaca:");
        panelRound1.add(lblFreCardiaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 180, -1));
        panelRound1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 320, 10));

        jLabel15.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/presion-arterial.png"))); // NOI18N
        jLabel15.setText("Presion Arterial:");
        panelRound1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 180, -1));

        jLabel18.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/indice-de-masa-corporal (1).png"))); // NOI18N
        jLabel18.setText("Masa Corporal:");
        panelRound1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, -1));

        jLabel55.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/formulario-de-llenado.png"))); // NOI18N
        jLabel55.setText("Llenado Capilar:");
        panelRound1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, -1));

        jLabel56.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/totalmente.png"))); // NOI18N
        jLabel56.setText("Total:");
        panelRound1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 460, 180, -1));

        jLabel42.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/discurso.png"))); // NOI18N
        jLabel42.setText("Verbal:");
        panelRound1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 180, -1));

        jLabel41.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/reconocimiento-ocular.png"))); // NOI18N
        jLabel41.setText("Ocular:");
        panelRound1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 180, -1));

        jLabel23.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salud-mental.png"))); // NOI18N
        jLabel23.setText("Glasgow:");
        panelRound1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 180, -1));

        jLabel58.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pupila-del-ojo.png"))); // NOI18N
        jLabel58.setText("Reacción Pupilar:");
        panelRound1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 180, -1));

        jLabel57.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salud.png"))); // NOI18N
        jLabel57.setText("Motora:");
        panelRound1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 180, -1));

        txtTemperatura.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtTemperatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTemperatura.setBorder(null);
        txtTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperaturaActionPerformed(evt);
            }
        });
        panelRound1.add(txtTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 70, 20));

        txtEstatura.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtEstatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEstatura.setBorder(null);
        panelRound1.add(txtEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 70, 20));

        txtPeso.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPeso.setBorder(null);
        panelRound1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 70, 20));

        txtMasaCorporal.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtMasaCorporal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMasaCorporal.setBorder(null);
        panelRound1.add(txtMasaCorporal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 70, 20));
        panelRound1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 70, 10));
        panelRound1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 70, 10));
        panelRound1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 70, 10));
        panelRound1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 70, 10));

        txtPresionArterial.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtPresionArterial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPresionArterial.setBorder(null);
        txtPresionArterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPresionArterialActionPerformed(evt);
            }
        });
        panelRound1.add(txtPresionArterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 70, 20));

        txtFrecRespiratoria.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtFrecRespiratoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFrecRespiratoria.setBorder(null);
        panelRound1.add(txtFrecRespiratoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 70, 20));

        txtFreCardiaca.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtFreCardiaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFreCardiaca.setBorder(null);
        panelRound1.add(txtFreCardiaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 70, 20));

        txtSaturacion.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtSaturacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaturacion.setBorder(null);
        panelRound1.add(txtSaturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 70, 20));
        panelRound1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 70, 10));
        panelRound1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 70, 10));
        panelRound1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 70, 10));
        panelRound1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 70, 10));
        panelRound1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 70, 10));

        txtLlenadoCapilar.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtLlenadoCapilar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLlenadoCapilar.setBorder(null);
        panelRound1.add(txtLlenadoCapilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 70, 20));

        txtReaccionPupilar.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtReaccionPupilar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReaccionPupilar.setBorder(null);
        panelRound1.add(txtReaccionPupilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 70, 20));
        panelRound1.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 70, 10));
        panelRound1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 70, 10));

        txtGlasgow.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtGlasgow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGlasgow.setBorder(null);
        panelRound1.add(txtGlasgow, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 70, 20));

        txtOcular.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtOcular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOcular.setBorder(null);
        txtOcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOcularActionPerformed(evt);
            }
        });
        panelRound1.add(txtOcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 70, 20));
        panelRound1.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 70, 10));

        txtMotora.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtMotora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMotora.setBorder(null);
        panelRound1.add(txtMotora, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 70, 20));
        panelRound1.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 70, 10));
        panelRound1.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 70, 10));
        panelRound1.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 70, 10));

        txtVerbal.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txtVerbal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVerbal.setBorder(null);
        panelRound1.add(txtVerbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 70, 20));

        TxtTotal.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        TxtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTotal.setBorder(null);
        TxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTotalActionPerformed(evt);
            }
        });
        panelRound1.add(TxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 70, 20));

        jScrollPane2.setViewportView(panelRound1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 320, 300));

        jTabbedPane.addTab("Notas de Padecimiento", jPanel3);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cuerpo_1.png"))); // NOI18N
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 170, 360));

        jLabel3.setText("Cabeza");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setText("Cuello");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        jLabel5.setText("Torax");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 30, 20));

        jLabel6.setText("Corazon");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 20));

        jLabel7.setText("Abdomen");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, 20));

        jLabel8.setText("R_Inguinal");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, 20));

        jLabel9.setText("M_Inferior");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, -1, 20));

        jLabel10.setText("M_superior");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, -1, 20));

        txtAreaCabeza.setColumns(20);
        txtAreaCabeza.setRows(5);
        jScrollPane4.setViewportView(txtAreaCabeza);

        jPanel8.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, 50));

        txtAreaCuello.setColumns(20);
        txtAreaCuello.setRows(5);
        jScrollPane6.setViewportView(txtAreaCuello);

        jPanel8.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 340, 50));

        txtAreaTorax.setColumns(20);
        txtAreaTorax.setRows(5);
        jScrollPane7.setViewportView(txtAreaTorax);

        jPanel8.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 340, 50));

        txtAreaCorazon.setColumns(20);
        txtAreaCorazon.setRows(5);
        jScrollPane8.setViewportView(txtAreaCorazon);

        jPanel8.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 340, 50));

        txtAreaAbdomen.setColumns(20);
        txtAreaAbdomen.setRows(5);
        jScrollPane9.setViewportView(txtAreaAbdomen);

        jPanel8.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 330, 50));

        txtAreaR_Inguinal.setColumns(20);
        txtAreaR_Inguinal.setRows(5);
        jScrollPane10.setViewportView(txtAreaR_Inguinal);

        jPanel8.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 330, 50));

        txtAreaM_Superior.setColumns(20);
        txtAreaM_Superior.setRows(5);
        jScrollPane11.setViewportView(txtAreaM_Superior);

        jPanel8.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 330, 50));

        txtAreaM_Inferior.setColumns(20);
        txtAreaM_Inferior.setRows(5);
        jScrollPane12.setViewportView(txtAreaM_Inferior);

        jPanel8.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 330, 50));

        jLabel11.setText("Nivel de prioridad");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No prioritario", "Prioritario", "Emergencia" }));
        jPanel8.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 140, -1));

        jLabel12.setText("Piel y faneras");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jScrollPane13.setViewportView(jTextArea9);

        jPanel8.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 250, 40));

        jScrollPane16.setViewportView(jPanel8);

        jPanel2.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 370));

        jTabbedPane.addTab("Examen fisico", jPanel2);

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
    }// </editor-fold>//GEN-END:initComponents

    private void txtImprimirRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirRecetaActionPerformed
    FrmInterfazImprimir co = new FrmInterfazImprimir();
    co.setVisible(true);
    }//GEN-LAST:event_txtImprimirRecetaActionPerformed

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

    private void TxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTotalActionPerformed

//-------------------------------------------------------------------------------------------------------------------------------------
    
    //Getter y setter de nota de padecimiento y diagnostico
    
    public JTextField getTxtTotal() {
        return TxtTotal;
    }

    public void setTxtTotal(JTextField TxtTotal) {
        this.TxtTotal = TxtTotal;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
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

    public JTextArea getTxtExamenFisico() {
        return txtExamenFisico;
    }

    public void setTxtExamenFisico(JTextArea txtExamenFisico) {
        this.txtExamenFisico = txtExamenFisico;
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

    public JTextField getTxtGlasgow() {
        return txtGlasgow;
    }

    public void setTxtGlasgow(JTextField txtGlasgow) {
        this.txtGlasgow = txtGlasgow;
    }

    public JButton getTxtImprimirReceta() {
        return txtImprimirReceta;
    }

    public void setTxtImprimirReceta(JButton txtImprimirReceta) {
        this.txtImprimirReceta = txtImprimirReceta;
    }

    public JTextField getTxtLlenadoCapilar() {
        return txtLlenadoCapilar;
    }

    public void setTxtLlenadoCapilar(JTextField txtLlenadoCapilar) {
        this.txtLlenadoCapilar = txtLlenadoCapilar;
    }

    public JTextField getTxtMasaCorporal() {
        return txtMasaCorporal;
    }

    public void setTxtMasaCorporal(JTextField txtMasaCorporal) {
        this.txtMasaCorporal = txtMasaCorporal;
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNuevaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnTerminarConsulta;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
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
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextArea jTextArea9;
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
    private javax.swing.JLabel lblSatOxigeno;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTemperatura;
    private Modelo.PanelRound panelRound1;
    private Modelo.PanelRound panelRound2;
    private Modelo.PanelRound panelRound3;
    private javax.swing.JTextArea txtAreaAbdomen;
    private javax.swing.JTextArea txtAreaCabeza;
    private javax.swing.JTextArea txtAreaCorazon;
    private javax.swing.JTextArea txtAreaCuello;
    private javax.swing.JTextArea txtAreaDiagnostico;
    private javax.swing.JTextArea txtAreaInstrucciones;
    private javax.swing.JTextArea txtAreaM_Inferior;
    private javax.swing.JTextArea txtAreaM_Superior;
    private javax.swing.JTextArea txtAreaMedicacion;
    private javax.swing.JTextArea txtAreaPlanTrat;
    private javax.swing.JTextArea txtAreaR_Inguinal;
    private javax.swing.JTextArea txtAreaTorax;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextArea txtExamenFisico;
    private javax.swing.JTextField txtFreCardiaca;
    private javax.swing.JTextField txtFrecRespiratoria;
    private javax.swing.JTextField txtGlasgow;
    private javax.swing.JButton txtImprimirReceta;
    private javax.swing.JTextField txtLlenadoCapilar;
    private javax.swing.JTextField txtMasaCorporal;
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
