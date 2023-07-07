package com.example.study.standard.ch3;

public class OperatorEx29 {
	public static void main(String[] args) {
		byte p = 10; 	//2������ -> 1010
		byte n = -10;	//2������ -> 0101(10�� 1�Ǻ���) + 1 = 0110
		
		System.out.printf("p = %d \t%s%n", p, toBinaryString(p));		//10, 00000000000000000000000000001010			
//		System.out.printf("p = %d \t%s%n", p, Integer.toBinaryString(p));		//10, 1010			
		System.out.printf("~p = %d \t%s%n", ~p, toBinaryString(~p));		//-11, 11111111111111111111111111110101
		System.out.printf("~p+1 = %d \t%s%n", ~p+1, toBinaryString(~p+1));	//-10, 11111111111111111111111111110110
		System.out.printf("~~p = %d \t%s%n", ~~p, toBinaryString(~~p));	//10, 00000000000000000000000000001010
		System.out.println();
		System.out.printf("n = %d%n", n);								//-10
		System.out.printf("~(n-1) = %d%n", ~(n-1));						//10
	}

//10�� ������ 2������ ��ȯ�ϴ� �޼���
static String toBinaryString(int x) {
	String zero = "00000000000000000000000000000000";
	String tmp = zero + Integer.toBinaryString(x);
	return tmp.substring(tmp.length()-32);
}
}