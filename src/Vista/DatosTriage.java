/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import controlador_Vist.DatosTriageDAO;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Jhony
 */
public class DatosTriage extends javax.swing.JPanel {

    DatosTriageDAO control;
    public DatosTriage() {
        initComponents();
        control= new DatosTriageDAO(this);
    }

    public JTabbedPane getjTabbedPaneles_() {
        return jTabbedPaneles_;
    }

    public void setjTabbedPaneles_(JTabbedPane jTabbedPaneles_) {
        this.jTabbedPaneles_ = jTabbedPaneles_;
    }

   
   
    public JRadioButton getBtnNoEmbarazo() {
        return btnNoEmbarazo;
    }

    public void setBtnNoEmbarazo(JRadioButton btnNoEmbarazo) {
        this.btnNoEmbarazo = btnNoEmbarazo;
    }
    
    
    

    public JTextArea getjTextAreaPiel_faneras() {
        return jTextAreaPiel_faneras;
    }

    public void setjTextAreaPiel_faneras(JTextArea jTextAreaPiel_faneras) {
        this.jTextAreaPiel_faneras = jTextAreaPiel_faneras;
    }
    

    public JRadioButton getBtnActivaInmunizacion() {
        return btnActivaInmunizacion;
    }

    public void setBtnActivaInmunizacion(JRadioButton btnActivaInmunizacion) {
        this.btnActivaInmunizacion = btnActivaInmunizacion;
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

    public JRadioButton getBtnRegular() {
        return btnRegular;
    }

    public void setBtnRegular(JRadioButton btnRegular) {
        this.btnRegular = btnRegular;
    }

    public JRadioButton getBtnSiEmbarazo() {
        return btnSiEmbarazo;
    }

    public void setBtnSiEmbarazo(JRadioButton btnSiEmbarazo) {
        this.btnSiEmbarazo = btnSiEmbarazo;
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

    public JTextField getTxt_DiasGestacion() {
        return txt_DiasGestacion;
    }

    public void setTxt_DiasGestacion(JTextField txt_DiasGestacion) {
        this.txt_DiasGestacion = txt_DiasGestacion;
    }

    public JTextField getTxt_Dismenorrea() {
        return txt_Dismenorrea;
    }

    public void setTxt_Dismenorrea(JTextField txt_Dismenorrea) {
        this.txt_Dismenorrea = txt_Dismenorrea;
    }

    public JTextField getTxt_Estatura() {
        return txt_Estatura;
    }

    public void setTxt_Estatura(JTextField txt_Estatura) {
        this.txt_Estatura = txt_Estatura;
    }

    public JTextField getTxt_FechaMenstruacion() {
        return txt_FechaMenstruacion;
    }

    public void setTxt_FechaMenstruacion(JTextField txt_FechaMenstruacion) {
        this.txt_FechaMenstruacion = txt_FechaMenstruacion;
    }

    public JTextField getTxt_FechaProbableParto() {
        return txt_FechaProbableParto;
    }

    public void setTxt_FechaProbableParto(JTextField txt_FechaProbableParto) {
        this.txt_FechaProbableParto = txt_FechaProbableParto;
    }

    public JTextField getTxt_FreCardiaca() {
        return txt_FreCardiaca;
    }

    public void setTxt_FreCardiaca(JTextField txt_FreCardiaca) {
        this.txt_FreCardiaca = txt_FreCardiaca;
    }

    public JTextField getTxt_FrecRespiratoria() {
        return txt_FrecRespiratoria;
    }

    public void setTxt_FrecRespiratoria(JTextField txt_FrecRespiratoria) {
        this.txt_FrecRespiratoria = txt_FrecRespiratoria;
    }

    public JTextField getTxt_InicioSexualidad() {
        return txt_InicioSexualidad;
    }

    public void setTxt_InicioSexualidad(JTextField txt_InicioSexualidad) {
        this.txt_InicioSexualidad = txt_InicioSexualidad;
    }

    public JTextField getTxt_LlenadoCapilar() {
        return txt_LlenadoCapilar;
    }

    public void setTxt_LlenadoCapilar(JTextField txt_LlenadoCapilar) {
        this.txt_LlenadoCapilar = txt_LlenadoCapilar;
    }

    public JTextField getTxt_MasaCorporal() {
        return txt_MasaCorporal;
    }

    public void setTxt_MasaCorporal(JTextField txt_MasaCorporal) {
        this.txt_MasaCorporal = txt_MasaCorporal;
    }

    public JTextField getTxt_Mastodinia() {
        return txt_Mastodinia;
    }

    public void setTxt_Mastodinia(JTextField txt_Mastodinia) {
        this.txt_Mastodinia = txt_Mastodinia;
    }

    public JTextField getTxt_Motora() {
        return txt_Motora;
    }

    public void setTxt_Motora(JTextField txt_Motora) {
        this.txt_Motora = txt_Motora;
    }

    public JTextField getTxt_Nivel_Prioridad() {
        return txt_Nivel_Prioridad;
    }

    public void setTxt_Nivel_Prioridad(JTextField txt_Nivel_Prioridad) {
        this.txt_Nivel_Prioridad = txt_Nivel_Prioridad;
    }

    public JTextField getTxt_NumeroControles() {
        return txt_NumeroControles;
    }

    public void setTxt_NumeroControles(JTextField txt_NumeroControles) {
        this.txt_NumeroControles = txt_NumeroControles;
    }

    public JTextField getTxt_NumeroPartos() {
        return txt_NumeroPartos;
    }

    public void setTxt_NumeroPartos(JTextField txt_NumeroPartos) {
        this.txt_NumeroPartos = txt_NumeroPartos;
    }

    public JTextField getTxt_NumerosCesarias() {
        return txt_NumerosCesarias;
    }

    public void setTxt_NumerosCesarias(JTextField txt_NumerosCesarias) {
        this.txt_NumerosCesarias = txt_NumerosCesarias;
    }

    public JTextField getTxt_Ocular() {
        return txt_Ocular;
    }

    public void setTxt_Ocular(JTextField txt_Ocular) {
        this.txt_Ocular = txt_Ocular;
    }

    public JTextField getTxt_ParejasSexuales() {
        return txt_ParejasSexuales;
    }

    public void setTxt_ParejasSexuales(JTextField txt_ParejasSexuales) {
        this.txt_ParejasSexuales = txt_ParejasSexuales;
    }

    public JTextField getTxt_Peso() {
        return txt_Peso;
    }

    public void setTxt_Peso(JTextField txt_Peso) {
        this.txt_Peso = txt_Peso;
    }

    public JTextField getTxt_PresionArterial() {
        return txt_PresionArterial;
    }

    public void setTxt_PresionArterial(JTextField txt_PresionArterial) {
        this.txt_PresionArterial = txt_PresionArterial;
    }

    public JTextField getTxt_ReaccionPupilar() {
        return txt_ReaccionPupilar;
    }

    public void setTxt_ReaccionPupilar(JTextField txt_ReaccionPupilar) {
        this.txt_ReaccionPupilar = txt_ReaccionPupilar;
    }

    public JTextField getTxt_Saturacion() {
        return txt_Saturacion;
    }

    public void setTxt_Saturacion(JTextField txt_Saturacion) {
        this.txt_Saturacion = txt_Saturacion;
    }

    public JTextField getTxt_SemanaGestacion() {
        return txt_SemanaGestacion;
    }

    public void setTxt_SemanaGestacion(JTextField txt_SemanaGestacion) {
        this.txt_SemanaGestacion = txt_SemanaGestacion;
    }

    public JTextField getTxt_Temperatura() {
        return txt_Temperatura;
    }

    public void setTxt_Temperatura(JTextField txt_Temperatura) {
        this.txt_Temperatura = txt_Temperatura;
    }

    public JTextField getTxt_Total() {
        return txt_Total;
    }

    public void setTxt_Total(JTextField txt_Total) {
        this.txt_Total = txt_Total;
    }

    public JTextField getTxt_Verbal() {
        return txt_Verbal;
    }

    public void setTxt_Verbal(JTextField txt_Verbal) {
        this.txt_Verbal = txt_Verbal;
    }

    public JTextField getTxt_abortos() {
        return txt_abortos;
    }

    public void setTxt_abortos(JTextField txt_abortos) {
        this.txt_abortos = txt_abortos;
    }

    public JTextField getTxt_ciclos() {
        return txt_ciclos;
    }

    public void setTxt_ciclos(JTextField txt_ciclos) {
        this.txt_ciclos = txt_ciclos;
    }

    public JTextField getTxt_gravides() {
        return txt_gravides;
    }

    public void setTxt_gravides(JTextField txt_gravides) {
        this.txt_gravides = txt_gravides;
    }

    public JTextField getTxt_menarca() {
        return txt_menarca;
    }

    public void setTxt_menarca(JTextField txt_menarca) {
        this.txt_menarca = txt_menarca;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTabbedPaneles_ = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
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
        jLabel12 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextAreaPiel_faneras = new javax.swing.JTextArea();
        txt_Nivel_Prioridad = new javax.swing.JTextField();
        jSeparator49 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        lblSatOxigeno2 = new javax.swing.JLabel();
        lblEstatura2 = new javax.swing.JLabel();
        lblPeso2 = new javax.swing.JLabel();
        lblTemperatura2 = new javax.swing.JLabel();
        lblFrecRespiratoria2 = new javax.swing.JLabel();
        lblFreCardiaca2 = new javax.swing.JLabel();
        jSeparator40 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        txt_Temperatura = new javax.swing.JTextField();
        txt_Estatura = new javax.swing.JTextField();
        txt_Peso = new javax.swing.JTextField();
        txt_MasaCorporal = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator41 = new javax.swing.JSeparator();
        jSeparator42 = new javax.swing.JSeparator();
        jSeparator43 = new javax.swing.JSeparator();
        txt_PresionArterial = new javax.swing.JTextField();
        txt_FrecRespiratoria = new javax.swing.JTextField();
        txt_FreCardiaca = new javax.swing.JTextField();
        txt_Saturacion = new javax.swing.JTextField();
        jSeparator44 = new javax.swing.JSeparator();
        jSeparator45 = new javax.swing.JSeparator();
        jSeparator46 = new javax.swing.JSeparator();
        jSeparator47 = new javax.swing.JSeparator();
        txt_LlenadoCapilar = new javax.swing.JTextField();
        txt_ReaccionPupilar = new javax.swing.JTextField();
        jSeparator48 = new javax.swing.JSeparator();
        jSeparator51 = new javax.swing.JSeparator();
        txt_Ocular = new javax.swing.JTextField();
        jSeparator52 = new javax.swing.JSeparator();
        txt_Motora = new javax.swing.JTextField();
        jSeparator53 = new javax.swing.JSeparator();
        jSeparator54 = new javax.swing.JSeparator();
        jSeparator55 = new javax.swing.JSeparator();
        txt_Verbal = new javax.swing.JTextField();
        txt_Total = new javax.swing.JTextField();
        jSeparator56 = new javax.swing.JSeparator();
        jSeparator57 = new javax.swing.JSeparator();
        jSeparator58 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jSeparator22 = new javax.swing.JSeparator();
        lblFrecRespiratoria3 = new javax.swing.JLabel();
        lblFrecRespiratoria4 = new javax.swing.JLabel();
        lblFrecRespiratoria5 = new javax.swing.JLabel();
        lblFrecRespiratoria6 = new javax.swing.JLabel();
        lblFrecRespiratoria7 = new javax.swing.JLabel();
        lblFrecRespiratoria8 = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        btnIrregular = new javax.swing.JRadioButton();
        btnRegular = new javax.swing.JRadioButton();
        txt_ciclos = new javax.swing.JTextField();
        txt_ParejasSexuales = new javax.swing.JTextField();
        txt_menarca = new javax.swing.JTextField();
        txt_InicioSexualidad = new javax.swing.JTextField();
        txt_FechaMenstruacion = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        jPanel15 = new javax.swing.JPanel();
        lblFrecRespiratoria9 = new javax.swing.JLabel();
        lblFrecRespiratoria10 = new javax.swing.JLabel();
        lblFrecRespiratoria11 = new javax.swing.JLabel();
        lblFrecRespiratoria12 = new javax.swing.JLabel();
        jSeparator35 = new javax.swing.JSeparator();
        jSeparator36 = new javax.swing.JSeparator();
        jSeparator37 = new javax.swing.JSeparator();
        jSeparator38 = new javax.swing.JSeparator();
        lblFrecRespiratoria20 = new javax.swing.JLabel();
        jSeparator50 = new javax.swing.JSeparator();
        lblFrecRespiratoria13 = new javax.swing.JLabel();
        jSeparator59 = new javax.swing.JSeparator();
        txt_gravides = new javax.swing.JTextField();
        txt_abortos = new javax.swing.JTextField();
        txt_NumeroPartos = new javax.swing.JTextField();
        txt_NumerosCesarias = new javax.swing.JTextField();
        txt_Mastodinia = new javax.swing.JTextField();
        txt_Dismenorrea = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        lblFrecRespiratoria1 = new javax.swing.JLabel();
        lblFrecRespiratoria14 = new javax.swing.JLabel();
        lblFrecRespiratoria15 = new javax.swing.JLabel();
        lblFrecRespiratoria16 = new javax.swing.JLabel();
        lblFrecRespiratoria17 = new javax.swing.JLabel();
        jSeparator60 = new javax.swing.JSeparator();
        jSeparator61 = new javax.swing.JSeparator();
        jSeparator62 = new javax.swing.JSeparator();
        jSeparator63 = new javax.swing.JSeparator();
        jSeparator64 = new javax.swing.JSeparator();
        btnSiEmbarazo = new javax.swing.JRadioButton();
        lblFrecRespiratoria19 = new javax.swing.JLabel();
        btnActivaInmunizacion = new javax.swing.JRadioButton();
        btnPasivaInmunizacion = new javax.swing.JRadioButton();
        txt_NumeroControles = new javax.swing.JTextField();
        txt_DiasGestacion = new javax.swing.JTextField();
        txt_SemanaGestacion = new javax.swing.JTextField();
        txt_FechaProbableParto = new javax.swing.JTextField();
        btnNoEmbarazo = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPaneles_.setBackground(new java.awt.Color(64, 172, 159));
        jTabbedPaneles_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cuerpo_1.png"))); // NOI18N
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 170, 400));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Cabeza");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Cuello");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 60, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Torax");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Corazon");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Abdomen");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("R_Inguinal");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("M_Inferior");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("M_superior");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, 30));

        txtAreaCabeza.setEditable(false);
        txtAreaCabeza.setColumns(20);
        txtAreaCabeza.setRows(5);
        txtAreaCabeza.setAutoscrolls(false);
        txtAreaCabeza.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(txtAreaCabeza);

        jPanel8.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, 50));

        jScrollPane6.setRowHeaderView(null);
        jScrollPane6.setViewportView(null);

        txtAreaCuello.setEditable(false);
        txtAreaCuello.setColumns(20);
        txtAreaCuello.setRows(5);
        txtAreaCuello.setAutoscrolls(false);
        txtAreaCuello.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtAreaCuello.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAreaCuello.setDragEnabled(true);
        txtAreaCuello.setHighlighter(null);
        txtAreaCuello.setKeymap(null);
        jScrollPane6.setViewportView(txtAreaCuello);

        jPanel8.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 250, 50));

        txtAreaTorax.setEditable(false);
        txtAreaTorax.setColumns(20);
        txtAreaTorax.setRows(5);
        txtAreaTorax.setAutoscrolls(false);
        txtAreaTorax.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane7.setViewportView(txtAreaTorax);

        jPanel8.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 250, 50));

        txtAreaCorazon.setEditable(false);
        txtAreaCorazon.setColumns(20);
        txtAreaCorazon.setRows(5);
        txtAreaCorazon.setAutoscrolls(false);
        txtAreaCorazon.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane8.setViewportView(txtAreaCorazon);

        jPanel8.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 250, 50));

        txtAreaAbdomen.setEditable(false);
        txtAreaAbdomen.setColumns(20);
        txtAreaAbdomen.setRows(5);
        txtAreaAbdomen.setAutoscrolls(false);
        txtAreaAbdomen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane9.setViewportView(txtAreaAbdomen);

        jPanel8.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 260, 50));

        txtAreaR_Inguinal.setEditable(false);
        txtAreaR_Inguinal.setColumns(20);
        txtAreaR_Inguinal.setRows(5);
        txtAreaR_Inguinal.setAutoscrolls(false);
        txtAreaR_Inguinal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane10.setViewportView(txtAreaR_Inguinal);

        jPanel8.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 260, 50));

        txtAreaM_Superior.setEditable(false);
        txtAreaM_Superior.setColumns(20);
        txtAreaM_Superior.setRows(5);
        txtAreaM_Superior.setAutoscrolls(false);
        txtAreaM_Superior.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane11.setViewportView(txtAreaM_Superior);

        jPanel8.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 260, 50));

        txtAreaM_Inferior.setEditable(false);
        txtAreaM_Inferior.setColumns(20);
        txtAreaM_Inferior.setRows(5);
        txtAreaM_Inferior.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane12.setViewportView(txtAreaM_Inferior);

        jPanel8.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 300, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Nivel de prioridad:");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 180, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setText("Piel y faneras");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, 30));

        jTextAreaPiel_faneras.setEditable(false);
        jTextAreaPiel_faneras.setColumns(20);
        jTextAreaPiel_faneras.setRows(5);
        jTextAreaPiel_faneras.setAutoscrolls(false);
        jTextAreaPiel_faneras.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane13.setViewportView(jTextAreaPiel_faneras);

        jPanel8.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 260, 50));

        txt_Nivel_Prioridad.setEditable(false);
        txt_Nivel_Prioridad.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        txt_Nivel_Prioridad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nivel_Prioridad.setBorder(null);
        txt_Nivel_Prioridad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel8.add(txt_Nivel_Prioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 220, 30));
        jPanel8.add(jSeparator49, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 220, 10));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 920));

        jTabbedPaneles_.addTab("Examen Fìsico", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOTAS DE PADECIMIENTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSatOxigeno2.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        lblSatOxigeno2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cuidado-de-la-salud.png"))); // NOI18N
        lblSatOxigeno2.setText("Saturación de Oxígeno:");
        jPanel23.add(lblSatOxigeno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 230, -1));

        lblEstatura2.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        lblEstatura2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Estatura.png"))); // NOI18N
        lblEstatura2.setText("Estarura:");
        jPanel23.add(lblEstatura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, -1));

        lblPeso2.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        lblPeso2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Peso.png"))); // NOI18N
        lblPeso2.setText("Peso:");
        jPanel23.add(lblPeso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 230, -1));

        lblTemperatura2.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        lblTemperatura2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/control-de-temperatura.png"))); // NOI18N
        lblTemperatura2.setText("Temperatura:");
        jPanel23.add(lblTemperatura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 230, -1));

        lblFrecRespiratoria2.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        lblFrecRespiratoria2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Frecuenca respiratoria.png"))); // NOI18N
        lblFrecRespiratoria2.setText("Frecuencia Respiratoria:");
        jPanel23.add(lblFrecRespiratoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 230, -1));

        lblFreCardiaca2.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        lblFreCardiaca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/monitor-de-pulso-cardiaco.png"))); // NOI18N
        lblFreCardiaca2.setText("Frecuencia Cardiaca:");
        jPanel23.add(lblFreCardiaca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 230, -1));
        jPanel23.add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 650, 20));

        jLabel17.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/presion-arterial.png"))); // NOI18N
        jLabel17.setText("Presion Arterial:");
        jPanel23.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 230, -1));

        jLabel20.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/indice-de-masa-corporal (1).png"))); // NOI18N
        jLabel20.setText("Masa Corporal:");
        jPanel23.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 230, -1));

        jLabel63.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/formulario-de-llenado.png"))); // NOI18N
        jLabel63.setText("Llenado Capilar:");
        jPanel23.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 230, -1));

        jLabel64.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/totalmente.png"))); // NOI18N
        jLabel64.setText("Total:");
        jPanel23.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 464, 170, 30));

        jLabel45.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/discurso.png"))); // NOI18N
        jLabel45.setText("Verbal:");
        jPanel23.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 140, -1));

        jLabel46.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/reconocimiento-ocular.png"))); // NOI18N
        jLabel46.setText("Ocular:");
        jPanel23.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 130, -1));

        jLabel27.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salud-mental.png"))); // NOI18N
        jPanel23.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 90, 30));

        jLabel65.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pupila-del-ojo.png"))); // NOI18N
        jLabel65.setText("Reacción Pupilar:");
        jPanel23.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 230, -1));

        jLabel66.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salud.png"))); // NOI18N
        jLabel66.setText("Motora:");
        jPanel23.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 130, -1));

        txt_Temperatura.setEditable(false);
        txt_Temperatura.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txt_Temperatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Temperatura.setBorder(null);
        txt_Temperatura.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_Temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TemperaturaActionPerformed(evt);
            }
        });
        jPanel23.add(txt_Temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 180, 20));

        txt_Estatura.setEditable(false);
        txt_Estatura.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txt_Estatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Estatura.setBorder(null);
        txt_Estatura.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel23.add(txt_Estatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 160, 20));

        txt_Peso.setEditable(false);
        txt_Peso.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txt_Peso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Peso.setBorder(null);
        txt_Peso.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel23.add(txt_Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 180, 20));

        txt_MasaCorporal.setEditable(false);
        txt_MasaCorporal.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txt_MasaCorporal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_MasaCorporal.setBorder(null);
        txt_MasaCorporal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel23.add(txt_MasaCorporal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 160, 20));
        jPanel23.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 180, 10));
        jPanel23.add(jSeparator41, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 160, 10));
        jPanel23.add(jSeparator42, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 180, 10));
        jPanel23.add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 160, 10));

        txt_PresionArterial.setEditable(false);
        txt_PresionArterial.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txt_PresionArterial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PresionArterial.setBorder(null);
        txt_PresionArterial.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_PresionArterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PresionArterialActionPerformed(evt);
            }
        });
        jPanel23.add(txt_PresionArterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 180, 20));

        txt_FrecRespiratoria.setEditable(false);
        txt_FrecRespiratoria.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txt_FrecRespiratoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_FrecRespiratoria.setBorder(null);
        txt_FrecRespiratoria.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel23.add(txt_FrecRespiratoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 160, 20));

        txt_FreCardiaca.setEditable(false);
        txt_FreCardiaca.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txt_FreCardiaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_FreCardiaca.setBorder(null);
        txt_FreCardiaca.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel23.add(txt_FreCardiaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 180, 20));

        txt_Saturacion.setEditable(false);
        txt_Saturacion.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txt_Saturacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Saturacion.setBorder(null);
        txt_Saturacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel23.add(txt_Saturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 160, 20));
        jPanel23.add(jSeparator44, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 180, 10));
        jPanel23.add(jSeparator45, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 160, 10));
        jPanel23.add(jSeparator46, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 180, 10));
        jPanel23.add(jSeparator47, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 160, 10));

        txt_LlenadoCapilar.setEditable(false);
        txt_LlenadoCapilar.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txt_LlenadoCapilar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_LlenadoCapilar.setBorder(null);
        txt_LlenadoCapilar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel23.add(txt_LlenadoCapilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 160, 20));

        txt_ReaccionPupilar.setEditable(false);
        txt_ReaccionPupilar.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txt_ReaccionPupilar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ReaccionPupilar.setBorder(null);
        txt_ReaccionPupilar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel23.add(txt_ReaccionPupilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 180, 20));
        jPanel23.add(jSeparator48, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 180, 10));
        jPanel23.add(jSeparator51, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 160, 10));

        txt_Ocular.setEditable(false);
        txt_Ocular.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txt_Ocular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Ocular.setBorder(null);
        txt_Ocular.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_Ocular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_OcularActionPerformed(evt);
            }
        });
        jPanel23.add(txt_Ocular, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 160, 20));
        jPanel23.add(jSeparator52, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 160, 10));

        txt_Motora.setEditable(false);
        txt_Motora.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txt_Motora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Motora.setBorder(null);
        txt_Motora.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel23.add(txt_Motora, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 160, 20));
        jPanel23.add(jSeparator53, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 160, 10));
        jPanel23.add(jSeparator54, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 160, 10));
        jPanel23.add(jSeparator55, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 140, 10));

        txt_Verbal.setEditable(false);
        txt_Verbal.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        txt_Verbal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Verbal.setBorder(null);
        txt_Verbal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel23.add(txt_Verbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 160, 20));

        txt_Total.setEditable(false);
        txt_Total.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        txt_Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Total.setBorder(null);
        txt_Total.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TotalActionPerformed(evt);
            }
        });
        jPanel23.add(txt_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 140, 20));
        jPanel23.add(jSeparator56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 650, 10));
        jPanel23.add(jSeparator57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 660, 10));
        jPanel23.add(jSeparator58, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 370, 660, 10));

        jLabel28.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Glasgow");
        jPanel23.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 160, 30));

        jLabel29.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salud-mental.png"))); // NOI18N
        jPanel23.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 90, 30));

        jPanel2.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 650, 520));

        jTabbedPaneles_.addTab("Padecimiento", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel14.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 200, 10));

        lblFrecRespiratoria3.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria3.setText("Menarca:");
        jPanel14.add(lblFrecRespiratoria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 20));

        lblFrecRespiratoria4.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria4.setText("Ciclos:");
        jPanel14.add(lblFrecRespiratoria4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 50, 20));

        lblFrecRespiratoria5.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria5.setText("Fecha Última Menstruación:");
        jPanel14.add(lblFrecRespiratoria5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, 20));

        lblFrecRespiratoria6.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria6.setText("Regularidad:");
        jPanel14.add(lblFrecRespiratoria6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 20));

        lblFrecRespiratoria7.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria7.setText("Inicio de Vida Sexual Activa:");
        jPanel14.add(lblFrecRespiratoria7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, 20));

        lblFrecRespiratoria8.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria8.setText("Número Parejas Sexuales:");
        jPanel14.add(lblFrecRespiratoria8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 200, 20));
        jPanel14.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 200, 10));
        jPanel14.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 180, 10));
        jPanel14.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 70, 10));
        jPanel14.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 90, 10));

        buttonGroup1.add(btnIrregular);
        btnIrregular.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnIrregular.setText("Irregular");
        btnIrregular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrregularActionPerformed(evt);
            }
        });
        jPanel14.add(btnIrregular, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        buttonGroup1.add(btnRegular);
        btnRegular.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnRegular.setText("Regular");
        jPanel14.add(btnRegular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        txt_ciclos.setEditable(false);
        txt_ciclos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_ciclos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ciclos.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_ciclos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ciclosActionPerformed(evt);
            }
        });
        jPanel14.add(txt_ciclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 210, 30));

        txt_ParejasSexuales.setEditable(false);
        txt_ParejasSexuales.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_ParejasSexuales.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ParejasSexuales.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_ParejasSexuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ParejasSexualesActionPerformed(evt);
            }
        });
        jPanel14.add(txt_ParejasSexuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 90, 30));

        txt_menarca.setEditable(false);
        txt_menarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_menarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_menarca.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_menarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_menarcaActionPerformed(evt);
            }
        });
        jPanel14.add(txt_menarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 14, 210, -1));

        txt_InicioSexualidad.setEditable(false);
        txt_InicioSexualidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_InicioSexualidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_InicioSexualidad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_InicioSexualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_InicioSexualidadActionPerformed(evt);
            }
        });
        jPanel14.add(txt_InicioSexualidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 90, 30));

        txt_FechaMenstruacion.setEditable(false);
        txt_FechaMenstruacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_FechaMenstruacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_FechaMenstruacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_FechaMenstruacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FechaMenstruacionActionPerformed(evt);
            }
        });
        jPanel14.add(txt_FechaMenstruacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 210, 30));
        jPanel14.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, 10));

        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 320, 280));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFrecRespiratoria9.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria9.setText("Abortos:");
        jPanel15.add(lblFrecRespiratoria9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 20));

        lblFrecRespiratoria10.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria10.setText("Número De Partos:");
        jPanel15.add(lblFrecRespiratoria10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, 20));

        lblFrecRespiratoria11.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria11.setText("Número De Cesarias:");
        jPanel15.add(lblFrecRespiratoria11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, 20));

        lblFrecRespiratoria12.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria12.setText("Mastodinia:");
        jPanel15.add(lblFrecRespiratoria12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, 20));
        jPanel15.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 210, 10));
        jPanel15.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 10));
        jPanel15.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 130, 10));
        jPanel15.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 150, 10));

        lblFrecRespiratoria20.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria20.setText("Dismenorrea:");
        jPanel15.add(lblFrecRespiratoria20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 110, 20));
        jPanel15.add(jSeparator50, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 150, 10));

        lblFrecRespiratoria13.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria13.setText("Gravides:");
        jPanel15.add(lblFrecRespiratoria13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 20));
        jPanel15.add(jSeparator59, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 200, 10));

        txt_gravides.setEditable(false);
        txt_gravides.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_gravides.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_gravides.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_gravides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gravidesActionPerformed(evt);
            }
        });
        jPanel15.add(txt_gravides, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 200, 30));

        txt_abortos.setEditable(false);
        txt_abortos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_abortos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_abortos.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_abortos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_abortosActionPerformed(evt);
            }
        });
        jPanel15.add(txt_abortos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 210, 30));

        txt_NumeroPartos.setEditable(false);
        txt_NumeroPartos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_NumeroPartos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NumeroPartos.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_NumeroPartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NumeroPartosActionPerformed(evt);
            }
        });
        jPanel15.add(txt_NumeroPartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 130, 30));

        txt_NumerosCesarias.setEditable(false);
        txt_NumerosCesarias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_NumerosCesarias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NumerosCesarias.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_NumerosCesarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NumerosCesariasActionPerformed(evt);
            }
        });
        jPanel15.add(txt_NumerosCesarias, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 130, 30));

        txt_Mastodinia.setEditable(false);
        txt_Mastodinia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Mastodinia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Mastodinia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_Mastodinia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MastodiniaActionPerformed(evt);
            }
        });
        jPanel15.add(txt_Mastodinia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 204, 150, -1));

        txt_Dismenorrea.setEditable(false);
        txt_Dismenorrea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Dismenorrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Dismenorrea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_Dismenorrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DismenorreaActionPerformed(evt);
            }
        });
        jPanel15.add(txt_Dismenorrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 150, 30));

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 330, -1));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFrecRespiratoria1.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria1.setText("Inmunizaciones:");
        jPanel16.add(lblFrecRespiratoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, 20));

        lblFrecRespiratoria14.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria14.setText("Fecha Probable de Parto:");
        jPanel16.add(lblFrecRespiratoria14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, 20));

        lblFrecRespiratoria15.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria15.setText("Semanas De Gestacion:");
        jPanel16.add(lblFrecRespiratoria15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 20));

        lblFrecRespiratoria16.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria16.setText("Dias De Gestacion;");
        jPanel16.add(lblFrecRespiratoria16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, 20));

        lblFrecRespiratoria17.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria17.setText("Número De Controles:");
        jPanel16.add(lblFrecRespiratoria17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 20));
        jPanel16.add(jSeparator60, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 160, 10));
        jPanel16.add(jSeparator61, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 170, 10));
        jPanel16.add(jSeparator62, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 170, 10));
        jPanel16.add(jSeparator63, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 170, 10));
        jPanel16.add(jSeparator64, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 200, 10));

        buttonGroup2.add(btnSiEmbarazo);
        btnSiEmbarazo.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnSiEmbarazo.setText("Si");
        btnSiEmbarazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiEmbarazoActionPerformed(evt);
            }
        });
        jPanel16.add(btnSiEmbarazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 20));

        lblFrecRespiratoria19.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblFrecRespiratoria19.setText("¿Se encuentra actualmente embarazada?");
        jPanel16.add(lblFrecRespiratoria19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 340, 30));

        buttonGroup3.add(btnActivaInmunizacion);
        btnActivaInmunizacion.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnActivaInmunizacion.setText("Activa");
        jPanel16.add(btnActivaInmunizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 90, 20));

        buttonGroup3.add(btnPasivaInmunizacion);
        btnPasivaInmunizacion.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnPasivaInmunizacion.setText("Pasiva");
        jPanel16.add(btnPasivaInmunizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 90, -1));

        txt_NumeroControles.setEditable(false);
        txt_NumeroControles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_NumeroControles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NumeroControles.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_NumeroControles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NumeroControlesActionPerformed(evt);
            }
        });
        jPanel16.add(txt_NumeroControles, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 170, -1));

        txt_DiasGestacion.setEditable(false);
        txt_DiasGestacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_DiasGestacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_DiasGestacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_DiasGestacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DiasGestacionActionPerformed(evt);
            }
        });
        jPanel16.add(txt_DiasGestacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 160, -1));

        txt_SemanaGestacion.setEditable(false);
        txt_SemanaGestacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_SemanaGestacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_SemanaGestacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_SemanaGestacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SemanaGestacionActionPerformed(evt);
            }
        });
        jPanel16.add(txt_SemanaGestacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 170, 30));

        txt_FechaProbableParto.setEditable(false);
        txt_FechaProbableParto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_FechaProbableParto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_FechaProbableParto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_FechaProbableParto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FechaProbablePartoActionPerformed(evt);
            }
        });
        jPanel16.add(txt_FechaProbableParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 160, 30));

        buttonGroup2.add(btnNoEmbarazo);
        btnNoEmbarazo.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnNoEmbarazo.setText("No");
        btnNoEmbarazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoEmbarazoActionPerformed(evt);
            }
        });
        jPanel16.add(btnNoEmbarazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, 20));

        jPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 450, 250));

        jTabbedPaneles_.addTab("Emergencia Obstetrica", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneles_)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneles_, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TemperaturaActionPerformed

    private void txt_PresionArterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PresionArterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PresionArterialActionPerformed

    private void txt_OcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_OcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_OcularActionPerformed

    private void txt_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TotalActionPerformed

    private void btnIrregularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrregularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIrregularActionPerformed

    private void txt_ciclosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ciclosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ciclosActionPerformed

    private void txt_ParejasSexualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ParejasSexualesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ParejasSexualesActionPerformed

    private void txt_menarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_menarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_menarcaActionPerformed

    private void txt_InicioSexualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_InicioSexualidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_InicioSexualidadActionPerformed

    private void txt_gravidesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gravidesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_gravidesActionPerformed

    private void txt_abortosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_abortosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_abortosActionPerformed

    private void txt_NumeroPartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NumeroPartosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NumeroPartosActionPerformed

    private void txt_NumerosCesariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NumerosCesariasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NumerosCesariasActionPerformed

    private void txt_MastodiniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MastodiniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MastodiniaActionPerformed

    private void txt_DismenorreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DismenorreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DismenorreaActionPerformed

    private void txt_NumeroControlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NumeroControlesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NumeroControlesActionPerformed

    private void txt_DiasGestacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DiasGestacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DiasGestacionActionPerformed

    private void txt_SemanaGestacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SemanaGestacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SemanaGestacionActionPerformed

    private void txt_FechaProbablePartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FechaProbablePartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FechaProbablePartoActionPerformed

    private void txt_FechaMenstruacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FechaMenstruacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FechaMenstruacionActionPerformed

    private void btnSiEmbarazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiEmbarazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiEmbarazoActionPerformed

    private void btnNoEmbarazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoEmbarazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNoEmbarazoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnActivaInmunizacion;
    private javax.swing.JRadioButton btnIrregular;
    private javax.swing.JRadioButton btnNoEmbarazo;
    private javax.swing.JRadioButton btnPasivaInmunizacion;
    private javax.swing.JRadioButton btnRegular;
    private javax.swing.JRadioButton btnSiEmbarazo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator45;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator47;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JSeparator jSeparator49;
    private javax.swing.JSeparator jSeparator50;
    private javax.swing.JSeparator jSeparator51;
    private javax.swing.JSeparator jSeparator52;
    private javax.swing.JSeparator jSeparator53;
    private javax.swing.JSeparator jSeparator54;
    private javax.swing.JSeparator jSeparator55;
    private javax.swing.JSeparator jSeparator56;
    private javax.swing.JSeparator jSeparator57;
    private javax.swing.JSeparator jSeparator58;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JSeparator jSeparator60;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JSeparator jSeparator64;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPaneles_;
    private javax.swing.JTextArea jTextAreaPiel_faneras;
    private javax.swing.JLabel lblEstatura2;
    private javax.swing.JLabel lblFreCardiaca2;
    private javax.swing.JLabel lblFrecRespiratoria1;
    private javax.swing.JLabel lblFrecRespiratoria10;
    private javax.swing.JLabel lblFrecRespiratoria11;
    private javax.swing.JLabel lblFrecRespiratoria12;
    private javax.swing.JLabel lblFrecRespiratoria13;
    private javax.swing.JLabel lblFrecRespiratoria14;
    private javax.swing.JLabel lblFrecRespiratoria15;
    private javax.swing.JLabel lblFrecRespiratoria16;
    private javax.swing.JLabel lblFrecRespiratoria17;
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
    private javax.swing.JLabel lblPeso2;
    private javax.swing.JLabel lblSatOxigeno2;
    private javax.swing.JLabel lblTemperatura2;
    private javax.swing.JTextArea txtAreaAbdomen;
    private javax.swing.JTextArea txtAreaCabeza;
    private javax.swing.JTextArea txtAreaCorazon;
    private javax.swing.JTextArea txtAreaCuello;
    private javax.swing.JTextArea txtAreaM_Inferior;
    private javax.swing.JTextArea txtAreaM_Superior;
    private javax.swing.JTextArea txtAreaR_Inguinal;
    private javax.swing.JTextArea txtAreaTorax;
    private javax.swing.JTextField txt_DiasGestacion;
    private javax.swing.JTextField txt_Dismenorrea;
    private javax.swing.JTextField txt_Estatura;
    private javax.swing.JTextField txt_FechaMenstruacion;
    private javax.swing.JTextField txt_FechaProbableParto;
    private javax.swing.JTextField txt_FreCardiaca;
    private javax.swing.JTextField txt_FrecRespiratoria;
    private javax.swing.JTextField txt_InicioSexualidad;
    private javax.swing.JTextField txt_LlenadoCapilar;
    private javax.swing.JTextField txt_MasaCorporal;
    private javax.swing.JTextField txt_Mastodinia;
    private javax.swing.JTextField txt_Motora;
    private javax.swing.JTextField txt_Nivel_Prioridad;
    private javax.swing.JTextField txt_NumeroControles;
    private javax.swing.JTextField txt_NumeroPartos;
    private javax.swing.JTextField txt_NumerosCesarias;
    private javax.swing.JTextField txt_Ocular;
    private javax.swing.JTextField txt_ParejasSexuales;
    private javax.swing.JTextField txt_Peso;
    private javax.swing.JTextField txt_PresionArterial;
    private javax.swing.JTextField txt_ReaccionPupilar;
    private javax.swing.JTextField txt_Saturacion;
    private javax.swing.JTextField txt_SemanaGestacion;
    private javax.swing.JTextField txt_Temperatura;
    private javax.swing.JTextField txt_Total;
    private javax.swing.JTextField txt_Verbal;
    private javax.swing.JTextField txt_abortos;
    private javax.swing.JTextField txt_ciclos;
    private javax.swing.JTextField txt_gravides;
    private javax.swing.JTextField txt_menarca;
    // End of variables declaration//GEN-END:variables
}
