package com.example.study.standard.ch7;

public class Ex7_30_DefaultMethodTest {
    public static void main(String[] args) {
        Child01 c = new Child01();
        c.method01();
        c.method02();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Child01 extends Parent01 implements MyInterface, MyInterface2 {
    public void method01() {
        System.out.println("method01() in Child01");  // 오버라이딩
    }
}

class Parent01 {
    public void method02() {
        System.out.println("method02 in Parent");
    }
}

interface MyInterface {
    default void method01() {
        System.out.println("method01() in MyInterface");
    }
    default void method02() {
        System.out.println("method02() in MyInterface");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method01() {
        System.out.println("method() in MyInterface2");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}
