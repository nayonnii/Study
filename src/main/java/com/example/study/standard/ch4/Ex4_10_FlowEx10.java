package com.example.study.standard.ch4;

import java.util.Scanner;

public class Ex4_10_FlowEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = ' ';
		
		System.out.print("����� ������ �Է��ϼ���. >");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		switch(score/10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8: 
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';
		}
		System.out.println("����� ������ " + grade + "�Դϴ�.");
	}

}
