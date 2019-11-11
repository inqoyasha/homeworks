package org.azamat.homeworks.javaexercises.points;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        float[] getXYZ = new float[3];
        getXYZ[0] = this.getX();
        getXYZ[1] = this.getY();
        getXYZ[2] = this.z;

        return getXYZ;
    }
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }
    @Override
    public String toString() {
        return "(" + this.getX() +
                ',' + this.getY() +
                ',' + z +
                ")";
    }
}
