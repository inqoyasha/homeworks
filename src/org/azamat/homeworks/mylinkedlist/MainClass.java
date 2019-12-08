package org.azamat.homeworks.mylinkedlist;

public class MainClass {
    public static void main(String[] args) {
        ILinkedList<Integer> myList = new MyLinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(null);
//-------------------------------------------------------------
//        System.out.println("----------------");
//        myList.add(0,0);
//        myList.forEach(System.out::println);
//        System.out.println("size: "+myList.size());
//        System.out.println("----------------");
//        myList.add(5,9);
//        myList.forEach(System.out::println);
//        System.out.println("----------------");
//        System.out.println("size: "+myList.size());
//        myList.add(7,null);
//        System.out.println("size: "+myList.size());
//        myList.forEach(System.out::println);
//        System.out.println("------last------");
//        myList.remove(6);
//        System.out.println("size: "+myList.size());
//        myList.forEach(System.out::println);
//        System.out.println("------first-----");
//        myList.remove(0);
//        System.out.println("size: "+myList.size());
//        myList.forEach(System.out::println);
//        System.out.println("-----mid-------");
//        myList.remove(3);
//        System.out.println("size: "+myList.size());
//        myList.forEach(System.out::println);
//
//        System.out.println("-----set-last--");
//        myList.set(4,0);
//        System.out.println("size: "+myList.size());
//        myList.forEach(System.out::println);
//
//        System.out.println("-----set--2----");
//        myList.set(2,0);
//        System.out.println("size: "+myList.size());
//        myList.forEach(System.out::println);
//
//
//        System.out.println("-----get--3----");
//        System.out.println(myList.get(3));
//
//
//        System.out.println("-----indexOf--0----");
//        System.out.println(myList.indexOf(0));
//        System.out.println("---------------");
//-------------------------------------------------------------
        System.out.println("----myList-----");
        for (Integer t: myList) {
            System.out.println(t);
        }
        System.out.println("----T[] a-----");
        Integer[] a = myList.toArray(new Integer[0]);
        System.out.println("---------a-----");
        for (Integer t: a) {
            System.out.println(t);
        }
        System.out.println("---------------");
        System.out.println("-Object b[i]------");
        Object[] b = myList.toArray();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("---------------");
        System.out.println(myList.indexOf(null));
        System.out.println("---------------");
//-------------------------------------------------------------
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
