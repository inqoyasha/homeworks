package org.azamat.homeworks.OOP2.myComplex;

public class Main {
    public static void main(String[] args) {
        MyComplex z1 = new MyComplex(1,-2);
        MyComplex z11 = new MyComplex(1,-2);
        MyComplex z2 = new MyComplex(3,-6);
        MyComplex z3 = new MyComplex(13,1);
        MyComplex z4 = new MyComplex(7,-6);
        MyComplex isReal = new MyComplex(34,0);
        MyComplex isImag = new MyComplex(-7,-3);
        System.out.println(z1.getReal());
        System.out.println(z1.getImag());
        System.out.println(z1.toString());
        System.out.println(z2.toString());
        System.out.println(z1.magnitude());
        System.out.println(z1.argument());
        System.out.println("----");
        System.out.println(z1.conjugate());
        System.out.println("----");
//        System.out.println(z1.add(z2));
//        System.out.println(z1.subtract(z2));
//        System.out.println(z1.multiply(z2));
//        System.out.println(z3.divide(z4));
//        System.out.println("----");
//        System.out.println(z3.addNew(z4));
//        System.out.println(z3);
//        System.out.println(z3.subtractNew(z4));
//        System.out.println(z3);
        System.out.println("isReal/isImag var isReal");
        System.out.println(isReal.isReal());
        System.out.println(isReal.isImaginary());
        System.out.println("isReal/isImag var isImag");
        System.out.println(isImag.isReal());
        System.out.println(isImag.isImaginary());
        System.out.println("equalsis for z1");
        System.out.println(z1.equals(z2));
        System.out.println(z1.equals(1,2));
        System.out.println("equalsis for z1");
        System.out.println(z1.equals(z11));
        System.out.println(z1.equals(1,-2));
    }
}
