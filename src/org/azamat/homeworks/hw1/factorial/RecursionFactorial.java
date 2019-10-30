package org.azamat.homeworks.hw1.factorial;

public class RecursionFactorial {
    long s=0;
    int fact(int n) {
        if (n==0 || n==1) return 1;
        return fact(n-1) * n;
    }
}
