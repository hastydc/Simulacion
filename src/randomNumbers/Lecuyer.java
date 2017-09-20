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
public class Lecuyer {

    public Lecuyer() {
    }

    public void getNumbers(int n, int x0, int y0, JTextArea XR, JTextArea YR, JTextArea ZR, JTextArea UR) {
        int z0 = 0;

        XR.setText("X0: " + x0 + "\n");
        YR.setText("Y0: " + y0 + "\n");
        ZR.setText("\n");
        UR.setText("\n");

        for (int i = 0; i < n; i++) {
            z0 = (x0 - y0) % 2147483562;
            x0 = (40014 * x0) % 2147483563;
            y0 = (40014 * y0) % 2147483399;

            XR.setText(XR.getText() + "X" + (i + 1) + ": " + x0 + "\n");
            YR.setText(YR.getText() + "Y" + (i + 1) + ": " + y0 + "\n");
            ZR.setText(ZR.getText() + "Z" + (i + 1) + ": " + z0 + "\n");

            if (z0 > 0) {
                UR.setText(UR.getText() + "U" + (i + 1) + ": " + ((float) z0 / (float) 2147483563) + "\n");
            } else {
                UR.setText(UR.getText() + "U" + (i + 1) + ": " + ((float) 2147483562 / (float) 2147483563) + "\n");
            }

        }
    }
}
