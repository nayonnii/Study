package com.example.study.standard.ch7;
class Point4 {
    int x = 10;
    int y = 20;

    Point4() {};

    Point4(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D4 extends Point4 {
    int z = 30;

    Point3D4() {
        this(100, 200, 300);
    }
    Point3D4(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

public class Ex7_8_PointTest2 {
    public static void main(String[] args) {
        Point4 point4 = new Point4();
        System.out.println(point4.x);
        System.out.println(point4.y);

        Point3D4 point3D4 = new Point3D4();
        System.out.println(point3D4.x);
        System.out.println(point3D4.y);
        System.out.println(point3D4.z);
    }
}
