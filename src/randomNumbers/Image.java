/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomNumbers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Hasty
 */
public class Image {

    public Image() {

    }

    public void getPercentage(File file, JLabel JLR, JLabel JLI) throws IOException {
        LinearCongruity lc = new LinearCongruity();
        BufferedImage img = ImageIO.read(file);

        int width = img.getWidth();
        int height = img.getHeight();
        int percentage = 0;

        String[][] map = new String[width][height];
        ArrayList<Integer> numbersX = lc.get100Numbers(width);
        ArrayList<Integer> numbersY = lc.get100Numbers(height);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int color = img.getRGB(i, j);
                /*System.out.println("r:" + ((color & 0xff0000) >> 16));
                System.out.println("g:" + ((color & 0xff00) >> 8));
                System.out.println("b:" + (color & 0xff));*/
                map[i][j] = ((color & 0xff0000) >> 16) + "," + ((color & 0xff00) >> 8) + "," + (color & 0xff);
            }
        }

        for (int i = 0; i < 100; i++) {
            img.setRGB(numbersX.get(i), numbersY.get(i), (new Color(255, 0, 0).getRGB()));
            if ((map[numbersX.get(i)][numbersY.get(i)]).equalsIgnoreCase("0,0,0")) {
                percentage++;
            }
        }
        
        ImageIcon display = new ImageIcon(img);
        JLI.setIcon(display);

        JLR.setText("El " + percentage + "% de coordenadas aleatorias generadas están sobre el área negra.");
    }
}
