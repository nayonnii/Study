package com.example.study.standard.ch7;

public class Ex7_24_FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit) {
            System.out.println("f는 Unit클래스의 자손입니다.");
        }

        if (f instanceof Fightable) {
            System.out.println("f는 Fightable 인터페이스를 구현했습니다.");
        }

        if(f instanceof Moveble) {
            System.out.println("f는 Mobable 인터페이스를 구현했습니다.");
        }

        if(f instanceof Attackable) {
            System.out.println("f는 Attackble 인터페이스를 구현했습니다.");
        }

        if(f instanceof Object) {
            System.out.println("f는 Object 클래스의 자손입니다.");
        }
    }
}

class Unit {
    int currentHP;  // 유닛의 채력
    int x;          // 유닛의 위치(x좌표)
    int y;          // 유닛의 위치(y좌표)
}

interface Attackable {
    void attack(Unit u);
}

interface Moveble {
    void move(int x, int y);
}

interface Fightable extends Moveble, Attackable {}  // attackable과 movable을 상속 받은 fightable 능력



class Fighter extends Unit implements Fightable {   // 유닛과 fightable 능력을 상속받아 fighter 완성
    public void move(int x, int y) {/* 내용 생략 */}
    public void attack(Unit u) {/* 내용 생략 */}
}
