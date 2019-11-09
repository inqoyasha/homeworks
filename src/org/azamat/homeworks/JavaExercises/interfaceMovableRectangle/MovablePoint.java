package org.azamat.homeworks.JavaExercises.interfaceMovableRectangle;

import org.azamat.homeworks.JavaExercises.interfaceMovableCircle.IMovable;

public class MovablePoint implements IMovable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint[" +
                '(' + x +
                ',' + y +
                "), Speed=(" + xSpeed +
                ',' + ySpeed +
                ")]";
    }
    @Override
    public void moveUp() {
        y+=ySpeed;
    }
    @Override
    public void moveDown() {
        y-=ySpeed;
    }
    @Override
    public void moveLeft() {
        x-=xSpeed;
    }
    @Override
    public void moveRight() {
        x+=xSpeed;
    }
}
