/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Controlador.ControladorFrmPanelDatosPaciente;
import Controlador.ControladorMostrarDatosPanelbtn;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Jhony
 */
public class PanelDatosPaciente extends javax.swing.JPanel {

    /**
     * Creates new form DatosPaciente
     */
    ControladorFrmPanelDatosPaciente control;
    ControladorMostrarDatosPanelbtn panel;

    public PanelDatosPaciente() {
        initComponents();
        control = new ControladorFrmPanelDatosPaciente(this);
        panel = new ControladorMostrarDatosPanelbtn(this);
    }

    //getters and setters panel
    public void setTxtApellidoPaciente(JTextField TxtApellidoPaciente) {
        this.TxtApellidoPaciente = TxtApellidoPaciente;
    }

    
    public JTextField getTxtApellidoPaciente() {
        return TxtApellidoPaciente;
    }

    public JLabel getLabelAñoUltimaCita() {
        return LabelAñoUltimaCita;
    }

    public void setLabelAñoUltimaCita(JLabel LabelAñoUltimaCita) {
        this.LabelAñoUltimaCita = LabelAñoUltimaCita;
    }

    public JLabel getLabelDiaUltimaCita() {
        return LabelDiaUltimaCita;
    }

    public void setLabelDiaUltimaCita(JLabel LabelDiaUltimaCita) {
        this.LabelDiaUltimaCita = LabelDiaUltimaCita;
    }

    public JLabel getLabelDocNombreMostrarDatos() {
        return LabelDocNombreMostrarDatos;
    }

    public void setLabelDocNombreMostrarDatos(JLabel LabelDocNombreMostrarDatos) {
        this.LabelDocNombreMostrarDatos = LabelDocNombreMostrarDatos;
    }

    public JLabel getLabelMesUltimaCita() {
        return LabelMesUltimaCita;
    }

    public void setLabelMesUltimaCita(JLabel LabelMesUltimaCita) {
        this.LabelMesUltimaCita = LabelMesUltimaCita;
    }

    public JLabel getLabelMotivoCita() {
        return LabelMotivoCita;
    }

    public void setLabelMotivoCita(JLabel LabelMotivoCita) {
        this.LabelMotivoCita = LabelMotivoCita;
    }

    public JPanel getPanelbtn() {
        return Panelbtn;
    }

    public void setPanelbtn(JPanel Panelbtn) {
        this.Panelbtn = Panelbtn;
    }

    //getters and setters mostrar datos
    public JButton getBtnNuevaConsulta() {
        return BtnNuevaConsulta;
    }

    public void setBtnNuevaConsulta(JButton BtnNuevaConsulta) {
        this.BtnNuevaConsulta = BtnNuevaConsulta;
    }

    public JLabel getLabelEdadConsu() {
        return LabelEdadConsu;
    }

    public void setLabelEdadConsu(JLabel LabelEdadConsu) {
        this.LabelEdadConsu = LabelEdadConsu;
    }

    public JLabel getLabelFrecuencia_CardiacaConsu() {
        return LabelFrecuencia_CardiacaConsu;
    }

    public void setLabelFrecuencia_CardiacaConsu(JLabel LabelFrecuencia_CardiacaConsu) {
        this.LabelFrecuencia_CardiacaConsu = LabelFrecuencia_CardiacaConsu;
    }

    public JLabel getLabelFrecuencia_RespiratoriaConsu() {
        return LabelFrecuencia_RespiratoriaConsu;
    }

    public void setLabelFrecuencia_RespiratoriaConsu(JLabel LabelFrecuencia_RespiratoriaConsu) {
        this.LabelFrecuencia_RespiratoriaConsu = LabelFrecuencia_RespiratoriaConsu;
    }

    public JLabel getLabelIndice_Masa_CorporalConsu() {
        return LabelIndice_Masa_CorporalConsu;
    }

    public void setLabelIndice_Masa_CorporalConsu(JLabel LabelIndice_Masa_CorporalConsu) {
        this.LabelIndice_Masa_CorporalConsu = LabelIndice_Masa_CorporalConsu;
    }

