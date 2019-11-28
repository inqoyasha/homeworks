package org.azamat.homeworks.test;

class Triangle{
    public int base;
    public int height;
    public double area = 0;
    boolean a = true;
    boolean b = false;

    public Triangle(int base, int height){
        this.base = base; this.height = height;
        updateArea();
    }

    public void updateArea(){
        double a = base*height/2;
        area = a;
    }

    public void setBase(int b){ base = b; updateArea(); }

    public void setHeight(int h){ height = h; updateArea(); }

    public int getHeight() {
        return height;
    }

    public void m() {
        Triangle n = new Triangle(1,2);
        if (a = b) {
            System.out.println("suka");
        }
        if (false) ; else ;
    }


}
