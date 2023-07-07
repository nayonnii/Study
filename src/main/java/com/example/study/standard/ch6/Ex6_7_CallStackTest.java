package com.example.study.standard.ch6;

public class Ex6_7_CallStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstMethod();
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
