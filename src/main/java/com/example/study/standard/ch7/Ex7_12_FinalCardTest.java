package com.example.study.standard.ch7;

class Card2 {
    final int NUMBER2;
    final String KIND2;
    static int width = 100;
    static int height = 250;

    Card2(String KIND2, int NUMBER2) {
        this.NUMBER2 = NUMBER2;
        this.KIND2 = KIND2;
    }

    Card2() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND2 + " " + NUMBER2;
    }
}

public class Ex7_12_FinalCardTest {
    public static void main(String[] args) {
        Card2 c = new Card2("HEART", 10);
//        c.NUMBER2 = 5;  // 에러케이스(c.NUMBER2는 final이 붙은 변수이므로 값 변경 불가)
        System.out.println(c.KIND2);
        System.out.println(c.NUMBER2);
        System.out.println(c);
    }
}
