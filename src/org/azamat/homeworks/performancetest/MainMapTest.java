package org.azamat.homeworks.performancetest;

import org.azamat.homeworks.oop.triangle.MyTriangle;

import java.util.*;

public class MainMapTest {
    public static void main(String[] args) {
        Map<Integer, MyTriangle> hashMap = new HashMap<>();
        Map<Integer, MyTriangle> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, MyTriangle> treeMap = new TreeMap<>();

        for (int i = 0; i < 100000; ++i) {
            int  newNum = (int)(-10 + Math.random() * (i - 10));
            MyTriangle nTg = new MyTriangle(newNum, newNum, newNum, newNum, newNum, newNum);
            hashMap.put(i, nTg);
        }

        for (int i = 0; i < 100000; ++i) {
            int  newNum = (int)(-10 + Math.random() * (i - 10));
            MyTriangle nTg = new MyTriangle(newNum, newNum, newNum, newNum, newNum, newNum);
            linkedHashMap.put(i, nTg);
        }

        for (int i = 0; i < 100000; ++i) {
            int  newNum = (int)(-10 + Math.random() * (i - 10));
            MyTriangle nTg = new MyTriangle(newNum, newNum, newNum, newNum, newNum, newNum);
            treeMap.put(i, nTg);
        }

//        for (Map.Entry entry: hashMap.entrySet()) {
//            System.out.println(entry);
//        }
        MyTriangle nTg1 = new MyTriangle(2, 3, 5, 6, 3, 1);
//---------------------------------------add-------------------------------------------------
//        System.out.println(hashMap.size());
        long startTimeHashMap = System.nanoTime();
        hashMap.put(100000, nTg1);
        long estimatedTimeHashMap = System.nanoTime() - startTimeHashMap;
        System.out.println(estimatedTimeHashMap + " HashMap add time");
//        System.out.println(hashMap.size());

        long startTimeLinkedHashMap = System.nanoTime();
        linkedHashMap.put(100000, nTg1);
        long estimatedTimeLinkedHashMap = System.nanoTime() - startTimeLinkedHashMap;
        System.out.println(estimatedTimeLinkedHashMap + " LinkedHashMap add time");

        long startTimeTreeMap = System.nanoTime();
        treeMap.put(100000, nTg1);
        long estimatedTimeTreeMap = System.nanoTime() - startTimeTreeMap;
        System.out.println(estimatedTimeTreeMap + " TreeMap add time");
        System.out.println("----------------------------------------");
//---------------------------------------insert----------------------------------------------
//        System.out.println(hashMap.size());
        long startTimeInsertHashMap = System.nanoTime();
        hashMap.put(50000, nTg1);
        long estimatedInsertHashMap = System.nanoTime() - startTimeInsertHashMap;
        System.out.println(estimatedInsertHashMap + " HashMap insert time");
//        System.out.println(hashMap.size());

        long startTimeInsertLinkedHashMap = System.nanoTime();
        linkedHashMap.put(50000, nTg1);
        long estimatedTimeInsertLinkedHashMap = System.nanoTime() - startTimeInsertLinkedHashMap;
        System.out.println(estimatedTimeInsertLinkedHashMap + " LinkedHashMap insert time");

        long startTimeInsertTreeMap = System.nanoTime();
        treeMap.put(50000, nTg1);
        long estimatedTimeInsertTreeMap = System.nanoTime() - startTimeInsertTreeMap;
        System.out.println(estimatedTimeInsertTreeMap + " TreeMap insert time");
        System.out.println("----------------------------------------");
//---------------------------------------remove----------------------------------------------
//        System.out.println(hashMap.size());
        long startTimeRemoveHashMap = System.nanoTime();
        hashMap.remove(50000, nTg1);
        long estimatedRemoveHashMap = System.nanoTime() - startTimeRemoveHashMap;
        System.out.println(estimatedRemoveHashMap + " HashMap remove time");
//        System.out.println(hashMap.size());

        long startTimeRemoveLinkedHashMap = System.nanoTime();
        linkedHashMap.remove(50000, nTg1);
        long estimatedTimeRemoveLinkedHashMap = System.nanoTime() - startTimeRemoveLinkedHashMap;
        System.out.println(estimatedTimeRemoveLinkedHashMap + " LinkedHashMap remove time");

        long startTimeRemoveTreeMap = System.nanoTime();
        treeMap.remove(50000, nTg1);
        long estimatedTimeRemoveTreeMap = System.nanoTime() - startTimeRemoveTreeMap;
        System.out.println(estimatedTimeRemoveTreeMap + " TreeMap insert time");
    }
}
