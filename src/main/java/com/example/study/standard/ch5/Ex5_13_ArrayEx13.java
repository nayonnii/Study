package com.example.study.standard.ch5;

import java.util.Arrays;

public class Ex5_13_ArrayEx13 {
//String 배열
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] hex = {'1', 'A', 'F', 'E'};
		
		String[] binary = {"0000", "0001", "0010", "0011"
						, "0100", "0101", "0110", "0111"
						, "1000", "1001", "1010", "1011"
						, "1100", "1101", "1110", "1111"
						};
		
		String result="";
		
		for(int i=0; i<hex.length; i++) {
			if(hex[i] >= '0' && hex[i] <= '9') {
				result += binary[hex[i]-'0'];
			}else {	//A~F이면
				result += binary[hex[i]-'A'+10];
//				result += binary[hex[i]-'A'];
//				System.out.println(result);
			}
		}
		
		System.out.println("hex:" + new String(hex));
		System.out.println("binary:" + result);
//		System.out.println((int)'0');
//		System.out.println('A'-'A');
	}

}
