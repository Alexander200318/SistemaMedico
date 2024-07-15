/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_Vist;

import Vista.FrmPantallaPrincipal;
import Vista.PANEL_PRINCIPAL_HISTORIAL;
import Vista.PANEL_PRINCIPAL_PACIENTE;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author alexa
 */
public class PaginaPrincipalDAO {

    FrmPantallaPrincipal principal;
    private JButton selectedButton = null;

    public PaginaPrincipalDAO(FrmPantallaPrincipal principal) {
        this.principal = principal;
        this.principal.setVisible(true);
        Eventos_menu();

    }

    public void Eventos_menu() {
/////////////////////////////////////// BOTON HISTORIAL
        principal.getBtnHistorial().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (selectedButton != principal.getBtnHistorial()) {
                    principal.getPane_HistorialMenu().setBackground(Color.WHITE);
                    principal.getBtnHistorial().setForeground(new Color(51, 102, 255));
                    principal.getBtnHistorial().setIcon(new ImageIcon("src/Recursos/conversacion2.png"));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (selectedButton != principal.getBtnHistorial()) {
                    principal.getPane_HistorialMenu().setBackground(new Color(102, 102, 255));
                    principal.getBtnHistorial().setForeground(Color.WHITE);
                    principal.getBtnHistorial().setIcon(new ImageIcon("src/Recursos/conversacion.png"));
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (selectedButton != null && selectedButton != principal.getBtnHistorial()) {
                    // Restaura el estado del botón anteriormente seleccionado
                    if (selectedButton == principal.getBtnUsuario()) {
                        principal.getPane_UsuarioMenu().setBackground(new Color(102, 102, 255));
                        selectedButton.setForeground(Color.WHITE);

                    } else if (selectedButton == principal.getBtnPaciente()) {
                        principal.getPane_PacienteMenu().setBackground(new Color(102, 102, 255));
                        selectedButton.setForeground(Color.WHITE);

                    } else if (selectedButton == principal.getBtnInicio()) {
                        principal.getPane_InicioMenu().setBackground(new Color(102, 102, 255));
                        selectedButton.setForeground(Color.WHITE);
                    }
                }

                
                
                selectedButton = principal.getBtnHistorial();
                principal.getPane_HistorialMenu().setBackground(Color.WHITE);
                principal.getBtnHistorial().setForeground(new Color(51, 102, 255));
                principal.getBtnHistorial().setIcon(new ImageIcon("src/Recursos/conversacion2.png"));
                System.out.println("Botón  seleccionado HISTORIAL");
                
               
                
                  
                PANEL_PRINCIPAL_HISTORIAL PanelHistorial=new PANEL_PRINCIPAL_HISTORIAL();
                PanelHistorial.setSize(1280, 680);
                PanelHistorial.setLocation(0, 0);
                
                principal.getPANEL_CAMBIO().removeAll();
                principal.getPANEL_CAMBIO().add(PanelHistorial, BorderLayout.CENTER);
                principal.getPANEL_CAMBIO().revalidate();
                principal.getPANEL_CAMBIO().repaint();
                
                // A
                
                
            }
        });

