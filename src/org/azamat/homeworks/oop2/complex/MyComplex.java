package org.azamat.homeworks.oop2.complex;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImag() {
        return imag;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    @Override
    public String toString() {
        if (imag < 0) return "("+real+imag+"i)";
            else return "("+real+"+"+imag+"i)";
    }
    public boolean isReal() {
        return (real != 0.0 && imag == 0.0) ? true : false;
    }
    public boolean isImaginary() {
        return (imag != 0.0) ? true : false;
    }
    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag) ? true : false;
    }
    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag) ? true : false;
    }
    public double magnitude() {
        return Math.sqrt(real*real+imag*imag);
    }
    public double argument() {
        if (real>0) return Math.atan(imag/real);
        if (real<0 && imag>0) return Math.PI+Math.atan(imag/real);
        if (real<0 && imag<0) return -Math.PI+Math.atan(imag/real);

        return 0.0;
    }
    public MyComplex add(MyComplex right) {
        real +=right.real;
        imag +=right.imag;

        return this;
    }
    public MyComplex subtract(MyComplex right) {
        real -= right.real;
        imag -= right.imag;

        return this;
    }
    public MyComplex multiply(MyComplex right) {
        MyComplex oldMyComplex = new MyComplex(this.real, this.imag);
        real = (real*right.real-imag*right.imag);
        imag = (oldMyComplex.real*right.imag+oldMyComplex.imag*right.real);

        return this;
    }
    public MyComplex divide(MyComplex right) {
        MyComplex oldMyComplex = new MyComplex(this.real, this.imag);
        double denumerator = (right.real*right.real+right.imag*right.imag);
        real = ((real*right.real+imag*right.imag)/(right.real*right.real+right.imag*right.imag));
        imag = ((right.real*oldMyComplex.imag-oldMyComplex.real*right.imag)/(right.real*right.real+right.imag*right.imag));

        return this;
    }
    public MyComplex addNew(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex = right.add(this);

        return newComplex;
    }
    public MyComplex subtractNew(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex = right.subtract(this);

        return newComplex;
    }
    public MyComplex conjugate() {
        MyComplex newComplex = new MyComplex();
        newComplex.real = this.real;
        newComplex.imag = -this.imag;
        return newComplex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.real, real) == 0 &&
                Double.compare(myComplex.imag, imag) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }
}
