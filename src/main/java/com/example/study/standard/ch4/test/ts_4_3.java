package com.example.study.standard.ch4.test;

//1+(1+2)+(1+2+3)+...+(1+2+3+...+10)의 결과를 계산하시오
public class ts_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for(int i=1; i<=10; i++) {
			for(int j=1; j<i+1; j++) {
				sum+=j;		//sum=sum+j
			}
//			System.out.println(sum);	
	}
		System.out.println("결과: " + sum);
	}

}
