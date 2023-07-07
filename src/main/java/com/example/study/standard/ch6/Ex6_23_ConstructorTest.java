package com.example.study.standard.ch6;

class Data1{
	int value;
}

class Data33{
	int value;
	
//	Data33(){}
	Data33(int x){	//매개변수가 있는 생성자
		value = x;
	}
}

public class Ex6_23_ConstructorTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Data1 d1 = new Data1();
//	Data33 d2 = new Data33();	//기본생성자가 있어야 사용 가능
	Data33 d2 = new Data33(10);	//매개변수 생성자 사용
	}
}

