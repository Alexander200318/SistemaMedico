package controlador_Vist;

import Controlador.Notificaciones;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import Controlador.ControladorPaciente;
import Modelo.AntecedentesFamiliares;
import Modelo.AntecedentesPersonales;
import Modelo.Estudiante;
import Modelo.Paciente;
import Modelo.Persona;
import Modelo.Singleton;
import Vista.FrmRegistrarsePaciente;
import Vista.PANEL_PRINCIPAL_PACIENTE;
import com.mysql.cj.jdbc.Blob;
import java.awt.BorderLayout;
import java.awt.MediaTracker;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.sql.Date;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import rsdragdropfiles.RSDragDropFiles;
import rojerusan.RSLabelImage;
import javax.swing.JLabel;

public class Registro_PacienteDAO {
    JLabel lbl= new JLabel();
    private ControladorPaciente control;
    private FrmRegistrarsePaciente vistaPrincipal;
    private String rol = " ";
    private String tipoSexo = "";
    private Singleton singleton;
    private List<AntecedentesFamiliares> familiares = new ArrayList<>();
    boolean identEstado = true;

    public Registro_PacienteDAO(FrmRegistrarsePaciente vistaPrincipal) {

        singleton = Singleton.getInstance();
        this.vistaPrincipal = vistaPrincipal;
        control = new ControladorPaciente();
        initListeners();
        configurarVista();
        EntradaIdentificacion();
        ArrastarImagen();
        vistaPrincipal.getBtn_Subir_Foto().addActionListener(e -> subirImagen());

    }
    
    
    public void subirImagen() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar Imagen");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                } else {
                    String filename = f.getName().toLowerCase();
                    return filename.endsWith(".jpg") || filename.endsWith(".jpeg") || filename.endsWith(".png") || filename.endsWith(".gif");
                }
            }

            @Override
            public String getDescription() {
                return "Archivos de Imagen (*.jpg, *.jpeg, *.png, *.gif)";
            }
        });

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                ImageIcon icon = new ImageIcon(selectedFile.getCanonicalPath());

                if (icon.getImageLoadStatus() == MediaTracker.ERRORED) {
                    System.out.println("Error al cargar la imagen desde la ruta especificada.");
                } else {
                    vistaPrincipal.getRSlabel_imagen().setText("");
                    vistaPrincipal.getRSlabel_imagen().setIcon(icon);
                    lbl.setIcon(icon);
                    rsdragdropfiles.RSDragDropFiles.setCopiar(selectedFile.getCanonicalPath(),"src/Recursos/IMAGEN_ARRASTRADO.png");
                    System.out.println("Imagen establecida correctamente en RslabelImagen.");
                }

                
                if (lbl.getIcon() != null) {
                    System.out.println("Imagen verificada correctamente en RslabelImagen.");
                } else {
                    System.out.println("Fallo al verificar la imagen en RslabelImagen.");
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    
    
    
    
    
    
    
    
    

    public byte[] IngresoImagen() {

        if ( lbl.getIcon()  != null) {
            ImageIcon icon = (ImageIcon) lbl.getIcon();
            Image image = icon.getImage();

            // Convertir la imagen a bytes en formato "jpg"
            byte[] imageInBytes = convertImageToByteArray(image, "jpg");

            // Guardar la imagen en la base de datos
            return imageInBytes;
        } else {
            System.out.println("El RslabelImagen no contiene ninguna imagen o no ha sido inicializado.");
        }
        return null;
    }

    public void ArrastarImagen() {
        
        RSDragDropFiles rsDragDropFiles = new rsdragdropfiles.RSDragDropFiles(vistaPrincipal.getPanel_contenedor_img(), (File[] files) -> {
            try {
                if (files.length > 1) {
                    Notificaciones.error("Error", "IMPOSIBLE IMPORTAR MÁS DE UNA IMAGEN");
                } else {
                    // Limpia el texto del label y establece la imagen
                    vistaPrincipal.getRSlabel_imagen().setText("");
                    ImageIcon icon = new ImageIcon(files[0].getCanonicalPath());

                    // Verificar si la imagen se carga correctamente
                    if (icon.getImageLoadStatus() == MediaTracker.ERRORED) {
                        System.out.println("Error al cargar la imagen desde la ruta especificada.");
                    } else {
                        vistaPrincipal.getRSlabel_imagen().setIcon(icon);
                         
                        lbl.setIcon(icon);
                        rsdragdropfiles.RSDragDropFiles.setCopiar(files[0].getCanonicalPath(), "src/Recursos/IMAGEN_ARRASTRADO.png");
                        System.out.println("Imagen establecida correctamente en RslabelImagen.");
                    }

                    // Verificación adicional
                    if (lbl.getIcon()!= null) {
                        System.out.println("Imagen verificada correctamente en RslabelImagen.");
                    } else {
                        System.out.println("Fallo al verificar la imagen en RslabelImagen.");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        vistaPrincipal.getTxt_Identificacion_pac().addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                identEstado = control.verificarIdentificacion(vistaPrincipal.getTxt_Identificacion_pac().getText());
                System.out.println("Identificación verificada.");
            }
        });
    }

    public void EntradaIdentificacion() {

        vistaPrincipal.getTxt_Identificacion_pac().addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                identEstado = control.verificarIdentificacion(vistaPrincipal.getTxt_Identificacion_pac().getText());
                System.out.println(" sale");
            }
        });

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

    public String Seleccion_tipo_sangre() {
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
            } else if (selectedItemString.equalsIgnoreCase("B-")) {
                valor = "B-";
            } else if (selectedItemString.equalsIgnoreCase("AB+")) {
                valor = "AB+";
            } else if (selectedItemString.equalsIgnoreCase("AB-")) {
                valor = "AB-";
            } else if (selectedItemString.equalsIgnoreCase("O+")) {
                valor = "O+";
            } else if (selectedItemString.equalsIgnoreCase("O-")) {
                valor = "O-";
            }
        }
        return valor;

    }

    public String Seleccion_Estado_civil() {
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
            } else if (selectedItemString.equalsIgnoreCase("Viudo")) {
                valor = "Viudo";
            } else if (selectedItemString.equalsIgnoreCase("Unión Libre")) {
                valor = "Unión Libre";
            } else if (selectedItemString.equalsIgnoreCase("Separado")) {
                valor = "Separado";
            }
        }
        return valor;

    }

    public String Seleccion_Parentesco() {
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
            } else if (selectedItemString.equalsIgnoreCase("Abuelos")) {
                valor = "Abuelos";
            } else if (selectedItemString.equalsIgnoreCase("Hermanos")) {
                valor = "Hermanos";
            }
        }
        return valor;

    }

    public String Seleccion_Carrera() {
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
            } else if (selectedItemString.equalsIgnoreCase("Ciberseguridad")) {
                valor = "Ciberseguridad";
            } else if (selectedItemString.equalsIgnoreCase("Producción y Realización Audiovisual")) {
                valor = "Producción y Realización Audiovisual";
            } else if (selectedItemString.equalsIgnoreCase("Seguridad y Prevención de Riesgos Laborales")) {
                valor = "Seguridad y Prevención de Riesgos Laborales";

            } else if (selectedItemString.equalsIgnoreCase("Gestión de Patrimonios Histórico-Cultural")) {
                valor = "Gestión de Patrimonios Histórico-Cultural";

            } else if (selectedItemString.equalsIgnoreCase("Desarrollo de Software")) {
                valor = "Desarrollo de Software";
            } else if (selectedItemString.equalsIgnoreCase("Entrenamiento Deportivo")) {
                valor = "Entrenamiento Deportivo";

            } else if (selectedItemString.equalsIgnoreCase("Mecánica")) {
                valor = "Mecánica";

            } else if (selectedItemString.equalsIgnoreCase("Mantenimiento Eléctrico y Control Industrial")) {
                valor = "Mantenimiento Eléctrico y Control Industrial";

            } else if (selectedItemString.equalsIgnoreCase("Mecatrónica")) {
                valor = "Mecatrónica";

            } else if (selectedItemString.equalsIgnoreCase("Administración de Infraestructura y Plataformas Tecnológicas")) {
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

//        ImageIcon icon = (ImageIcon) vistaPrincipal.getRSlabel_imagen().getIcon();
//        Image image = icon.getImage();
        byte[] imageInBytes = IngresoImagen();
        if (imageInBytes != null) {
            paciente.setFoto(imageInBytes);
        } else {
            System.out.println("No se pudo obtener la imagen para el paciente.");
        }
//        
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

        int idDoctor = singleton.getId_Doctor();
        System.out.println("Paciente: " + paciente);

        try {
            if (validarDatosPaciente(paciente)) {
                boolean resultado = control.registrar(paciente, antecedentesPersonales, antecedentesFamiliares, idDoctor, rol, estudiante, identEstado);
                if (resultado) {
                    System.out.println("Se guardó el paciente correctamente.");
                    /////////////////////////////////////////////////////////////////////////////
                    Notificaciones.success("¡CONFIRMACIÓN!", "Se guardo correctamente al Paciente");
                    PasarPanel();
                    /////////////////////////////////////////////////////////////////////////////
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
        if (utilDate != null) {
            return new Date(utilDate.getTime());
        }
        return null;
    }

    private boolean validarDatosPaciente(Paciente paciente) {
        boolean esValido = true;
        StringBuilder errores = new StringBuilder();

        // Validar identificación
        if (paciente.getIdentificacion() == null || paciente.getIdentificacion().trim().isEmpty()) {
            errores.append("La identificación es requerida.\n");
            esValido = false;
        } else if (!Pattern.matches("\\d{10}", paciente.getIdentificacion())) {
            errores.append("La identificación debe tener exactamente 10 dígitos.\n");
            esValido = false;
        }

        // Validar primer nombre
        if (paciente.getPrimNombre().trim().isEmpty()) {
            errores.append("El primer nombre es requerido.\n");
            esValido = false;
        } else if (!Pattern.matches("^[\\p{L} ]+$", paciente.getPrimNombre())) {
            errores.append("El primer nombre solo debe contener letras y espacios.\n");
            esValido = false;
        }

        // Validar segundo nombre (puede estar vacío)
        if (!paciente.getSegNombre().trim().isEmpty() && !Pattern.matches("^[\\p{L} ]*$", paciente.getSegNombre())) {
            errores.append("El segundo nombre solo debe contener letras y espacios.\n");
            esValido = false;
        }

        // Validar primer apellido
        if (paciente.getPrimApellido().trim().isEmpty()) {
            errores.append("El primer apellido es requerido.\n");
            esValido = false;
        } else if (!Pattern.matches("^[\\p{L} ]+$", paciente.getPrimApellido())) {
            errores.append("El primer apellido solo debe contener letras y espacios.\n");
            esValido = false;
        }

        // Validar segundo apellido (puede estar vacío)
        if (!paciente.getSegApellido().trim().isEmpty() && !Pattern.matches("^[\\p{L} ]*$", paciente.getSegApellido())) {
            errores.append("El segundo apellido solo debe contener letras y espacios.\n");
            esValido = false;
        }

        // Validar correo electrónico
        if (paciente.getEmail() == null || paciente.getEmail().trim().isEmpty()) {
            errores.append("El correo electrónico es requerido.\n");
            esValido = false;
        } else if (!Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", paciente.getEmail())) {
            errores.append("El correo electrónico no es válido.\n");
            esValido = false;
        }

        // Validar fecha de nacimiento
        if (paciente.getFechaNacimiento() == null) {
            errores.append("La fecha de nacimiento es requerida.\n");
            esValido = false;
        }

        // Validar contacto de emergencia
        if (paciente.getContactoEmergencia() == null || paciente.getContactoEmergencia().trim().isEmpty()) {
            errores.append("El contacto de emergencia es requerido.\n");
            esValido = false;
        } else if (!Pattern.matches("^\\d{10}$", paciente.getContactoEmergencia())) {
            errores.append("El contacto de emergencia debe tener exactamente 10 dígitos.\n");
            esValido = false;
        }

        if (!esValido) {
            JOptionPane.showMessageDialog(vistaPrincipal, errores.toString(), "Errores de Validación", JOptionPane.ERROR_MESSAGE);
        }

        return esValido;
    }

    public void PasarPanel() {

        PANEL_PRINCIPAL_PACIENTE PrincPaciente = new PANEL_PRINCIPAL_PACIENTE();
        PrincPaciente.setSize(1280, 680);
        PrincPaciente.setLocation(0, 0);

        this.vistaPrincipal.removeAll();
        this.vistaPrincipal.add(PrincPaciente, BorderLayout.CENTER);
        this.vistaPrincipal.revalidate();
        this.vistaPrincipal.repaint();

    }

    public static byte[] convertImageToByteArray(Image image, String format) {
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
        bufferedImage.getGraphics().drawImage(image, 0, 0, null);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(bufferedImage, format, baos);
            baos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] imageInBytes = baos.toByteArray();

        try {
            baos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return imageInBytes;
    }

}
