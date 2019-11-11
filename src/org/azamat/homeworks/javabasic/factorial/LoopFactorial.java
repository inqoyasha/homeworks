package org.azamat.homeworks.javabasic.factorial;

public class LoopFactorial {
    public void fact(int var) {
        int fact = 1;
        for (int i=1; i<= var; ++i) {
            fact*=i;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        return super.equals(o);
    }
}
