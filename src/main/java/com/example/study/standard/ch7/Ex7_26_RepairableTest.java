package com.example.study.standard.ch7;

public class Ex7_26_RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();

        Marine marine = new Marine();
        SCV scv = new SCV();
        scv.repair(tank);
        scv.repair(dropship);
//        scv.repair(marine);   // Marin 클래스에는 Repairable 인터페이스를 구현하지 않았으므로 에러
    }
}

interface Repairable {}

class Unit2 {
    int hitPoint;
    final int MAX_HP;

    Unit2(int hp) {
        MAX_HP = hp;    // 생성자를 통해 MAX_HP 초기화
    }
}

class GroundUnit extends Unit2 {
    GroundUnit(int hp) {
        super(hp);  // Unit2(조상)의 생성자 호출
    }
}

class AirUnit extends Unit2 {
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }
}

class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(125);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Dropship";
    }
}

class Marine extends GroundUnit {
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
}

// SCV: 건설인부
class SCV extends  GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if(r instanceof Unit2) {
            Unit2 u = (Unit2) r;
            while(u.hitPoint != u.MAX_HP) { //HP 꽉 채우기
                /* Unit의 HP를 증가시킨다. */
            u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
}