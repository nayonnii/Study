package com.example.study.standard.ch6;

class Data1{
	int value;
}

class Data33{
	int value;
	
//	Data33(){}
	Data33(int x){	//�Ű������� �ִ� ������
		value = x;
	}
}

public class Ex6_23_ConstructorTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Data1 d1 = new Data1();
//	Data33 d2 = new Data33();	//�⺻�����ڰ� �־�� ��� ����
	Data33 d2 = new Data33(10);	//�Ű����� ������ ���
	}
}

