package com.example.study.standard.ch4.test;

//1�� 1���� �����ϴ� �Ǻ���ġ������ 10��° ���� �������� ����ϴ� ���α׷��� �ϼ��Ͻÿ�.
public class ts_4_11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ǻ���ġ ������ ������ ù �� ���ڸ� 1,1�� �Ѵ�.
		
	int num1 = 1;	
	int num2 = 1;
	int num3 = 0;	//����°��
	System.out.print(num1+","+ num2);
	for(int i=0; i<8; i++) {
		//(1) ����
			num3=num1+num2;
			System.out.print("," + num3);
			num1=num2;
			num2=num3;
	}
	
		//(1) ��
	
	}
}

