package com.example.study.standard.ch7;

import java.util.Vector;

public class Ex7_23_PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        Tv5 tv = new Tv5();
        Computer5 com = new Computer5();
        Audio5 au = new Audio5();

        b.buy(tv);
        b.buy(com);
        b.buy(au);
        b.buy(tv);
        b.summary();
        System.out.println();
        b.refund(tv);
        b.summary();
    }
}

class Product3 {
    int price;
    int bonusPoint;

    Product3(int price) {
        this.price = price;
        bonusPoint = (int)(price * 0.1);
    }
}

class Tv5 extends Product3 {
    Tv5() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}

class Computer5 extends Product3 {
    Computer5() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}

class Audio5 extends Product3 {
    Audio5() {
        super(50);
    }
    public String toString() {
        return "Audio";
    }
}

class Buyer3 {
    String buyerName = "김자바";
    int money = 1000;
    int bonusPoint = 0;
    Vector<Product3> item = new Vector(); // *참고) Vector에서 제네릭 타입(<Product3>) 미지정 시 Object타입으로 객체가 저장됨

    void buy(Product3 p) {
        if(money < p.price) {
            System.out.println("잔액이 부족합니다.");
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "를 구입하셨습니다.");
    }

    void refund(Product3 p) {
        if(item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "상품 반품이 완료되었습니다.");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() {
        int sumPrice = 0;
        int sumPoint = 0;
        String itemList = "";

        if(item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
        }

        for(int i = 0; i < item.size(); i++) {
            Product3 p = item.get(i);
            sumPrice += p.price;
            sumPoint += p.bonusPoint;
            itemList += (i == 0) ? "" + p : ", " + p;
        }
        System.out.println(buyerName + "님께서 구입하신 제품은 " + itemList + "입니다.");
        System.out.println("제품의 총 금액은 " + sumPrice + "만원이며,");
        System.out.println("적립 포인트는 " + sumPoint + "P 입니다.");
    }
}
