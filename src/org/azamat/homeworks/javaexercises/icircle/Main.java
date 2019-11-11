package org.azamat.homeworks.javaexercises.icircle;

public class Main {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(12,3,1,1,3);
        System.out.println(movableCircle.toString());
        movableCircle.moveDown();
        movableCircle.moveDown();
        movableCircle.moveDown();
        movableCircle.moveDown();
        System.out.println("call moveDown() 4times -----------");
        System.out.println(movableCircle.toString());
        movableCircle.moveLeft();
        movableCircle.moveLeft();
        movableCircle.moveLeft();
        movableCircle.moveLeft();
        movableCircle.moveLeft();
        movableCircle.moveLeft();
        movableCircle.moveLeft();
        movableCircle.moveLeft();
        System.out.println("call moveLeft() 8times -----------");
        System.out.println(movableCircle.toString());
        System.out.println("----------------------------------");
        MovablePoint movablePoint = new MovablePoint(6,7,1,1);
        System.out.println(movablePoint.toString());
        movablePoint.moveUp();
        movablePoint.moveUp();
        movablePoint.moveUp();
        System.out.println("call moveUp() 3times -----------");
        System.out.println(movablePoint.toString());
        movablePoint.moveRight();
        movablePoint.moveRight();
        movablePoint.moveRight();
        movablePoint.moveRight();
        movablePoint.moveRight();
        movablePoint.moveRight();
        movablePoint.moveRight();
        movablePoint.moveRight();
        System.out.println("call moveRight() 8times -----------");
        System.out.println(movablePoint.toString());
    }
}
