package org.azamat.homeworks.hw1.arraySort;

public class Main {
    public static void main(String[] args) {

        ArraySortClass a = new ArraySortClass();

        long startTime = System.nanoTime();
        a.bubbleSort();
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("bubbleSort    " + estimatedTime+"ns");

        long startTime1 = System.nanoTime();
        a.selectionSort();

        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("selectionSort " + estimatedTime1+"ns");

        long startTime2 = System.nanoTime();
        a.arraySort();
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("arraysSort    " + estimatedTime2+"ns");
    }
}
