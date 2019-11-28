package org.azamat.homeworks.test;

import java.util.Objects;

public class SomeClass {
    int s;
    public SomeClass(int s) {
        this.s = ++s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeClass someClass = (SomeClass) o;
        return s == someClass.s;
    }

    @Override
    public int hashCode() {
        return Objects.hash(s);
    }
}
