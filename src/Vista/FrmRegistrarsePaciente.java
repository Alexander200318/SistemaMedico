/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import controlador_Vist.Registro_PacienteDAO;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author alexa
 */
public class FrmRegistrarsePaciente extends javax.swing.JPanel {

    
    Registro_PacienteDAO control;
    public FrmRegistrarsePaciente() {
        initComponents();
        control=new Registro_PacienteDAO(this);    
        

        
    }

    public JComboBox<String> getCb_Parentesco() {
        return Cb_Parentesco;
    }

    public void setCb_Parentesco(JComboBox<String> Cb_Parentesco) {
        this.Cb_Parentesco = Cb_Parentesco;
    }
    
    
    
    
    
    

    public JComboBox<String> getCbx_Carreras() {
        return Cbx_Carreras;
    }

    public void setCbx_Carreras(JComboBox<String> Cbx_Carreras) {
        this.Cbx_Carreras = Cbx_Carreras;
    }

    public JComboBox<String> getCbx_estado_civil() {
        return Cbx_estado_civil;
    }

    public void setCbx_estado_civil(JComboBox<String> Cbx_estado_civil) {
        this.Cbx_estado_civil = Cbx_estado_civil;
    }

    public JComboBox<String> getCbx_tipo_sangre() {
        return Cbx_tipo_sangre;
    }

    public void setCbx_tipo_sangre(JComboBox<String> Cbx_tipo_sangre) {
        this.Cbx_tipo_sangre = Cbx_tipo_sangre;
    }
    
    
    
    
    
    
    
    
    
    

    public JRadioButton getRbn_Femenino() {
        return Rbn_Femenino;
    }

    public void setRbn_Femenino(JRadioButton Rbn_Femenino) {
        this.Rbn_Femenino = Rbn_Femenino;
    }

    public JRadioButton getRbn_Masculino() {
        return Rbn_Masculino;
    }

    public void setRbn_Masculino(JRadioButton Rbn_Masculino) {
        this.Rbn_Masculino = Rbn_Masculino;
    }
    


    public JTextField getTxt_CarnetConadis() {
        return Txt_CarnetConadis;
    }

    public void setTxt_CarnetConadis(JTextField Txt_CarnetConadis) {
        this.Txt_CarnetConadis = Txt_CarnetConadis;
    }
    
    
    

    public JButton getBtn_guardar_Familiar() {
        return Btn_guardar_Familiar;
    }

    public void setBtn_guardar_Familiar(JButton Btn_guardar_Familiar) {
        this.Btn_guardar_Familiar = Btn_guardar_Familiar;
    }
    

    public JButton getBtn_Cancelar() {
        return Btn_Cancelar;
    }

    public void setBtn_Cancelar(JButton Btn_Cancelar) {
        this.Btn_Cancelar = Btn_Cancelar;
    }

    public JButton getBtn_Guardar() {
        return Btn_Guardar;
    }

    public void setBtn_Guardar(JButton Btn_Guardar) {
        this.Btn_Guardar = Btn_Guardar;
    }

    public JButton getBtn_Subir_Foto() {
        return Btn_Subir_Foto;
    }

    public void setBtn_Subir_Foto(JButton Btn_Subir_Foto) {
        this.Btn_Subir_Foto = Btn_Subir_Foto;
    }

   
    public JCheckBox getCkx_discapacidad() {
        return Ckx_discapacidad;
    }

    public void setCkx_discapacidad(JCheckBox Ckx_discapacidad) {
        this.Ckx_discapacidad = Ckx_discapacidad;
    }

    public JDateChooser getJCL_FechaNacimiento() {
        return JCL_FechaNacimiento;
    }

    public void setJCL_FechaNacimiento(JDateChooser JCL_FechaNacimiento) {
        this.JCL_FechaNacimiento = JCL_FechaNacimiento;
    }

    public JPanel getPanl_Ant_Familiares() {
        return Panl_Ant_Familiares;
    }

    public void setPanl_Ant_Familiares(JPanel Panl_Ant_Familiares) {
        this.Panl_Ant_Familiares = Panl_Ant_Familiares;
    }

    public JPanel getPanl_Ant_Personal() {
        return Panl_Ant_Personal;
    }

    public void setPanl_Ant_Personal(JPanel Panl_Ant_Personal) {
        this.Panl_Ant_Personal = Panl_Ant_Personal;
    }

    public JRadioButton getRbn_Alumno() {
        return Rbn_Alumno;
    }

