package com.example.study.standard.ch4.test;

//다음의 for문을 while문으로 변경하시오.
public class ts_4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int i = 0;
	while(i<=10) {
		int j = 0;
		while(j<=i) {
			System.out.print("*");
			j++;
		}
		System.out.println();
		i++;
	}		
//		for(j=0; j<=i; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		i++;
//	}	
	}
}
