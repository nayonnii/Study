package com.example.study.standard.ch5;

import java.util.Arrays;

public class Ex5_14_ArrayEx14 {
//String �迭
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src ="ABCDE";
		
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + ") :" + ch);
		}
		
		//String�� char�迭�� ��ȯ
		char[] chArr = src.toCharArray();
		
		System.out.println(chArr);
	}

}