    public void setRbn_Alumno(JRadioButton Rbn_Alumno) {
        this.Rbn_Alumno = Rbn_Alumno;
    }

    public JRadioButton getRbn_docente() {
        return Rbn_docente;
    }

    public void setRbn_docente(JRadioButton Rbn_docente) {
        this.Rbn_docente = Rbn_docente;
    }

    public JSpinner getSpr_Porcen_Discapasidad() {
        return Spr_Porcen_Discapasidad;
    }

    public void setSpr_Porcen_Discapasidad(JSpinner Spr_Porcen_Discapasidad) {
        this.Spr_Porcen_Discapasidad = Spr_Porcen_Discapasidad;
    }

    public JSpinner getSpr_ciclo() {
        return Spr_ciclo;
    }

    public void setSpr_ciclo(JSpinner Spr_ciclo) {
        this.Spr_ciclo = Spr_ciclo;
    }

    public JTextArea getTxA_Faml_alergia() {
        return TxA_Faml_alergia;
    }

    public void setTxA_Faml_alergia(JTextArea TxA_Faml_alergia) {
        this.TxA_Faml_alergia = TxA_Faml_alergia;
    }

    public JTextArea getTxA_Faml_cirugia() {
        return TxA_Faml_cirugia;
    }

    public void setTxA_Faml_cirugia(JTextArea TxA_Faml_cirugia) {
        this.TxA_Faml_cirugia = TxA_Faml_cirugia;
    }

    public JTextArea getTxA_Faml_clinico() {
        return TxA_Faml_clinico;
    }

    public void setTxA_Faml_clinico(JTextArea TxA_Faml_clinico) {
        this.TxA_Faml_clinico = TxA_Faml_clinico;
    }

    public JTextArea getTxA_Faml_enfermedades() {
        return TxA_Faml_enfermedades;
    }

    public void setTxA_Faml_enfermedades(JTextArea TxA_Faml_enfermedades) {
        this.TxA_Faml_enfermedades = TxA_Faml_enfermedades;
    }

    public JTextArea getTxA_Faml_farmacologico() {
        return TxA_Faml_farmacologico;
    }

    public void setTxA_Faml_farmacologico(JTextArea TxA_Faml_farmacologico) {
        this.TxA_Faml_farmacologico = TxA_Faml_farmacologico;
    }

    public JTextArea getTxA_Faml_ginecologo() {
        return TxA_Faml_ginecologo;
    }

    public void setTxA_Faml_ginecologo(JTextArea TxA_Faml_ginecologo) {
        this.TxA_Faml_ginecologo = TxA_Faml_ginecologo;
    }

    public JTextArea getTxA_Faml_quirurgico() {
        return TxA_Faml_quirurgico;
    }

    public void setTxA_Faml_quirurgico(JTextArea TxA_Faml_quirurgico) {
        this.TxA_Faml_quirurgico = TxA_Faml_quirurgico;
    }

    public JTextArea getTxA_Faml_traumatologico() {
        return TxA_Faml_traumatologico;
    }

    public void setTxA_Faml_traumatologico(JTextArea TxA_Faml_traumatologico) {
        this.TxA_Faml_traumatologico = TxA_Faml_traumatologico;
    }

    public JTextArea getTxA_Faml_vacunas() {
        return TxA_Faml_vacunas;
    }

    public void setTxA_Faml_vacunas(JTextArea TxA_Faml_vacunas) {
        this.TxA_Faml_vacunas = TxA_Faml_vacunas;
    }

    public JTextArea getTxA_Persn_alergia() {
        return TxA_Persn_alergia;
    }

    public void setTxA_Persn_alergia(JTextArea TxA_Persn_alergia) {
        this.TxA_Persn_alergia = TxA_Persn_alergia;
    }

    public JTextArea getTxA_Persn_cirugias() {
        return TxA_Persn_cirugias;
    }

    public void setTxA_Persn_cirugias(JTextArea TxA_Persn_cirugias) {
        this.TxA_Persn_cirugias = TxA_Persn_cirugias;
    }

    public JTextArea getTxA_Persn_clinico() {
        return TxA_Persn_clinico;
    }

    public void setTxA_Persn_clinico(JTextArea TxA_Persn_clinico) {
        this.TxA_Persn_clinico = TxA_Persn_clinico;
    }

    public JTextArea getTxA_Persn_enfermedades() {
        return TxA_Persn_enfermedades;
    }

    public void setTxA_Persn_enfermedades(JTextArea TxA_Persn_enfermedades) {
        this.TxA_Persn_enfermedades = TxA_Persn_enfermedades;
    }

