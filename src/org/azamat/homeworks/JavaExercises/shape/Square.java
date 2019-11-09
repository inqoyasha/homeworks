package org.azamat.homeworks.JavaExercises.shape;

public class Square extends Rectangle {
    private double side;
    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    @Override
    public void setLength(double length) {
        setSide(length);
    }
    @Override
    public String toString() {
         return "Square[" +
                "color='" + getColor() + "', " +
                "isFilled? "+isFilled() +
                ", side=" + side +
                ']';
    }
}
