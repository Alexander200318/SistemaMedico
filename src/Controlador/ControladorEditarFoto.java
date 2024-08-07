/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Singleton;
import Vista.PanelDatosPaciente;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorEditarFoto {

    private PanelDatosPaciente panelDatosPaciente;
    private File archivoFoto;
    private Conexion conexion;

    public ControladorEditarFoto(PanelDatosPaciente panelDatosPaciente) {
        this.panelDatosPaciente = panelDatosPaciente;
        this.conexion = new Conexion(); // Inicializa la conexión a la base de datos

        configurarBtnEditarFotos();
        configurarArrastrarYSoltar();
        cargarFoto(Singleton.getInstance().getIdPaciente()); // Carga la foto al iniciar
    }

    private void configurarBtnEditarFotos() {
        panelDatosPaciente.getBtnEditarFotos().addActionListener(e -> {
            if ("Guardar Cambios".equals(panelDatosPaciente.getBtnEditarFotos().getText())) {
                if (archivoFoto != null) {
                    guardarFoto(archivoFoto);
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna imagen.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            } else {
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
                    archivoFoto = fileChooser.getSelectedFile();
                    actualizarImagenEnEtiqueta(archivoFoto);
                    panelDatosPaciente.getBtnEditarFotos().setText("Guardar Cambios");
                }
            }
        });
    }

    private void configurarArrastrarYSoltar() {
        panelDatosPaciente.getLblFotoConsu().setDropTarget(new DropTarget(panelDatosPaciente.getLblFotoConsu(), new DropTargetAdapter() {
            @Override
            public void drop(DropTargetDropEvent evt) {
                try {
                    evt.acceptDrop(DnDConstants.ACTION_COPY);
                    Transferable transferable = evt.getTransferable();
                    if (transferable.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                        java.util.List<File> fileList = (java.util.List<File>) transferable.getTransferData(DataFlavor.javaFileListFlavor);
                        if (!fileList.isEmpty()) {
                            archivoFoto = fileList.get(0);
                            actualizarImagenEnEtiqueta(archivoFoto);
                            panelDatosPaciente.getBtnEditarFotos().setText("Guardar Cambios");
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al procesar la imagen: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }));
    }

    private void actualizarImagenEnEtiqueta(File archivo) {
        int width = panelDatosPaciente.getLblFotoConsu().getWidth();
        int height = panelDatosPaciente.getLblFotoConsu().getHeight();

        // Verificar que el tamaño del componente no sea cero
        if (width <= 0 || height <= 0) {
            System.out.println("Tamaño del componente no válido: width=" + width + ", height=" + height);
            return;
        }

        // Actualizar la imagen
        ImageIcon icono = new ImageIcon(archivo.getAbsolutePath());
        Image img = icono.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        panelDatosPaciente.getLblFotoConsu().setIcon(new ImageIcon(img));
    }

    private void guardarFoto(File archivo) {
        int idPaciente = Singleton.getInstance().getIdPaciente(); // Obtén el ID del paciente desde Singleton
        int idPersona = obtenerIdPersonaPorPaciente(idPaciente);

        if (idPersona == -1) {
            JOptionPane.showMessageDialog(null, "ID de persona no encontrado para el paciente.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (FileInputStream fis = new FileInputStream(archivo);
             Connection conn = conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement("UPDATE Persona SET Foto = ? WHERE Id_Persona = ?")) {

            ps.setBinaryStream(1, fis, (int) archivo.length());
            ps.setInt(2, idPersona);

            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "La imagen se ha modificado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                panelDatosPaciente.getBtnEditarFotos().setText("Editar Foto");
                archivoFoto = null;
                cargarFoto(idPaciente); // Recarga la foto actualizada
            } else {
                JOptionPane.showMessageDialog(null, "No se actualizó ninguna imagen. Verifique el ID de persona.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }

        } catch (IOException | SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar la imagen: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private int obtenerIdPersonaPorPaciente(int idPaciente) {
        int idPersona = -1;
        try (Connection conn = conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement("SELECT Id_Persona FROM Paciente WHERE Id_Paciente = ?")) {

            ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                idPersona = rs.getInt("Id_Persona");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener el ID de persona: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return idPersona;
    }

    private void cargarFoto(int idPaciente) {
        SwingUtilities.invokeLater(() -> {
            int idPersona = obtenerIdPersonaPorPaciente(idPaciente);
            if (idPersona == -1) {
                JOptionPane.showMessageDialog(null, "ID de persona no encontrado para el paciente.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try (Connection conn = conexion.getConexion();
                 PreparedStatement ps = conn.prepareStatement("SELECT Foto FROM Persona WHERE Id_Persona = ?")) {

                ps.setInt(1, idPersona);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    byte[] imgData = rs.getBytes("Foto");
                    if (imgData != null) {
                        ImageIcon icono = new ImageIcon(imgData);
                        int width = panelDatosPaciente.getLblFotoConsu().getWidth();
                        int height = panelDatosPaciente.getLblFotoConsu().getHeight();
                        
                        // Verificar que el tamaño del componente no sea cero
                        if (width <= 0 || height <= 0) {
                            System.out.println("Tamaño del componente no válido al cargar foto: width=" + width + ", height=" + height);
                            return;
                        }
                        
                        Image img = icono.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
                        panelDatosPaciente.getLblFotoConsu().setIcon(new ImageIcon(img));
                    } else {
                        panelDatosPaciente.getLblFotoConsu().setIcon(null);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al cargar la imagen: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
