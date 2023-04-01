
package com.mycompany.mavenproject1;


import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class ImageModel {
    
    private List<BufferedImage> images;
    
    public ImageModel() {
        images = new ArrayList<>();
    }
    
    public void addImage(BufferedImage image) {
        images.add(image);
    }
    
    public List<BufferedImage> getImageList() {
        return new ArrayList<>(images);
    }

}
