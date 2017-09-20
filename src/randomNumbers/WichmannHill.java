/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomNumbers;

import javax.swing.JTextArea;

/**
 *
 * @xenis
 * 
 */
public class WichmannHill {

    public WichmannHill() {
    }

    public void getNumbers(int n, int x0, int y0, int z0, JTextArea XR, JTextArea UR) {

        for (int i = 0; i < 1; i++) {
            x0 = (171 * x0) % 30269;
            y0 = (172 * y0) % 30307;
            z0 = (170 * z0) % 30323;
            System.out.println(x0);
            System.out.println(y0);
            System.out.println(z0);
        }
    }
}
