/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomNumbers;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import tests.Tests;
import views.jpLinearCongruity;

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
    private Tests tests;

    public LinearCongruity() {
        this.X0 = 0.0;
        this.n = 0;
        this.a = 0.0;
        this.b = 0.0;
        this.m = 0.0;
        tests = new Tests();
    }

    public void getNumbers(Double X0, int n, Double a, Double b, Double m, 
            JTextArea XR, JTextArea UR, 
            JLabel jlAverage, JLabel jlAvLInf, JLabel jlAvLSup, JLabel jlAvResponse,
            //JLabel jlVar, JLabel jlVarLInf, JLabel jlVarLSup, JLabel jlVarResponse,
            JLabel jlChiInt, JLabel jlChiEi, JLabel jlChiSum, JLabel jlChiGL, JLabel jlChiResponse
    ) {
        this.X0 = X0;
        this.n = n;
        this.a = a;
        this.b = b;
        this.m = m;
        Double xn = this.X0;
        Double un = 0.0;
        Double average = 0.0;
        double[] numbers = new double[n];

        XR.setText("X0: " + X0 + "\n");
        UR.setText("\n");

        for (int i = 0; i < n; i++) {
            xn = ((this.a * xn) + b) % this.m;
            XR.setText(XR.getText() + "X" + (i + 1) + ": " + xn + "\n");

            un = xn / this.m;
            average = Double.sum(average, un);
            numbers[i] = un;
            UR.setText(UR.getText() + "U" + (i + 1) + ": " + un + "\n");
        }

        tests.average(n, (average / n), jlAverage, jlAvLInf, jlAvLSup, jlAvResponse);
        //tests.variance(n, (average / n), jlVar, jlVarLInf, jlVarLSup, jlVarResponse);
        tests.chiSquareF(n, numbers, jlChiInt, jlChiEi, jlChiSum, jlChiGL, jlChiResponse);
    }

    public ArrayList<Integer> get100Numbers(int limit) {
        Random rnd = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        this.n = 100;
        this.a = 4014.0;
        this.b = 18.0;
        this.m = 397.0;
        Double xn = Double.parseDouble((rnd.nextInt(100) + 600) + "");

        do {
            xn = ((this.a * xn) + b) % this.m;
            if (xn < limit) {
                numbers.add(xn.intValue());
            }
        } while (numbers.size() < n);

        return numbers;
    }
    
    public ArrayList<Integer> getNNumbers(int limit) {
        Random rnd = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        this.n = 100;
        this.a = 4014.0;
        this.b = 18.0;
        this.m = 397.0;
        Double xn = Double.parseDouble((rnd.nextInt(100) + 600) + "");

        do {
            xn = ((this.a * xn) + b) % this.m;
            if (xn < limit) {
                numbers.add(xn.intValue());
            }
        } while (numbers.size() < n);

        return numbers;
    }
}

