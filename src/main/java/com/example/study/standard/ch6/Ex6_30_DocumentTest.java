package com.example.study.standard.ch6;

public class Ex6_30_DocumentTest {
	static int count = 0;
	String name;	//������(Document name)
	
	Ex6_30_DocumentTest(String name){
		this.name = name;
		System.out.println("���� " + this.name + "�� �����Ǿ����ϴ�.");
	}
	
	Ex6_30_DocumentTest() {	//���� ���� �� �������� �������� �ʾ��� ���� ������
		this("�������" + ++count);
	}
	
	public static void main(String[] args) {
		Ex6_30_DocumentTest d1 = new Ex6_30_DocumentTest();
		Ex6_30_DocumentTest d2 = new Ex6_30_DocumentTest("�ڹ�.txt");
		Ex6_30_DocumentTest d3 = new Ex6_30_DocumentTest();
		Ex6_30_DocumentTest d4 = new Ex6_30_DocumentTest();
		}
}

