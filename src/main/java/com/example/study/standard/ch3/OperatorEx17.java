package com.example.study.standard.ch3;

public class OperatorEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.141592f;
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0; //3142.0 / 1000.0
		float short2Pi = (int)(pi * 1000 + 0.5) / 1000.0f;
		
		System.out.println(shortPi);
		System.out.println(short2Pi);
	}

}