 ////////////////////////////////////////// BOTON USUARIO
        principal.getBtnUsuario().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (selectedButton != principal.getBtnUsuario()) {
                    principal.getPane_UsuarioMenu().setBackground(Color.WHITE);
                    principal.getBtnUsuario().setForeground(new Color(51, 0, 204));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (selectedButton != principal.getBtnUsuario()) {
                    principal.getPane_UsuarioMenu().setBackground(new Color(102, 102, 255));
                    principal.getBtnUsuario().setForeground(Color.WHITE);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (selectedButton != null && selectedButton != principal.getBtnUsuario()) {
                    // Restaura el estado del botón anteriormente seleccionado
                    if (selectedButton == principal.getBtnHistorial()) {
                        principal.getPane_HistorialMenu().setBackground(new Color(102, 102, 255));
                        selectedButton.setForeground(Color.WHITE);
                        selectedButton.setIcon(new ImageIcon("src/Recursos/conversacion.png"));
                    } else if (selectedButton == principal.getBtnPaciente()) {
                        principal.getPane_PacienteMenu().setBackground(new Color(102, 102, 255));
                        selectedButton.setForeground(Color.WHITE);

                    } else if (selectedButton == principal.getBtnInicio()) {
                        principal.getPane_InicioMenu().setBackground(new Color(102, 102, 255));
                        selectedButton.setForeground(Color.WHITE);
                    }
                }

                // Actualiza el botón seleccionado
                selectedButton = principal.getBtnUsuario();
                principal.getPane_UsuarioMenu().setBackground(Color.WHITE);
                principal.getBtnUsuario().setForeground(new Color(51, 0, 204));
                System.out.println("Botón Actividad USUARIO");
            }
        });
        //////////////////////////////////////////////  BOTON PACIENTE
        principal.getBtnPaciente().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (selectedButton != principal.getBtnPaciente()) {
                    principal.getPane_PacienteMenu().setBackground(Color.WHITE);
                    principal.getBtnPaciente().setForeground(new Color(51, 0, 204));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (selectedButton != principal.getBtnPaciente()) {
                    principal.getPane_PacienteMenu().setBackground(new Color(102, 102, 255));
                    principal.getBtnPaciente().setForeground(Color.WHITE);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (selectedButton != null && selectedButton != principal.getBtnPaciente()) {
                    // Restaura el estado del botón anteriormente seleccionado
                    if (selectedButton == principal.getBtnHistorial()) {
                        principal.getPane_HistorialMenu().setBackground(new Color(102, 102, 255));
                        selectedButton.setForeground(Color.WHITE);
                        selectedButton.setIcon(new ImageIcon("src/Recursos/conversacion.png"));

                    } else if (selectedButton == principal.getBtnUsuario()) {
                        principal.getPane_UsuarioMenu().setBackground(new Color(102, 102, 255));
                        selectedButton.setForeground(Color.WHITE);

                    } else if (selectedButton == principal.getBtnInicio()) {
                        principal.getPane_InicioMenu().setBackground(new Color(102, 102, 255));
                        selectedButton.setForeground(Color.WHITE);
                    }
                }

                selectedButton = principal.getBtnPaciente();
                principal.getPane_PacienteMenu().setBackground(Color.WHITE);
                principal.getBtnPaciente().setForeground(new Color(51, 0, 204));
                
                
                PANEL_PRINCIPAL_PACIENTE PanelPaciente=new PANEL_PRINCIPAL_PACIENTE();
                PanelPaciente.setSize(1280, 680);
                PanelPaciente.setLocation(0, 0);
                
                principal.getPANEL_CAMBIO().removeAll();
                principal.getPANEL_CAMBIO().add(PanelPaciente, BorderLayout.CENTER);
                principal.getPANEL_CAMBIO().revalidate();
                principal.getPANEL_CAMBIO().repaint();
                
                
                System.out.println("Botón Actividad PACIENTE");
            }
        });
        
/////////////////////////////////////////////////            BOTON INICIO
        principal.getBtnInicio().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (selectedButton != principal.getBtnInicio()) {
                    principal.getPane_InicioMenu().setBackground(Color.WHITE);
                    principal.getBtnInicio().setForeground(new Color(51, 0, 204));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (selectedButton != principal.getBtnInicio()) {
                    principal.getPane_InicioMenu().setBackground(new Color(102, 102, 255));
                    principal.getBtnInicio().setForeground(Color.WHITE);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (selectedButton != null && selectedButton != principal.getBtnInicio()) {
                    // Restaura el estado del botón anteriormente seleccionado
                    if (selectedButton == principal.getBtnHistorial()) {
                        principal.getPane_HistorialMenu().setBackground(new Color(102, 102, 255));
                        selectedButton.setForeground(Color.WHITE);
                        selectedButton.setIcon(new ImageIcon("src/Recursos/conversacion.png"));

                    } else if (selectedButton == principal.getBtnUsuario()) {
                        principal.getPane_UsuarioMenu().setBackground(new Color(102, 102, 255));
                        selectedButton.setForeground(Color.WHITE);
                    } else if (selectedButton == principal.getBtnPaciente()) {
                        principal.getPane_PacienteMenu().setBackground(new Color(102, 102, 255));
                        selectedButton.setForeground(Color.WHITE);
                    }
                }

               
                selectedButton = principal.getBtnInicio();
                principal.getPane_InicioMenu().setBackground(Color.WHITE);
                principal.getBtnInicio().setForeground(new Color(51, 0, 204));
                System.out.println("Botón Actividad INICIO");
                
                
                
                
            }
        });
        /////////////////////////////////////////////////////////
    }

}
