package org.azamat.homeworks.OOP2.myPolynomial;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length-1;
    }
    @Override
    public String toString() {
        String str = coeffs[this.getDegree()] + "x^" + this.getDegree();
        int size = coeffs.length;
        if (size == 2) {if (coeffs[1] > 0)return coeffs[1]+"x+"+coeffs[0];}
        else if (size == 1) return ""+ coeffs[0];
        if (size > 2) {
            for (int i = coeffs.length - 1; i >= 0; --i) {
                    if (coeffs[i] == 0) continue;
                    if (i == 1) {str += "+"+coeffs[1]+"x+"+coeffs[0]; break;}
                    else if (coeffs[i] > 0) str += "+" + coeffs[i] + "x^" + (i);
                    else if (coeffs[i] < 0) str += "-"+ -coeffs[i] + "x^" + (i);
            }
        }

        return str;
    }
}
