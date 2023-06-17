package com.example.study.standard.ch7;

public class Ex7_15_CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe1 = new FireEngine();
        FireEngine fe2 = null;

        fe1.water();
        car = fe1;
//        car.water();    // Car 타입의 참조변수로 water() 호출 불가
        fe2 = (FireEngine) car;
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~~");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}
