package org.azamat.homeworks.JavaExercises.interfaceMovableCircle;

public class MovableCircle implements IMovable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        MovablePoint mPoint = new MovablePoint(x,y,xSpeed,ySpeed);
        center = mPoint;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle[" +
                "radius=" + radius +
                ", center=(" + center.x +
                ',' + center.y +
                "), speed=(" + center.xSpeed +
                ',' + center.ySpeed +
                ")]";
    }
    @Override
    public void moveUp() {
        center.y+=center.ySpeed;
    }
    @Override
    public void moveDown() {
        center.y-=center.ySpeed;
    }
    @Override
    public void moveLeft() {
        center.x-=center.xSpeed;
    }
    @Override
    public void moveRight() {
        center.x+=center.xSpeed;
    }
}
