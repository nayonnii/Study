package com.example.study.standard.ch7;

class Point2 {
    int x;
    int y;

    String getLocation() {
        return "x: " + x + ", y: " + y;
    }
}

class Point3D extends Point2 {
    int z;

    @Override
    String getLocation() {
        return super.getLocation() + ", z: " + z;
    }
}

public class Ex7_6_SuperTest2_Method {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.x = 1;
        point3D.y = 2;
        point3D.z = 3;
        System.out.println(point3D.getLocation());
    }

}
