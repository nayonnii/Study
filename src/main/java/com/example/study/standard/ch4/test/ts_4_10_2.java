package com.example.study.standard.ch4.test;

//(1)에 알맞은 코드를 넣어 완성하시오.
public class ts_4_10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int sum = 0;
		while(num != 0) {
		sum += num%10;
		num /= 10;
		}
		System.out.println("sum=" + sum);
	}
}

