package com.example.study.standard.ch6;

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}

public class Ex6_5_TvTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Card.width= " + Card.width);	//Ŭ���� ����(static)�� �ν��Ͻ��� �������� �ʰ��� ��� ����
		System.out.println("Card.width= " + Card.height);	//Ŭ���� ����(static)�� �ν��Ͻ��� �������� �ʰ��� ��� ����
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");	//static ������ Card.width, Card.height�� ���� ���� ����
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
		
		c1.width = 50;
		c1.height = 70;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
		
	}
}