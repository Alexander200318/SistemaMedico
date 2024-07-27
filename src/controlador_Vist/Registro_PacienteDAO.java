package controlador_Vist;

import Controlador.ControladorPaciente;
import Modelo.AntecedentesFamiliares;
import Modelo.AntecedentesPersonales;
import Modelo.Estudiante;
import Modelo.Paciente;
import Modelo.Persona;
import Modelo.Singleton;
import Vista.FrmRegistrarsePaciente;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.sql.Date;

public class Registro_PacienteDAO {

    private ControladorPaciente control;
    private FrmRegistrarsePaciente vistaPrincipal;
    private String rol = " ";
    private String tipoSexo = "";
    private Singleton singleton;
    private List<AntecedentesFamiliares> familiares = new ArrayList<>();

    public Registro_PacienteDAO(FrmRegistrarsePaciente vistaPrincipal) {

        singleton = Singleton.getInstance();
        this.vistaPrincipal = vistaPrincipal;
        control = new ControladorPaciente();
        initListeners();
        configurarVista();
    }

    private void configurarVista() {
        vistaPrincipal.getSpr_ciclo().setEnabled(false);
        vistaPrincipal.getSpr_ciclo().setValue(0);
        vistaPrincipal.getCbx_Carreras().setEnabled(false);
        
        vistaPrincipal.getTxt_tipoDiscapacidad().setText(null);
        vistaPrincipal.getTxt_tipoDiscapacidad().setEnabled(false);
        vistaPrincipal.getSpr_Porcen_Discapasidad().setValue(0);
        vistaPrincipal.getSpr_Porcen_Discapasidad().setEnabled(false);
        vistaPrincipal.getTxt_CarnetConadis().setText(null);
        vistaPrincipal.getTxt_CarnetConadis().setEnabled(false);
    }

    private void initListeners() {
        vistaPrincipal.getBtn_guardar_Familiar().addActionListener(e -> guardarAntecedFamiliares());
        vistaPrincipal.getBtn_Guardar().addActionListener(e -> IngresoDatos());

        vistaPrincipal.getCkx_discapacidad().addActionListener(e -> ClickDiscapacidad());
        vistaPrincipal.getRbn_Alumno().addActionListener(e -> Seleccion_tipo());
        vistaPrincipal.getRbn_docente().addActionListener(e -> Seleccion_tipo());
    }

    public void guardarAntecedFamiliares() {
        
        
        String parentescoFamilia = Seleccion_Parentesco();
        int idAntecedentes_Fm = 0; // Asegúrate de manejar correctamente el ID
        String alergias_Fm = vistaPrincipal.getTxA_Faml_alergia().getText().trim();
        String clinico_Fm = vistaPrincipal.getTxA_Faml_clinico().getText().trim();
        String ginecologico_Fm = vistaPrincipal.getTxA_Faml_ginecologo().getText().trim();
        String traumatologico_Fm = vistaPrincipal.getTxA_Faml_traumatologico().getText().trim();
        String quirurgico_Fm = vistaPrincipal.getTxA_Faml_quirurgico().getText().trim();
        String farmacologico_Fm = vistaPrincipal.getTxA_Faml_farmacologico().getText().trim();
        String enfermedades_Fm = vistaPrincipal.getTxA_Faml_enfermedades().getText().trim();
        String cirugias_Fm = vistaPrincipal.getTxA_Faml_cirugia().getText().trim();
        String vacunas_Fm = vistaPrincipal.getTxA_Faml_vacunas().getText().trim();

        AntecedentesFamiliares familia = new AntecedentesFamiliares(
                parentescoFamilia,
                idAntecedentes_Fm,
                alergias_Fm,
                clinico_Fm,
                ginecologico_Fm,
                traumatologico_Fm,
                quirurgico_Fm,
                farmacologico_Fm,
                enfermedades_Fm,
                cirugias_Fm,
                vacunas_Fm
        );

        familiares.add(familia);
        limpiarCamposFamiliares();
    }

