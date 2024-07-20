/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author alexa
 */
public class OpacityBackground {
       private JWindow background;

    public void showWithOpacity(JFrame frame, int opacity) {
        // Centrar el JFrame en la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);

        // Crear un JWindow para el fondo opaco
        background = new JWindow();
        background.setBackground(new Color(0, 0, 0, opacity));
        background.setSize(screenSize);
        background.setLocation(0, 0);

        // Mostrar el fondo opaco y el JFrame
        background.setVisible(true);
        frame.setVisible(true);

        // Agregar un listener para cerrar el fondo opaco cuando el JFrame se cierre
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                background.dispose();
            }
        });
    }
}
