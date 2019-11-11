package org.azamat.homeworks.oop.rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7.3f, 4.7f);
        System.out.println(rectangle.toString());

        System.out.println("area: "+rectangle.getArea());
        System.out.println("perimeter: "+rectangle.getPerimeter());
    }
}
