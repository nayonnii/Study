package com.example.study.standard.ch4;

public class Ex4_13_FlowEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;	// sum = sum + i;
			System.out.printf("1부터 %2d까지의 합: %2d%n", i, sum);
		}
	}

}
