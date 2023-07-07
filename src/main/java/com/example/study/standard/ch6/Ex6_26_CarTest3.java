package com.example.study.standard.ch6;

class Car22 {
	String color;
	String gearType;
	int door;
	
	Car22() {
		this("white", "auto", 4);
	}
	
	Car22(Car22 c) {	//�ν��Ͻ� ���縦 ���� ������
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	/*
	Car22(Car22 c){
		this(c.color, c.gearType, c.door)
	} 
	 */
	
	Car22(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class Ex6_26_CarTest3 {
	
	public static void main(String[] args) {
	Car22 c1 = new Car22();
	Car22 c2 = new Car22(c1);	//c1�� ���纻 c2�� �����Ѵ�.
	System.out.println("c1�� color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
	System.out.println("c2�� color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
	
	c1.door = 100;	//c1�� �ν��Ͻ����� door�� ���� �����Ѵ�.
	System.out.println("c1�� color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
	System.out.println("c2�� color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

	}
}

