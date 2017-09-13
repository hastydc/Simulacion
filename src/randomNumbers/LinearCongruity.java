/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomNumbers;

import javax.swing.JTextArea;

/**
 *
 * @author hasty
 */
public class LinearCongruity {

    private Double X0;
    private int n;
    private Double a;
    private Double b;
    private Double m;

    public LinearCongruity() {
        this.X0 = 0.0;
        this.n = 0;
        this.a = 0.0;
        this.b = 0.0;
        this.m = 0.0;
    }

    public void getNumbers(Double X0, int n, Double a, Double b, Double m, JTextArea XR, JTextArea UR) {
        this.X0 = X0;
        this.n = n;
        this.a = a;
        this.b = b;
        this.m = m;
        Double xn = this.X0;
        Double un = 0.0;

        XR.setText("X0: " + X0 + "\n");
        UR.setText("\n");

        for (int i = 0; i < n; i++) {
            xn = ((this.a * xn) + b) % this.m;
            XR.setText(XR.getText() + "X" + (i+1) + ": " + xn + "\n");

            un = xn / this.m;
            UR.setText(UR.getText() + "U" + (i+1) + ": " + un + "\n");
        }
    }
}
