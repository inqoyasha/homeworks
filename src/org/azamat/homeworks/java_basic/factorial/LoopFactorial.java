package org.azamat.homeworks.java_basic.factorial;

public class LoopFactorial {
    public void fact(int var) {
        int fact = 1;
        for (int i=1; i<= var; ++i) {
            fact*=i;
        }
    }
}
