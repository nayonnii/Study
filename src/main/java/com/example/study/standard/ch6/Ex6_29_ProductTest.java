package com.example.study.standard.ch6;

public class Ex6_29_ProductTest {
	static int count = 0;	//������ �ν��Ͻ��� ���� �����ϱ� ���� ����
	int serialNo;			//�ν��Ͻ� ������ ��ȣ
	
	{						//�ν��Ͻ� �ʱ�ȭ ��
		++count;
		serialNo = count;
	}
	
	public Ex6_29_ProductTest() {}		//�⺻������(�ν��Ͻ�), ���� ����
	
	public static void main(String[] args) {
		Ex6_29_ProductTest p1 = new Ex6_29_ProductTest();
		Ex6_29_ProductTest p2 = new Ex6_29_ProductTest();
		Ex6_29_ProductTest p3 = new Ex6_29_ProductTest();
		
		System.out.println("p1�� ��ǰ��ȣ(serial no)�� " + p1.serialNo);
		System.out.println("p1�� ��ǰ��ȣ(serial no)�� " + p2.serialNo);
		System.out.println("p1�� ��ǰ��ȣ(serial no)�� " + p3.serialNo);
		System.out.println("����� ��ǰ�� ���� ��� " + Ex6_29_ProductTest.count + "�� �Դϴ�.");
	
	}
}

