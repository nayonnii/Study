package com.example.study.standard.ch4.test;

//(1)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
public class ts_4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String value = "12o34";
	char ch = ' ';
	boolean isNumber = true;
	
	//�ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ� �ϳ��� �о �˻��Ѵ�.
	for(int i=0; i<value.length(); i++) {
		//(1) ����
//		ch = value.charAt(i);
		if(!('0'<=value.charAt(i) && value.charAt(i)<='9')) {
			isNumber = false;
			break;	//break ����������
		}
		//(1) ��
	}
	
	if(isNumber) {
		System.out.println(value + "�� �����Դϴ�.");
	}else {
		System.out.println(value + "�� ���ڰ� �ƴմϴ�.");
	}
	}
}

