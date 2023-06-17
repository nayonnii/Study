package com.example.study.standard.ch7;

public class Ex7_17_InstanceofTest {
    public static void main(String[] args) {
        FireEngine2 fe = new FireEngine2();
        Car2 car = new Car2();

        if(fe instanceof FireEngine2) {
            System.out.println("This is a FireEngine instance.");
        }

        if(fe instanceof Car2) {
            System.out.println("This is a Car instance.");
        }

        if(fe instanceof Object) {
            System.out.println("This is an Object instance.");
        }

        if(car instanceof FireEngine2) {    // 출력되지 않음
            System.out.println("This is a FireEngine instance.");
        }

        System.out.println(fe.getClass().getName());    // 클래스의 이름 출력
        System.out.println(car.getClass().getName());    // 클래스의 이름 출력
    }
}

class Car2 {}
class FireEngine2 extends Car2 {}

