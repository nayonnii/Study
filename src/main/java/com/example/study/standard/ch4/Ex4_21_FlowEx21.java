package com.example.study.standard.ch4;

public class Ex4_21_FlowEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) {
					System.out.printf("[%d,%d]", i, j);
				} else {
					System.out.printf("%5c",' ');
				}
			}
			System.out.println();
		}
	}

}
