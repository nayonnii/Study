package com.example.study.standard.ch4.test;

//(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오. 몰라 ㅠㅠㅠ
public class ts_4_15_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12321;
		int tmp = number;
		
		int result = 0;	//변수 number를 거꾸로 변환해서 담을 변수
		
		while(tmp!=0) {
			result = (result*10) + tmp%10;
			tmp = tmp/10;
			}
		
		if(number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
		
	
	}
}

