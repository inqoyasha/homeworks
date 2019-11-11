package org.azamat.homeworks.javabasic.factorial;

public class Main {
    public static void main(String[] args) {
        RecursionFactorial rf = new RecursionFactorial();
        LoopFactorial lf = new LoopFactorial();

        long startTime = System.nanoTime();
        rf.fact(9);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("rec " + estimatedTime+"ns");

        long startTime1 = System.nanoTime();
        lf.fact(9);
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("loop " + estimatedTime1+"ns");
    }
}
