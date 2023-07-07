package com.example.study.standard.ch3;
import java.util.*;

public class OperatorEx25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ���. >");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);				//charAt(index) : scanner�� �Է¹��� ���ڿ� �� index��°�� ���ڸ� ����
		
		if('0' <= ch && ch <= '9') {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");

			if(('a' <= ch && ch <= 'z') || ('A' < ch && ch <= 'Z')) {
				System.out.println("�Է��Ͻ� ���ڴ� �������Դϴ�.");
			}
		}
	}

}
