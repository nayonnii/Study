package com.example.study.standard.ch4.test;

//1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
public class ts_4_11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//피보나치 수열의 시작의 첫 두 숫자를 1,1로 한다.
		
	int num1 = 1;	
	int num2 = 1;
	int num3 = 0;	//세번째값
	System.out.print(num1+","+ num2);
	for(int i=0; i<8; i++) {
		//(1) 시작
			num3=num1+num2;
			System.out.print("," + num3);
			num1=num2;
			num2=num3;
	}
	
		//(1) 끝
	
	}
}

