package com.example.study.standard.ch4.test;

//(1)에 알맞은 코드를 넣어 완성하시오.
public class ts_4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		int sum = 0;

		for(int i = 0; i<str.length(); i++) {
			//(1)시작
			int num = Integer.parseInt(str);

			while(num != 0) {
				sum += num%10;
				num /= 10;
//					System.out.printf("%d\t%d%n", num, sum);
			}
			if(num==0) break;
			//(1)끝
		}
		System.out.println("sum=" + sum);
	}
}

