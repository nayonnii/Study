package com.example.study.standard.ch6;

class MemberCall{
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv;	//static������ �ν��Ͻ����� ��� �Ұ�
	static int cv2 = new MemberCall().iv;	//�ν��Ͻ����� ��ü �����Ͽ� ��� ����
	
	//�Ʒ� 2���� �� �� �ٷ� ���
//	static MemberCall aa = new MemberCall();
//	static int cv2 = aa.iv;
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);	//static�޼��忡�� �ν��Ͻ� ���� ��� �Ұ�
		MemberCall c = new MemberCall();
		System.out.println(c.iv);//��ü ���� �� �ν��Ͻ� ���� ���� ����
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();	//static�޼��忡�� �ν��Ͻ��޼��� ȣ�� �Ұ�
		MemberCall c = new MemberCall();
		c.instanceMethod1();	//�ν��Ͻ� ���� �� ȣ�� ����
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

