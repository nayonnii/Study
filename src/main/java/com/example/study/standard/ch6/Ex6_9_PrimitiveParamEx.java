package com.example.study.standard.ch6;

class Data{int x;}

public class Ex6_9_PrimitiveParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) {	//�⺻�� �Ű�����
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}