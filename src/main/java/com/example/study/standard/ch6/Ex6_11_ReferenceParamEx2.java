package com.example.study.standard.ch6;

public class Ex6_11_ReferenceParamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {10};	//크기가 1인 배열. x[0] = 10;
		System.out.println("main() : x = " + x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]);
 	}
	
	static void change(int[] x) {
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]);
	}
}
