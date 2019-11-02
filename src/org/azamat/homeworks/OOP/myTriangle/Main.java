package org.azamat.homeworks.OOP.myTriangle;

public class Main {
    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle(1,1,3,4,3,1);
        MyTriangle triangle2 = new MyTriangle(1,1,1,4,4,4);
        System.out.println(triangle.toString());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getType());
        System.out.println("----");
        System.out.println(triangle2.toString());
        System.out.println(triangle2.getPerimeter());
        System.out.println(triangle2.getType());
    }
}