    public JLabel getLabelLlenado_CapilarConsu() {
        return LabelLlenado_CapilarConsu;
    }

    public void setLabelLlenado_CapilarConsu(JLabel LabelLlenado_CapilarConsu) {
        this.LabelLlenado_CapilarConsu = LabelLlenado_CapilarConsu;
    }

    public JLabel getLabelMotoraConsu() {
        return LabelMotoraConsu;
    }

    public void setLabelMotoraConsu(JLabel LabelMotoraConsu) {
        this.LabelMotoraConsu = LabelMotoraConsu;
    }

    public JLabel getLabelOcularConsu() {
        return LabelOcularConsu;
    }
    

    public void setLabelOcularConsu(JLabel LabelOcularConsu) {
        this.LabelOcularConsu = LabelOcularConsu;
    }

    public JLabel getLabelPesoConsu() {
        return LabelPesoConsu;
    }

    public void setLabelPesoConsu(JLabel LabelPesoConsu) {
        this.LabelPesoConsu = LabelPesoConsu;
    }

    public JLabel getLabelPresion_ArterialConsu() {
        return LabelPresion_ArterialConsu;
    }

    public void setLabelPresion_ArterialConsu(JLabel LabelPresion_ArterialConsu) {
        this.LabelPresion_ArterialConsu = LabelPresion_ArterialConsu;
    }

    public JLabel getLabelR_PupilarConsu() {
        return LabelR_PupilarConsu;
    }

    public void setLabelR_PupilarConsu(JLabel LabelR_PupilarConsu) {
        this.LabelR_PupilarConsu = LabelR_PupilarConsu;
    }

    public JLabel getLabelSaturacion_OxigenoConsu() {
        return LabelSaturacion_OxigenoConsu;
    }

    public void setLabelSaturacion_OxigenoConsu(JLabel LabelSaturacion_OxigenoConsu) {
        this.LabelSaturacion_OxigenoConsu = LabelSaturacion_OxigenoConsu;
    }

    public JLabel getLabelTallaConsu() {
        return LabelTallaConsu;
    }

    public void setLabelTallaConsu(JLabel LabelTallaConsu) {
        this.LabelTallaConsu = LabelTallaConsu;
    }

    public JLabel getLabelTemperaturaConsu() {
        return LabelTemperaturaConsu;
    }

    public void setLabelTemperaturaConsu(JLabel LabelTemperaturaConsu) {
        this.LabelTemperaturaConsu = LabelTemperaturaConsu;
    }

    public JLabel getLabelTotalConsu() {
        return LabelTotalConsu;
    }

    public void setLabelTotalConsu(JLabel LabelTotalConsu) {
        this.LabelTotalConsu = LabelTotalConsu;
    }

    public JLabel getLabelVerbalConsu() {
        return LabelVerbalConsu;
    }

    public void setLabelVerbalConsu(JLabel LabelVerbalConsu) {
        this.LabelVerbalConsu = LabelVerbalConsu;
    }

    public JLabel getLblFotoConsu() {
        return LblFotoConsu;
    }

    public void setLblFotoConsu(JLabel LblFotoConsu) {
        this.LblFotoConsu = LblFotoConsu;
    }

    public JTextField getTxtCelularPaciente() {
        return TxtCelularPaciente;
    }

    public void setTxtCelularPaciente(JTextField TxtCelularPaciente) {
        this.TxtCelularPaciente = TxtCelularPaciente;
    }

    public JTextField getTxtCorreoPaciente() {
        return TxtCorreoPaciente;
    }

    public void setTxtCorreoPaciente(JTextField TxtCorreoPaciente) {
        this.TxtCorreoPaciente = TxtCorreoPaciente;
    }

    public JTextField getTxtDireccionPaciente() {
        return TxtDireccionPaciente;
    }

    public void setTxtDireccionPaciente(JTextField TxtDireccionPaciente) {
        this.TxtDireccionPaciente = TxtDireccionPaciente;
    }

    public JTextField getTxtIdentificacionPaciente() {
        return TxtIdentificacionPaciente;
    }

