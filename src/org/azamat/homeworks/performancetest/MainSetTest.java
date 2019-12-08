package org.azamat.homeworks.perfomancetest;

import org.azamat.homeworks.oop.triangle.MyTriangle;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSetTest {
    public static void main(String[] args) {
        Set<MyTriangle> hashSet = new HashSet<>();
        Set<MyTriangle> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 250000; ++i) {
            int newNum = (int) (-10 + Math.random() * (i + 10));
            MyTriangle nTg = new MyTriangle(newNum, newNum, newNum, newNum, newNum, newNum);
            hashSet.add(nTg);
        }
//        System.out.println(hashSet.size());

        for (int i = 0; i < 250000; ++i) {
            int newNum = (int) (-10 + Math.random() * (i + 10));
            MyTriangle nTg = new MyTriangle(newNum, newNum, newNum, newNum, newNum, newNum);
            linkedHashSet.add(nTg);
        }
//        System.out.println(linkedHashSet.size());

        for (int i = 0; i < 250000; ++i) {
            int newNum = (int) (-10 + Math.random() * (i + 10));
            treeSet.add(newNum);
        }
//        System.out.println(treeSet.size());

        int newNum = (int) (-10 + Math.random() * (3 + 10));
        MyTriangle nTg = new MyTriangle(newNum, newNum, newNum, newNum, newNum, newNum);

        long startTimeHashSet = System.nanoTime();
        hashSet.add(nTg);
        long estimatedTimeHashSet = System.nanoTime() - startTimeHashSet;
        System.out.println(estimatedTimeHashSet + " HashSet add time");

        long startTimeLinkedHashSet = System.nanoTime();
        linkedHashSet.add(nTg);
        long estimatedTimeLinkedHashSet = System.nanoTime() - startTimeLinkedHashSet;
        System.out.println(estimatedTimeLinkedHashSet + " LinkedHashSet add time");

        long startTimeTreeSet = System.nanoTime();
        treeSet.add(4);
        long estimatedTimeTreeSet = System.nanoTime() - startTimeTreeSet;
        System.out.println(estimatedTimeTreeSet + " TreeSet add time");

        long startTimeRemoveHashSet = System.nanoTime();
        hashSet.remove(nTg);
        long estimatedTimeRemoveHashSet = System.nanoTime() - startTimeRemoveHashSet;
        System.out.println(estimatedTimeRemoveHashSet + " HashSet remove time");

        long startTimeRemoveLinkedHashSet = System.nanoTime();
        linkedHashSet.remove(nTg);
        long estimatedTimeRemoveLinkedHashSet = System.nanoTime() - startTimeRemoveLinkedHashSet;
        System.out.println(estimatedTimeRemoveLinkedHashSet + " LinkedHashSet remove time");

        long startTimeRemoveTreeSet = System.nanoTime();
        treeSet.remove(2);
        long estimatedTimeRemoveTreeSet = System.nanoTime() - startTimeRemoveTreeSet;
        System.out.println(estimatedTimeRemoveTreeSet + " TreeSet remove time");

    }
}
