package org.azamat.homeworks.mylinkedlist;

import org.azamat.homeworks.oop.triangle.MyTriangle;

import java.util.LinkedList;
import java.util.List;

public class MainTestPerformance {
    public static void main(String[] args) {

//----------------Perfomance test with Integer---------------------

//    List<Integer> listJava = new LinkedList<>();
//    ILinkedList<Integer> listMy = new MyLinkedList<>();

//-------------Appends element to the end of list--------------------

//    long startTimeAddJava = System.nanoTime();
//    for (int i = 0; i < 100000; ++i) {
//        listJava.add((int)(-100+Math.random()*(10+100)));
//    }
//    long estimatedTimeAddJava = System.nanoTime() - startTimeAddJava;
//    System.out.println(estimatedTimeAddJava + " JavaList add time");
//
//    long startTimeAddMy = System.nanoTime();
//    for (int i = 0; i < 100000; ++i) {
//        listMy.add((int)(-100+Math.random()*(10+100)));
//    }
//    long estimatedTimeAddMy = System.nanoTime() - startTimeAddMy;
//    System.out.println(estimatedTimeAddMy + " MyList add time");

//-------------------------------------------------------------------
//----------------------Inserts element in the list------------------

//    for (int i = 0; i < 50000; ++i) {
//        listJava.add((int)(-100+Math.random()*(10+100)));
//    }
//    long startTimeAddJava = System.nanoTime();
//        for (int i = 0; i < 50000; ++i) {
//            listJava.add((int)(Math.random()*(i+1)),(int)(-100+Math.random()*(10+100)));
//        }
//    long estimatedTimeAddJava = System.nanoTime() - startTimeAddJava;
//    System.out.println(estimatedTimeAddJava + " JavaList insert time");
//
//    for (int i = 0; i < 50000; ++i) {
//        listMy.add((int)(-100+Math.random()*(10+100)));
//    }
//    long startTimeAddMy = System.nanoTime();
//        for (int i = 0; i < 50000; ++i) {
//            listMy.add((int)(Math.random()*(i+1)),(int)(-100+Math.random()*(10+100)));
//        }
//    long estimatedTimeAddMy = System.nanoTime() - startTimeAddMy;
//    System.out.println(estimatedTimeAddMy + " MyList insert time");

//-------------------------------------------------------------------
//---------------------Search element in the list--------------------

//    for (int i = 0; i < 100000; ++i) {
//        listJava.add((int)(-100+Math.random()*(10+100)));
//    }
//    long startTimeSearchJava = System.nanoTime();
//    listJava.get(50000);
//    long estimatedTimeSearchJava = System.nanoTime() - startTimeSearchJava;
//    System.out.println(estimatedTimeSearchJava + " JavaList search time");
//
//    for (int i = 0; i < 100000; ++i) {
//        listMy.add((int)(-100+Math.random()*(10+100)));
//    }
//    long startTimeSearchMy = System.nanoTime();
//    listMy.get(50000);
//    long estimatedTimeSearchMy = System.nanoTime() - startTimeSearchMy;
//    System.out.println(estimatedTimeSearchMy + " MyList search time");

//-------------------------------------------------------------------
//---------------------Remove element from list----------------------

//    for (int i = 0; i < 100000; ++i) {
//        listJava.add((int)(-100+Math.random()*(10+100)));
//    }
//    long startTimeRemoveJava = System.nanoTime();
//    listJava.remove(50000);
//    long estimatedTimeRemoveJava = System.nanoTime() - startTimeRemoveJava;
//    System.out.println(estimatedTimeRemoveJava + " JavaList remove time");
//
//    for (int i = 0; i < 100000; ++i) {
//        listMy.add((int)(-100+Math.random()*(10+100)));
//    }
//    long startTimeRemoveMy = System.nanoTime();
//    listMy.remove(50000);
//    long estimatedTimeRemoveMy = System.nanoTime() - startTimeRemoveMy;
//    System.out.println(estimatedTimeRemoveMy + " MyList remove time");

//----------------perfomance test with MyTriangle--------------------

    ILinkedList<MyTriangle> listMy = new MyLinkedList<>();
    List<MyTriangle> listJava = new LinkedList<>();

//-------------Appends element to the end of list--------------------

//    long startTimeAddJava = System.nanoTime();
//    for (int i = 0; i < 100000; ++i) {
//        int newNum = (int)(-10+Math.random()*(10+10));
//        MyTriangle nTg = new MyTriangle(newNum,newNum,newNum,newNum,newNum,newNum);
//        listJava.add(nTg);
//    }
//    long estimatedTimeAddJava = System.nanoTime() - startTimeAddJava;
//    System.out.println(estimatedTimeAddJava + " JavaList add time");
//
//    long startTimeAddMy = System.nanoTime();
//    for (int i = 0; i < 100000; ++i) {
//        int newNum = (int)(-10+Math.random()*(10+10));
//        MyTriangle nTg = new MyTriangle(newNum,newNum,newNum,newNum,newNum,newNum);
//        listMy.add(nTg);
//    }
//    long estimatedTimeAddMy = System.nanoTime() - startTimeAddMy;
//    System.out.println(estimatedTimeAddMy + " MyList add time");

//-------------------------------------------------------------------
//----------------------Inserts element in the list------------------

//    for (int i = 0; i < 50000; ++i) {
//        int newNum = (int)(-10+Math.random()*(10+10));
//        MyTriangle nTg = new MyTriangle(newNum,newNum,newNum,newNum,newNum,newNum);
//        listJava.add(nTg);
//    }
//    long startTimeAddJava = System.nanoTime();
//        for (int i = 0; i < 50000; ++i) {
//            int newNum = (int)(-10+Math.random()*(10+10));
//            MyTriangle nTg = new MyTriangle(newNum,newNum,newNum,newNum,newNum,newNum);
//            listJava.add((int)(Math.random()*(i+1)),nTg);
//        }
//    long estimatedTimeAddJava = System.nanoTime() - startTimeAddJava;
//    System.out.println(estimatedTimeAddJava + " JavaList insert time");
//
//    for (int i = 0; i < 50000; ++i) {
//        int newNum = (int)(-10+Math.random()*(10+10));
//        MyTriangle nTg = new MyTriangle(newNum,newNum,newNum,newNum,newNum,newNum);
//        listMy.add(nTg);
//    }
//    long startTimeAddMy = System.nanoTime();
//        for (int i = 0; i < 50000; ++i) {
//            int newNum = (int)(-10+Math.random()*(10+10));
//            MyTriangle nTg = new MyTriangle(newNum,newNum,newNum,newNum,newNum,newNum);
//            listMy.add((int)(Math.random()*(i+1)),nTg);
//        }
//    long estimatedTimeAddMy = System.nanoTime() - startTimeAddMy;
//    System.out.println(estimatedTimeAddMy + " MyList insert time");

//-------------------------------------------------------------------
//---------------------Search element in the list--------------------

//    for (int i = 0; i < 100000; ++i) {
//        int newNum = (int)(-10+Math.random()*(10+10));
//        MyTriangle nTg = new MyTriangle(newNum,newNum,newNum,newNum,newNum,newNum);
//        listJava.add(nTg);
//    }
//    long startTimeSearchJava = System.nanoTime();
//    listJava.get(50000);
//    long estimatedTimeSearchJava = System.nanoTime() - startTimeSearchJava;
//    System.out.println(estimatedTimeSearchJava + " JavaList search time");
//
//    for (int i = 0; i < 100000; ++i) {
//        int newNum = (int)(-10+Math.random()*(10+10));
//        MyTriangle nTg = new MyTriangle(newNum,newNum,newNum,newNum,newNum,newNum);
//        listMy.add(nTg);
//    }
//    long startTimeSearchMy = System.nanoTime();
//    listMy.get(50000);
//    long estimatedTimeSearchMy = System.nanoTime() - startTimeSearchMy;
//    System.out.println(estimatedTimeSearchMy + " MyList search time");

//-------------------------------------------------------------------
//---------------------Remove element from list----------------------

    for (int i = 0; i < 100000; ++i) {
        int newNum = (int)(-10+Math.random()*(10+10));
        MyTriangle nTg = new MyTriangle(newNum,newNum,newNum,newNum,newNum,newNum);
        listJava.add(nTg);
    }
    long startTimeRemoveJava = System.nanoTime();
    listJava.remove(50000);
    long estimatedTimeRemoveJava = System.nanoTime() - startTimeRemoveJava;
    System.out.println(estimatedTimeRemoveJava + " JavaList remove time");

    for (int i = 0; i < 100000; ++i) {
        int newNum = (int)(-10+Math.random()*(10+10));
        MyTriangle nTg = new MyTriangle(newNum,newNum,newNum,newNum,newNum,newNum);
        listMy.add(nTg);
    }
    long startTimeRemoveMy = System.nanoTime();
    listMy.remove(50000);
    long estimatedTimeRemoveMy = System.nanoTime() - startTimeRemoveMy;
    System.out.println(estimatedTimeRemoveMy + " MyList remove time");

    }
}
