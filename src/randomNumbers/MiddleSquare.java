/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomNumbers;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JTextArea;

/**
 *
 * @author hasty
 */
public class MiddleSquare {

    private int X0;
    private int n;
    private String tmp;

    public MiddleSquare() {
        this.X0 = 0;
        this.n = 0;
        this.tmp = "";
    }

    public void getNumbers(int n, JTextArea XR, JTextArea UR) {
        this.n = n;
        X0 = ThreadLocalRandom.current().nextInt(1000, 9999 + 1);

        XR.setText("X0: " + X0 + "\n");
        UR.setText("\n");

        //X0 = 3708;
        for (int i = 0; i < this.n; i++) {
            tmp = ((long) Math.pow(X0, 2) + "");

            if (tmp.length() < 8) {
                for (int j = tmp.length(); j < 8; j++) {
                    tmp = "0" + tmp;
                }
            }

            X0 = Integer.parseInt(tmp.substring(2, 6));

            XR.setText(XR.getText() + "X" + (i + 1) + ": " + X0 + "\n");
            UR.setText(UR.getText() + "U" + (i + 1) + ": 0." + X0 + "\n");
        }
    }
}
