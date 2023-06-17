package com.example.study.standard.ch7;

public class Ex7_21_PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv3());
        b.buy(new Computer3());

        System.out.println(b.memberName + "님의 잔액은 " + b.money + "원 입니다.");
        System.out.println(b.memberName + "님의 잔여 포인트는 " + b.bonusPoint + "P 입니다.");
    }
}

class Product {
    int price;      // 제품의 가격
    int bonusPoint; // 제품 구매 시 제공하는 보너스포인트

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0); // 보너스포인트는 제품 가격의 10%
    }
}

class Tv3 extends Product {
    // 조상클래스의 생성자를 호출하여 price를 100으로 한다.
    Tv3() {
        super(100);
    }
    // Object클래스의 toString()을 오버라이딩 한다.
    public String toString() {return "Tv";}
}

class Computer3 extends Product {
    Computer3() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer {
    String memberName = "김자바";
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(this.memberName + "님이 " + p + "을 구입하셨습니다.");
    }
}
