package org.azamat.homeworks.hw1.oneDArrays;

public class OneDimArray {
    private int[] arr;

    public int[] createArr(int size) {
        return this.arr = new int[size];
    }

    public int[] createArr(int size, int min, int max) {
        this.arr = new int[size];
        for (int i = 0; i <= arr.length - 1; ++i) {
            arr[i] = min + (int) (Math.random() * ((max - min) + 1));
        }
        return arr;
    }

    public int[] createOddArr(int size) {
        this.arr = new int[size];
        for (int i = 0; i <= arr.length - 1; ++i) {
            arr[i] = 2 * i + 1;
        }
        return arr;
    }

    public void printDesc() {
        for (int i = arr.length - 1; i >= 0; --i) {
            System.out.println(arr[i]);
        }
    }

    public void printAsc() {
        for (int i = 0; i <= arr.length - 1; ++i) {
            System.out.println(arr[i]);
        }
    }

    public void printArr() {
        for (int i = 0; i <= arr.length - 1; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void oddEvenCount() {
        int oddC = 0;
        int evenC = 0;
        for (int i = 0; i <= arr.length - 1; ++i) {
            if (arr[i] % 2 == 0 || arr[i] == 0) evenC += 1;
            else oddC += 1;
        }
        System.out.println("odd: " + oddC);
        System.out.println("even: " + evenC);
    }

    public void oddIndexToZero() {
        for (int i = 0; i <= arr.length - 1; ++i) {
            if (i % 2 == 0 || i == 0) arr[i] = 0;
        }
    }

    public void findMaxAndMinElem() {
        int maxInt = 0;
        int minInt = 0;
        int lastMax = 0;
        int lastMin = 0;
        for (int i = 0; i <= arr.length - 1; ++i) {
            if (arr[i] > maxInt) maxInt = arr[i];
            if (arr[i] < minInt) minInt = arr[i];
        }
        for (int i = 0; i <= arr.length - 1; ++i) {
            if (arr[i] == maxInt) lastMax = i;
            if (arr[i] == minInt) lastMin = i;
        }


        System.out.println("max: " + maxInt + " lastIn " + lastMax);
        System.out.println("min: " + minInt + " lastIn " + lastMin);
    }

    public double avgEl() {
        double sum = 0;
        double avgSum = 0;
        for (int i = 0; i <= arr.length - 1; ++i) {
            sum += arr[i];
        }
        return avgSum = sum / arr.length;
    }

    static public void compareAvg(OneDimArray arr1, OneDimArray arr2) {
        if (arr1.avgEl() == arr2.avgEl()) System.out.println("avg(arr1[]) = avg(arr2[]) and equals: " + arr1.avgEl());
        else if (arr1.avgEl() > arr2.avgEl())
            System.out.println("avg(arr1[]) > avg(arr2[]) and equals: " + arr1.avgEl());
            else System.out.println("avg(arr1[]) < avg(arr2[]) and equals: " + arr2.avgEl());
    }

    public void occursMostOften() {
        int[] count = new int[3];
        for (int i = 0; i < arr.length; ++i) {
            count[arr[i]+1]++; //statistics set
        }

        int max = 0;
        int var = 0;
        for (int i=0; i < count.length; ++i) {
             if (count[i] > max) max = count[i];
        }

        for (int i=0; i < count.length; ++i) {
            if (count[i] == max) var = i-1;
        }

        int repeat = 0;
        int k = 0;
        for (int i=0; i < count.length; ++i) {
            for (int j=i+1; j < count.length; ++j) {
                if (count[i]==count[j]) {
                    repeat = i-1;
                    k++;
                }
            }
        }

        if (k>=1) System.out.println("meets the same number of times " + repeat + " " + var);
            else System.out.println("occurs most often "+var);
    }
}