    public JTextArea getTxA_Persn_farmacologico() {
        return TxA_Persn_farmacologico;
    }

    public void setTxA_Persn_farmacologico(JTextArea TxA_Persn_farmacologico) {
        this.TxA_Persn_farmacologico = TxA_Persn_farmacologico;
    }

    public JTextArea getTxA_Persn_ginecologico() {
        return TxA_Persn_ginecologico;
    }

    public void setTxA_Persn_ginecologico(JTextArea TxA_Persn_ginecologico) {
        this.TxA_Persn_ginecologico = TxA_Persn_ginecologico;
    }

    public JTextArea getTxA_Persn_quirurgico() {
        return TxA_Persn_quirurgico;
    }

    public void setTxA_Persn_quirurgico(JTextArea TxA_Persn_quirurgico) {
        this.TxA_Persn_quirurgico = TxA_Persn_quirurgico;
    }

    public JTextArea getTxA_Persn_traumatologico() {
        return TxA_Persn_traumatologico;
    }

    public void setTxA_Persn_traumatologico(JTextArea TxA_Persn_traumatologico) {
        this.TxA_Persn_traumatologico = TxA_Persn_traumatologico;
    }

    public JTextArea getTxA_Persn_vacunas() {
        return TxA_Persn_vacunas;
    }

    public void setTxA_Persn_vacunas(JTextArea TxA_Persn_vacunas) {
        this.TxA_Persn_vacunas = TxA_Persn_vacunas;
    }

    public JTextField getTxt_Apellidos() {
        return Txt_Apellidos;
    }

    public void setTxt_Apellidos(JTextField Txt_Apellidos) {
        this.Txt_Apellidos = Txt_Apellidos;
    }

    public JTextField getTxt_ContactoEmergencias() {
        return Txt_ContactoEmergencias;
    }

    public void setTxt_ContactoEmergencias(JTextField Txt_ContactoEmergencias) {
        this.Txt_ContactoEmergencias = Txt_ContactoEmergencias;
    }

    public JTextField getTxt_Email() {
        return Txt_Email;
    }

    public void setTxt_Email(JTextField Txt_Email) {
        this.Txt_Email = Txt_Email;
    }

   
    public JTextField getTxt_Nombres() {
        return Txt_Nombres;
    }

    public void setTxt_Nombres(JTextField Txt_Nombres) {
        this.Txt_Nombres = Txt_Nombres;
    }

    

    public JTextField getTxt_barrio() {
        return Txt_barrio;
    }

    public void setTxt_barrio(JTextField Txt_barrio) {
        this.Txt_barrio = Txt_barrio;
    }

    public JTextField getTxt_canton() {
        return Txt_canton;
    }

    public void setTxt_canton(JTextField Txt_canton) {
        this.Txt_canton = Txt_canton;
    }

   

    public JTextField getTxt_direccion() {
        return Txt_direccion;
    }

    public void setTxt_direccion(JTextField Txt_direccion) {
        this.Txt_direccion = Txt_direccion;
    }

   

    public JTextField getTxt_etnia() {
        return Txt_etnia;
    }

    public void setTxt_etnia(JTextField Txt_etnia) {
        this.Txt_etnia = Txt_etnia;
    }

    public JTextField getTxt_genero() {
        return Txt_genero;
    }

    public void setTxt_genero(JTextField Txt_genero) {
        this.Txt_genero = Txt_genero;
    }

    public JTextField getTxt_lugar() {
        return Txt_lugar;
    }

    public void setTxt_lugar(JTextField Txt_lugar) {
        this.Txt_lugar = Txt_lugar;
    }

    public JTextField getTxt_pais() {
        return Txt_pais;
    }

    public void setTxt_pais(JTextField Txt_pais) {
        this.Txt_pais = Txt_pais;
    }

    public JTextField getTxt_provincia() {
        return Txt_provincia;
    }

    public void setTxt_provincia(JTextField Txt_provincia) {
        this.Txt_provincia = Txt_provincia;
    }

   

    public JTextField getTxt_telefono() {
        return Txt_telefono;
    }

    public void setTxt_telefono(JTextField Txt_telefono) {
        this.Txt_telefono = Txt_telefono;
    }

    public JTextField getTxt_tipoDiscapacidad() {
        return Txt_tipoDiscapacidad;
    }

    public void setTxt_tipoDiscapacidad(JTextField Txt_tipoDiscapacidad) {
        this.Txt_tipoDiscapacidad = Txt_tipoDiscapacidad;
    }

