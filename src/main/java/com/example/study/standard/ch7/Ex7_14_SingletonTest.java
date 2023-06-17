package com.example.study.standard.ch7;

public class Ex7_14_SingletonTest {
    public static void main(String[] args) {
//        Singleton s1 = new Singleton();   // Singleton 클래스의 생성자의 접근제어자가 private이기 때문에 인스턴스 생성 불가
        Singleton s = Singleton.getInstance();
    }
}

final class Singleton { // final을 붙였다 = 상속할 수 없다
    private static Singleton s = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (s == null) {    // s가 null이면 인스턴스가 생성되므로 최초 한 번만 생성됨(이후 인스턴스 재사용)
            s = new Singleton();
        }
        return s;
    }
}
