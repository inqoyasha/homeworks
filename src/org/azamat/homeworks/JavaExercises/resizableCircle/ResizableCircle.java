package org.azamat.homeworks.JavaExercises.resizableCircle;

public class ResizableCircle extends Circle implements  IResizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius = radius * percent/100;
    }
}
