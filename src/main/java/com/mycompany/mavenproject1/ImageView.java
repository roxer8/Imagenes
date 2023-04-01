/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Collections;
import java.util.List;

import javax.swing.JPanel;

public class ImageView extends JPanel {

    private static final long serialVersionUID = 1L;
    private ImageModel model;

    public ImageView(ImageModel model) {
        this.model = model;
        setPreferredSize(new Dimension(500, 500));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        List<BufferedImage> images = model.getImageList();
        Collections.shuffle(images); // Mezcla la lista de imágenes
        int x = 0;
        int y = 0;
        int imageCount = 0;
        while (imageCount < 10) {
            for (BufferedImage image : images) {
                g.drawImage(image, x, y, null);
                x += image.getWidth();
                imageCount++;
                if (imageCount >= 10) {
                    break;
                }
            }
            y += images.get(0).getHeight();
            x = 0;
        }
    }
}



