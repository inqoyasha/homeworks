package org.azamat.homeworks.oop2.polynomial;

public class Main {
    public static void main(String[] args) {
        MyPolynomial aN = new MyPolynomial(-1, 2, 3,2);
        MyPolynomial bN = new MyPolynomial( 1, 0, 1);
        System.out.println(aN.toString());
//        System.out.println(aN.evaluate(-1));
        System.out.println(bN.toString());
        System.out.println(aN.add(bN).toString());
        System.out.println(aN.multiply(bN).toString());
    }
}
