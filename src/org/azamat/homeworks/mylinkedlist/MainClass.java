package org.azamat.homeworks.mylinkedlist;

import org.azamat.homeworks.oop.triangle.MyTriangle;

import java.util.LinkedList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
//        ILinkedList<Integer> listMy = new MyLinkedList<>();
//        List<Integer> listJava = new LinkedList<>();
//
//        long startTimeAddJava = System.nanoTime();
//        for (int i = 0; i < 100000; ++i) {
//            listJava.add((int)(-100+Math.random()*(10+100)));
//        }
//        long estimatedTimeAddJava = System.nanoTime() - startTimeAddJava;
////       System.out.println(estimatedTimeAddJava);
//
//        long startTimeAddMy = System.nanoTime();
//        for (int i = 0; i < 100000; ++i) {
//            listMy.add((int)(-100+Math.random()*(10+100)));
//        }
//        long estimatedTimeAddMy = System.nanoTime() - startTimeAddMy;
////        System.out.println(estimatedTimeAddMy);
//
//        long startTimeSearchJava = System.nanoTime();
//        listJava.get(50009);
//        long estimatedTimeSearchJava = System.nanoTime() - startTimeSearchJava;
////        System.out.println(estimatedTimeSearchJava);
//
//        long startTimeSearchMy = System.nanoTime();
//        listMy.get(50009);
//        long estimatedTimeSearchMy = System.nanoTime() - startTimeSearchMy;
////        System.out.println(estimatedTimeSearchMy);
//
//        long startTimeRemoveJava = System.nanoTime();
//        listJava.remove(50009);
//        long estimatedTimeRemoveJava = System.nanoTime() - startTimeRemoveJava;
//        System.out.println(estimatedTimeRemoveJava);
//
//        long startTimeRemoveMy = System.nanoTime();
//        listMy.remove(50009);
//        long estimatedTimeRemoveMy = System.nanoTime() - startTimeRemoveMy;
//        System.out.println(estimatedTimeRemoveMy);
        ILinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
//        list.add(null);
//        System.out.println("----------------");
//        list.add(0,0);
//        list.forEach(System.out::println);
//        System.out.println("size: "+list.size());
//        System.out.println("----------------");
//        list.add(5,9);
//        list.forEach(System.out::println);
//        System.out.println("----------------");
//        System.out.println("size: "+list.size());
//        list.add(7,null);
//        System.out.println("size: "+list.size());
//        list.forEach(System.out::println);
//        System.out.println("------last------");
//        list.remove(6);
//        System.out.println("size: "+list.size());
//        list.forEach(System.out::println);
//        System.out.println("------first-----");
//        list.remove(0);
//        System.out.println("size: "+list.size());
//        list.forEach(System.out::println);
//        System.out.println("-----mid-------");
//        list.remove(3);
//        System.out.println("size: "+list.size());
//        list.forEach(System.out::println);
//
//        System.out.println("-----set-last--");
//        list.set(4,0);
//        System.out.println("size: "+list.size());
//        list.forEach(System.out::println);
//
//        System.out.println("-----set--2----");
//        list.set(2,0);
//        System.out.println("size: "+list.size());
//        list.forEach(System.out::println);
//        System.out.println("---------------");

//        for (Integer t: list) {
//            System.out.println(t);
//        }
//
//        Integer[] a = list.toArray(new Integer[0]);
//
//        for (Integer t: a) {
//            System.out.println(t);
//        }

//        for (Integer t: list) {
//            System.out.println(t);
//        }
//
//        Object[] a = list.toArray();
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }


//        System.out.println(list.indexOf(null));

//        MyTriangle trg1 = new MyTriangle(1,1,1,1,1,1);
//        MyTriangle trg2 = new MyTriangle(2,2,2,2,2,2);
//        MyTriangle trg3 = new MyTriangle(3,3,3,3,3,3);
//        MyTriangle trg4 = new MyTriangle(-4,-4,-4,-4,-4,-4);
//        MyTriangle trg5 = new MyTriangle(-5,-5,-5,-5,-5,-5);
//        ILinkedList<MyTriangle> myLinkedList = new MyLinkedList<>();
//        myLinkedList.clear();
//        myLinkedList.add(trg1);
//        myLinkedList.add(trg2);
//        myLinkedList.add(trg3);
//
//        myLinkedList.forEach(System.out::println);
//        System.out.println("--------------------------------------");
//        System.out.println(myLinkedList.get(0));
//        System.out.println("--------------------------------------");
//        myLinkedList.add(0, trg4);
//        myLinkedList.forEach(System.out::println);
//        for (MyTriangle t: myLinkedList) {
//            System.out.println(t);
//        }
//        System.out.println(myLinkedList.size());
//        System.out.println(myLinkedList.get(0));
//        System.out.println(myLinkedList.size());
//        System.out.println(myLinkedList.get(0));
//        System.out.println(myLinkedList.get(4));
//        myLinkedList.clear();
//        System.out.println(myLinkedList.size());
    }
}