    public void setTxtIdentificacionPaciente(JTextField TxtIdentificacionPaciente) {
        this.TxtIdentificacionPaciente = TxtIdentificacionPaciente;
    }

    public JTextField getTxtNombrePaciente() {
        return TxtNombrePaciente;
    }

    public void setTxtNombrePaciente(JTextField TxtNombrePaciente) {
        this.TxtNombrePaciente = TxtNombrePaciente;
    }

    public JTextField getTxtSexoPaciente() {
        return TxtSexoPaciente;
    }

    public void setTxtSexoPaciente(JTextField TxtSexoPaciente) {
        this.TxtSexoPaciente = TxtSexoPaciente;
    }

    public JTextField getTxtFechaNacimientoPaciente() {
        return TxtFechaNacimientoPaciente;
    }

    public void setTxtFechaNacimientoPaciente(JTextField TxtFechaNacimientoPaciente) {
        this.TxtFechaNacimientoPaciente = TxtFechaNacimientoPaciente;
    }

    public JButton getBtnEditarDatos() {
        return BtnEditarDatos;
    }

    public void setBtnEditarDatos(JButton BtnEditarDatos) {
        this.BtnEditarDatos = BtnEditarDatos;
    }

    public JButton getBtnGuardarCambiosDatos() {
        return BtnGuardarCambiosDatos;
    }

    public void setBtnGuardarCambiosDatos(JButton BtnGuardarCambiosDatos) {
        this.BtnGuardarCambiosDatos = BtnGuardarCambiosDatos;
    }

    //getteres and setters  antecedenetes  personales 
    public JTextField getTxtAlergiasPersonales() {
        return TxtAlergiasPersonales;
    }

    public void setTxtAlergiasPersonales(JTextField TxtAlergiasPersonales) {
        this.TxtAlergiasPersonales = TxtAlergiasPersonales;
    }

    public JTextField getTxtCirugiasPersonales() {
        return TxtCirugiasPersonales;
    }

    public void setTxtCirugiasPersonales(JTextField TxtCirugiasPersonales) {
        this.TxtCirugiasPersonales = TxtCirugiasPersonales;
    }

    public JTextField getTxtClinicoPersonales() {
        return TxtClinicoPersonales;
    }

    public void setTxtClinicoPersonales(JTextField TxtClinicoPersonales) {
        this.TxtClinicoPersonales = TxtClinicoPersonales;
    }

    public JTextField getTxtEnfermedadesPersonales() {
        return TxtEnfermedadesPersonales;
    }

    public void setTxtEnfermedadesPersonales(JTextField TxtEnfermedadesPersonales) {
        this.TxtEnfermedadesPersonales = TxtEnfermedadesPersonales;
    }

    public JTextField getTxtFarmacologicoPersonales() {
        return TxtFarmacologicoPersonales;
    }

    public void setTxtFarmacologicoPersonales(JTextField TxtFarmacologicoPersonales) {
        this.TxtFarmacologicoPersonales = TxtFarmacologicoPersonales;
    }

    public JTextField getTxtGinecologicoPersonales() {
        return TxtGinecologicoPersonales;
    }

    public void setTxtGinecologicoPersonales(JTextField TxtGinecologicoPersonales) {
        this.TxtGinecologicoPersonales = TxtGinecologicoPersonales;
    }

    public JTextField getTxtTraumatologicoPersonales() {
        return TxtTraumatologicoPersonales;
    }

    public void setTxtTraumatologicoPersonales(JTextField TxtTraumatologicoPersonales) {
        this.TxtTraumatologicoPersonales = TxtTraumatologicoPersonales;
    }

    public JTextField getTxtVacunasPersonales() {
        return TxtVacunasPersonales;
    }

    public void setTxtVacunasPersonales(JTextField TxtVacunasPersonales) {
        this.TxtVacunasPersonales = TxtVacunasPersonales;
    }

    //getteres and setters  antecedenetes  Familiares
    public JComboBox<String> getComboBoxParentesco() {
        return ComboBoxParentesco;
    }

