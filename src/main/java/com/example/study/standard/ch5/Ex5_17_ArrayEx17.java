package com.example.study.standard.ch5;

import java.util.Arrays;

public class Ex5_17_ArrayEx17 {
//Ŀ�ǵ� ������ ���� �Է¹ޱ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 3) {	//�Էµ� ���� ������ 3���� �ƴϸ�
			System.out.println("usage : java ArrayEx17 NUM1 OP NUM2");
			System.exit(0);	//���α׷��� �����Ѵ�.
		}
		
		int num1 = Integer.parseInt(args[0]);	//���ڿ��� ���ڷ� ��ȯ�Ѵ�.
		char op = args[1].charAt(0);			//���ڿ��� char�� ��ȯ�Ѵ�.
		int num2 = Integer.parseInt(args[2]);
		int result = 0;
		
		switch(op) {	//switch���� �������� charŸ���� ������ �����ϴ�.
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case 'x':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default :
			System.out.println("�������� �ʴ� �������Դϴ�.");
		}
		System.out.println("���=" + result);
	}

}