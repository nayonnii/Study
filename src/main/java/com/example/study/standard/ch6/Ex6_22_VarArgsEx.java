package com.example.study.standard.ch6;

public class Ex6_22_VarArgsEx {
	static String concatenate(String delim, String...args) {
		String result = "";
		
		for(String str : args) {
			result += str + delim;
		}
		return result;
	}
	/*
	 static String concatenate(String... args){
	 	return concatenate("", args);
	 }
	 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] strArr = {"100", "200", "300"};
	
	System.out.println(concatenate("", "100", "200", "300"));
	System.out.println(concatenate("-", strArr));
	System.out.println(concatenate(",", new String[] {"1", "2", "3"}));
	System.out.println("["+concatenate(",", new String[0])+"]");
	System.out.println("["+concatenate(",")+"]");
	
	}
}

