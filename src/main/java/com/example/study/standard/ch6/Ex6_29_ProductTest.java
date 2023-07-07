package com.example.study.standard.ch6;

public class Ex6_29_ProductTest {
	static int count = 0;	//생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo;			//인스턴스 고유의 번호
	
	{						//인스턴스 초기화 블럭
		++count;
		serialNo = count;
	}
	
	public Ex6_29_ProductTest() {}		//기본생성자(인스턴스), 생략 가능
	
	public static void main(String[] args) {
		Ex6_29_ProductTest p1 = new Ex6_29_ProductTest();
		Ex6_29_ProductTest p2 = new Ex6_29_ProductTest();
		Ex6_29_ProductTest p3 = new Ex6_29_ProductTest();
		
		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
		System.out.println("p1의 제품번호(serial no)는 " + p2.serialNo);
		System.out.println("p1의 제품번호(serial no)는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 " + Ex6_29_ProductTest.count + "개 입니다.");
	
	}
}

