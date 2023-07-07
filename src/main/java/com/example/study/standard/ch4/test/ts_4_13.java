package com.example.study.standard.ch4.test;

//(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
public class ts_4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String value = "12o34";
	char ch = ' ';
	boolean isNumber = true;
	
	//반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
	for(int i=0; i<value.length(); i++) {
		//(1) 시작
//		ch = value.charAt(i);
		if(!('0'<=value.charAt(i) && value.charAt(i)<='9')) {
			isNumber = false;
			break;	//break 빼먹지말기
		}
		//(1) 끝
	}
	
	if(isNumber) {
		System.out.println(value + "는 숫자입니다.");
	}else {
		System.out.println(value + "는 숫자가 아닙니다.");
	}
	}
}

