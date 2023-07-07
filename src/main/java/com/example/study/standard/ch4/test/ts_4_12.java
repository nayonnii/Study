package com.example.study.standard.ch4.test;

//구구단의 일부분을 다음과 같이 출력하시오.
public class ts_4_12 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=3; j++) {
				int x=i+j;
				int y=(i%3)==0 ? 3 : i%3;
				System.out.printf("%d*%d=%d\t", x, y, x*y);
			}
			System.out.println();
		}
		
		
		
		
		
		
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.printf("%d * %d = %d%n", i,j,i*j);
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=3; i++) {
//			for(int j=2; j<=4; j++) {
//				System.out.printf("%d * %d = %d\t" ,j, i, j*i);
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//			for(int i=1; i<=3; i++) {
//				for(int j=5; j<=7; j++) {
//					System.out.printf("%d * %d = %d\t" ,j, i, j*i);
//				}
//				System.out.println();
//			}
//			
//			System.out.println();
//				for(int i=1; i<=3; i++) {
//					for(int j=8; j<=9; j++) {
//						System.out.printf("%d * %d = %d\t" ,j, i, j*i);
//					}
//					System.out.println();
//				}


		
	}
}

