package org.azamat.homeworks.javaexercises.points;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        float[] getXY = new float[2];
        getXY[0] = this.x;
        getXY[1] = this.y;

        return getXY;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" + x +
                ',' + y +
                ")";
    }
}
