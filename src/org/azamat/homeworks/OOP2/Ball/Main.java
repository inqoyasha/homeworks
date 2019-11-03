package org.azamat.homeworks.OOP2.Ball;

public class Main {
    public static void main(String[] args) {
        Ball someBall = new Ball(2,-2,1, 1, 180);
        Container field = new Container(0,0,15,-10);

        System.out.println("inside or not? "+field.collides(someBall));
        someBall.move();
        System.out.println("after call move(): "+field.collides(someBall));
        someBall.move();
        someBall.move();
        someBall.move();
        System.out.println("after call move() 3times: "+field.collides(someBall));
        someBall.reflectHorisontal();
        someBall.move();
        someBall.move();
        someBall.move();
        System.out.println("after use reflectHorisontal() method and 3times call move(): "+field.collides(someBall));

//        Ball newSomeBall = new Ball(7,-4,1, 1, 90);
//
//        System.out.println("inside or not? "+field.collides(newSomeBall));
//        newSomeBall.move();
//        System.out.println("after call move(): "+field.collides(newSomeBall));
//        newSomeBall.move();
//        newSomeBall.move();
//        newSomeBall.move();
//        newSomeBall.move();
//        newSomeBall.move();
//        newSomeBall.move();
//        System.out.println("after call move() 6times: "+field.collides(newSomeBall));
//        newSomeBall.reflectVertical();
//        newSomeBall.move();
//        newSomeBall.move();
//        newSomeBall.move();
//        newSomeBall.move();
//        newSomeBall.move();
//        newSomeBall.move();
//        newSomeBall.move();
//        newSomeBall.move();
//        System.out.println("after use reflectHorisontal() method and 8times call move(): "+field.collides(newSomeBall));

    }
}
