package org.azamat.homeworks.hw1.oneDArrays;

import java.rmi.activation.ActivationDesc;

public class Main {
    public static void main(String[] args) {
//        OneDimArray arrA = new OneDimArray();
//        arrA.createOddArr(50);
//        arrA.printAsc();
//        System.out.println("----");
//        arrA.printDesc();

//        OneDimArray arrB = new OneDimArray();
//        arrB.createArr(20,0,10);
//        arrB.printArr();
//        arrB.oddEvenCount();

//        OneDimArray arrC = new OneDimArray();
//        arrC.createArr(10,1,100);
//        arrC.printArr();
//        arrC.oddIndexToZero();
//        arrC.printArr();

//        OneDimArray arrD = new OneDimArray();
//        arrD.createArr(15,-50,50);
//        arrD.printArr();
//        arrD.findMaxAndMinElem();

//        OneDimArray arrE1 = new OneDimArray();
//        OneDimArray arrE2 = new OneDimArray();
//        arrE1.createArr(10,0,10);
//        arrE2.createArr(10,0,10);
//        arrE1.printArr();
//        arrE2.printArr();
//        OneDimArray.compareAvg(arrE1,arrE2);

        OneDimArray arrF = new OneDimArray();
        arrF.createArr(20,-1,1);
        arrF.printArr();
        System.out.println("");
        arrF.occursMostOften();
    }
}