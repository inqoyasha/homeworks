package org.azamat.homeworks.hw1.oneDArrays;

public class OneDimArray {
    void oddNum(int[] arr){
        for (int i = 0; i<= arr.length-1; ++i) {
            arr[i] =2*i+1;
        }
    }
    void printDesc(int[] arr){
        for (int i=arr.length-1; i>=0; --i) {
            System.out.println(arr[i]);
        }
    }
    void printAsc(int[] arr){
        for (int i = 0; i<= arr.length-1; ++i) {
            System.out.println(arr[i]);
        }
    }
    int[] createArr(int size, int first, int second) {
        int[] arr = new int[size];
        for (int i = 0; i< arr.length - 1; ++i) {
            arr[i] =(int)(first+Math.random()*(second-first)) ;
        }
        return arr;
    }
    int[] createArr(int size) {
        int[] arr = new int[size];
        return arr;
    }
}
