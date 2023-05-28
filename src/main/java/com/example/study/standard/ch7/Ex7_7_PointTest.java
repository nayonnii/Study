package com.example.study.standard.ch7;

class Point3 {
    int x, y;

    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x: " + x + ", y: " + y;
    }
}

class Point3D3 extends Point3 {
    int z;

    public Point3D3(int x, int y, int z) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    String getLocation() {
        return super.getLocation() + ", z: " + z;
    }
}

public class Ex7_7_PointTest {
    public static void main(String[] args) {

    }
}
