package com.example.study.standard.ch3;

public class OperatorEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1000000;
		
		int result1 = a * a / a;	// a * a���� �����÷ο� �߻�
		int result2 = a / a * a;
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
	}

}
