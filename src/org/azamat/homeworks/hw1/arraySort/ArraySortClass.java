package org.azamat.homeworks.hw1.arraySort;

import java.util.Arrays;

public class ArraySortClass {
    private int[] arr = new int[1000];

    public ArraySortClass(){
        for (int i = 0; i< arr.length - 1; ++i) {
            arr[i] =(int)(-10+Math.random()*(10+10)) ;
        }
    }
    void bubbleSort() {
        int t;
        boolean isSort = false;
        while (!isSort) {
            isSort=true;
                for (int i = 0; i < arr.length - 1; ++i) {
                    if (arr[i] > arr[i + 1]) {
                        isSort = false;

                        t = arr[i + 1];
                        arr[i + 1] = arr[i];
                        arr[i] = t;
                    }
                }
        }
//        for (int z:arr) {
//            System.out.println(z);
//        }
    }
    void selectionSort() {
        for (int i = 0; i < arr.length - 1; ++i) {
            int z = i;
            for (int j = z+1; j < arr.length; ++j) {
                if (arr[j]<arr[z]) {
                    z=j;
                }
            }

            int t = arr[i];
            arr[i] = arr[z];
            arr[z] = t;
        }
//        for (int z:arr) {
//            System.out.println(z);
//        }
    }
    void arraySort() {
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
    }

}
