package com.example.study.standard.ch7;

public class Ex7_27_InterfaceTest {
    public static void main(String[] args) {
        A2 a = new A2();
        a.methodA(new B2());
    }
}

class A2 {
    public void methodA(B2 b) {
        b.methodB();
    }
}

class B2 {
    public void methodB() {
        System.out.println("methodB()");
    }
}
