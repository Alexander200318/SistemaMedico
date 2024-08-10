/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Controlador.ControladorDatosPacienteAdmin;
import Controlador.ControladorHistorialPaciente;
import Controlador.Notificaciones;
import Modelo.Conexion;
import Modelo.ConsultaDatosPacienteAdmin;
import Modelo.DatosPacienteAdminClass;
import Vista.PanelAdminPaciente;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class PanelPacienteAdminDAO {

    PanelAdminPaciente vistaPanel;
    ControladorDatosPacienteAdmin controlHistorial;
    int idPaciente = 0;

    public PanelPacienteAdminDAO(PanelAdminPaciente vistaPanel) {
        this.vistaPanel = vistaPanel;
        vistaPanel.getBtn_Buscar_Adm().addActionListener((e) -> {
            IngresarDatorTabla(vistaPanel.getTablaPacienteAd(), vistaPanel.getTxt_ad_identificacion().getText(), vistaPanel.getTxt_ad_nombre().getText(), vistaPanel.getTxt_ad_apellido().getText(), null, seleccionRol());
        });

        vistaPanel.getBtn_Limpiar_Adm().addActionListener((e) -> {
            RecetearDatos();
        });
        vistaPanel.getBtn_most_Limpiar().addActionListener((e) -> {
            LimpiarDatosCargados();
        });
        vistaPanel.getBtn_Deshabilitar_Adm().addActionListener((e) -> {
            guardarCambios(idPaciente);
            IngresarDatorTabla(vistaPanel.getTablaPacienteAd(), null, null, null, null, null);
        });

        vistaPanel.getBtn_Habilitar_Adm().addActionListener((e) -> {
            guardarCambiosTrue(idPaciente);
            IngresarDatorTabla(vistaPanel.getTablaPacienteAd(), null, null, null, null, null);
        });
        
        IngresarDatorTabla(vistaPanel.getTablaPacienteAd(), null, null, null, null, null);
        MouseclickedTabla(vistaPanel.getTablaPacienteAd());

    }

    public void MouseclickedTabla(JTable table) {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.rowAtPoint(e.getPoint());
                if (row >= 0) {
                    Tabla(table, row);
                }
            }
        });
    }

    private void Tabla(JTable table, int row) {
        if (row >= 0 && row < table.getRowCount()) {
            // Obtener el modelo de la tabla
            ConsultaDatosPacienteAdmin model = (ConsultaDatosPacienteAdmin) table.getModel();
            if (model != null) {
                // Obtener la lista de datos de la tabla
                List<DatosPacienteAdminClass> pacientes = model.getConsultas(); // Método que devuelve la lista de DatosPacienteAdminClass
                if (pacientes != null && row < pacientes.size()) {
                    DatosPacienteAdminClass paciente = pacientes.get(row); // Obtiene el paciente directamente usando el índice de fila
                    if (paciente != null) {
                        idPaciente = paciente.getIdPaciente();
                        System.out.println("ID Paciente: " + idPaciente);
                        obtenerPaciente(idPaciente);

//                    CambioDatosPa();
                    } else {
                        System.out.println("Paciente no encontrado.");
                    }
                } else {
                    System.out.println("Índice de fila fuera de rango.");
                }
            } else {
                System.out.println("Modelo de tabla no válido.");
            }
        } else {
            System.out.println("Índice de fila fuera de rango.");
        }
    }

    public String seleccionRol() {
        String nivel = "";
        Object selectedItem = this.vistaPanel.getCbx_ad_rol().getSelectedItem();
        if (selectedItem != null) {
            String selectedItemString = String.valueOf(selectedItem);
            if (selectedItemString.equalsIgnoreCase("Pers. Administrativo")) {
                nivel = "administrativo";
            } else if (selectedItemString.equalsIgnoreCase("Alumno")) {
                nivel = "estudiante";
            } else if (selectedItemString.equalsIgnoreCase("Servicio")) {
                nivel = "servicios";
            } else if (selectedItemString.equalsIgnoreCase("Docente")) {
                nivel = "docente";
            } else if (selectedItemString.equalsIgnoreCase("Ninguno")) {
                nivel = null;
            }
        }

        return nivel;
    }

    public void RecetearDatos() {
        this.vistaPanel.getTxt_ad_identificacion().setText(null);
        this.vistaPanel.getTxt_ad_apellido().setText(null);
        this.vistaPanel.getTxt_ad_nombre().setText(null);
        this.vistaPanel.getCbx_ad_rol().setSelectedIndex(0);

    }

    public void IngresarDatorTabla(JTable tabla,
            String identificacion,
            String nombreParte,
            String apellidoParte,
            String sexoPaciente,
            String rol) {

        controlHistorial = new ControladorDatosPacienteAdmin();
        List<DatosPacienteAdminClass> consultas = controlHistorial.obtenerPaciente(identificacion, nombreParte, apellidoParte, sexoPaciente, rol);

        // Imprimir tamaño de la lista
        System.out.println("Número de consultas: " + consultas.size());

        ConsultaDatosPacienteAdmin model = new ConsultaDatosPacienteAdmin(consultas);
        tabla.setModel(model);

        tabla.setRowHeight(30);
        TableColumn column;

        // Asignar el renderer personalizado a la tabla
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                DatosPacienteAdminClass paciente = consultas.get(row);
                boolean estado = paciente.isEstado();

                if (!isSelected) {
                    if (!estado) {
                        c.setBackground(Color.RED);
                    } else {
                        c.setBackground(Color.GREEN);
                    }
                } else {
                    c.setBackground(table.getSelectionBackground());
                }

                return c;
            }
        };

        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        tabla.revalidate();
    }

    public void obtenerPaciente(int idPacient) {
        Conexion cnxt = new Conexion();

        String baseQuery = "SELECT \n"
                + "    per.Identificacion AS Identificacion, \n"
                + "    CONCAT(per.prim_Nombre, ' ', IFNULL(per.seg_Nombre, ''), ' ', per.prim_Apellido, ' ', IFNULL(per.seg_Apellido, '')) AS nombrePaciente, \n"
                + "    per.Sexo AS Sexo ,\n"
                + "    per.Telefono AS Telefono ,\n"
                + "    pac.Pac_Est_Activo ,\n"
                + "   TRIM(CONCAT( \n"
                + "        IF(per.Direccion IS NOT NULL, per.Direccion, ''), \n"
                + "        IF(per.Direccion IS NOT NULL AND per.Barrio IS NOT NULL, ', ', ''), \n"
                + "        IF(per.Barrio IS NOT NULL, per.Barrio, ''),\n"
                + "        IF(per.Barrio IS NOT NULL AND per.Canton IS NOT NULL, ', ', ''), \n"
                + "        IF(per.Canton IS NOT NULL, per.Canton, ''),\n"
                + "        IF(per.Canton IS NOT NULL AND per.Provincia IS NOT NULL, ', ', ''), \n"
                + "        IF(per.Provincia IS NOT NULL, per.Provincia, ''),\n"
                + "        IF(per.Provincia IS NOT NULL AND per.Lugar IS NOT NULL, ', ', ''), \n"
                + "        IF(per.Lugar IS NOT NULL, per.Lugar, ''),\n"
                + "        IF(per.Lugar IS NOT NULL AND per.Pais IS NOT NULL, ', ', ''), \n"
                + "        IF(per.Pais IS NOT NULL, per.Pais, '') \n"
                + "    )) AS DireccionCompleta, \n"
                + "    COALESCE( \n"
                + "        roles.nombreRoles, \n"
                + "        CASE \n"
                + "            WHEN alumno.Id_Paciente IS NOT NULL THEN 'Alumno' \n"
                + "            ELSE 'Otros Roles' \n"
                + "        END \n"
                + "    ) AS Rol, \n"
                + "    registrapaciente.Fecha, \n"
                + "    CONCAT(doctPer.prim_Nombre, ' ', IFNULL(doctPer.prim_Apellido, '')) AS nombreDoctor, \n"
                + "    discapacidad.D_Tipo_Discapacidad,  \n"
                + "    per.email,  \n"
                + "    pac.Id_Paciente  \n"
                + "FROM \n"
                + "    Paciente pac \n"
                + "JOIN \n"
                + "    Persona per ON pac.Id_Persona = per.Id_Persona \n"
                + "LEFT JOIN \n"
                + "    discapacidad ON per.Id_Persona = discapacidad.Id_Persona \n"
                + "LEFT JOIN \n"
                + "    roles ON pac.Id_Paciente = roles.Id_Paciente \n"
                + "LEFT JOIN \n"
                + "    alumno ON pac.Id_Paciente = alumno.Id_Paciente \n"
                + "LEFT JOIN \n"
                + "    registrapaciente ON pac.Id_Paciente = registrapaciente.Id_Paciente \n"
                + "LEFT JOIN \n"
                + "    doctor ON doctor.Id_Doctor = registrapaciente.Id_Doctor \n"
                + "LEFT JOIN \n"
                + "    Persona doctPer ON doctPer.Id_Persona = doctor.Id_Persona \n"
                + "WHERE 1=1 AND pac.Id_Paciente= ?";

        try ( Connection connection = cnxt.getConexion();  PreparedStatement statement = connection.prepareStatement(baseQuery)) {
            statement.setInt(1, idPacient);
            try ( ResultSet resultSet = statement.executeQuery()) {

                if (resultSet.next()) {

                    int idPaciente = resultSet.getInt("Id_Paciente");
                    String identificacionPaciente = resultSet.getString("Identificacion");
                    String nombrePaciente = resultSet.getString("nombrePaciente");
                    String emailpa = resultSet.getString("email");
                    String sexo = resultSet.getString("Sexo");
                    String discapacidad = resultSet.getString("D_Tipo_Discapacidad");
                    String telefono = resultSet.getString("Telefono");
                    String direccionCompleta = resultSet.getString("DireccionCompleta");
                    String rolPaciente = resultSet.getString("Rol");
                    String FechaRegistro = resultSet.getString("Fecha");
                    String NomDoctor = resultSet.getString("nombreDoctor");
                    boolean Estado = resultSet.getBoolean("Pac_Est_Activo");

                    vistaPanel.getTxt_most_identificacion().setText(identificacionPaciente);
                    vistaPanel.getTxt_most_nombress().setText(nombrePaciente);
                    vistaPanel.getTxt_most_email().setText(emailpa);
                    vistaPanel.getTxt_most_direccion().setText(direccionCompleta);
                    vistaPanel.getTxt_most_sexo().setText(sexo);
                    vistaPanel.getTxt_most_rol().setText(rolPaciente);
                    vistaPanel.getTxt_most_discapacidad().setText(discapacidad);
                    vistaPanel.getTxt_most_telefono().setText(telefono);

                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ocurrió un error al realizar la consulta.");
        }

    }

    public void LimpiarDatosCargados() {
        idPaciente = 0;

        vistaPanel.getTxt_most_identificacion().setText("");
        vistaPanel.getTxt_most_nombress().setText("");
        vistaPanel.getTxt_most_email().setText("");
        vistaPanel.getTxt_most_direccion().setText("");
        vistaPanel.getTxt_most_sexo().setText("");
        vistaPanel.getTxt_most_rol().setText("");
        vistaPanel.getTxt_most_discapacidad().setText("");
        vistaPanel.getTxt_most_telefono().setText("");

    }

    private void guardarCambios(int idPaciente) {
        
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();

        if (idPaciente != 0) {
          if (con == null) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Consultar el estado actual antes de la actualización
        String consultaEstado = "SELECT p.Estado_Activo, pac.Pac_Est_Activo FROM Persona p "
                + "JOIN Paciente pac ON p.Id_Persona = pac.Id_Persona "
                + "WHERE pac.Id_Paciente = ?";

        // Query para actualizar el estado a false en Persona y Paciente
        String actualizarEstado = "UPDATE Persona p "
                + "JOIN Paciente pac ON p.Id_Persona = pac.Id_Persona "
                + "SET p.Estado_Activo = false, "
                + "pac.Pac_Est_Activo = false "
                + "WHERE pac.Id_Paciente = ?";

        try {
            // Consultar el estado actual
            PreparedStatement psConsulta = con.prepareStatement(consultaEstado);
            psConsulta.setInt(1, idPaciente);
            ResultSet rs = psConsulta.executeQuery();

            if (rs.next()) {
                boolean estadoPersona = rs.getBoolean("Estado_Activo");
                boolean estadoPaciente = rs.getBoolean("Pac_Est_Activo");

                String estadoPersonaMsg = estadoPersona ? "Estado de Persona: Habilitado" : "Estado de Persona: Deshabilitado";
                String estadoPacienteMsg = estadoPaciente ? "Estado de Paciente: Habilitado" : "Estado de Paciente: Deshabilitado";

                 
                
            }

            // Actualizar el estado a false
            PreparedStatement ps = con.prepareStatement(actualizarEstado);
            ps.setInt(1, idPaciente);

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                            Notificaciones.success("EXITO",  "Los estados se actualizaron a 'Deshabilitado'");

            } else {
                            Notificaciones.error("ERROR",  "No se pudo actualizar los estados");

            }

        } catch (SQLException e) {
            e.printStackTrace();
            Notificaciones.error("ERROR",  "Error al actualizar los estados");
           
        }  
        } else {
            Notificaciones.error("ERROR", "Seleccione un paciente");
        
        }
        
        
    }
    private void guardarCambiosTrue(int idPaciente) {

    Conexion conexion = new Conexion();
    Connection con = conexion.getConexion();

    if (idPaciente != 0) {
        if (con == null) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Consultar el estado actual antes de la actualización
        String consultaEstado = "SELECT p.Estado_Activo, pac.Pac_Est_Activo FROM Persona p "
                + "JOIN Paciente pac ON p.Id_Persona = pac.Id_Persona "
                + "WHERE pac.Id_Paciente = ?";

        // Query para actualizar el estado a true en Persona y Paciente
        String actualizarEstado = "UPDATE Persona p "
                + "JOIN Paciente pac ON p.Id_Persona = pac.Id_Persona "
                + "SET p.Estado_Activo = true, "
                + "pac.Pac_Est_Activo = true "
                + "WHERE pac.Id_Paciente = ?";

        try {
            // Consultar el estado actual
            PreparedStatement psConsulta = con.prepareStatement(consultaEstado);
            psConsulta.setInt(1, idPaciente);
            ResultSet rs = psConsulta.executeQuery();

            if (rs.next()) {
                boolean estadoPersona = rs.getBoolean("Estado_Activo");
                boolean estadoPaciente = rs.getBoolean("Pac_Est_Activo");

                String estadoPersonaMsg = estadoPersona ? "Estado de Persona: Habilitado" : "Estado de Persona: Deshabilitado";
                String estadoPacienteMsg = estadoPaciente ? "Estado de Paciente: Habilitado" : "Estado de Paciente: Deshabilitado";

                // Mostrar estado actual
//                JOptionPane.showMessageDialog(null, estadoPersonaMsg + "\n" + estadoPacienteMsg, "Estado Actual", JOptionPane.INFORMATION_MESSAGE);
            }

            // Actualizar el estado a true
            PreparedStatement ps = con.prepareStatement(actualizarEstado);
            ps.setInt(1, idPaciente);

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                Notificaciones.success("EXITO", "Los estados se actualizaron a 'Habilitado'");
            } else {
                Notificaciones.error("ERROR", "No se pudo actualizar los estados");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            Notificaciones.error("ERROR", "Error al actualizar los estados");

        }
    } else {
        Notificaciones.error("ERROR", "Seleccione un paciente");
    }
}
}
