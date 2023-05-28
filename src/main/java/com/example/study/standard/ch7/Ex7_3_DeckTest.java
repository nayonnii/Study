package com.example.study.standard.ch7;

class Deck {
    final int CARD_NUM = 52;    //카드의 개수(카드 무늬 개수 4 * 카드 숫자 13)
    Card[] cardArr = new Card[CARD_NUM];    // Card 객체 배열을 포함

    Deck () {
        int i = 0;

        // 카드 종류(4, 3, 2, 1 순)별 카드 숫자(0~12)를 배열에 채우기(배열에는 Card객체가 저장됨)
        for (int k = Card.KIND_MAX; k > 0; k--) {
            for (int n = 0; n < Card.NUM_MAX; n++) {
                cardArr[i++] = new Card(k, n + 1);
            }
        }
    }

    Card pick(int index) {      // 저장된 위치(index)에 있는 카드 하나를 꺼내서 반환
        return cardArr[index];
    }

    Card pick() {               // Deck에서 랜덤으로 카드 하나(index)를 선택한다.
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() {            // 카드 순서를 섞는다.(카드 개수만큼 랜덤숫자(r)을 뽑아 섞는 방식)
        for(int i = 0; i < cardArr.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}

class Card {
    static final int KIND_MAX = 4;  // 카드 무늬의 수
    static final int NUM_MAX = 13;  // 무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    public Card() {
        this(SPADE, 1);
    }

    public Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};   // 카드 무늬 종류 배열
        String numbers = "0123456789XJQK";    // 숫자 10은 X로 표현

        return "kind: " + kinds[this.kind] + ", number: " + numbers.charAt(this.number);
    }
}

public class Ex7_3_DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();         // 카드 한 벌(Deck)를 만든다. (카드 배열(cardArr까지 생성 완료)
        Card c = d.pick(0);    // 섞기 전에 제일 위의 카드를 뽑는다. (Deck 클래스 내부에 Card 클래스가 선언되어 있기 때문에 Card 인스턴스를 생성하지 않아도 사용 가능)
        System.out.println(c);       // System.out.println(c.toString());과 같다.

        d.shuffle();                // 카드를 섞는다.
        c = d.pick(0);        // 섞은 후에 제일 위의 카드를 뽑는다.
        System.out.println(c);
    }
}