    public JLabel getLbl_Foto() {
        return lbl_Foto;
    }

    public void setLbl_Foto(JLabel lbl_Foto) {
        this.lbl_Foto = lbl_Foto;
    }

    public JTextField getTxt_Identificacion_pac() {
        return Txt_Identificacion_pac;
    }

    public void setTxt_Identificacion_pac(JTextField Txt_Identificacion_pac) {
        this.Txt_Identificacion_pac = Txt_Identificacion_pac;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Txt_Identificacion_pac = new javax.swing.JTextField();
        Txt_Nombres = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        Txt_genero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Txt_Apellidos = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        Txt_ContactoEmergencias = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Txt_Email = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        Txt_telefono = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        Txt_direccion = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        Txt_barrio = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        Txt_lugar = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Txt_tipoDiscapacidad = new javax.swing.JTextField();
        jSeparator29 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Rbn_docente = new javax.swing.JRadioButton();
        Rbn_Alumno = new javax.swing.JRadioButton();
        JCL_FechaNacimiento = new com.toedter.calendar.JDateChooser();
        Ckx_discapacidad = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        lbl_Foto = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        Btn_Subir_Foto = new javax.swing.JButton();
        Txt_canton = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator34 = new javax.swing.JSeparator();
        Txt_etnia = new javax.swing.JTextField();
        jSeparator27 = new javax.swing.JSeparator();
        Txt_provincia = new javax.swing.JTextField();
        Txt_pais = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        Spr_Porcen_Discapasidad = new javax.swing.JSpinner();
        Spr_ciclo = new javax.swing.JSpinner();
        Btn_Cancelar = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        Panl_Ant_Personal = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxA_Persn_alergia = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxA_Persn_clinico = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TxA_Persn_ginecologico = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TxA_Persn_traumatologico = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TxA_Persn_quirurgico = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TxA_Persn_farmacologico = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        TxA_Persn_enfermedades = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        TxA_Persn_cirugias = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        TxA_Persn_vacunas = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Panl_Ant_Familiares = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        TxA_Faml_alergia = new javax.swing.JTextArea();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        TxA_Faml_clinico = new javax.swing.JTextArea();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        TxA_Faml_ginecologo = new javax.swing.JTextArea();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        TxA_Faml_traumatologico = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        TxA_Faml_quirurgico = new javax.swing.JTextArea();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        TxA_Faml_farmacologico = new javax.swing.JTextArea();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        TxA_Faml_enfermedades = new javax.swing.JTextArea();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        TxA_Faml_cirugia = new javax.swing.JTextArea();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        Cb_Parentesco = new javax.swing.JComboBox<>();
        Btn_guardar_Familiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        TxA_Faml_vacunas = new javax.swing.JTextArea();
        jLabel49 = new javax.swing.JLabel();
        Txt_CarnetConadis = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        Rbn_Femenino = new javax.swing.JRadioButton();
        Rbn_Masculino = new javax.swing.JRadioButton();
        Cbx_estado_civil = new javax.swing.JComboBox<>();
        Cbx_Carreras = new javax.swing.JComboBox<>();
        Cbx_tipo_sangre = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 680));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DEPARTAMENTO MEDICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Light", 3, 24), new java.awt.Color(9, 49, 130))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1290, 760));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel1.setText("NÚMERO  IDENTIFICACION : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, 20));

        Txt_Identificacion_pac.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_Identificacion_pac.setBorder(null);
        jPanel1.add(Txt_Identificacion_pac, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 170, 20));

        Txt_Nombres.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_Nombres.setBorder(null);
        jPanel1.add(Txt_Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 170, 20));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 170, 10));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel3.setText("TIPO SANGRE :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 90, -1, -1));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 170, 10));

        Txt_genero.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_genero.setBorder(null);
        jPanel1.add(Txt_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 170, 20));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel5.setText("APELLIDOS:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, 20));

        Txt_Apellidos.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_Apellidos.setBorder(null);
        jPanel1.add(Txt_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 170, 20));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 170, 10));

        Txt_ContactoEmergencias.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_ContactoEmergencias.setBorder(null);
        jPanel1.add(Txt_ContactoEmergencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 170, 170, 20));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 170, 10));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel7.setText("SEXO :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, 20));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel8.setText("GÉNERO :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, 20));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel9.setText("FECHA  DE NACIMIENTO : ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel10.setText("ESTADO CIVIL : ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel11.setText("E - MAIL : ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, -1, 20));

        Txt_Email.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_Email.setBorder(null);
        jPanel1.add(Txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 170, 20));

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 170, 10));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel12.setText("TELÉFONO : ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, -1, 20));

        Txt_telefono.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_telefono.setBorder(null);
        jPanel1.add(Txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, 170, 20));

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 170, 10));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel13.setText("DIRECCIÓN (Calles) : ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 20));

        Txt_direccion.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_direccion.setBorder(null);
        jPanel1.add(Txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 170, 20));

        jSeparator21.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator21.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 170, 10));

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel14.setText("BARRIO (Vecindario): ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        Txt_barrio.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_barrio.setBorder(null);
        jPanel1.add(Txt_barrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 170, 20));

        jSeparator22.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator22.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 170, 10));

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel15.setText("LUGAR (Ciudad) : ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        Txt_lugar.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_lugar.setBorder(null);
        jPanel1.add(Txt_lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 170, 20));

        jSeparator23.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator23.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 170, 10));

        jLabel16.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel16.setText("CANTÓN (Distrito) : ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel17.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel17.setText("PROVINCIA : ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jLabel18.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel18.setText("ANTECEDENTES");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 230, -1, 20));

        jLabel19.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel19.setText("ETNIA : ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, 20));

        jLabel20.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel20.setText("DISCAPACIDAD : ");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        jLabel21.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel21.setText("TIPO DISCAPACIDAD : ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, -1));

        Txt_tipoDiscapacidad.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_tipoDiscapacidad.setBorder(null);
        jPanel1.add(Txt_tipoDiscapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 170, 20));

        jSeparator29.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator29.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 170, 10));

        jLabel23.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel23.setText("PORCENTAGE DISCAPACIDAD : ");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, -1, -1));

        jLabel28.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel28.setText("TIPO  PACIENTE :");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, 20));

        jLabel31.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel31.setText("CICLO : ");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, 20));

        jLabel32.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel32.setText("CARRERA :");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 750, 10));

        buttonGroup1.add(Rbn_docente);
        Rbn_docente.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        Rbn_docente.setText("DOCENTE");
        Rbn_docente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbn_docenteActionPerformed(evt);
            }
        });
        jPanel1.add(Rbn_docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 80, -1));

        buttonGroup1.add(Rbn_Alumno);
        Rbn_Alumno.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        Rbn_Alumno.setText("ALUMNO");
        jPanel1.add(Rbn_Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));
        jPanel1.add(JCL_FechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 170, -1));

        Ckx_discapacidad.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Ckx_discapacidad.setText("SI");
        jPanel1.add(Ckx_discapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 810, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 1010, 10));

        jLabel35.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel35.setText("NOMBRES : ");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, 20));

        jSeparator25.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator25.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 170, 10));

        lbl_Foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl_Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 130, 150));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 170, 10));

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 170, 10));

        Btn_Subir_Foto.setText("Subir");
        jPanel1.add(Btn_Subir_Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 130, -1));

        Txt_canton.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_canton.setBorder(null);
        jPanel1.add(Txt_canton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 170, 20));

        jSeparator26.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator26.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 170, 10));

        jSeparator34.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator34.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 170, 10));

        Txt_etnia.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_etnia.setBorder(null);
        jPanel1.add(Txt_etnia, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 170, 20));

        jSeparator27.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator27.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 170, 10));

        Txt_provincia.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_provincia.setBorder(null);
        jPanel1.add(Txt_provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 170, 20));

        Txt_pais.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_pais.setBorder(null);
        jPanel1.add(Txt_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 170, 20));

        jSeparator28.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator28.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 170, 10));
        jPanel1.add(Spr_Porcen_Discapasidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, -1, -1));

        Spr_ciclo.setEnabled(false);
        jPanel1.add(Spr_ciclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        Btn_Cancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_Cancelar.setText("CANCELAR");
        jPanel1.add(Btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 630, 180, -1));

        Btn_Guardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_Guardar.setText("GUARDAR");
        jPanel1.add(Btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 630, 180, -1));

        jLabel22.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel22.setText("PAIS : ");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, 20));

        jScrollPane2.setHorizontalScrollBar(null);

        Panl_Ant_Personal.setForeground(new java.awt.Color(255, 255, 255));
        Panl_Ant_Personal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel6.setText("Alergias:");
        Panl_Ant_Personal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel24.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel24.setText("Personal:");
        Panl_Ant_Personal.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        TxA_Persn_alergia.setColumns(20);
        TxA_Persn_alergia.setRows(5);
        TxA_Persn_alergia.setText("\n");
        TxA_Persn_alergia.setAutoscrolls(false);
        jScrollPane3.setViewportView(TxA_Persn_alergia);

        Panl_Ant_Personal.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 64, 330, 40));

        TxA_Persn_clinico.setColumns(20);
        TxA_Persn_clinico.setRows(5);
        TxA_Persn_clinico.setAutoscrolls(false);
        jScrollPane4.setViewportView(TxA_Persn_clinico);

        Panl_Ant_Personal.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 132, 330, 40));

        jLabel25.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel25.setText("Clinico");
        Panl_Ant_Personal.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        TxA_Persn_ginecologico.setColumns(20);
        TxA_Persn_ginecologico.setRows(5);
        TxA_Persn_ginecologico.setAutoscrolls(false);
        jScrollPane5.setViewportView(TxA_Persn_ginecologico);

        Panl_Ant_Personal.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 200, 330, 40));

        jLabel26.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel26.setText("Ginecologo:");
        Panl_Ant_Personal.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        TxA_Persn_traumatologico.setColumns(20);
        TxA_Persn_traumatologico.setRows(5);
        TxA_Persn_traumatologico.setAutoscrolls(false);
        jScrollPane6.setViewportView(TxA_Persn_traumatologico);

        Panl_Ant_Personal.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 339, 40));

        jLabel27.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel27.setText("Traumatologico:");
        Panl_Ant_Personal.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        TxA_Persn_quirurgico.setColumns(20);
        TxA_Persn_quirurgico.setRows(5);
        TxA_Persn_quirurgico.setAutoscrolls(false);
        jScrollPane7.setViewportView(TxA_Persn_quirurgico);

        Panl_Ant_Personal.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 339, 40));

        jLabel29.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel29.setText("Quirurgico:");
        Panl_Ant_Personal.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel30.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel30.setText("Farmacologico:");
        Panl_Ant_Personal.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        TxA_Persn_farmacologico.setColumns(20);
        TxA_Persn_farmacologico.setRows(5);
        TxA_Persn_farmacologico.setAutoscrolls(false);
        jScrollPane8.setViewportView(TxA_Persn_farmacologico);

        Panl_Ant_Personal.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 339, 40));

        TxA_Persn_enfermedades.setColumns(20);
        TxA_Persn_enfermedades.setRows(5);
        TxA_Persn_enfermedades.setAutoscrolls(false);
        jScrollPane9.setViewportView(TxA_Persn_enfermedades);

        Panl_Ant_Personal.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 339, 40));

        jLabel34.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel34.setText("Enfermedades");
        Panl_Ant_Personal.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        TxA_Persn_cirugias.setColumns(20);
        TxA_Persn_cirugias.setRows(5);
        TxA_Persn_cirugias.setAutoscrolls(false);
        jScrollPane10.setViewportView(TxA_Persn_cirugias);

        Panl_Ant_Personal.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 339, 40));

        jLabel36.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel36.setText("Cirugias");
        Panl_Ant_Personal.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        jLabel37.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel37.setText("Vacunas:");
        Panl_Ant_Personal.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));

        TxA_Persn_vacunas.setColumns(20);
        TxA_Persn_vacunas.setRows(5);
        TxA_Persn_vacunas.setAutoscrolls(false);
        jScrollPane11.setViewportView(TxA_Persn_vacunas);

        Panl_Ant_Personal.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 630, 340, 40));

        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        Panl_Ant_Personal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 702, -1, -1));

        jScrollPane2.setViewportView(Panl_Ant_Personal);

        jTabbedPane1.addTab("PERSONALES", jScrollPane2);

        jScrollPane1.setHorizontalScrollBar(null);

        Panl_Ant_Familiares.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxA_Faml_alergia.setColumns(20);
        TxA_Faml_alergia.setRows(5);
        TxA_Faml_alergia.setAutoscrolls(false);
        jScrollPane12.setViewportView(TxA_Faml_alergia);

        Panl_Ant_Familiares.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 102, 338, 40));

        jLabel38.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel38.setText("Alergias:");
        Panl_Ant_Familiares.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        jLabel39.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel39.setText("Clinico");
        Panl_Ant_Familiares.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 154, -1, -1));

        TxA_Faml_clinico.setColumns(20);
        TxA_Faml_clinico.setRows(5);
        TxA_Faml_clinico.setAutoscrolls(false);
        jScrollPane13.setViewportView(TxA_Faml_clinico);

        Panl_Ant_Familiares.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 176, 338, 40));

        jLabel40.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel40.setText("Ginecologo:");
        Panl_Ant_Familiares.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 228, -1, -1));

        TxA_Faml_ginecologo.setColumns(20);
        TxA_Faml_ginecologo.setRows(5);
        TxA_Faml_ginecologo.setAutoscrolls(false);
        jScrollPane14.setViewportView(TxA_Faml_ginecologo);

        Panl_Ant_Familiares.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 250, 338, 40));

        jLabel41.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel41.setText("Traumatologico:");
        Panl_Ant_Familiares.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 302, -1, -1));

        TxA_Faml_traumatologico.setColumns(20);
        TxA_Faml_traumatologico.setRows(5);
        TxA_Faml_traumatologico.setAutoscrolls(false);
        jScrollPane15.setViewportView(TxA_Faml_traumatologico);

        Panl_Ant_Familiares.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 324, 338, 40));

        jLabel42.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel42.setText("Quirurgico:");
        Panl_Ant_Familiares.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 376, -1, -1));

        TxA_Faml_quirurgico.setColumns(20);
        TxA_Faml_quirurgico.setRows(5);
        TxA_Faml_quirurgico.setAutoscrolls(false);
        jScrollPane16.setViewportView(TxA_Faml_quirurgico);

        Panl_Ant_Familiares.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 398, 338, 40));

        jLabel43.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel43.setText("Farmacologico:");
        Panl_Ant_Familiares.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 450, -1, -1));

        TxA_Faml_farmacologico.setColumns(20);
        TxA_Faml_farmacologico.setRows(5);
        TxA_Faml_farmacologico.setAutoscrolls(false);
        jScrollPane17.setViewportView(TxA_Faml_farmacologico);

        Panl_Ant_Familiares.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 472, 338, 40));

        jLabel44.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel44.setText("Enfermedades:");
        Panl_Ant_Familiares.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 524, -1, -1));

        TxA_Faml_enfermedades.setColumns(20);
        TxA_Faml_enfermedades.setRows(5);
        TxA_Faml_enfermedades.setAutoscrolls(false);
        jScrollPane18.setViewportView(TxA_Faml_enfermedades);

        Panl_Ant_Familiares.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 546, 338, 40));

        jLabel45.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel45.setText("Cirugia:");
        Panl_Ant_Familiares.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 598, -1, -1));

        TxA_Faml_cirugia.setColumns(20);
        TxA_Faml_cirugia.setRows(5);
        TxA_Faml_cirugia.setAutoscrolls(false);
        jScrollPane19.setViewportView(TxA_Faml_cirugia);

        Panl_Ant_Familiares.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 620, 338, 40));

        jLabel46.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel46.setText("Familiares");
        Panl_Ant_Familiares.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel47.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel47.setText("PARENTESCO");
        Panl_Ant_Familiares.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 30));

        Cb_Parentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otro", "Padres", "Hijos", "Abuelos", "Hermanos" }));
        Panl_Ant_Familiares.add(Cb_Parentesco, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 42, 140, 30));

        Btn_guardar_Familiar.setText("Registrar");
        Panl_Ant_Familiares.add(Btn_guardar_Familiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 44, -1, 26));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        Panl_Ant_Familiares.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 716, -1, -1));

        jLabel48.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel48.setText("Vacunas:");
        Panl_Ant_Familiares.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 648, -1, -1));

        TxA_Faml_vacunas.setColumns(20);
        TxA_Faml_vacunas.setRows(5);
        TxA_Faml_vacunas.setAutoscrolls(false);
        jScrollPane20.setViewportView(TxA_Faml_vacunas);

        Panl_Ant_Familiares.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 670, 334, 40));

        jScrollPane1.setViewportView(Panl_Ant_Familiares);

        jTabbedPane1.addTab("FAMILIARES", jScrollPane1);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 360, 340));

        jLabel49.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel49.setText("CARNET DEL CONADIS : ");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, -1, -1));

        Txt_CarnetConadis.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_CarnetConadis.setBorder(null);
        jPanel1.add(Txt_CarnetConadis, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 170, 20));

        jSeparator30.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator30.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, 170, 10));

        GrupoGroup2.add(Rbn_Femenino);
        Rbn_Femenino.setText("FEMENINO");
        Rbn_Femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbn_FemeninoActionPerformed(evt);
            }
        });
        jPanel1.add(Rbn_Femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, -1, -1));

        GrupoGroup2.add(Rbn_Masculino);
        Rbn_Masculino.setText("MASCULINO");
        Rbn_Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbn_MasculinoActionPerformed(evt);
            }
        });
        jPanel1.add(Rbn_Masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, -1, -1));

        Cbx_estado_civil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Divorciado", "Viudo", "Unión Libre", "Separado" }));
        jPanel1.add(Cbx_estado_civil, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 170, -1));

        Cbx_Carreras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otros", "Big Data", "Tributación", "Ciberseguridad", "Producción y Realización Audiovisual", "Seguridad y Prevención de Riesgos Laborales", "Gestión de Patrimonios Histórico-Cultural", "Desarrollo de Software", "Entrenamiento Deportivo", "Mecánica", "Mantenimiento Eléctrico y Control Industrial", "Mecatrónica", "Administración de Infraestructura y Plataformas Tecnológicas", " " }));
        jPanel1.add(Cbx_Carreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 170, -1));

        Cbx_tipo_sangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel1.add(Cbx_tipo_sangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 110, 170, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel4.setText("CONTACTO EMERGENCIA : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Rbn_docenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbn_docenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rbn_docenteActionPerformed

    private void Rbn_FemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbn_FemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rbn_FemeninoActionPerformed

    private void Rbn_MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbn_MasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rbn_MasculinoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Subir_Foto;
    private javax.swing.JButton Btn_guardar_Familiar;
    private javax.swing.JComboBox<String> Cb_Parentesco;
    private javax.swing.JComboBox<String> Cbx_Carreras;
    private javax.swing.JComboBox<String> Cbx_estado_civil;
    private javax.swing.JComboBox<String> Cbx_tipo_sangre;
    private javax.swing.JCheckBox Ckx_discapacidad;
    private javax.swing.ButtonGroup GrupoGroup2;
    private com.toedter.calendar.JDateChooser JCL_FechaNacimiento;
    private javax.swing.JPanel Panl_Ant_Familiares;
    private javax.swing.JPanel Panl_Ant_Personal;
    private javax.swing.JRadioButton Rbn_Alumno;
    private javax.swing.JRadioButton Rbn_Femenino;
    private javax.swing.JRadioButton Rbn_Masculino;
    private javax.swing.JRadioButton Rbn_docente;
    private javax.swing.JSpinner Spr_Porcen_Discapasidad;
    private javax.swing.JSpinner Spr_ciclo;
    private javax.swing.JTextArea TxA_Faml_alergia;
    private javax.swing.JTextArea TxA_Faml_cirugia;
    private javax.swing.JTextArea TxA_Faml_clinico;
    private javax.swing.JTextArea TxA_Faml_enfermedades;
    private javax.swing.JTextArea TxA_Faml_farmacologico;
    private javax.swing.JTextArea TxA_Faml_ginecologo;
    private javax.swing.JTextArea TxA_Faml_quirurgico;
    private javax.swing.JTextArea TxA_Faml_traumatologico;
    private javax.swing.JTextArea TxA_Faml_vacunas;
    private javax.swing.JTextArea TxA_Persn_alergia;
    private javax.swing.JTextArea TxA_Persn_cirugias;
    private javax.swing.JTextArea TxA_Persn_clinico;
    private javax.swing.JTextArea TxA_Persn_enfermedades;
    private javax.swing.JTextArea TxA_Persn_farmacologico;
    private javax.swing.JTextArea TxA_Persn_ginecologico;
    private javax.swing.JTextArea TxA_Persn_quirurgico;
    private javax.swing.JTextArea TxA_Persn_traumatologico;
    private javax.swing.JTextArea TxA_Persn_vacunas;
    private javax.swing.JTextField Txt_Apellidos;
    private javax.swing.JTextField Txt_CarnetConadis;
    private javax.swing.JTextField Txt_ContactoEmergencias;
    private javax.swing.JTextField Txt_Email;
    private javax.swing.JTextField Txt_Identificacion_pac;
    private javax.swing.JTextField Txt_Nombres;
    private javax.swing.JTextField Txt_barrio;
    private javax.swing.JTextField Txt_canton;
    private javax.swing.JTextField Txt_direccion;
    private javax.swing.JTextField Txt_etnia;
    private javax.swing.JTextField Txt_genero;
    private javax.swing.JTextField Txt_lugar;
    private javax.swing.JTextField Txt_pais;
    private javax.swing.JTextField Txt_provincia;
    private javax.swing.JTextField Txt_telefono;
    private javax.swing.JTextField Txt_tipoDiscapacidad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
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
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
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
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_Foto;
    // End of variables declaration//GEN-END:variables
}
