package com.example.study.standard.ch6.test;

class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	double getDistance(int x1, int y1){
//		return Math.sqrt(((x1 - this.x) * (x1 - this.x)) + ((y1 - this.y) * (y1 - this.y)));
		return Math.sqrt(Math.pow((x1 - this.x),2) + Math.pow((y1 - this.y),2));
	}	// this �Ⱥٿ��� ��
	
}

public class ts_6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MyPoint p = new MyPoint(1,1);
	//p�� (2,2)�� �Ÿ��� ���Ѵ�.
	System.out.println(p.getDistance(2, 2));
	}
}
