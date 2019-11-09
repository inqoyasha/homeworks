package org.azamat.homeworks.JavaExercises.interfaceMovableRectangle;

public class MovableRectangle implements IMovable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        MovablePoint topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        MovablePoint bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MovableRectangle[" +
                "topLeft=(" + topLeft.x +
                ',' + topLeft.y +
                "), bottomRight=(" + bottomRight.x +
                ',' + bottomRight.y +
                "), speed=(" + bottomRight.xSpeed +
                ',' + topLeft.ySpeed +
                ")]";
    }
    @Override
    public void moveUp() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }
    @Override
    public void moveDown() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }
    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.ySpeed;
        bottomRight.x -= bottomRight.ySpeed;
    }
    @Override
    public void moveRight() {
        topLeft.x += topLeft.ySpeed;
        bottomRight.x += bottomRight.ySpeed;
    }
}
