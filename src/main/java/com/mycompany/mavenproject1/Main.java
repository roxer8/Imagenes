/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        ImageModel model = new ImageModel();
        JFrame frame = new JFrame("Imagenes");
        
        ImageView view = new ImageView(model);
        frame.add(view);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        ImageController controller = new ImageController(model, frame);
        // Si has agregado una imagen en el constructor del controlador, ya no necesitas agregar un botón
        // JButton button = new JButton("Agregar imagen");
        // button.addActionListener(controller);
        // frame.add(button, BorderLayout.SOUTH);
    }
}

