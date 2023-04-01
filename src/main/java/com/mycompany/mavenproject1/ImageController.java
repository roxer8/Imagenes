/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.JFrame;

public class ImageController implements ActionListener {
    
    private ImageModel model;
    private JFrame view;
    
    public ImageController(ImageModel model, JFrame view) {
        this.model = model;
        this.view = view;
        
        // Agregamos una imagen al modelo
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\golden\\Documents\\NetBeansProjects\\mavenproject1\\descargar.png"));
            model.addImage(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // Aquí puedes agregar más imágenes al modelo si lo deseas
    }
}


