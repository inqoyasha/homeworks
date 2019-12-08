package org.azamat.homeworks.performancetest;

import java.util.*;

public class MainListTest {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; ++i) {
            arrayList.add(i);
        }
        for (int i = 0; i < 100000; ++i) {
            linkedList.add(i);
        }

        long startTimeArrayList = System.nanoTime();
        arrayList.add(3);
        long estimatedTimeArrayList = System.nanoTime() - startTimeArrayList;
        System.out.println(estimatedTimeArrayList + " ArrayList add time");

        long startTimeLinkedList = System.nanoTime();
        linkedList.add(3);
        long estimatedTimeLinkedList = System.nanoTime() - startTimeLinkedList;
        System.out.println(estimatedTimeLinkedList + " LinkedList add time");

        long startTimeInsertArrayList = System.nanoTime();
        arrayList.add(14,1);
        long estimatedTimeInsertArrayList = System.nanoTime() - startTimeInsertArrayList;
        System.out.println(estimatedTimeInsertArrayList + " ArrayList insert time");

        long startTimeInsertLinkedList = System.nanoTime();
        linkedList.add(14,1);
        long estimatedTimeInsertLinkedList = System.nanoTime() - startTimeInsertLinkedList;
        System.out.println(estimatedTimeInsertLinkedList + " LinkedList insert time");

        long startTimeRemoveArrayList = System.nanoTime();
        arrayList.remove(1);
        long estimatedTimeRemoveArrayList = System.nanoTime() - startTimeRemoveArrayList;
        System.out.println(estimatedTimeRemoveArrayList + " ArrayList remove time");

        long startTimeRemoveLinkedList = System.nanoTime();
        linkedList.remove(1);
        long estimatedTimeRemoveLinkedList = System.nanoTime() - startTimeRemoveLinkedList;
        System.out.println(estimatedTimeRemoveLinkedList + " LinkedList remove time");
    }
}
