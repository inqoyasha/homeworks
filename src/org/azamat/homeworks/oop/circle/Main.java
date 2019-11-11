package org.azamat.homeworks.oop.circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.4, "yellow");

        System.out.println(circle.toString());
        System.out.println(circle.getArea());
    }
}
