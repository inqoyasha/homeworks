package org.azamat.homeworks.javaexercises.shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2,"yellow",false );
        Rectangle rectangle = new Rectangle(2,3, "blue",true);
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        Square square = new Square(2,"black",true);
        System.out.println(square.toString());
    }
}