    public void setComboBoxParentesco(JComboBox<String> ComboBoxParentesco) {
        this.ComboBoxParentesco = ComboBoxParentesco;
    }

    public JTextField getTxFarmacologiaFamiliares() {
        return TxFarmacologiaFamiliares;
    }

    public void setTxFarmacologiaFamiliares(JTextField TxFarmacologiaFamiliares) {
        this.TxFarmacologiaFamiliares = TxFarmacologiaFamiliares;
    }

    public JTextField getTxtAlergiasFamiliares() {
        return TxtAlergiasFamiliares;
    }

    public void setTxtAlergiasFamiliares(JTextField TxtAlergiasFamiliares) {
        this.TxtAlergiasFamiliares = TxtAlergiasFamiliares;
    }

    public JTextField getTxtCirugiasFamiliares() {
        return TxtCirugiasFamiliares;
    }

    public void setTxtCirugiasFamiliares(JTextField TxtCirugiasFamiliares) {
        this.TxtCirugiasFamiliares = TxtCirugiasFamiliares;
    }

    public JTextField getTxtClinicoFamiliares() {
        return TxtClinicoFamiliares;
    }

    public void setTxtClinicoFamiliares(JTextField TxtClinicoFamiliares) {
        this.TxtClinicoFamiliares = TxtClinicoFamiliares;
    }

    public JTextField getTxtEnfermedadesFamiliares() {
        return TxtEnfermedadesFamiliares;
    }

    public void setTxtEnfermedadesFamiliares(JTextField TxtEnfermedadesFamiliares) {
        this.TxtEnfermedadesFamiliares = TxtEnfermedadesFamiliares;
    }

    public JTextField getTxtTraumatologiaFamiliares() {
        return TxtTraumatologiaFamiliares;
    }

