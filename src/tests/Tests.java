/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;



import javax.swing.JLabel;


/**
 *
 * @author Hasty
 */
public class Tests {

    public Tests() {
    }

    public void average(int n, Double x, JLabel jlAverage, JLabel jlAvLInf, JLabel jlAvLSup, JLabel jlAvResponse) {
        jlAverage.setText(x + "");
        Double li = 0.5 - ((1.96) * (1 / Math.sqrt(12 * n)));
        Double ls = 0.5 + ((1.96) * (1 / Math.sqrt(12 * n)));
        jlAvLInf.setText(li + "");
        jlAvLSup.setText(ls + "");
        jlAvResponse.setText((x > li && x < ls) ? "La hipotesis nula es ACEPTADA" : "La hipotesis nula es RECHAZADA");
    }

    public void variance(int n, Double x, JLabel jlVar, JLabel jlVarLInf, JLabel jlVarLSup, JLabel jlVarResponse) {

    }

    public void chiSquareF(int n, double[] numbers, JLabel jlChiInt, JLabel jlChiEi, JLabel jlChiSum, JLabel jlChiGL, JLabel jlChiResponse) {
        double m = Math.sqrt(n);
        double gl = m - 1;
        double ei = (double) n / m;
        double sum = 0.0;

        for (int i = 0; i < m; i++) {
            int oi = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > Double.parseDouble("0." + i) && numbers[j] < Double.parseDouble("0." + (i + 1))) {
                    oi++;
                }
            }
            
            sum = Double.sum(sum, (Math.pow((ei - oi), 2) / ei));
        }
        
        jlChiInt.setText(String.format("%.2f", m));
        jlChiEi.setText(String.format("%.2f", ei));
        jlChiGL.setText(String.format("%.2f", gl));
        jlChiSum.setText(String.format("%.2f", sum));
        jlChiResponse.setText("Consultar en la tabla si con el Grado de libertad y la a el valor de la suma es inferior a este.");
    }

    public void ks() {

    }
    
}
