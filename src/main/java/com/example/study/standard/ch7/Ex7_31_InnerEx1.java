package com.example.study.standard.ch7;

public class Ex7_31_InnerEx1 {
    class InstanceInner {
        int iv = 100;
        static int cv = 100;  // java 16부터 내부클래스가 static이 아니여도 static 변수 사용 가능
        final static int CONST = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
            static int cv = 300;       // static 변수지만 지역 클래스이므로 클래스 밖에서 사용 불가
            final static int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);

        Ex7_31_InnerEx1 ex731InnerEx1 = new Ex7_31_InnerEx1();
        ex731InnerEx1.myMethod();
    }
}
