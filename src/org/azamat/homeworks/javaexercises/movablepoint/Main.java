package org.azamat.homeworks.javaexercises.movablepoint;

public class Main {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(2,3,1,1);

        mp.move();

        System.out.println(mp.toString());
    }
}