    private void limpiarCamposFamiliares() {
//        vistaPrincipal.getTxt_Faml_PARENTESCO().setText("");
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

    public void ClickDiscapacidad() {
        boolean seleccionado = vistaPrincipal.getCkx_discapacidad().isSelected();
        vistaPrincipal.getTxt_tipoDiscapacidad().setEnabled(seleccionado);
        vistaPrincipal.getSpr_Porcen_Discapasidad().setEnabled(seleccionado);
        vistaPrincipal.getTxt_CarnetConadis().setEnabled(seleccionado);

        if (!seleccionado) {
            vistaPrincipal.getTxt_tipoDiscapacidad().setText(null);
            vistaPrincipal.getSpr_Porcen_Discapasidad().setValue(0);
            vistaPrincipal.getTxt_CarnetConadis().setText(null);
        }
    }

    public void Seleccion_tipo() {
        boolean esEstudiante = vistaPrincipal.getRbn_Alumno().isSelected();
        vistaPrincipal.getSpr_ciclo().setEnabled(esEstudiante);
        vistaPrincipal.getCbx_Carreras().setEnabled(esEstudiante);
        rol = esEstudiante ? "estudiante" : "docente";
    }

    public String SeleccionSEXO() {
        if (vistaPrincipal.getRbn_Femenino().isSelected()) {
            tipoSexo = "F";
        } else if (vistaPrincipal.getRbn_Masculino().isSelected()) {
            tipoSexo = "M";
        }
        return tipoSexo;
    }
    


    public String Seleccion_tipo_sangre(){
    String valor = "";
        Object selectedItem = this.vistaPrincipal.getCbx_tipo_sangre().getSelectedItem();
        if (selectedItem != null) {
            String selectedItemString = String.valueOf(selectedItem);
            if (selectedItemString.equalsIgnoreCase("A+")) {
                valor = "A+";
            } else if (selectedItemString.equalsIgnoreCase("A-")) {
                valor = "A-";
            } else if (selectedItemString.equalsIgnoreCase("B+")) {
                valor = "B+";
            }else if (selectedItemString.equalsIgnoreCase("B-")) {
                valor = "B-";
            }else if (selectedItemString.equalsIgnoreCase("AB+")) {
                valor = "AB+";
            }else if (selectedItemString.equalsIgnoreCase("AB-")) {
                valor = "AB-";
            }else if (selectedItemString.equalsIgnoreCase("O+")) {
                valor = "O+";
            }else if (selectedItemString.equalsIgnoreCase("O-")) {
                valor = "O-";
            }
        }
        return valor;
  
    }
    

     public String Seleccion_Estado_civil(){
    String valor = "";
        Object selectedItem = this.vistaPrincipal.getCbx_estado_civil().getSelectedItem();
        if (selectedItem != null) {
            String selectedItemString = String.valueOf(selectedItem);
            if (selectedItemString.equalsIgnoreCase("Soltero")) {
                valor = "Soltero";
            } else if (selectedItemString.equalsIgnoreCase("Casado")) {
                valor = "Casado";
            } else if (selectedItemString.equalsIgnoreCase("Divorciado")) {
                valor = "Divorciado";
            }else if (selectedItemString.equalsIgnoreCase("Viudo")) {
                valor = "Viudo";
            }else if (selectedItemString.equalsIgnoreCase("Unión Libre")) {
                valor = "Unión Libre";
            }else if (selectedItemString.equalsIgnoreCase("Separado")) {
                valor = "Separado";
            }
        }
        return valor;
  
    }
     
     
     




        public String Seleccion_Parentesco(){
    String valor = "";
        Object selectedItem = this.vistaPrincipal.getCb_Parentesco().getSelectedItem();
        if (selectedItem != null) {
            String selectedItemString = String.valueOf(selectedItem);
            if (selectedItemString.equalsIgnoreCase("Otro")) {
                valor = "Otro";
            } else if (selectedItemString.equalsIgnoreCase("Padres")) {
                valor = "Padres";
            } else if (selectedItemString.equalsIgnoreCase("Hijos")) {
                valor = "Hijos";
            }else if (selectedItemString.equalsIgnoreCase("Abuelos")) {
                valor = "Abuelos";
            }else if (selectedItemString.equalsIgnoreCase("Hermanos")) {
                valor = "Hermanos";
            }
        }
        return valor;
  
    }
     
 
     public String Seleccion_Carrera(){
    String valor = "";
        Object selectedItem = this.vistaPrincipal.getCbx_Carreras().getSelectedItem();
        if (selectedItem != null) {
            String selectedItemString = String.valueOf(selectedItem);
            if (selectedItemString.equalsIgnoreCase("Otros")) {
                valor = "Otros";
            } else if (selectedItemString.equalsIgnoreCase("Big Data")) {
                valor = "Big Data";
            } else if (selectedItemString.equalsIgnoreCase("Tributación")) {
                valor = "Tributación";
            }else if (selectedItemString.equalsIgnoreCase("Ciberseguridad")) {
                valor = "Ciberseguridad";
            }else if (selectedItemString.equalsIgnoreCase("Producción y Realización Audiovisual")) {
                valor = "Producción y Realización Audiovisual";
            }else if (selectedItemString.equalsIgnoreCase("Seguridad y Prevención de Riesgos Laborales")) {
                valor = "Seguridad y Prevención de Riesgos Laborales";
                
            }else if (selectedItemString.equalsIgnoreCase("Gestión de Patrimonios Histórico-Cultural")) {
                valor = "Gestión de Patrimonios Histórico-Cultural";
                
            }else if (selectedItemString.equalsIgnoreCase("Desarrollo de Software")) {
                valor = "Desarrollo de Software";
            }else if (selectedItemString.equalsIgnoreCase("Entrenamiento Deportivo")) {
                valor = "Entrenamiento Deportivo";
                
            }else if (selectedItemString.equalsIgnoreCase("Mecánica")) {
                valor = "Mecánica";
                
            }else if (selectedItemString.equalsIgnoreCase("Mantenimiento Eléctrico y Control Industrial")) {
                valor = "Mantenimiento Eléctrico y Control Industrial";
                
            }else if (selectedItemString.equalsIgnoreCase("Mecatrónica")) {
                valor = "Mecatrónica";
                
            }else if (selectedItemString.equalsIgnoreCase("Administración de Infraestructura y Plataformas Tecnológicas")) {
                valor = "Administración de Infraestructura y Plataformas Tecnológicas";
                
            }
        }
        return valor;
  
    }
     
     

    public void IngresoDatos() {
        Paciente paciente = new Paciente();
        paciente.setIdentificacion(getValidData(vistaPrincipal.getTxt_Identificacion_pac().getText()));
        paciente.setPrimNombre(getValidData(vistaPrincipal.getTxt_Nombres().getText().split(" ")[0]));
        paciente.setSegNombre(getValidData(vistaPrincipal.getTxt_Nombres().getText().split(" ").length > 1 ? vistaPrincipal.getTxt_Nombres().getText().split(" ")[1] : ""));
        paciente.setPrimApellido(getValidData(vistaPrincipal.getTxt_Apellidos().getText().split(" ")[0]));
        paciente.setSegApellido(getValidData(vistaPrincipal.getTxt_Apellidos().getText().split(" ").length > 1 ? vistaPrincipal.getTxt_Apellidos().getText().split(" ")[1] : ""));
        paciente.setEmail(getValidData(vistaPrincipal.getTxt_Email().getText()));
        paciente.setDireccion(getValidData(vistaPrincipal.getTxt_direccion().getText()));
        paciente.setBarrio(getValidData(vistaPrincipal.getTxt_barrio().getText()));
        paciente.setCanton(getValidData(vistaPrincipal.getTxt_canton().getText()));
        paciente.setProvincia(getValidData(vistaPrincipal.getTxt_provincia().getText()));
        paciente.setTelefono(getValidData(vistaPrincipal.getTxt_telefono().getText()));
        paciente.setFechaNacimiento(utilDateToSqlDate(vistaPrincipal.getJCL_FechaNacimiento().getDate()));
        paciente.setLugar(getValidData(vistaPrincipal.getTxt_lugar().getText()));
        paciente.setPais(getValidData(vistaPrincipal.getTxt_pais().getText()));
        paciente.setGenero(getValidData(vistaPrincipal.getTxt_genero().getText()));
        paciente.setEstadoCivil(getValidData(Seleccion_Estado_civil()));
        paciente.setSexo(SeleccionSEXO());
        paciente.setEtnia(getValidData(vistaPrincipal.getTxt_etnia().getText()));
        paciente.setFechaRegistro(utilDateToSqlDate(new java.util.Date()));
        paciente.setCarnetConadis(getValidData(vistaPrincipal.getTxt_CarnetConadis().getText()));
        paciente.setDiscapacidad(vistaPrincipal.getCkx_discapacidad().isSelected());
        paciente.setTipoDiscapacidad(getValidData(vistaPrincipal.getTxt_tipoDiscapacidad().getText()));
        paciente.setPorctDiscapacidad(((Number) vistaPrincipal.getSpr_Porcen_Discapasidad().getValue()).intValue());
        paciente.setContactoEmergencia(getValidData(vistaPrincipal.getTxt_ContactoEmergencias().getText()));
        paciente.setEstadoActivo(true);
        paciente.setPacEstActivo(true);
        paciente.setTipo_sangre(Seleccion_tipo_sangre());

        AntecedentesPersonales antecedentesPersonales = new AntecedentesPersonales(
                0, // Asignar ID si es necesario
                getValidData(vistaPrincipal.getTxA_Persn_alergia().getText()),
                getValidData(vistaPrincipal.getTxA_Persn_clinico().getText()),
                getValidData(vistaPrincipal.getTxA_Persn_ginecologico().getText()),
                getValidData(vistaPrincipal.getTxA_Persn_traumatologico().getText()),
                getValidData(vistaPrincipal.getTxA_Persn_quirurgico().getText()),
                getValidData(vistaPrincipal.getTxA_Persn_farmacologico().getText()),
                getValidData(vistaPrincipal.getTxA_Persn_enfermedades().getText()),
                getValidData(vistaPrincipal.getTxA_Persn_cirugias().getText()),
                getValidData(vistaPrincipal.getTxA_Persn_vacunas().getText())
        );

        List<AntecedentesFamiliares> antecedentesFamiliares = this.familiares.stream()
                .map(fam -> new AntecedentesFamiliares(
                fam.getParentescoFamiliar(),
                fam.getIdAntecedentes(),
                getValidData(fam.getAlergias()),
                getValidData(fam.getClinico()),
                getValidData(fam.getGinecologico()),
                getValidData(fam.getTraumatologico()),
                getValidData(fam.getQuirurgico()),
                getValidData(fam.getFarmacologico()),
                getValidData(fam.getEnfermedades()),
                getValidData(fam.getCirugias()),
                getValidData(fam.getVacunas())
        ))
                .collect(Collectors.toList());

        Estudiante estudiante = null;
        if (rol.equals("estudiante")) {
            estudiante = new Estudiante(
                    Seleccion_Carrera(),
                    String.valueOf(vistaPrincipal.getSpr_ciclo().getValue()).trim(),
                    true
            );
        }

        Persona persona = new Persona();

        int idDoctor = singleton.getId_Doctor();
        System.out.println("Paciente: " + paciente);
        System.out.println("Persona: " + paciente);

        try {
            if (validarDatosPaciente(paciente, antecedentesPersonales, antecedentesFamiliares, estudiante)) {
                boolean resultado = control.registrar(persona, paciente, antecedentesPersonales, antecedentesFamiliares, idDoctor, rol, estudiante);
                if (resultado) {
                    System.out.println("Se guardó el paciente correctamente.");
                } else {
                    System.out.println("Error al guardar el paciente.");
                }
            } else {
                System.out.println("Datos del paciente no válidos.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private String getValidData(String data) {
        return data == null || data.trim().isEmpty() ? "Ninguno" : data.trim();
    }

    public Date utilDateToSqlDate(java.util.Date utilDate) {
        return new Date(utilDate.getTime());
    }

    private boolean validarDatosPaciente(Paciente paciente, AntecedentesPersonales antecedentesPersonales, List<AntecedentesFamiliares> familiares, Estudiante estudiante) {
        // Validar identificación
        if (paciente.getIdentificacion() == null || paciente.getIdentificacion().trim().isEmpty()) {
            System.out.println("La identificación es requerida.");
            return false;
        }

        // Validar nombres
        if (paciente.getPrimNombre().trim().isEmpty()) {
            System.out.println("El primer nombre es requerido.");
            return false;
        }

        // Validar apellidos
        if (paciente.getPrimApellido().trim().isEmpty()) {
            System.out.println("El primer apellido es requerido.");
            return false;
        }

        // Validar correo electrónico
        if (paciente.getEmail() == null || paciente.getEmail().trim().isEmpty()) {
            System.out.println("El correo electrónico es requerido.");
            return false;
        }

        // Validar fecha de nacimiento
        if (paciente.getFechaNacimiento() == null) {
            System.out.println("La fecha de nacimiento es requerida.");
            return false;
        }

        // Validar contacto de emergencia
        if (paciente.getContactoEmergencia() == null || paciente.getContactoEmergencia().trim().isEmpty()) {
            System.out.println("El contacto de emergencia es requerido.");
            return false;
        }

        // Validar antecedentes personales
        if (antecedentesPersonales == null) {
            System.out.println("Los antecedentes personales son requeridos.");
            return false;
        }

        // Validar antecedentes familiares
        if (familiares == null || familiares.isEmpty()) {
            System.out.println("Se deben agregar antecedentes familiares.");
            return false;
        }

        // Validar estudiante
        if (rol.equals("estudiante") && (estudiante == null )) {
            System.out.println("Los datos del estudiante son requeridos.");
            return false;
        }

        // Si todas las validaciones pasan
        return true;
    }
}
