package com.example.study.standard.ch4;

import java.util.Scanner;

public class Ex4_3_FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���. >");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if(input == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}
	
	}

}
