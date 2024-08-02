/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Carrera;
import Modelo.Conexion;
import Vista.CrudCarrera;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ControladorAñadirCarrera {

    private CrudCarrera vista;
    private Conexion conexion;
    private int idCarreraSeleccionada;
    private boolean enModoModificacion = false;

    public ControladorAñadirCarrera(CrudCarrera vista) {
        this.vista = vista;
        this.conexion = new Conexion(); // Inicializar la conexión
        init();
    }

    private Connection getConnection() {
        return conexion.getConexion();
    }

    public void agregarCarrera(Carrera carrera) {
        if (existeCarrera(carrera.getNombreCarrera())) {
            JOptionPane.showMessageDialog(vista, "Ya existe una carrera con el mismo nombre.");
            return;
        }

        String sql = "INSERT INTO Carrera (Nombre_Carrera) VALUES (?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, carrera.getNombreCarrera());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modificarCarrera(Carrera carrera) {
        if (existeOtraCarreraConNombre(carrera.getNombreCarrera(), carrera.getIdCarrera())) {
            JOptionPane.showMessageDialog(vista, "Ya existe una carrera con el mismo nombre.");
            return;
        }

        String sql = "UPDATE Carrera SET Nombre_Carrera = ? WHERE Id_Carrera = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, carrera.getNombreCarrera());
            pstmt.setInt(2, carrera.getIdCarrera());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarCarrera(int idCarrera) {
        if (verificarRelacionConAlumno(idCarrera)) {
            JOptionPane.showMessageDialog(vista, "No se puede eliminar la carrera porque está asociada a un alumno.");
            return;
        }
        
        String sql = "DELETE FROM Carrera WHERE Id_Carrera = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idCarrera);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(vista, "Carrera eliminada con éxito.");
            actualizarTablaCarreras();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean verificarRelacionConAlumno(int idCarrera) {
        String sql = "SELECT COUNT(*) FROM Alumno WHERE Id_Carrera = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idCarrera);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0; // Retorna true si hay alumnos asociados
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // No hay alumnos asociados
    }

    public boolean existeCarrera(String nombreCarrera) {
        String sql = "SELECT COUNT(*) FROM Carrera WHERE LOWER(Nombre_Carrera) = LOWER(?)";
        
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombreCarrera.toLowerCase());
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0; // Retorna true si existe una carrera con el mismo nombre
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // No existe carrera con el nombre dado
    }

    public boolean existeOtraCarreraConNombre(String nombreCarrera, int idCarrera) {
        String sql = "SELECT COUNT(*) FROM Carrera WHERE LOWER(Nombre_Carrera) = LOWER(?) AND Id_Carrera != ?";
        
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombreCarrera.toLowerCase());
            pstmt.setInt(2, idCarrera);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0; // Retorna true si existe otra carrera con el mismo nombre diferente al id dado
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // No existe otra carrera con el nombre dado
    }

    public List<Carrera> obtenerCarreras() {
        List<Carrera> carreras = new ArrayList<>();
        String sql = "SELECT Id_Carrera, Nombre_Carrera FROM Carrera";
        
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                int idCarrera = rs.getInt("Id_Carrera");
                String nombreCarrera = rs.getString("Nombre_Carrera");
                carreras.add(new Carrera(idCarrera, nombreCarrera));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return carreras;
    }

    private void init() {
        vista.getBtnAñadirCarrera().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (enModoModificacion) {
                    JOptionPane.showMessageDialog(vista, "Por favor, termine la modificación actual.");
                    return;
                }

                String nombreCarrera = vista.getTxtNuevaCarrera().getText();
                if (nombreCarrera.isEmpty()) {
                    JOptionPane.showMessageDialog(vista, "Por favor, ingrese el nombre de la carrera.");
                    return;
                }

                // Validar nombre de la carrera
                if (!Pattern.matches("^[a-zA-Z]+(?: [a-zA-Z]+)*$", nombreCarrera)) {
                    JOptionPane.showMessageDialog(vista, "El nombre de la carrera solo puede contener letras y un único espacio entre palabras.");
                    return;
                }

                if (existeCarrera(nombreCarrera)) {
                    JOptionPane.showMessageDialog(vista, "Ya existe una carrera con el mismo nombre.");
                    return;
                }

                Carrera nuevaCarrera = new Carrera();
                nuevaCarrera.setNombreCarrera(nombreCarrera);
                agregarCarrera(nuevaCarrera);

                actualizarTablaCarreras();
                vista.getTxtNuevaCarrera().setText(""); // Limpiar el campo de texto
            }
        });

        vista.getBtnModificarCarrera().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (enModoModificacion) {
                    // Confirmar modificación
                    if (idCarreraSeleccionada > 0) {
                        String nuevoNombre = vista.getTxtNuevaCarrera().getText();
                        if (nuevoNombre.isEmpty()) {
                            JOptionPane.showMessageDialog(vista, "El nombre de la carrera no puede estar vacío.");
                            return;
                        }

                        // Validar nuevo nombre de la carrera
                        if (!Pattern.matches("^[a-zA-Z]+(?: [a-zA-Z]+)*$", nuevoNombre)) {
                            JOptionPane.showMessageDialog(vista, "El nombre de la carrera solo puede contener letras y un único espacio entre palabras.");
                            return;
                        }

                        if (existeOtraCarreraConNombre(nuevoNombre, idCarreraSeleccionada)) {
                            JOptionPane.showMessageDialog(vista, "Ya existe una carrera con el mismo nombre.");
                            return;
                        }

                        Carrera carreraModificada = new Carrera();
                        carreraModificada.setIdCarrera(idCarreraSeleccionada);
                        carreraModificada.setNombreCarrera(nuevoNombre);
                        modificarCarrera(carreraModificada);

                        JOptionPane.showMessageDialog(vista, "Carrera modificada con éxito.");
                        vista.getBtnAñadirCarrera().setEnabled(true); // Habilitar botón Añadir
                        vista.getBtnEliminarCarrera().setEnabled(true); // Habilitar botón Eliminar
                        vista.getBtnModificarCarrera().setText("Modificar"); // Cambiar el texto del botón
                        enModoModificacion = false; // Salir del modo de modificación
                        vista.getTxtNuevaCarrera().setText(""); // Limpiar el campo de texto
                        actualizarTablaCarreras();
                    }
                } else {
                    // Activar modo de modificación
                    int filaSeleccionada = vista.getTablaCarreras().getSelectedRow();
                    if (filaSeleccionada >= 0) {
                        idCarreraSeleccionada = (int) vista.getTablaCarreras().getValueAt(filaSeleccionada, 0);
                        String nombreCarrera = (String) vista.getTablaCarreras().getValueAt(filaSeleccionada, 1);
                        vista.getTxtNuevaCarrera().setText(nombreCarrera);

                        // Cambiar el texto del botón y habilitar modo de modificación
                        vista.getBtnModificarCarrera().setText("Guardar Cambios");
                        vista.getBtnAñadirCarrera().setEnabled(false); // Deshabilitar botón Añadir
                        vista.getBtnEliminarCarrera().setEnabled(false); // Deshabilitar botón Eliminar
                        enModoModificacion = true;
                    } else {
                        JOptionPane.showMessageDialog(vista, "Seleccione una carrera para modificar.");
                    }
                }
            }
        });

        vista.getBtnEliminarCarrera().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = vista.getTablaCarreras().getSelectedRow();
                if (filaSeleccionada >= 0) {
                    int idCarrera = (int) vista.getTablaCarreras().getValueAt(filaSeleccionada, 0);
                    eliminarCarrera(idCarrera);
                } else {
                    JOptionPane.showMessageDialog(vista, "Seleccione una carrera para eliminar.");
                }
            }
        });

        // Acción al seleccionar una fila en la tabla
        vista.getTablaCarreras().getSelectionModel().addListSelectionListener(e -> {
            if (enModoModificacion) {
                int filaSeleccionada = vista.getTablaCarreras().getSelectedRow();
                if (filaSeleccionada >= 0) {
                    idCarreraSeleccionada = (int) vista.getTablaCarreras().getValueAt(filaSeleccionada, 0);
                    String nombreCarrera = (String) vista.getTablaCarreras().getValueAt(filaSeleccionada, 1);
                    vista.getTxtNuevaCarrera().setText(nombreCarrera);
                }
            }
        });

        // Cargar datos al iniciar la ventana
        actualizarTablaCarreras();
    }

    private void actualizarTablaCarreras() {
        DefaultTableModel model = (DefaultTableModel) vista.getTablaCarreras().getModel();
        model.setRowCount(0); // Limpiar la tabla antes de actualizar

        for (Carrera carrera : obtenerCarreras()) {
            model.addRow(new Object[]{carrera.getIdCarrera(), carrera.getNombreCarrera()});
        }
    }
}
