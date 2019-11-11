package org.azamat.homeworks.oop.point;

public class Main {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3,3);
        MyPoint point2 = new MyPoint(1,1);
        System.out.println(point1.toString());
        System.out.println(point2.distance(6,6));
        System.out.println(point1.distance());
        System.out.println(point1.distance(point2));
    }
}
