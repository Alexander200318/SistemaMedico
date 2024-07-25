/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Controlador.ControladorPaciente;
import Modelo.Antecedentes;
import Modelo.AntecedentesFamiliares;
import Modelo.AntecedentesPersonales;
import Modelo.Docente;
import Modelo.Estudiante;
import Modelo.Paciente;
import Modelo.Persona;
import Vista.FrmRegistrarsePaciente;
import com.mysql.cj.jdbc.Blob;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

/**
 *
 * @author alexa
 */
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Registro_PacienteDAO {

    private ControladorPaciente control;
    private Paciente modeloPaciente;
    private FrmRegistrarsePaciente vistaPrincipal;
    String rol = "";
    List< AntecedentesFamiliares> familiares;

    public Registro_PacienteDAO(FrmRegistrarsePaciente vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        control = new ControladorPaciente();
        initListeners();
        this.familiares = new ArrayList<>();
        //////////////////////////////////////////////////
        vistaPrincipal.getSpr_ciclo().setEnabled(false);
        vistaPrincipal.getSpr_ciclo().setValue(0);
        vistaPrincipal.getTxt_carrera().setEnabled(false);
        vistaPrincipal.getTxt_Nvl_Academico().setEnabled(false);
        vistaPrincipal.getTxt_tipoDiscapacidad().setText(null);
        vistaPrincipal.getTxt_tipoDiscapacidad().setEnabled(false);
        vistaPrincipal.getSpr_Porcen_Discapasidad().setValue(0);
        vistaPrincipal.getSpr_Porcen_Discapasidad().setEnabled(false);
        vistaPrincipal.getTxt_CarnetConadis().setText(null);
        vistaPrincipal.getTxt_CarnetConadis().setEnabled(false);
        //////////////////////////////////////////////

        this.vistaPrincipal.getBtn_guardar_Familiar().addActionListener((e) -> {
            guardarAntecedFamiliares();

        });

        this.vistaPrincipal.getBtn_Guardar().addActionListener((e) -> {
            IngresoDatos();
        });
    }

    public void guardarAntecedFamiliares() {
        String parentescoFamilia = vistaPrincipal.getTxt_Faml_PARENTESCO().getText();
        int idAntecedentes_Fm = 0;
        String alergias_Fm = vistaPrincipal.getTxA_Faml_alergia().getText();
        String clinico_Fm = vistaPrincipal.getTxA_Faml_clinico().getText();
        String ginecologico_Fm = vistaPrincipal.getTxA_Faml_ginecologo().getText();
        String traumatologico_Fm = vistaPrincipal.getTxA_Faml_traumatologico().getText();
        String quirurgico_Fm = vistaPrincipal.getTxA_Faml_quirurgico().getText();
        String farmacologico_Fm = vistaPrincipal.getTxA_Faml_farmacologico().getText();
        String enfermedades_Fm = vistaPrincipal.getTxA_Faml_enfermedades().getText();
        String cirugias_Fm = vistaPrincipal.getTxA_Faml_cirugia().getText();
        String vacunas_Fm = vistaPrincipal.getTxA_Faml_vacunas().getText();

        AntecedentesFamiliares familia = new AntecedentesFamiliares(parentescoFamilia, idAntecedentes_Fm, alergias_Fm, clinico_Fm, ginecologico_Fm, traumatologico_Fm, quirurgico_Fm, farmacologico_Fm, enfermedades_Fm, cirugias_Fm, vacunas_Fm);

        familiares.add(familia);

        ////////////////////////////////////////////////////////////////////////
        vistaPrincipal.getTxt_Faml_PARENTESCO().setText("");
        vistaPrincipal.getTxA_Faml_alergia().setText("");
        vistaPrincipal.getTxA_Faml_clinico().setText("");
        vistaPrincipal.getTxA_Faml_ginecologo().setText("");
        vistaPrincipal.getTxA_Faml_traumatologico().setText("");
        vistaPrincipal.getTxA_Faml_quirurgico().setText("");
        vistaPrincipal.getTxA_Faml_farmacologico().setText("");
        vistaPrincipal.getTxA_Faml_enfermedades().setText("");
        vistaPrincipal.getTxA_Faml_cirugia().setText("");
        vistaPrincipal.getTxA_Faml_vacunas().setText("");

    }

    private void initListeners() {
        vistaPrincipal.getCkx_discapacidad().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClickDiscapacidad();
            }
        });

        vistaPrincipal.getRbn_Alumno().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Seleccion_tipo();
            }
        });

        vistaPrincipal.getRbn_docente().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Seleccion_tipo();
            }
        });
    }

    public void ClickDiscapacidad() {
        if (vistaPrincipal.getCkx_discapacidad().isSelected()) {
            vistaPrincipal.getTxt_tipoDiscapacidad().setEnabled(true);
            vistaPrincipal.getSpr_Porcen_Discapasidad().setEnabled(true);
            vistaPrincipal.getTxt_CarnetConadis().setEnabled(true);
        } else {
            vistaPrincipal.getTxt_tipoDiscapacidad().setText(null);
            vistaPrincipal.getTxt_tipoDiscapacidad().setEnabled(false);
            vistaPrincipal.getSpr_Porcen_Discapasidad().setValue(0);
            vistaPrincipal.getSpr_Porcen_Discapasidad().setEnabled(false);
            vistaPrincipal.getTxt_CarnetConadis().setText(null);
            vistaPrincipal.getTxt_CarnetConadis().setEnabled(false);
        }
    }

    public void Seleccion_tipo() {
        if (vistaPrincipal.getRbn_Alumno().isSelected()) {
            vistaPrincipal.getSpr_ciclo().setEnabled(true);
            vistaPrincipal.getTxt_carrera().setEnabled(true);
            vistaPrincipal.getTxt_Nvl_Academico().setEnabled(true);
            this.rol = "estudiante";
        } else if (vistaPrincipal.getRbn_docente().isSelected()) {
            vistaPrincipal.getSpr_ciclo().setEnabled(false);
            vistaPrincipal.getSpr_ciclo().setValue(0);
            vistaPrincipal.getTxt_carrera().setEnabled(false);
            vistaPrincipal.getTxt_Nvl_Academico().setEnabled(false);

            this.rol = "docente";
        }
    }

    public void IngresoDatos() {
        String nombres = vistaPrincipal.getTxt_Nombres().getText();

        String[] nombrePartes = nombres.split(" ", 2);
        String priNombre = nombrePartes[0];
        String seNombre = nombrePartes.length > 1 ? nombrePartes[1] : "";

        String apellidos = vistaPrincipal.getTxt_Apellidos().getText();
        String[] apellidoPartes = apellidos.split(" ", 2);
        String priApellido = apellidoPartes[0];
        String seApellido = apellidoPartes.length > 1 ? apellidoPartes[1] : "";

        int id_paciente = 0;
        String identificacion = vistaPrincipal.getTxt_Identificacion().getText();
        String primNombre = priNombre;
        String segNombre = seNombre;
        String primApellido = priApellido;
        String segApellido = seApellido;
        String email = vistaPrincipal.getTxt_Email().getText();
        String direccion = vistaPrincipal.getTxt_direccion().getText();
        String barrio = vistaPrincipal.getTxt_barrio().getText();
        String canton = vistaPrincipal.getTxt_canton().getText();
        String provincia = vistaPrincipal.getTxt_provincia().getText();
        String telefono = vistaPrincipal.getTxt_telefono().getText();
        Date fechaNacimiento = utilDateToSqlDate(vistaPrincipal.getJCL_FechaNacimiento().getDate());
        String lugar = vistaPrincipal.getTxt_lugar().getText();
        String pais = vistaPrincipal.getTxt_pais().getText();
        String genero = vistaPrincipal.getTxt_genero().getText();
        String estadoCivil = vistaPrincipal.getTxt_estadoCivil().getText();
        String sexo = vistaPrincipal.getTxt_sexo().getText();
        Blob foto = null;
//        byte[] foto = vistaPrincipal.getLbl_Foto().getText();
        String etnia = vistaPrincipal.getTxt_etnia().getText();

        Date fechaRegistro = utilDateToSqlDate(new java.util.Date());
        String carnetConadis = vistaPrincipal.getTxt_CarnetConadis().getText();
        boolean discapacidad = vistaPrincipal.getCkx_discapacidad().isSelected();
        String tipoDiscapacidad = vistaPrincipal.getTxt_tipoDiscapacidad().getText();
        int porctDiscapacidad = ((Number) vistaPrincipal.getSpr_Porcen_Discapasidad().getValue()).intValue();

        String contactoEmergencia = vistaPrincipal.getTxt_ContactoEmergencias().getText();
        boolean EstadoActivo = true;
        boolean EstadoActivoPersona = true;

        Paciente paciente = new Paciente(EstadoActivo, id_paciente, identificacion, primNombre, segNombre, primApellido, segApellido, email, direccion, barrio, canton, provincia, telefono, fechaNacimiento, lugar, pais, genero, estadoCivil, sexo, foto, etnia, fechaRegistro, carnetConadis, discapacidad, tipoDiscapacidad, porctDiscapacidad, contactoEmergencia, EstadoActivo);

        ///////////////////////////////////////////////////////
        int idAntecedentes = 0;
        String alergias = vistaPrincipal.getTxA_Persn_alergia().getText();
        String clinico = vistaPrincipal.getTxA_Persn_clinico().getText();
        String ginecologico = vistaPrincipal.getTxA_Persn_ginecologico().getText();
        String traumatologico = vistaPrincipal.getTxA_Persn_traumatologico().getText();
        String quirurgico = vistaPrincipal.getTxA_Persn_quirurgico().getText();
        String farmacologico = vistaPrincipal.getTxA_Persn_farmacologico().getText();
        String enfermedades = vistaPrincipal.getTxA_Persn_enfermedades().getText();
        String cirugias = vistaPrincipal.getTxA_Persn_cirugias().getText();
        String vacunas = vistaPrincipal.getTxA_Persn_vacunas().getText();

        AntecedentesPersonales antecedentesPersonales = new AntecedentesPersonales(idAntecedentes, alergias, clinico, ginecologico, traumatologico, quirurgico, farmacologico, enfermedades, cirugias, vacunas);

        ///////////////////////////////////////////////////////////////////
        String nivelAcademico = vistaPrincipal.getTxt_Nvl_Academico().getText();
        String carrera = vistaPrincipal.getTxt_carrera().getText();
        String ciclo = String.valueOf(vistaPrincipal.getSpr_ciclo().getValue());
        boolean estEstado = true;
        Estudiante estudiente = new Estudiante(nivelAcademico, carrera, ciclo, estEstado);

        /////////////////////////////////////////////////////////////////////////////////////
        int IdDoctor = 1;

        control.registrar(paciente, antecedentesPersonales, this.familiares, IdDoctor, this.rol, estudiente);
        System.out.println("Se cuardo el´paciente correctamente");
    }

    public Date utilDateToSqlDate(java.util.Date utilDate) {
        return new Date(utilDate.getTime());
    }

}
