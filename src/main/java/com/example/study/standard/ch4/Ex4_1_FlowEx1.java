package com.example.study.standard.ch4;

public class Ex4_1_FlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		System.out.printf("x=%d일 때, 참인 것은 %n", x);
		
		if(x == 0) System.out.println("x==0");
		if(x != 0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x != 0)) System.out.println("!(x!=0)");
	
		x=1;
		System.out.printf("x=%d일 때, 참인 것은 %n", x);
		
		if(x == 0) System.out.println("x==0");
		if(x != 0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x != 0)) System.out.println("!(x!=0)");
	
	}

}
