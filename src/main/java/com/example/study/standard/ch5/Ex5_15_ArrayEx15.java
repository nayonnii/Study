package com.example.study.standard.ch5;

import java.util.Arrays;

public class Ex5_15_ArrayEx15 {
//String ¹è¿­
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.", "-..", ".",
				"..-.", "--.", "....", "..", ".---",
				"-.-", ",-..", "--", "-.", "---",
				".--.", "--.-", ".-.", "...", "-",
				"..-", "...-", ".--", "-..-", "-.--",
				"--.."};
		
		String result="";
		
		for(int i=0; i<source.length(); i++) {
			result+=morse[source.charAt(i) - 'A'];
		}
		System.out.println("source:" + source);
		System.out.println("morse:" + result);
//		System.out.println(morse.length);
	
	}

}