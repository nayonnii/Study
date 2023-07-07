package com.example.study.standard.ch6.test;

public class ts_6_24 {
	static int abs(int value) {
//		if(value < 0)
//			return -value;
//		return value;
		return	value < 0 ? -value : value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int value = 5;
	System.out.println(value + "의 절대값: " + abs(value));
	value = -10;
	System.out.println(value + "의 절대값: " + abs(value));
	}
}
