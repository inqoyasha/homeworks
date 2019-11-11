package org.azamat.homeworks.javabasic.twodarray;

import java.util.Arrays;

public class TwoDimArray {
    private int[][] arr;

    public TwoDimArray(int row, int col) {
        this.arr = new int[row][col];
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j){
                arr[i][j] = 0;
            }
        }
    }

    public TwoDimArray(int row, int col, int min, int max) {
        this.arr = new int[row][col];
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j){
                arr[i][j] = min + (int) (Math.random() * ((max - min) + 1));
            }
        }

    }

    public void printArr() {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j){
                if(arr[i][j]<0 ) System.out.print(arr[i][j]+"\t");
                    else System.out.print(" "+arr[i][j]+"\t");
            }
            System.out.println("");
        }
    }

    public long multiplyMainDiag() {
        long mul = 1;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j){
                if (i == j) mul*= arr[i][j];
            }
        }
        return mul;
    }
    public long multiplyCollateralDiag() {
        long mul = 1;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j){
                if (i + j == arr[i].length - 1) mul*= arr[i][j];
            }
        }
        return mul;
    }
    public int sumMainDiag() {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j){
                if (i == j) sum+= arr[i][j];
            }
        }
        return sum;
    }
    public int sumCollateralDiag() {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j){
                if (i + j == arr[i].length - 1) sum+= arr[i][j];
            }
        }
        return sum;
    }

    public void findMaxAndMinElem() {
        int maxInt = 0;
        int indexI = 0;
        int indexJ = 0;

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j){
                if (arr[i][j] > maxInt) {
                    maxInt = arr[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }

        System.out.println("max el: "+maxInt+", index i: "+indexI+", index j: "+indexJ);
    }


    public void maxAbsMultiplyIndex() {
        int mult = 1;
        int[] mas = new int[arr.length];
        for (int i = 0; i < arr.length; ++i) {
            mult = 1;
            for (int j = 0; j < arr[i].length; ++j){
                    mult*=arr[i][j];
                }
            mas[i]=mult;
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (Math.abs(mas[i]) > max) {
                max = Math.abs(mas[i]);
                index = i;
            }
        }
        System.out.println("index row: "+index+", abs multiply is equals: "+max);

    }

    public void sortRowDesc() {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j){
                selectionSort(arr[i]);
            }
        }

    }
    void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            int z = i;
            for (int j = z+1; j < arr.length; ++j) {
                if (arr[j] > arr[z]) {
                    z=j;
                }
            }
            int t = arr[i];
            arr[i] = arr[z];
            arr[z] = t;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        TwoDimArray that = (TwoDimArray) o;
        return Arrays.equals(arr, that.arr);
    }
    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }
}
