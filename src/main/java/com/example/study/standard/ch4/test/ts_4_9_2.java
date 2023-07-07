package com.example.study.standard.ch4.test;

//(1)에 알맞은 코드를 넣어 완성하시오.
public class ts_4_9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		int sum = 0;

		for(int i = 0; i<str.length(); i++) {
			//(1)시작
			sum = sum+((int)(str.charAt(i))-48);
//			System.out.println(sum);
			//(1)끝
		}
		System.out.println("sum=" + sum);
	}
}

