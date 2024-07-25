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

    public JComboBox<String> getCb_Parent_total() {
        return Cb_Parent_total;
    }

    public void setCb_Parent_total(JComboBox<String> Cb_Parent_total) {
        this.Cb_Parent_total = Cb_Parent_total;
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

    public JTextField getTxt_Faml_PARENTESCO() {
        return Txt_Faml_PARENTESCO;
    }

    public void setTxt_Faml_PARENTESCO(JTextField Txt_Faml_PARENTESCO) {
        this.Txt_Faml_PARENTESCO = Txt_Faml_PARENTESCO;
    }

    public JTextField getTxt_Identificacion() {
        return Txt_Identificacion;
    }

    public void setTxt_Identificacion(JTextField Txt_Identificacion) {
        this.Txt_Identificacion = Txt_Identificacion;
    }

    public JTextField getTxt_Nombres() {
        return Txt_Nombres;
    }

    public void setTxt_Nombres(JTextField Txt_Nombres) {
        this.Txt_Nombres = Txt_Nombres;
    }

    public JTextField getTxt_Nvl_Academico() {
        return Txt_Nvl_Academico;
    }

    public void setTxt_Nvl_Academico(JTextField Txt_Nvl_Academico) {
        this.Txt_Nvl_Academico = Txt_Nvl_Academico;
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

    public JTextField getTxt_carrera() {
        return Txt_carrera;
    }

    public void setTxt_carrera(JTextField Txt_carrera) {
        this.Txt_carrera = Txt_carrera;
    }

    public JTextField getTxt_direccion() {
        return Txt_direccion;
    }

    public void setTxt_direccion(JTextField Txt_direccion) {
        this.Txt_direccion = Txt_direccion;
    }

    public JTextField getTxt_estadoCivil() {
        return Txt_estadoCivil;
    }

    public void setTxt_estadoCivil(JTextField Txt_estadoCivil) {
        this.Txt_estadoCivil = Txt_estadoCivil;
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

    public JTextField getTxt_sexo() {
        return Txt_sexo;
    }

    public void setTxt_sexo(JTextField Txt_sexo) {
        this.Txt_sexo = Txt_sexo;
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

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotton = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Txt_Identificacion = new javax.swing.JTextField();
        Txt_Nombres = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Txt_carrera = new javax.swing.JTextField();
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
        Txt_Nvl_Academico = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jSeparator33 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
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
        Txt_estadoCivil = new javax.swing.JTextField();
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
        Txt_sexo = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
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
        Txt_Faml_PARENTESCO = new javax.swing.JTextField();
        Cb_Parent_total = new javax.swing.JComboBox<>();
        Btn_guardar_Familiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        TxA_Faml_vacunas = new javax.swing.JTextArea();
        jLabel49 = new javax.swing.JLabel();
        Txt_CarnetConadis = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(1280, 680));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DEPARTAMENTO MEDICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Light", 3, 24), new java.awt.Color(9, 49, 130))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1290, 760));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel1.setText("NÚMERO  IDENTIFICASION : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, 20));

        Txt_Identificacion.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_Identificacion.setBorder(null);
        jPanel1.add(Txt_Identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 170, 20));

        Txt_Nombres.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_Nombres.setBorder(null);
        jPanel1.add(Txt_Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 170, 20));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 170, 10));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel3.setText("CONTACTO EMERGENCIA : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 150, -1, -1));

        Txt_carrera.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_carrera.setBorder(null);
        Txt_carrera.setEnabled(false);
        jPanel1.add(Txt_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 170, 20));

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
        jLabel14.setText("BARRIO : ");
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
        jLabel16.setText("CANTÓN : ");
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

        Txt_Nvl_Academico.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_Nvl_Academico.setBorder(null);
        jPanel1.add(Txt_Nvl_Academico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, 170, 20));

        jLabel23.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel23.setText("PORCENTAGE DISCAPACIDAD : ");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, -1, -1));

        jSeparator33.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator33.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 170, 10));

        jLabel28.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel28.setText("TIPO  PACIENTE :");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, 20));

        jLabel31.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel31.setText("CICLO : ");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, 20));

        jLabel32.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel32.setText("CARRERA :");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));

        jLabel33.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel33.setText("Nvl. ACADEMICO :");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 380, 10));

        GrupoBotton.add(Rbn_docente);
        Rbn_docente.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        Rbn_docente.setText("DOCENTE");
        Rbn_docente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbn_docenteActionPerformed(evt);
            }
        });
        jPanel1.add(Rbn_docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 80, -1));

        GrupoBotton.add(Rbn_Alumno);
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

        Txt_estadoCivil.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_estadoCivil.setBorder(null);
        jPanel1.add(Txt_estadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 170, 20));

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

        Txt_sexo.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_sexo.setBorder(null);
        jPanel1.add(Txt_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 170, 20));

        jSeparator18.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator18.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 170, 10));

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

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel6.setText("Alergias:");

        jLabel24.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel24.setText("Personal:");

        TxA_Persn_alergia.setColumns(20);
        TxA_Persn_alergia.setRows(5);
        TxA_Persn_alergia.setAutoscrolls(false);
        jScrollPane3.setViewportView(TxA_Persn_alergia);

        TxA_Persn_clinico.setColumns(20);
        TxA_Persn_clinico.setRows(5);
        TxA_Persn_clinico.setAutoscrolls(false);
        jScrollPane4.setViewportView(TxA_Persn_clinico);

        jLabel25.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel25.setText("Clinico");

        TxA_Persn_ginecologico.setColumns(20);
        TxA_Persn_ginecologico.setRows(5);
        TxA_Persn_ginecologico.setAutoscrolls(false);
        jScrollPane5.setViewportView(TxA_Persn_ginecologico);

        jLabel26.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel26.setText("Ginecologo:");

        TxA_Persn_traumatologico.setColumns(20);
        TxA_Persn_traumatologico.setRows(5);
        TxA_Persn_traumatologico.setAutoscrolls(false);
        jScrollPane6.setViewportView(TxA_Persn_traumatologico);

        jLabel27.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel27.setText("Traumatologico:");

        TxA_Persn_quirurgico.setColumns(20);
        TxA_Persn_quirurgico.setRows(5);
        TxA_Persn_quirurgico.setAutoscrolls(false);
        jScrollPane7.setViewportView(TxA_Persn_quirurgico);

        jLabel29.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel29.setText("Quirurgico:");

        jLabel30.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel30.setText("Farmacologico:");

        TxA_Persn_farmacologico.setColumns(20);
        TxA_Persn_farmacologico.setRows(5);
        TxA_Persn_farmacologico.setAutoscrolls(false);
        jScrollPane8.setViewportView(TxA_Persn_farmacologico);

        TxA_Persn_enfermedades.setColumns(20);
        TxA_Persn_enfermedades.setRows(5);
        TxA_Persn_enfermedades.setAutoscrolls(false);
        jScrollPane9.setViewportView(TxA_Persn_enfermedades);

        jLabel34.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel34.setText("Enfermedades");

        TxA_Persn_cirugias.setColumns(20);
        TxA_Persn_cirugias.setRows(5);
        TxA_Persn_cirugias.setAutoscrolls(false);
        jScrollPane10.setViewportView(TxA_Persn_cirugias);

        jLabel36.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel36.setText("Cirugias");

        jLabel37.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel37.setText("Vacunas:");

        TxA_Persn_vacunas.setColumns(20);
        TxA_Persn_vacunas.setRows(5);
        TxA_Persn_vacunas.setAutoscrolls(false);
        jScrollPane11.setViewportView(TxA_Persn_vacunas);

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

        javax.swing.GroupLayout Panl_Ant_PersonalLayout = new javax.swing.GroupLayout(Panl_Ant_Personal);
        Panl_Ant_Personal.setLayout(Panl_Ant_PersonalLayout);
        Panl_Ant_PersonalLayout.setHorizontalGroup(
            Panl_Ant_PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panl_Ant_PersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panl_Ant_PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addGroup(Panl_Ant_PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Panl_Ant_PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        Panl_Ant_PersonalLayout.setVerticalGroup(
            Panl_Ant_PersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panl_Ant_PersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(Panl_Ant_Personal);

        jTabbedPane1.addTab("PERSONALES", jScrollPane2);

        jScrollPane1.setHorizontalScrollBar(null);

        TxA_Faml_alergia.setColumns(20);
        TxA_Faml_alergia.setRows(5);
        TxA_Faml_alergia.setAutoscrolls(false);
        jScrollPane12.setViewportView(TxA_Faml_alergia);

        jLabel38.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel38.setText("Alergias:");

        jLabel39.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel39.setText("Clinico");

        TxA_Faml_clinico.setColumns(20);
        TxA_Faml_clinico.setRows(5);
        TxA_Faml_clinico.setAutoscrolls(false);
        jScrollPane13.setViewportView(TxA_Faml_clinico);

        jLabel40.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel40.setText("Ginecologo:");

        TxA_Faml_ginecologo.setColumns(20);
        TxA_Faml_ginecologo.setRows(5);
        TxA_Faml_ginecologo.setAutoscrolls(false);
        jScrollPane14.setViewportView(TxA_Faml_ginecologo);

        jLabel41.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel41.setText("Traumatologico:");

        TxA_Faml_traumatologico.setColumns(20);
        TxA_Faml_traumatologico.setRows(5);
        TxA_Faml_traumatologico.setAutoscrolls(false);
        jScrollPane15.setViewportView(TxA_Faml_traumatologico);

        jLabel42.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel42.setText("Quirurgico:");

        TxA_Faml_quirurgico.setColumns(20);
        TxA_Faml_quirurgico.setRows(5);
        TxA_Faml_quirurgico.setAutoscrolls(false);
        jScrollPane16.setViewportView(TxA_Faml_quirurgico);

        jLabel43.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel43.setText("Farmacologico:");

        TxA_Faml_farmacologico.setColumns(20);
        TxA_Faml_farmacologico.setRows(5);
        TxA_Faml_farmacologico.setAutoscrolls(false);
        jScrollPane17.setViewportView(TxA_Faml_farmacologico);

        jLabel44.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel44.setText("Enfermedades:");

        TxA_Faml_enfermedades.setColumns(20);
        TxA_Faml_enfermedades.setRows(5);
        TxA_Faml_enfermedades.setAutoscrolls(false);
        jScrollPane18.setViewportView(TxA_Faml_enfermedades);

        jLabel45.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel45.setText("Cirugia:");

        TxA_Faml_cirugia.setColumns(20);
        TxA_Faml_cirugia.setRows(5);
        TxA_Faml_cirugia.setAutoscrolls(false);
        jScrollPane19.setViewportView(TxA_Faml_cirugia);

        jLabel46.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel46.setText("Familiares");

        jLabel47.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel47.setText("PARENTESCO");

        Txt_Faml_PARENTESCO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Cb_Parent_total.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));

        Btn_guardar_Familiar.setText("Registrar");

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

        jLabel48.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel48.setText("Vacunas:");

        TxA_Faml_vacunas.setColumns(20);
        TxA_Faml_vacunas.setRows(5);
        TxA_Faml_vacunas.setAutoscrolls(false);
        jScrollPane20.setViewportView(TxA_Faml_vacunas);

        javax.swing.GroupLayout Panl_Ant_FamiliaresLayout = new javax.swing.GroupLayout(Panl_Ant_Familiares);
        Panl_Ant_Familiares.setLayout(Panl_Ant_FamiliaresLayout);
        Panl_Ant_FamiliaresLayout.setHorizontalGroup(
            Panl_Ant_FamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panl_Ant_FamiliaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panl_Ant_FamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panl_Ant_FamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Panl_Ant_FamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panl_Ant_FamiliaresLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Faml_PARENTESCO, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_guardar_Familiar))
                            .addGroup(Panl_Ant_FamiliaresLayout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(69, 69, 69)
                                .addComponent(Cb_Parent_total, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panl_Ant_FamiliaresLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel48))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(Panl_Ant_FamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panl_Ant_FamiliaresLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(Panl_Ant_FamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING))
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        Panl_Ant_FamiliaresLayout.setVerticalGroup(
            Panl_Ant_FamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panl_Ant_FamiliaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panl_Ant_FamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(Cb_Parent_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panl_Ant_FamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(Txt_Faml_PARENTESCO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_guardar_Familiar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(603, 603, 603)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panl_Ant_FamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panl_Ant_FamiliaresLayout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(jLabel38)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel39)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel40)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel41)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel42)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel43)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel44)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel45)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(110, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(Panl_Ant_Familiares);

        jTabbedPane1.addTab("FAMILIARES", jScrollPane1);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 360, 340));

        jLabel49.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jLabel49.setText("CARNET DEL CONADIS : ");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, -1, -1));

        Txt_CarnetConadis.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Txt_CarnetConadis.setBorder(null);
        jPanel1.add(Txt_CarnetConadis, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 170, 20));

        jSeparator30.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator30.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, 170, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Rbn_docenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbn_docenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rbn_docenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Subir_Foto;
    private javax.swing.JButton Btn_guardar_Familiar;
    private javax.swing.JComboBox<String> Cb_Parent_total;
    private javax.swing.JCheckBox Ckx_discapacidad;
    private javax.swing.ButtonGroup GrupoBotton;
    private com.toedter.calendar.JDateChooser JCL_FechaNacimiento;
    private javax.swing.JPanel Panl_Ant_Familiares;
    private javax.swing.JPanel Panl_Ant_Personal;
    private javax.swing.JRadioButton Rbn_Alumno;
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
    private javax.swing.JTextField Txt_Faml_PARENTESCO;
    private javax.swing.JTextField Txt_Identificacion;
    private javax.swing.JTextField Txt_Nombres;
    private javax.swing.JTextField Txt_Nvl_Academico;
    private javax.swing.JTextField Txt_barrio;
    private javax.swing.JTextField Txt_canton;
    private javax.swing.JTextField Txt_carrera;
    private javax.swing.JTextField Txt_direccion;
    private javax.swing.JTextField Txt_estadoCivil;
    private javax.swing.JTextField Txt_etnia;
    private javax.swing.JTextField Txt_genero;
    private javax.swing.JTextField Txt_lugar;
    private javax.swing.JTextField Txt_pais;
    private javax.swing.JTextField Txt_provincia;
    private javax.swing.JTextField Txt_sexo;
    private javax.swing.JTextField Txt_telefono;
    private javax.swing.JTextField Txt_tipoDiscapacidad;
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
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
    private javax.swing.JSeparator jSeparator18;
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
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_Foto;
    // End of variables declaration//GEN-END:variables
}
