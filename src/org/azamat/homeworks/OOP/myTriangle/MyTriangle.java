package org.azamat.homeworks.OOP.myTriangle;

import org.azamat.homeworks.OOP.myPoint.MyPoint;

import java.util.Objects;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=(" + v1.getX() + ',' + v1.getY() +
                "), v2=(" + v2.getX() + ',' + v2.getY() +
                "), v3=(" + v3.getX() + ',' + v3.getY() +
                ")]";
    }
    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }
    public String getType() {
        String type = "not found";
        int num = 0;
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v1.distance(v3);
        if (a == b && b == c && b == c) num = 1;
        if (a == b || b == c || a == c) num = 2;
        if (a != b && b != c && c != a) num = 3;
        switch(num) {
            case 1:
                type = "equilateral"; // can't three points with integer coordinates be vertices of an equilateral triangle
                break;
            case 2:
                type = "isosceles";
                break;
            case 3:
                type = "scalene";
                break;
        }

        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        MyTriangle that = (MyTriangle) o;
        return Objects.equals(v1, that.v1) &&
                Objects.equals(v2, that.v2) &&
                Objects.equals(v3, that.v3);
    }
    @Override
    public int hashCode() {
        return Objects.hash(v1, v2, v3);
    }
}

