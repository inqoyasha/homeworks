package org.azamat.homeworks.javaexercises.points;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D g = new Point2D(2.3f,4.2f);
        System.out.println(Arrays.toString(g.getXY()));
        g.setXY(7.7f,4.9f);
        System.out.println(Arrays.toString(g.getXY()));
        System.out.println(g.toString());

        Point3D g3 = new Point3D(3.3f,7.2f,1.8f);
        System.out.println(Arrays.toString(g3.getXYZ()));
        g3.setXYZ(3.7f,2.9f,6.7f);
        System.out.println(Arrays.toString(g3.getXYZ()));
        System.out.println(g3.toString());
    }
}
