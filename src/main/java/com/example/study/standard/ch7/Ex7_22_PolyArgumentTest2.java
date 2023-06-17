package com.example.study.standard.ch7;

public class Ex7_22_PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv4());
        b.buy(new Computer4());
        b.buy(new Audio4());
        b.summary();
    }
}

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int)(price * 0.1);
    }
}
class Tv4 extends Product2 {
    Tv4() {super(100);}
    public String toString() {
        return "Tv";
    }
}

class Computer4 extends Product2 {
    Computer4() {super(200);}
    public String toString() {
        return "Computer";
    }
}

class Audio4 extends Product2 {
    Audio4() {super(50);}
    public String toString() {
        return "Audio";
    }
}

class Buyer2 {
    String buyerName = "김자바";
    int money = 1000;
    int bonusPoint = 0;
    Product2[] item = new Product2[10];
    int i = 0;

    void buy(Product2 p) {
        if(money < p.price) {
            System.out.println("잔액이 부족합니다.");
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(buyerName + "님이 " + p + "을(를) 구매하셨습니다.");
    }

    void summary() {
        int sum = 0;
        int bonusPoint = 0;
        String itemList = "";

        for(int i = 0; i < item.length; i++) {
            if(item[i] == null) break;
                sum += item[i].price;
                bonusPoint += item[i].bonusPoint;
                itemList += (i == 0) ? "" + item[i] : ", " + item[i];
        }
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
        System.out.println("구입하신 제품의 총 금액은 " + sum + "만원 입니다.");
        System.out.println("적립된 포인트는 " + bonusPoint + "P 입니다.");
    }
}
