package com.example.study.standard.ch4.test;

//Math.random()을 이용해서 1부터 6 사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라.
//(1)에 알맞은 코드를 넣으시오.
public class ts_4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	int value = (1)
	int value = (int)(Math.random()*6+1);	
	System.out.println("value:" + value);
	}
}

