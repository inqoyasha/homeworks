package org.azamat.homeworks.JavaExercises.interfaceMovableRectangle;

public class Main {
    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(1,6,6,1,1,1);
        System.out.println(movableRectangle.toString());
        movableRectangle.moveDown();
        movableRectangle.moveDown();
        movableRectangle.moveDown();
        movableRectangle.moveDown();
        movableRectangle.moveRight();
        movableRectangle.moveRight();
        movableRectangle.moveRight();
        movableRectangle.moveRight();
        System.out.println("call moveDown() and moveRight() 4 times");
        System.out.println(movableRectangle.toString());
    }
}
