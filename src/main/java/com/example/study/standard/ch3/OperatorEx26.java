package com.example.study.standard.ch3;

public class OperatorEx26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n", a, b);						//a=5, b=0
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);		//true  --> ù��° �ĺ��� true�̹Ƿ� �ι�° ���� ��� ����
		System.out.printf("a=%d, b=%d%n", a, b);						//a=5, b=0
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);		//false	--> ù��° �ĺ��� false�̹Ƿ� �ι�° ���� ��� ����
		System.out.printf("a=%d, b=%d%n", a, b);						//a==5, b=0 --> �ι�° ��(b��)�� ��� ������ �ʾ����Ƿ� b=0 ����
	}

}
