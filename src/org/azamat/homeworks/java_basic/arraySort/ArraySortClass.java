package org.azamat.homeworks.java_basic.arraySort;

import java.util.Arrays;

public class ArraySortClass {
    private int[] arr = new int[1000];

    public ArraySortClass(){
        for (int i = 0; i< arr.length - 1; ++i) {
            arr[i] =(int)(-10+Math.random()*(10+10)) ;
        }
    }
    public void bubbleSort() {
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
    public void selectionSort() {
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
    public void arraySort() {
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        ArraySortClass that = (ArraySortClass) o;
        return Arrays.equals(arr, that.arr);
    }
    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }
}
