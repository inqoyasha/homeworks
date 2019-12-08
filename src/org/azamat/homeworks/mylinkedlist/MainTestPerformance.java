package org.azamat.homeworks.mylinkedlist;

import org.azamat.homeworks.oop.triangle.MyTriangle;

import java.util.LinkedList;
import java.util.List;

public class MainTestPerformance {
    public static void main(String[] args) {

//----------------Perfomance test with Integer---------------------

//    List<Integer> listJava = new LinkedList<>();
//    for (int i = 0; i < 100000; ++i) {
//        listJava.add((int)(-100+Math.random()*(10+100)));
//    }
//    ILinkedList<Integer> listMy = new MyLinkedList<>();
//    for (int i = 0; i < 100000; ++i) {
//        listMy.add((int)(-100+Math.random()*(10+100)));
//    }

//-------------Appends element to the end of list--------------------

//    long startTimeAddJava = System.nanoTime();
//    listJava.add((int)(-100+Math.random()*(10+100)));
//    long estimatedTimeAddJava = System.nanoTime() - startTimeAddJava;
//    System.out.println(estimatedTimeAddJava + " JavaList add time");
//
//    long startTimeAddMy = System.nanoTime();
//    listMy.add((int)(-100+Math.random()*(10+100)));
//    long estimatedTimeAddMy = System.nanoTime() - startTimeAddMy;
//    System.out.println(estimatedTimeAddMy + " MyList add time");

//-------------------------------------------------------------------
//----------------------Inserts element in the list------------------

//    int ind = (int)(Math.random()*(100000+1));
//    int num = (int)(-100+Math.random()*(10+100));
//    long startTimeAddJava = System.nanoTime();
//    listJava.add(ind,num);
//    long estimatedTimeAddJava = System.nanoTime() - startTimeAddJava;
//    System.out.println(estimatedTimeAddJava + " JavaList insert time");
//
//    long startTimeAddMy = System.nanoTime();
//    listMy.add(ind,num);
//    long estimatedTimeAddMy = System.nanoTime() - startTimeAddMy;
//    System.out.println(estimatedTimeAddMy + " MyList insert time");

//-------------------------------------------------------------------
//---------------------Search element in the list--------------------

//    long startTimeSearchJava = System.nanoTime();
//    listJava.get(50000);
//    long estimatedTimeSearchJava = System.nanoTime() - startTimeSearchJava;
//    System.out.println(estimatedTimeSearchJava + " JavaList search time");
//
//    long startTimeSearchMy = System.nanoTime();
//    listMy.get(50000);
//    long estimatedTimeSearchMy = System.nanoTime() - startTimeSearchMy;
//    System.out.println(estimatedTimeSearchMy + " MyList search time");

//-------------------------------------------------------------------
//---------------------Remove element from list----------------------

//    long startTimeRemoveJava = System.nanoTime();
//    listJava.remove(50000);
//    long estimatedTimeRemoveJava = System.nanoTime() - startTimeRemoveJava;
//    System.out.println(estimatedTimeRemoveJava + " JavaList remove time");
//
//    long startTimeRemoveMy = System.nanoTime();
//    listMy.remove(50000);
//    long estimatedTimeRemoveMy = System.nanoTime() - startTimeRemoveMy;
//    System.out.println(estimatedTimeRemoveMy + " MyList remove time");

//----------------perfomance test with MyTriangle--------------------

    List<MyTriangle> listJava = new LinkedList<>();
    for (int i = 0; i < 100000; ++i) {
        int newNum = (int)(-10+Math.random()*(10+10));
        MyTriangle nTg = new MyTriangle(newNum,newNum,newNum,newNum,newNum,newNum);
        listJava.add(nTg);
    }
    ILinkedList<MyTriangle> listMy = new MyLinkedList<>();
    for (int i = 0; i < 100000; ++i) {
        int newNum = (int)(-10+Math.random()*(10+10));
        MyTriangle nTg = new MyTriangle(newNum,newNum,newNum,newNum,newNum,newNum);
        listMy.add(nTg);
    }

    int index = (int)(Math.random()*(1000+1));
    int newNum1 = (int)(-10+Math.random()*(10+10));
    MyTriangle nTg1 = new MyTriangle(newNum1,newNum1,newNum1,newNum1,newNum1,newNum1);

//-------------Appends element to the end of list--------------------

//    long startTimeAddJava = System.nanoTime();
//    listJava.add(nTg1);
//    long estimatedTimeAddJava = System.nanoTime() - startTimeAddJava;
//    System.out.println(estimatedTimeAddJava + " JavaList add time");
//
//    long startTimeAddMy = System.nanoTime();
//    listMy.add(nTg1);
//    long estimatedTimeAddMy = System.nanoTime() - startTimeAddMy;
//    System.out.println(estimatedTimeAddMy + " MyList add time");

//-------------------------------------------------------------------
//----------------------Inserts element in the list------------------

    long startTimeAddJava = System.nanoTime();
    listJava.add(index,nTg1);
    long estimatedTimeAddJava = System.nanoTime() - startTimeAddJava;
    System.out.println(estimatedTimeAddJava + " JavaList insert time");


    long startTimeAddMy = System.nanoTime();
    listMy.add(index,nTg1);
    long estimatedTimeAddMy = System.nanoTime() - startTimeAddMy;
    System.out.println(estimatedTimeAddMy + " MyList insert time");

//-------------------------------------------------------------------
//---------------------Search element in the list--------------------

//    long startTimeSearchJava = System.nanoTime();
//    listJava.get(50000);
//    long estimatedTimeSearchJava = System.nanoTime() - startTimeSearchJava;
//    System.out.println(estimatedTimeSearchJava + " JavaList search time");
//
//    long startTimeSearchMy = System.nanoTime();
//    listMy.get(50000);
//    long estimatedTimeSearchMy = System.nanoTime() - startTimeSearchMy;
//    System.out.println(estimatedTimeSearchMy + " MyList search time");

//-------------------------------------------------------------------
//---------------------Remove element from list----------------------

//    long startTimeRemoveJava = System.nanoTime();
//    listJava.remove(50000);
//    long estimatedTimeRemoveJava = System.nanoTime() - startTimeRemoveJava;
//    System.out.println(estimatedTimeRemoveJava + " JavaList remove time");
//
//    long startTimeRemoveMy = System.nanoTime();
//    listMy.remove(50000);
//    long estimatedTimeRemoveMy = System.nanoTime() - startTimeRemoveMy;
//    System.out.println(estimatedTimeRemoveMy + " MyList remove time");

    }
}
