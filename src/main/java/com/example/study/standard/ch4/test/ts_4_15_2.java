package com.example.study.standard.ch4.test;

//(1)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�. ���� �ФФ�
public class ts_4_15_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12321;
		int tmp = number;
		
		int result = 0;	//���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����
		
		while(tmp!=0) {
			result = (result*10) + tmp%10;
			tmp = tmp/10;
			}
		
		if(number == result)
			System.out.println(number + "�� ȸ���� �Դϴ�.");
		else
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
		
	
	}
}

