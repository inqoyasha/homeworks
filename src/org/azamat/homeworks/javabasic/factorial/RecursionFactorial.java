package org.azamat.homeworks.javabasic.factorial;

import java.util.Objects;

public class RecursionFactorial {
    long s=0;
    public int fact(int n) {
        if (n==0 || n==1) return 1;
        return fact(n-1) * n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        RecursionFactorial that = (RecursionFactorial) o;
        return s == that.s;
    }
    @Override
    public int hashCode() {
        return Objects.hash(s);
    }
}
