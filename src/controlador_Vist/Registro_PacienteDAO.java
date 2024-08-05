package controlador_Vist;

import Controlador.Notificaciones;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import javax.imageio.ImageIO;
import Controlador.ControladorPaciente;
import Modelo.AntecedentesFamiliares;
import Modelo.AntecedentesPersonales;
import Modelo.Carrera;
import Modelo.Conexion;
import Modelo.Discapacidad;
import Modelo.Estudiante;
import Modelo.Paciente;
import Modelo.Singleton;
import Vista.CrudCarrera;
import Vista.FrmRegistrarsePaciente;
import Vista.PANEL_PRINCIPAL_PACIENTE;
import java.awt.BorderLayout;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import rsdragdropfiles.RSDragDropFiles;
import javax.swing.JLabel;
import java.sql.*;
import java.util.Calendar;
import java.util.Optional;

public class Registro_PacienteDAO {

    JLabel lbl = new JLabel();
    private ControladorPaciente control;
    private FrmRegistrarsePaciente vistaPrincipal;
    private String rol = " ";
    private String tipoSexo = "";
    private Singleton singleton;
    private List<AntecedentesFamiliares> Listafamiliares = new ArrayList<>();
    boolean identEstado = true;
    String selectedItem = "";
    int idCarrera = 0;

