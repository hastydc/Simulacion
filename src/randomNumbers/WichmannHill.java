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

    public void getNumbers(int n, int x0, int y0, int z0, JTextArea XR, JTextArea YR, JTextArea ZR, JTextArea UR) {

        XR.setText("X0: " + x0 + "\n");
        YR.setText("Y0: " + y0 + "\n");
        ZR.setText("Z0: " + z0 + "\n");
        UR.setText("\n");

        for (int i = 0; i < n; i++) {
            x0 = (171 * x0) % 30269;
            y0 = (172 * y0) % 30307;
            z0 = (170 * z0) % 30323;

            XR.setText(XR.getText() + "X" + (i + 1) + ": " + x0 + "\n");
            YR.setText(YR.getText() + "Y" + (i + 1) + ": " + y0 + "\n");
            ZR.setText(ZR.getText() + "Z" + (i + 1) + ": " + z0 + "\n");
            UR.setText(UR.getText() + "U" + (i + 1) + ": " + (((float) x0 / (float) 30269) + ((float) y0 / (float) 30307) + ((float) z0 / (float) 30323)) + "\n");
        }
    }
}
