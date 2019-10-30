package org.azamat.homeworks.hw1.factorial;

public class LoopFactorial {
    void fact(int var) {
        int fact = 1;
        for (int i=1; i<= var; ++i) {
            fact*=i;
        }
    }
}
