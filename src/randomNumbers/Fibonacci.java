/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomNumbers;

import javax.swing.JTextArea;

/**
 *
 * @author Usuario
 */
public class Fibonacci {

    public Fibonacci() {

    }

    public void getNumbers(int n, int m, int n0, int n1, int r, int s, JTextArea XR, JTextArea UR) {
        int xn = 0;

        for (int i = 0; i < n; i++) {
            xn = (n0 + n1) % m;
            n0 = n1;
            n1 = xn;

            XR.setText(XR.getText() + "X" + (i + 1) + ": " + xn + "\n");
            UR.setText(UR.getText() + "U: " + ((float) xn / (float) m) + "\n");
        }
    }
}
