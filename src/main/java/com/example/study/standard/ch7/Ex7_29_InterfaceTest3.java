package com.example.study.standard.ch7;

public class Ex7_29_InterfaceTest3 {
    public static void main(String[] args) {
        A3 a = new A3();
        a.methodA();
    }
}

class A3 {
    void methodA() {
        I3 i = InstanceManager.getInstance();   // i에 B3 인스턴스가 저장됨
        i.methodB();
        System.out.println(i.toString());
    }
}

interface I3 {
    public abstract void methodB();
}

class B3 implements I3 {
    public void methodB() {
        System.out.println("methodB in B class");
    }
    public String toString() {
        return "class B";
    }
}

class InstanceManager {
    public static I3 getInstance() {
        return new B3();
    }
}
