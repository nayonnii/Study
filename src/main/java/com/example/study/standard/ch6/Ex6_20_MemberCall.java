package com.example.study.standard.ch6;

class MemberCall{
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv;	//static변수라서 인스턴스변수 사용 불가
	static int cv2 = new MemberCall().iv;	//인스턴스변수 객체 생성하여 사용 가능
	
	//아래 2줄을 위 한 줄로 축약
//	static MemberCall aa = new MemberCall();
//	static int cv2 = aa.iv;
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);	//static메서드에서 인스턴스 변수 사용 불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv);//객체 생성 후 인스턴스 변수 참조 가능
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();	//static메서드에서 인스턴스메서드 호출 불가
		MemberCall c = new MemberCall();
		c.instanceMethod1();	//인스턴스 생성 후 호출 가능
	}
	
	void instanceMethod2() {	
		staticMethod1();	
		instanceMethod1();
	}
}

public class Ex6_20_MemberCall {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}

