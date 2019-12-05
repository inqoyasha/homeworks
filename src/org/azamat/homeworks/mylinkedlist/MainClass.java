package org.azamat.homeworks.mylinkedlist;

import org.azamat.homeworks.oop.triangle.MyTriangle;

public class MainClass {
    public static void main(String[] args) {
        MyTriangle trg1 = new MyTriangle(0,2,3,4,5,6);
        MyTriangle trg2 = new MyTriangle(1,2,3,4,5,6);
        MyTriangle trg3 = new MyTriangle(2,1,4,3,6,5);
        MyTriangle trg4 = new MyTriangle(-2,1,7,3,6,5);
        MyTriangle trg5 = new MyTriangle(5,10,73,32,6,5);
        ILinkedList<MyTriangle> myLinkedList = new MyLinkedList<>();
        myLinkedList.clear();
        myLinkedList.add(trg1);
        myLinkedList.add(trg2);
        myLinkedList.add(trg3);
        myLinkedList.add(trg4);
        myLinkedList.add(trg5);

        myLinkedList.forEach(System.out::println);
//        for (MyTriangle t: myLinkedList) {
//            System.out.println(t);
//        }
//        System.out.println(myLinkedList.size());
//        System.out.println(myLinkedList.get(0));
//        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(4));
//        myLinkedList.clear();
//        System.out.println(myLinkedList.size());
    }
}