    public Registro_PacienteDAO(FrmRegistrarsePaciente vistaPrincipal) {

        singleton = Singleton.getInstance();
        this.vistaPrincipal = vistaPrincipal;
        control = new ControladorPaciente();
        initListeners();
        configurarVista();
        EntradaIdentificacion();
        ArrastarImagen();

        vistaPrincipal.getBtn_Subir_Foto().addActionListener(e -> subirImagen());

        vistaPrincipal.getCBX_tipoDiscapacidad().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el elemento seleccionado del JComboBox
                selectedItem = (String) vistaPrincipal.getCBX_tipoDiscapacidad().getSelectedItem();

            }
        });
        vistaPrincipal.getBtnCrudCarrera().addActionListener((e) ->  {
            CrudCarrera crud = new CrudCarrera();
            crud.setVisible(true);
            
        });
        
        
        

        vistaPrincipal.getCbx_Carreras().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Carrera carreraSeleccionada = (Carrera) vistaPrincipal.getCbx_Carreras().getSelectedItem();
                if (carreraSeleccionada != null) {
                    idCarrera = carreraSeleccionada.getIdCarrera();
                    System.out.println("Id Carrera = " + idCarrera);

                }
            }
        });
        cargarCarreras();
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////

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
                // Crear directorio si no existe
                File directory = new File("src/Recursos");
                if (!directory.exists()) {
                    directory.mkdirs();
                }

                // Obtener la extensión del archivo original
                String originalFileName = selectedFile.getName();
                String fileExtension = originalFileName.substring(originalFileName.lastIndexOf('.'));

                // Construir la ruta de destino con la misma extensión
                String destinationPath = "src/Recursos/IMAGEN_ARRASTRADOBoton" + fileExtension;

                // Mostrar un gráfico de carga temporal
                vistaPrincipal.getRSlabel_imagen().setText("Cargando...");
                vistaPrincipal.getRSlabel_imagen().setIcon(null);

                boolean imageLoaded = false;
                int attempts = 0;
                int maxAttempts = 5; // Número máximo de intentos

                while (!imageLoaded && attempts < maxAttempts) {
                    attempts++;
                    ImageIcon icon = new ImageIcon(selectedFile.getCanonicalPath());

                    // Verificar si la imagen se carga correctamente
                    if (icon.getImageLoadStatus() == MediaTracker.ERRORED) {
                        System.out.println("Intento " + attempts + ": Error al cargar la imagen desde la ruta especificada.");
                    } else {
                        vistaPrincipal.getRSlabel_imagen().setText("");
                        vistaPrincipal.getRSlabel_imagen().setIcon(icon);
                        lbl.setIcon(icon);

                        try {
                            // Copiar el archivo a la ubicación destino
                            Files.copy(selectedFile.toPath(), new File(destinationPath).toPath(), StandardCopyOption.REPLACE_EXISTING);
                            System.out.println("Imagen copiada a la ubicación destino.");
                            imageLoaded = true;
                        } catch (IOException e) {
                            System.out.println("Error al copiar la imagen: " + e.getMessage());
                            e.printStackTrace();
                        }
                    }

                    if (!imageLoaded) {
                        try {
                            Thread.sleep(500); 
                        } catch (InterruptedException e) {
                            System.out.println("Error al esperar entre intentos: " + e.getMessage());
                        }
                    }
                }

                // Mensaje final dependiendo del resultado del bucle
                if (imageLoaded) {
                    System.out.println("Imagen verificada correctamente en RslabelImagen.");
                } else {
                    System.out.println("Fallo al verificar la imagen en RslabelImagen después de " + attempts + " intentos.");
                    vistaPrincipal.getRSlabel_imagen().setText("Imagen no disponible");
                    vistaPrincipal.getRSlabel_imagen().setIcon(null); // Se asegura que no haya icono si no se cargó
                }

            } catch (IOException ex) {
                System.out.println("Error al acceder al archivo de imagen: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    public byte[] IngresoImagen() {

        if (lbl.getIcon() != null) {
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
        RSDragDropFiles rsDragDropFiles = new rsdragdropfiles.RSDragDropFiles(
                vistaPrincipal.getPanel_contenedor_img(),
                (File[] files) -> {
                    try {
                        if (files.length > 1) {
                            Notificaciones.error("Error", "IMPOSIBLE IMPORTAR MÁS DE UNA IMAGEN");
                        } else {
                            // Limpia el texto del label
                            vistaPrincipal.getRSlabel_imagen().setText("");

                            boolean imageLoaded = false;
                            int attempts = 0;
                            int maxAttempts = 5; // Número máximo de intentos

                            while (!imageLoaded && attempts < maxAttempts) {
                                attempts++;
                                ImageIcon icon = new ImageIcon(files[0].getCanonicalPath());

                                // Verificar si la imagen se carga correctamente
                                if (icon.getImageLoadStatus() == MediaTracker.ERRORED) {
                                    System.out.println("Intento " + attempts + ": Error al cargar la imagen desde la ruta especificada.");
                                } else {
                                    vistaPrincipal.getRSlabel_imagen().setIcon(icon);
                                    lbl.setIcon(icon);
                                    rsdragdropfiles.RSDragDropFiles.setCopiar(
                                            files[0].getCanonicalPath(),
                                            "src/Recursos/IMAGEN_ARRASTRADO.png"
                                    );
                                    System.out.println("Imagen establecida correctamente en RslabelImagen.");
                                    imageLoaded = true;
                                }

                                // Espera breve antes del próximo intento
                                if (!imageLoaded) {
                                    try {
                                        Thread.sleep(500); // Esperar 500 milisegundos antes de intentar nuevamente
                                    } catch (InterruptedException e) {
                                        System.out.println("Error al esperar entre intentos: " + e.getMessage());
                                    }
                                }
                            }

                            // Mensaje final dependiendo del resultado del bucle
                            if (imageLoaded) {
                                System.out.println("Imagen verificada correctamente en RslabelImagen.");
                            } else {
                                System.out.println("Fallo al verificar la imagen en RslabelImagen después de " + attempts + " intentos.");
                                vistaPrincipal.getRSlabel_imagen().setText("Imagen no disponible");
                                vistaPrincipal.getRSlabel_imagen().setIcon(null); // Se asegura que no haya icono si no se cargó
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        );

        vistaPrincipal.getTxt_Identificacion_pac().addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                identEstado = control.verificarIdentificacion(
                        vistaPrincipal.getTxt_Identificacion_pac().getText()
                );
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

        vistaPrincipal.getTxt_Observacion().setText(null);
        vistaPrincipal.getRB_Si_carnet().setText(null);
        vistaPrincipal.getRB_No_carnet().setEnabled(false);
        vistaPrincipal.getSpr_Porcen_Discapasidad().setValue(0);
        vistaPrincipal.getSpr_Porcen_Discapasidad().setEnabled(false);
        vistaPrincipal.getCBX_tipoDiscapacidad().setEnabled(false);
        vistaPrincipal.getSpr_Porcen_Discapasidad().setEnabled(false);
    }

    private void initListeners() {
        vistaPrincipal.getBtn_guardar_Familiar().addActionListener(e -> guardarAntecedFamiliares());
        vistaPrincipal.getBtn_Guardar().addActionListener(e -> IngresoDatos());

        vistaPrincipal.getCkx_discapacidad().addActionListener(e -> ClickDiscapacidad());
        vistaPrincipal.getRbn_Alumno().addActionListener(e -> Seleccion_tipo());
        vistaPrincipal.getRbn_docente().addActionListener(e -> Seleccion_tipo());
        vistaPrincipal.getRbn_Administrativo().addActionListener(e -> Seleccion_tipo());
        vistaPrincipal.getRbn_Servicios().addActionListener(e -> Seleccion_tipo());
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
        manejarAntecedenteFamiliar(familia, Listafamiliares);

        Listafamiliares.add(familia);

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
        vistaPrincipal.getCBX_tipoDiscapacidad().setEnabled(seleccionado);
        vistaPrincipal.getSpr_Porcen_Discapasidad().setEnabled(seleccionado);
        vistaPrincipal.getTxt_Observacion().setEnabled(seleccionado);
        vistaPrincipal.getRB_Si_carnet().setEnabled(seleccionado);
        vistaPrincipal.getRB_No_carnet().setEnabled(seleccionado);

        if (!seleccionado) {
            vistaPrincipal.getCBX_tipoDiscapacidad().setEnabled(false);
            vistaPrincipal.getSpr_Porcen_Discapasidad().setEnabled(false);
            vistaPrincipal.getTxt_Observacion().setEnabled(false);
            vistaPrincipal.getRB_Si_carnet().setEnabled(false);
            vistaPrincipal.getRB_No_carnet().setEnabled(false);
            vistaPrincipal.getSpr_Porcen_Discapasidad().setValue(0);
            vistaPrincipal.getTxt_Observacion().setText(null);
        }
    }

    public void Seleccion_tipo() {
        boolean esAdministrativo = vistaPrincipal.getRbn_Administrativo().isSelected();
        boolean esServicios = vistaPrincipal.getRbn_Servicios().isSelected();
        boolean esDocente = vistaPrincipal.getRbn_docente().isSelected();

        boolean esEstudiante = vistaPrincipal.getRbn_Alumno().isSelected();
        vistaPrincipal.getSpr_ciclo().setEnabled(esEstudiante);
        vistaPrincipal.getCbx_Carreras().setEnabled(esEstudiante);

        if (esAdministrativo) {
            rol = "administrativo";
            System.out.println("Rol :" + rol);
        } else if (esEstudiante) {
            rol = "estudiante";
            System.out.println("Rol :" + rol);
        } else if (esServicios) {
            rol = "servicios";
            System.out.println("Rol :" + rol);
        } else if (esDocente) {
            rol = "docente";
            System.out.println("Rol :" + rol);
        } else {
            rol = "";
            System.out.println("Rol _:" + rol);
        }
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
//////////////////////////////////////////////////popiugytf

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
/////////////////////////////////////////////////////////////////

    public boolean SeleccionConadis() {
        boolean conadis;
        if (vistaPrincipal.getRB_Si_carnet().isSelected()) {
            conadis = true;
        } else if (vistaPrincipal.getRB_No_carnet().isSelected()) {
            conadis = false;
        }
        return false;

    }

    public void IngresoDatos() {
        Paciente paciente = new Paciente();
        paciente.setIdentificacion((vistaPrincipal.getTxt_Identificacion_pac().getText()));

        // Obtener y validar nombres
        String[] nombres = vistaPrincipal.getTxt_Nombres().getText().trim().replaceAll("\\s+", " ").split(" ");
        paciente.setPrimNombre(getValidNameOrEmpty(nombres, 0));  // Valida y asigna primer nombre
        paciente.setSegNombre(getValidNameOrEmpty(nombres, 1));  // Valida y asigna segundo nombre

// Obtener y validar apellidos
        String[] apellidos = vistaPrincipal.getTxt_Apellidos().getText().trim().replaceAll("\\s+", " ").split(" ");
        paciente.setPrimApellido(getValidNameOrEmpty(apellidos, 0));  // Valida y asigna primer apellido
        paciente.setSegApellido(getValidNameOrEmpty(apellidos, 1));
        paciente.setEmail((vistaPrincipal.getTxt_Email().getText()));
        paciente.setDireccion(getValidData(vistaPrincipal.getTxt_direccion().getText()));
        paciente.setBarrio(getValidData(vistaPrincipal.getTxt_barrio().getText()));
        paciente.setCanton(getValidData(vistaPrincipal.getTxt_canton().getText()));
        paciente.setProvincia(getValidData(vistaPrincipal.getTxt_provincia().getText()));
        paciente.setTelefono(getValidData(vistaPrincipal.getTxt_telefono().getText()));
        paciente.setFechaNacimiento(utilDateToSqlDate(vistaPrincipal.getJCL_FechaNacimiento().getDate()));
        paciente.setLugar(getValidData(vistaPrincipal.getTxt_lugar().getText()));
        paciente.setPais(getValidData(vistaPrincipal.getTxt_pais().getText()));
        paciente.setGenero(getValidData(vistaPrincipal.getTxt_genero().getText()));
        paciente.setEstadoCivil((Seleccion_Estado_civil()));
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
        paciente.setContactoEmergencia(getValidData(vistaPrincipal.getTxt_ContactoEmergencias().getText()));
        paciente.setEstadoActivo(true);
        paciente.setPacEstActivo(true);
        paciente.setTipo_sangre(Seleccion_tipo_sangre());

        Discapacidad discapacidad = new Discapacidad();
        boolean select = vistaPrincipal.getCkx_discapacidad().isSelected();
        if (select) {
            discapacidad.setCarnet_Conadis(SeleccionConadis());
            discapacidad.setObservacion(getValidData(vistaPrincipal.getTxt_Observacion().getText()));
            discapacidad.setPorct_Discapacidad((int) vistaPrincipal.getSpr_ciclo().getValue());
            discapacidad.setTipo_Discapacidad(getValidData((String) vistaPrincipal.getCBX_tipoDiscapacidad().getSelectedItem()));

        } else {
            System.out.println("No tiene discapacidad");
        }

//          paciente.setCarnetConadis(getValidData(vistaPrincipal.getTxt_CarnetConadis().getText()));
//        paciente.setDiscapacidad(vistaPrincipal.getCkx_discapacidad().isSelected());
//        paciente.setTipoDiscapacidad(getValidData(vistaPrincipal.getTxt_tipoDiscapacidad().getText()));
//        paciente.setPorctDiscapacidad(((Number) vistaPrincipal.getSpr_Porcen_Discapasidad().getValue()).intValue());
//        
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

        List<AntecedentesFamiliares> antecedentesFamiliares = this.Listafamiliares.stream()
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
                    idCarrera,
                    String.valueOf(vistaPrincipal.getSpr_ciclo().getValue()).trim(),
                    true
            );
        }

        int idDoctor = singleton.getId_Doctor();
        System.out.println("Paciente: " + paciente);

        try {
            if (validarDatosPaciente(paciente)) {
                if (validarDatosAlumno(estudiante, rol)) {
                    if (rol != null) {

                        if (validarDatosDiscapacidad(discapacidad, vistaPrincipal.getCkx_discapacidad().isSelected())) {
                            boolean resultado = control.registrar(discapacidad, paciente, antecedentesPersonales, antecedentesFamiliares, idDoctor, rol, estudiante, identEstado);
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
                            System.out.println("Error al guardar la discapacidad");
                        }

                    } else {
                        Notificaciones.error("ERROR", "El paciente no tiene un rol asignado");

                    }

                } else {

                    System.out.println("Error en la tabla estudiante");

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
        return data == null || data.trim().isEmpty() ? " " : data.trim();
    }

    private String getValidNameOrEmpty(String[] names, int index) {
        if (index < names.length) {
            String name = names[index];
            if (isValidName(name)) {
                return name;
            } else {
                // Mostrar mensaje de error si el nombre tiene espacios internos
                System.out.println("Error: '" + name + "' no es un nombre válido. Por favor ingresa los nombres correctamente, por ejemplo, 'Juan Carlos'.");
            }
        }
        return "";
    }

    private boolean isValidName(String name) {
        return name.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$");
    }

    public Date utilDateToSqlDate(java.util.Date utilDate) {
        if (utilDate != null) {
            return new Date(utilDate.getTime());
        }
        return null;
    }

    private boolean validarDatosDiscapacidad(Discapacidad discapacidad, boolean seleccion) {
        if (seleccion) {
            boolean esValido = true;
            StringBuilder errores = new StringBuilder();


            if (discapacidad.getTipo_Discapacidad() == null || discapacidad.getTipo_Discapacidad().trim().isEmpty()) {
                errores.append("El tipo de discapacidad es obligatorio.\n");
                esValido = false;
            }

            if (discapacidad.getPorct_Discapacidad() < 0 || discapacidad.getPorct_Discapacidad() > 100) {
                errores.append("El porcentaje de discapacidad debe estar entre 0 y 100.\n");
                esValido = false;
            }

            if (discapacidad.getObservacion() != null && discapacidad.getObservacion().length() > 150) {
                errores.append("La observación es demasiado larga (máximo 150 caracteres).\n");
                esValido = false;
            }

            if (!esValido) {
                JOptionPane.showMessageDialog(vistaPrincipal, errores.toString(), "Errores de Validación", JOptionPane.ERROR_MESSAGE);

            }

            return esValido;
        }

        // Si no hay selección, retorna true por defecto
        return true;
    }

    private boolean validarDatosAlumno(Estudiante estudiante, String rol) {
        if (rol.equalsIgnoreCase("estudiante")) {
            boolean esValido = true;
            StringBuilder errores = new StringBuilder();

            if (estudiante.getIdcarrera() <= 0) {
                errores.append("El ID de carrera es obligatorio y debe ser un valor positivo.\n");
                esValido = false;
            }

            if (estudiante.getCiclo() == null || estudiante.getCiclo().trim().isEmpty() || estudiante.getCiclo().equalsIgnoreCase("0")) {
                errores.append("El ciclo que estudia es obligatorio y no puede ser '0'.\n");
                esValido = false;
            }

            if (!esValido) {
                JOptionPane.showMessageDialog(vistaPrincipal, errores.toString(), "Errores de Validación", JOptionPane.ERROR_MESSAGE);

            }

            return esValido;
        }

        return true;
    }

    private boolean validarDatosPaciente(Paciente paciente) {
        boolean datosValidos = true;
        StringBuilder errores = new StringBuilder();
        // Validar identificación: debe tener exactamente 10 dígitos
        if (paciente.getIdentificacion() == null || paciente.getIdentificacion().isEmpty()) {
            errores.append("La identificación no puede estar vacía.\n");
            datosValidos = false;
        } else if (!paciente.getIdentificacion().matches("\\d{10}")) {
            errores.append("El formato de la identificación es incorrecto. Debe tener exactamente 10 dígitos.\n");
            datosValidos = false;
        }

        if (paciente.getPrimNombre() == null || paciente.getPrimNombre().isEmpty()) {
            errores.append("El primer nombre no puede estar vacío.\n");
            datosValidos = false;
        } else if (!paciente.getPrimNombre().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            errores.append("El formato del primer nombre es incorrecto. Debe contener solo letras.\n");
            datosValidos = false;
        }

        // Validar segundo nombre: debe contener solo letras o estar vacío
        if (paciente.getSegNombre() != null && !paciente.getSegNombre().isEmpty() && !paciente.getSegNombre().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]*")) {
            errores.append("El formato del segundo nombre es incorrecto. Debe contener solo letras.\n");
            datosValidos = false;
        }

        if (paciente.getPrimApellido() == null || paciente.getPrimApellido().isEmpty()) {
            errores.append("El primer apellido no puede estar vacío.\n");
            datosValidos = false;
        } else if (!paciente.getPrimApellido().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            errores.append("El formato del primer apellido es incorrecto. Debe contener solo letras.\n");
            datosValidos = false;
        }

        if (paciente.getSegApellido() != null && !paciente.getSegApellido().isEmpty() && !paciente.getSegApellido().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]*")) {
            errores.append("El formato del segundo apellido es incorrecto. Debe contener solo letras.\n");
            datosValidos = false;
        }

        if (paciente.getEmail() == null || paciente.getEmail().isEmpty()) {
            errores.append("El email no puede estar vacío.\n");
            datosValidos = false;
        } else {
            String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
            if (!paciente.getEmail().matches(emailRegex)) {
                errores.append("El formato del email no es válido.\n");
                datosValidos = false;
            }
        }

        if (paciente.getTelefono() == null || paciente.getTelefono().isEmpty()) {
            errores.append("El teléfono no puede estar vacío.\n");
            datosValidos = false;
        } else if (!paciente.getTelefono().matches("\\d{10}")) {
            errores.append("El formato del teléfono es incorrecto. Debe contener exactamente 10 dígitos.\n");
            datosValidos = false;
        }

        if (paciente.getProvincia() == null || paciente.getProvincia().isEmpty()) {
            errores.append("La provincia es obligatoria.\n");
            datosValidos = false;
        }

        if (paciente.getPais() == null || paciente.getPais().isEmpty()) {
            errores.append("El país es obligatorio.\n");
            datosValidos = false;
        }

        if (paciente.getSexo() == null || paciente.getSexo().isEmpty()) {
            errores.append("El sexo es obligatorio.\n");
            datosValidos = false;
        }

        if (paciente.getTipo_sangre() == null || paciente.getTipo_sangre().isEmpty()) {
            errores.append("El tipo de sangre es obligatorio.\n");
            datosValidos = false;
        }

        if (paciente.getEstadoCivil() == null || paciente.getEstadoCivil().isEmpty()) {
            errores.append("El estado civil es obligatorio.\n");
            datosValidos = false;
        }

        if (paciente.getFechaNacimiento() == null) {
            errores.append("La fecha de nacimiento no puede estar vacía.\n");
            datosValidos = false;
        } else {
            Calendar fechaActual = Calendar.getInstance();
            fechaActual.add(Calendar.YEAR, -15); // Restar 15 años de la fecha actual
            if (!paciente.getFechaNacimiento().before(fechaActual.getTime())) {
                errores.append("La fecha de nacimiento no es válida. El paciente debe tener al menos 15 años.\n");
                datosValidos = false;
            }
        }
        if (!datosValidos) {
            JOptionPane.showMessageDialog(vistaPrincipal, errores.toString(), "Errores de Validación", JOptionPane.ERROR_MESSAGE);

        }

        return datosValidos;
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
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void cargarCarreras() {

        Conexion cnxt = new Conexion();
        PreparedStatement pS = null;
        java.sql.Connection conectBase = cnxt.getConexion();
        try {

            String query = "SELECT Id_Carrera, Nombre_Carrera FROM carrera";

            pS = conectBase.prepareStatement(query);
            // Procesar el resultado

            vistaPrincipal.getCbx_Carreras().addItem(new Carrera());
            try ( ResultSet resultSet = pS.executeQuery(query)) {
                // Procesar el resultado
                while (resultSet.next()) {
                    int idCarrera = resultSet.getInt("Id_Carrera");
                    String nombreCarrera = resultSet.getString("Nombre_Carrera");

                    // Agregar cada carrera al JComboBox
                    vistaPrincipal.getCbx_Carreras().addItem(new Carrera(idCarrera, nombreCarrera));
                }

            }
//            statement.close();
//            conectBase.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
///////////////////////////////////////////////////////////////////////////////////////////

    private void manejarAntecedenteFamiliar(AntecedentesFamiliares nuevoAntecedente, List<AntecedentesFamiliares> listaFamiliares) {
        Optional<AntecedentesFamiliares> antecedenteExistente = buscarAntecedenteFamiliarPorParentesco(nuevoAntecedente.getParentescoFamiliar(), listaFamiliares);

        if (antecedenteExistente.isPresent()) {
    
            // Si se encuentra el antecedente, actualizar sus datos
            AntecedentesFamiliares antecedente = antecedenteExistente.get();
            antecedente.setAlergias(nuevoAntecedente.getAlergias());
            antecedente.setClinico(nuevoAntecedente.getClinico());
            antecedente.setGinecologico(nuevoAntecedente.getGinecologico());
            antecedente.setTraumatologico(nuevoAntecedente.getTraumatologico());
            antecedente.setQuirurgico(nuevoAntecedente.getQuirurgico());
            antecedente.setFarmacologico(nuevoAntecedente.getFarmacologico());
            antecedente.setEnfermedades(nuevoAntecedente.getEnfermedades());
            antecedente.setCirugias(nuevoAntecedente.getCirugias());
            antecedente.setVacunas(nuevoAntecedente.getVacunas());

            // Cargar los datos del antecedente en los campos de texto
            cargarDatosAntecedenteEnCampos(antecedente);
             limpiarCamposFamiliares();
        } else {
            // Si no se encuentra, añadir el nuevo antecedente a la lista
            listaFamiliares.add(nuevoAntecedente);
            // Opcionalmente, puedes limpiar los campos si se añade un nuevo antecedente
            limpiarCamposFamiliares();
        }
    }

    private Optional<AntecedentesFamiliares> buscarAntecedenteFamiliarPorParentesco(String parentescoFamiliar, List<AntecedentesFamiliares> lista) {
        // Buscar antecedente por parentesco
        return lista.stream()
                .filter(af -> af.getParentescoFamiliar().equalsIgnoreCase(parentescoFamiliar))
                .findFirst();
    }
    // Método para cargar los datos del antecedente en los campos de texto

    private void cargarDatosAntecedenteEnCampos(AntecedentesFamiliares antecedente) {
        vistaPrincipal.getTxA_Faml_alergia().setText(antecedente.getAlergias());
        vistaPrincipal.getTxA_Faml_clinico().setText(antecedente.getClinico());
        vistaPrincipal.getTxA_Faml_ginecologo().setText(antecedente.getGinecologico());
        vistaPrincipal.getTxA_Faml_traumatologico().setText(antecedente.getTraumatologico());
        vistaPrincipal.getTxA_Faml_quirurgico().setText(antecedente.getQuirurgico());
        vistaPrincipal.getTxA_Faml_farmacologico().setText(antecedente.getFarmacologico());
        vistaPrincipal.getTxA_Faml_enfermedades().setText(antecedente.getEnfermedades());
        vistaPrincipal.getTxA_Faml_cirugia().setText(antecedente.getCirugias());
        vistaPrincipal.getTxA_Faml_vacunas().setText(antecedente.getVacunas());
    }

}
