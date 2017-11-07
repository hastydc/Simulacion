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
public class Pi {

    public Pi() {

    }

    public void getNumbers(File file, JLabel JLR, JLabel JLI, JLabel JLN) throws IOException {
        LinearCongruity lc = new LinearCongruity();
        BufferedImage img = ImageIO.read(file);
        int width = img.getWidth();
        int height = img.getHeight();
        int percentage;
        int n = 50;
        double four = 4.0;
        double pi = 3.14;
        double pe = 0.0;
        ArrayList<Integer> numbersX, numbersY;
        String[][] map = new String[width][height];
        
        do {
            n++;
            percentage = 0;
            numbersX = lc.getNNumbers(n);
            numbersY = lc.getNNumbers(n);

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    int color = img.getRGB(i, j);
                    map[i][j] = ((color & 0xff0000) >> 16) + "," + ((color & 0xff00) >> 8) + "," + (color & 0xff);
                }
            }

            for (int i = 0; i < n; i++) {
                if ((map[numbersX.get(i)][numbersY.get(i)]).equalsIgnoreCase("0,0,0")) {
                    percentage++;
                }
            }
            pe = (double) percentage / n;
            pe = (double) pe * four;
            pe = (double) pe - pi;
        } while (pe <= (double) 0.01);

        for (int i = 0; i < n; i++) {
            img.setRGB(numbersX.get(i), numbersY.get(i), (new Color(255, 0, 0).getRGB()));
        }

        JLN.setText(n + ".  La Formula es: (" + 4 +" * "+ percentage + " / " + n + ") - 3.14 = " + pe);        
        ImageIcon display = new ImageIcon(img);
        JLI.setIcon(display);
    }
}
