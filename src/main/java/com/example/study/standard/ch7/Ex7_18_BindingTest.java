package com.example.study.standard.ch7;

public class Ex7_18_BindingTest {
    public static void main(String[] args) {
        Parent3 p = new Parent3();
        Child3 c = new Child3();
        Parent3 p2 = new Child3();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();

        System.out.println("p2.x = " + p2.x);
        p2.method();
    }
}

class Parent3 {
    int x = 100;
    void method() {
        System.out.println("Parent Method");
    }
}

class Child3 extends Parent3 {
    int x = 200;
    void method() {
        System.out.println("Child Method");
    }
}
