package com.example.study.standard.ch4;

import java.util.Scanner;

public class Ex4_5_FlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("������ �Է����ּ���. >");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			}else if(score < 94) {
				opt = '-';
			}
		} else if(score >= 80) {
			grade = 'B';

			if(score >= 98) {
				opt = '+';
			}else if(score < 94) {
				opt = '-';
			}
		} else  {
			grade = 'C';
		}
		System.out.printf("����� ������ %c%c�Դϴ�.%n", grade, opt);
	}

}
