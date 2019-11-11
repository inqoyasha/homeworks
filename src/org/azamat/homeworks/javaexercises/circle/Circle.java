package org.azamat.homeworks.javaexercises.circle;

public class Circle implements  IGeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public String toString() {
        return "ResizableCircle[" +
                "radius=" + radius +
                ']';
    }
}
