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
        if (size == 2) {
            if (coeffs[0] > 0) return coeffs[1]+"x+"+coeffs[0];
            else return coeffs[1]+"x"+coeffs[0];
        }
        else if (size == 1) return ""+ coeffs[0];
        if (size > 2) {
            for (int i = this.getDegree() - 1; i >= 0; --i) {
                if (coeffs[i] == 0) continue;
                else if (coeffs[i] > 0) str += "+" + coeffs[i];
                else if (coeffs[i] < 0) str += "-"+ -coeffs[i];
                if (i==1) str+= "x";
                else if (i >  1) str += "x^" + i;
            }
        }

        return str;
    }

    public double evaluate(double x) {
        int degree = this.getDegree();
        double value = 0.0;
        for (int i = degree; i >= 0; --i) {
            value += coeffs[i]*Math.pow(x,i);
        }

        return value;
    }

    public MyPolynomial add(MyPolynomial right) {
        int degreeThis = this.getDegree();
        int degreeRight = right.getDegree();
        int minDegree = Math.min(degreeThis,degreeRight);
        int maxDegree = Math.max(degreeThis,degreeRight);
        double[] newCoeffs = new double[maxDegree+1];
        for (int i = 0; i <= maxDegree; ++i) {
            if (i <= minDegree) newCoeffs[i] = coeffs[i] + right.coeffs[i]; //идем до минимальной степени полинома, в массив с новыми коэффициентами закидываем сумму 2х полиномов
                else if (degreeThis > degreeRight) newCoeffs[i] = this.coeffs[i]; //когда дошли до степени большей минимальной, проверяем какой из массивов длиннее
                    else newCoeffs[i] = right.coeffs[i];                          //и из наибольшего копируем остальные коэффициенты в результирующий массив
        }
        MyPolynomial newPolynom = new MyPolynomial(newCoeffs); //заполняем наш результирующий полином коэфф

        return newPolynom;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int thisCoeffsSize = coeffs.length;
        int rightCoeffsSize = right.coeffs.length;
        double[] newCoeffs = new double[thisCoeffsSize+rightCoeffsSize-1];
        for (int i = 0; i < thisCoeffsSize; ++i) {
            for (int j = 0; j < rightCoeffsSize; ++j) {
                newCoeffs[i+j] += this.coeffs[i]*right.coeffs[j]; // заполняем массив перемножая коэффы 1 и 2
            }
        }
        MyPolynomial newPolynom = new MyPolynomial(newCoeffs);

        return newPolynom;
    }

}
