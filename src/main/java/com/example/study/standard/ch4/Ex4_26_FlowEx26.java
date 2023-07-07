package com.example.study.standard.ch4;

public class Ex4_26_FlowEx26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		
		//sum = sum + ++i
		while((sum += ++i) <= 100) {
			System.out.printf("%d - %d%n", i, sum);
		}
	}

}
