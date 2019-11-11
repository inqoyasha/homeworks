package org.azamat.homeworks.javabasic.twodarray;

public class Main {
    public static void main(String[] args) {
////      task a
//        TwoDimArray arrA = new TwoDimArray(8,8,1,99);
//        arrA.printArr();
//        System.out.println("");
//        System.out.println("multiply main diagonal "+"\t"+"\t"+arrA.multiplyMainDiag());
//        System.out.println("multiply collateral diagonal "+arrA.multiplyCollateralDiag());
//        System.out.println("sum main diagonal "+"\t"+"\t"+arrA.sumMainDiag());
//        System.out.println("sum collateral diagonal "+arrA.sumCollateralDiag());

////      task b
//        TwoDimArray arrB = new TwoDimArray(8,5,-99,99);
//        arrB.printArr();
//        System.out.println("");
//        arrB.findMaxAndMinElem();

////      task c
//        TwoDimArray arrC = new TwoDimArray(8,5,-10,10);
//        arrC.printArr();
//        System.out.println("");
//        arrC.maxAbsMultiplyIndex();

//      task d
        TwoDimArray arrD = new TwoDimArray(10,7,0,100);
        arrD.printArr();
        System.out.println("-----------------");
        arrD.sortRowDesc();
        arrD.printArr();
    }
}