    public void setTxtTraumatologiaFamiliares(JTextField TxtTraumatologiaFamiliares) {
        this.TxtTraumatologiaFamiliares = TxtTraumatologiaFamiliares;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        panelRound1 = new Modelo.PanelRound();
        LblFotoConsu = new javax.swing.JLabel();
        LabelEdadConsu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        TxtFechaNacimientoPaciente = new javax.swing.JTextField();
        TxtNombrePaciente = new javax.swing.JTextField();
        TxtIdentificacionPaciente = new javax.swing.JTextField();
        TxtCelularPaciente = new javax.swing.JTextField();
        TxtSexoPaciente = new javax.swing.JTextField();
        TxtCorreoPaciente = new javax.swing.JTextField();
        TxtDireccionPaciente = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        TxtApellidoPaciente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelRound4 = new Modelo.PanelRound();
        BtnNuevaConsulta = new javax.swing.JButton();
        BtnGuardarCambiosDatos = new javax.swing.JButton();
        BtnEditarDatos = new javax.swing.JButton();
        panelRound3 = new Modelo.PanelRound();
        LabelPresion_ArterialConsu = new javax.swing.JLabel();
        LabelPesoConsu = new javax.swing.JLabel();
        LabelTallaConsu = new javax.swing.JLabel();
        LabelIndice_Masa_CorporalConsu = new javax.swing.JLabel();
        LabelFrecuencia_CardiacaConsu = new javax.swing.JLabel();
        LabelFrecuencia_RespiratoriaConsu = new javax.swing.JLabel();
        LabelSaturacion_OxigenoConsu = new javax.swing.JLabel();
        LabelTemperaturaConsu = new javax.swing.JLabel();
        LabelVerbalConsu = new javax.swing.JLabel();
        LabelOcularConsu = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        LabelMotoraConsu = new javax.swing.JLabel();
        LabelTotalConsu = new javax.swing.JLabel();
        LabelLlenado_CapilarConsu = new javax.swing.JLabel();
        LabelR_PupilarConsu = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        Panelbtn = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LabelAñoUltimaCita = new javax.swing.JLabel();
        LabelDocNombreMostrarDatos = new javax.swing.JLabel();
        LabelMotivoCita = new javax.swing.JLabel();
        LabelDiaUltimaCita = new javax.swing.JLabel();
        LabelMesUltimaCita = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        jSeparator34 = new javax.swing.JSeparator();
        jSeparator35 = new javax.swing.JSeparator();
        jSeparator36 = new javax.swing.JSeparator();
        jSeparator37 = new javax.swing.JSeparator();
        jSeparator38 = new javax.swing.JSeparator();
        jSeparator39 = new javax.swing.JSeparator();
        TxtAlergiasPersonales = new javax.swing.JTextField();
        TxtGinecologicoPersonales = new javax.swing.JTextField();
        TxtTraumatologicoPersonales = new javax.swing.JTextField();
        TxtVacunasPersonales = new javax.swing.JTextField();
        TxtClinicoPersonales = new javax.swing.JTextField();
        TxtFarmacologicoPersonales = new javax.swing.JTextField();
        TxtEnfermedadesPersonales = new javax.swing.JTextField();
        TxtCirugiasPersonales = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jLabel43 = new javax.swing.JLabel();
        ComboBoxParentesco = new javax.swing.JComboBox<>();
        TxtCirugiasFamiliares = new javax.swing.JTextField();
        TxtAlergiasFamiliares = new javax.swing.JTextField();
        TxtClinicoFamiliares = new javax.swing.JTextField();
        TxtTraumatologiaFamiliares = new javax.swing.JTextField();
        TxFarmacologiaFamiliares = new javax.swing.JTextField();
        TxtEnfermedadesFamiliares = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS GENERALES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Maiandra GD", 1, 21))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblFotoConsu.setToolTipText("");
        LblFotoConsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelRound1.add(LblFotoConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 170));
        panelRound1.add(LabelEdadConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 60, 20));

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel2.setText("Apellidos:");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel3.setText("Cedula:");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel4.setText("Correo:");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel5.setText("Celular:");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, 20));

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel7.setText("Dirección:");
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 81, 96, -1));
        panelRound1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 60, 10));
        panelRound1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 150, 10));
        panelRound1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 170, 10));
        panelRound1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 170, 10));
        panelRound1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 170, 10));
        panelRound1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 170, 10));
        panelRound1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 130, 10));
        panelRound1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 170, 10));

        TxtFechaNacimientoPaciente.setBorder(null);
        TxtFechaNacimientoPaciente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panelRound1.add(TxtFechaNacimientoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 130, 20));

        TxtNombrePaciente.setBorder(null);
        TxtNombrePaciente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panelRound1.add(TxtNombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 150, 20));

        TxtIdentificacionPaciente.setBorder(null);
        TxtIdentificacionPaciente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panelRound1.add(TxtIdentificacionPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 170, 20));

        TxtCelularPaciente.setBorder(null);
        TxtCelularPaciente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panelRound1.add(TxtCelularPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 170, 20));

        TxtSexoPaciente.setBorder(null);
        TxtSexoPaciente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panelRound1.add(TxtSexoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 170, 20));

        TxtCorreoPaciente.setBorder(null);
        TxtCorreoPaciente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panelRound1.add(TxtCorreoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 170, 20));

        TxtDireccionPaciente.setBorder(null);
        TxtDireccionPaciente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panelRound1.add(TxtDireccionPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 170, 20));
        panelRound1.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 160, 10));

        TxtApellidoPaciente.setBorder(null);
        TxtApellidoPaciente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panelRound1.add(TxtApellidoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 160, 20));

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel10.setText("Sexo:");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel12.setText("Nombres:");
        panelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jPanel3.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 710, 280));

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONSULTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        panelRound4.setRoundBottomLeft(10);
        panelRound4.setRoundBottomRight(10);
        panelRound4.setRoundTopLeft(10);
        panelRound4.setRoundTopRight(10);
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnNuevaConsulta.setBackground(new java.awt.Color(64, 172, 159));
        BtnNuevaConsulta.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        BtnNuevaConsulta.setText("Nueva Consulta");
        BtnNuevaConsulta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnNuevaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevaConsultaActionPerformed(evt);
            }
        });
        panelRound4.add(BtnNuevaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 180, 40));

        BtnGuardarCambiosDatos.setBackground(new java.awt.Color(64, 172, 159));
        BtnGuardarCambiosDatos.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        BtnGuardarCambiosDatos.setText("Guardar Cambios");
        BtnGuardarCambiosDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnGuardarCambiosDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarCambiosDatosActionPerformed(evt);
            }
        });
        panelRound4.add(BtnGuardarCambiosDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 140, 40));

        BtnEditarDatos.setBackground(new java.awt.Color(64, 172, 159));
        BtnEditarDatos.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        BtnEditarDatos.setText("Editar");
        BtnEditarDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelRound4.add(BtnEditarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 100, 40));

        jPanel3.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 710, 80));

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SIGNOS VITALES CONSULTAS ANTERIORES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        panelRound3.setRoundBottomLeft(10);
        panelRound3.setRoundBottomRight(10);
        panelRound3.setRoundTopLeft(10);
        panelRound3.setRoundTopRight(10);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelRound3.add(LabelPresion_ArterialConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 80, 22));
        panelRound3.add(LabelPesoConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 80, 22));
        panelRound3.add(LabelTallaConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 80, 22));
        panelRound3.add(LabelIndice_Masa_CorporalConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 80, 22));
        panelRound3.add(LabelFrecuencia_CardiacaConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 80, 22));
        panelRound3.add(LabelFrecuencia_RespiratoriaConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 80, 22));
        panelRound3.add(LabelSaturacion_OxigenoConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 80, 22));
        panelRound3.add(LabelTemperaturaConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 80, 22));
        panelRound3.add(LabelVerbalConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 80, 22));
        panelRound3.add(LabelOcularConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 80, 22));

        jLabel15.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel15.setText("Presion Arterial:");
        panelRound3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel16.setFont(new java.awt.Font("Maiandra GD", 1, 15)); // NOI18N
        jLabel16.setText("Peso:");
        panelRound3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jLabel17.setFont(new java.awt.Font("Maiandra GD", 1, 15)); // NOI18N
        jLabel17.setText("Talla:");
        panelRound3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        jLabel18.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel18.setText("Masa Corporal:");
        panelRound3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jLabel19.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel19.setText("Frecuencia Cardiaca:");
        panelRound3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel20.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        jLabel20.setText("Frecuencia Respiratoria:");
        panelRound3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel21.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel21.setText("Temperatura:");
        panelRound3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel22.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        jLabel22.setText("Saturacion de Oxigeno:");
        panelRound3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel41.setFont(new java.awt.Font("Maiandra GD", 1, 15)); // NOI18N
        jLabel41.setText("Ocular:");
        panelRound3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jLabel42.setFont(new java.awt.Font("Maiandra GD", 1, 15)); // NOI18N
        jLabel42.setText("Verbal:");
        panelRound3.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jLabel55.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        jLabel55.setText("Llenado Capilar:");
        panelRound3.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLabel56.setFont(new java.awt.Font("Maiandra GD", 1, 15)); // NOI18N
        jLabel56.setText("Total:");
        panelRound3.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel57.setFont(new java.awt.Font("Maiandra GD", 1, 15)); // NOI18N
        jLabel57.setText("Motora:");
        panelRound3.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));
        panelRound3.add(LabelMotoraConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 80, 22));
        panelRound3.add(LabelTotalConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 80, 22));
        panelRound3.add(LabelLlenado_CapilarConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 80, 22));
        panelRound3.add(LabelR_PupilarConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 80, 22));

        jLabel58.setFont(new java.awt.Font("Maiandra GD", 1, 13)); // NOI18N
        jLabel58.setText("Reacción Pupilar:");
        panelRound3.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));
        panelRound3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 80, 10));
        panelRound3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 80, 10));
        panelRound3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 80, 10));
        panelRound3.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 80, 10));
        panelRound3.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 80, 10));
        panelRound3.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 80, 10));
        panelRound3.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 80, 10));
        panelRound3.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 80, 10));
        panelRound3.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 80, 10));
        panelRound3.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 80, 10));
        panelRound3.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 80, 10));
        panelRound3.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 80, 10));
        panelRound3.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 80, 10));
        panelRound3.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 80, 10));

        jPanel3.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 710, 230));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANTECEDENTES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panelbtn.setBackground(new java.awt.Color(255, 255, 255));
        Panelbtn.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N
        Panelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelbtnMousePressed(evt);
            }
        });
        Panelbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("|");
        Panelbtn.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 20, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("|");
        Panelbtn.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 20, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("|");
        Panelbtn.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 20, 50));
        Panelbtn.add(LabelAñoUltimaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, 20));

        LabelDocNombreMostrarDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Panelbtn.add(LabelDocNombreMostrarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 260, 30));
        Panelbtn.add(LabelMotivoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 180, 30));
        Panelbtn.add(LabelDiaUltimaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 20));
        Panelbtn.add(LabelMesUltimaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 20));

        jPanel4.add(Panelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 400, 110));

        jTabbedPane1.setBackground(new java.awt.Color(64, 172, 159));
        jTabbedPane1.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANTECEDENTES PERSONALES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        jPanel1.setName("Antecedentes Personales"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel24.setText("Alergias:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, -1));

        jLabel27.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel27.setText("Clinico:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, -1));

        jLabel28.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel28.setText("Ginecologico:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, -1));

        jLabel29.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel29.setText("Traumatologico:");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, -1));

        jLabel30.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel30.setText("Farmacologico:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 100, -1));

        jLabel31.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel31.setText("Enfermedades:");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 99, -1));

        jLabel32.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel32.setText("Cirugias:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 80, -1));

        jLabel33.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel33.setText("Vacunas:");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 60, -1));
        jPanel1.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 360, 10));
        jPanel1.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 360, 10));
        jPanel1.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 360, 10));
        jPanel1.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 360, 10));
        jPanel1.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 360, 10));
        jPanel1.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 360, 10));
        jPanel1.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 360, 10));
        jPanel1.add(jSeparator39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 360, 10));

        TxtAlergiasPersonales.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxtAlergiasPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 360, 30));

        TxtGinecologicoPersonales.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxtGinecologicoPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 360, 30));

        TxtTraumatologicoPersonales.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxtTraumatologicoPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 360, 30));

        TxtVacunasPersonales.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxtVacunasPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 360, 30));

        TxtClinicoPersonales.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxtClinicoPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 360, 30));

        TxtFarmacologicoPersonales.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxtFarmacologicoPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 360, 30));

        TxtEnfermedadesPersonales.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxtEnfermedadesPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 360, 30));

        TxtCirugiasPersonales.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxtCirugiasPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 360, 30));

        jScrollPane3.setViewportView(jPanel1);

        jScrollPane4.setViewportView(jScrollPane3);

        jTabbedPane1.addTab("Antecedentes Personales", jScrollPane4);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANTECEDENTES FAMILIARES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel35.setText("Alergias:");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        jLabel36.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel36.setText("Clinico:");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 30));

        jLabel37.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel37.setText("Traumatologico:");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, -1));

        jLabel38.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel38.setText("Farmacologico:");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 120, -1));

        jLabel39.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel39.setText("Enfermedades:");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, 30));

        jLabel40.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel40.setText("Cirugias:");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 80, 30));
        jPanel2.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 360, 10));
        jPanel2.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 360, 10));
        jPanel2.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 360, 10));
        jPanel2.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 360, 10));
        jPanel2.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 360, 10));
        jPanel2.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 360, 10));

        jLabel43.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel43.setText("Parentesco");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        ComboBoxParentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otro", "Padres", "Hijos", "Abuelos", "Hermanos" }));
        jPanel2.add(ComboBoxParentesco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 280, -1));

        TxtCirugiasFamiliares.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(TxtCirugiasFamiliares, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 360, 30));

        TxtAlergiasFamiliares.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(TxtAlergiasFamiliares, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 360, 30));

        TxtClinicoFamiliares.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(TxtClinicoFamiliares, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 360, 30));

        TxtTraumatologiaFamiliares.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(TxtTraumatologiaFamiliares, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 360, 30));

        TxFarmacologiaFamiliares.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(TxFarmacologiaFamiliares, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 360, 30));

        TxtEnfermedadesFamiliares.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(TxtEnfermedadesFamiliares, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 360, 30));

        jScrollPane2.setViewportView(jPanel2);

        jTabbedPane1.addTab("Antecedentes Familiares", jScrollPane2);

        jPanel4.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 410, 420));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 470, 590));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1230, 640));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo Login.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1953, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNuevaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevaConsultaActionPerformed
        FrmNuevaConsulta pa = new FrmNuevaConsulta();
        pa.setVisible(true);
    }//GEN-LAST:event_BtnNuevaConsultaActionPerformed

    private void PanelbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelbtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelbtnMousePressed

    private void BtnGuardarCambiosDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarCambiosDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuardarCambiosDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditarDatos;
    private javax.swing.JButton BtnGuardarCambiosDatos;
    private javax.swing.JButton BtnNuevaConsulta;
    private javax.swing.JComboBox<String> ComboBoxParentesco;
    private javax.swing.JLabel LabelAñoUltimaCita;
    private javax.swing.JLabel LabelDiaUltimaCita;
    private javax.swing.JLabel LabelDocNombreMostrarDatos;
    private javax.swing.JLabel LabelEdadConsu;
    private javax.swing.JLabel LabelFrecuencia_CardiacaConsu;
    private javax.swing.JLabel LabelFrecuencia_RespiratoriaConsu;
    private javax.swing.JLabel LabelIndice_Masa_CorporalConsu;
    private javax.swing.JLabel LabelLlenado_CapilarConsu;
    private javax.swing.JLabel LabelMesUltimaCita;
    private javax.swing.JLabel LabelMotivoCita;
    private javax.swing.JLabel LabelMotoraConsu;
    private javax.swing.JLabel LabelOcularConsu;
    private javax.swing.JLabel LabelPesoConsu;
    private javax.swing.JLabel LabelPresion_ArterialConsu;
    private javax.swing.JLabel LabelR_PupilarConsu;
    private javax.swing.JLabel LabelSaturacion_OxigenoConsu;
    private javax.swing.JLabel LabelTallaConsu;
    private javax.swing.JLabel LabelTemperaturaConsu;
    private javax.swing.JLabel LabelTotalConsu;
    private javax.swing.JLabel LabelVerbalConsu;
    private javax.swing.JLabel LblFotoConsu;
    private javax.swing.JPanel Panelbtn;
    public javax.swing.JTextField TxFarmacologiaFamiliares;
    private javax.swing.JTextField TxtAlergiasFamiliares;
    private javax.swing.JTextField TxtAlergiasPersonales;
    private javax.swing.JTextField TxtApellidoPaciente;
    private javax.swing.JTextField TxtCelularPaciente;
    private javax.swing.JTextField TxtCirugiasFamiliares;
    private javax.swing.JTextField TxtCirugiasPersonales;
    private javax.swing.JTextField TxtClinicoFamiliares;
    private javax.swing.JTextField TxtClinicoPersonales;
    private javax.swing.JTextField TxtCorreoPaciente;
    private javax.swing.JTextField TxtDireccionPaciente;
    private javax.swing.JTextField TxtEnfermedadesFamiliares;
    private javax.swing.JTextField TxtEnfermedadesPersonales;
    private javax.swing.JTextField TxtFarmacologicoPersonales;
    private javax.swing.JTextField TxtFechaNacimientoPaciente;
    private javax.swing.JTextField TxtGinecologicoPersonales;
    private javax.swing.JTextField TxtIdentificacionPaciente;
    private javax.swing.JTextField TxtNombrePaciente;
    private javax.swing.JTextField TxtSexoPaciente;
    private javax.swing.JTextField TxtTraumatologiaFamiliares;
    private javax.swing.JTextField TxtTraumatologicoPersonales;
    private javax.swing.JTextField TxtVacunasPersonales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
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
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private Modelo.PanelRound panelRound1;
    private Modelo.PanelRound panelRound3;
    private Modelo.PanelRound panelRound4;
    // End of variables declaration//GEN-END:variables
}
