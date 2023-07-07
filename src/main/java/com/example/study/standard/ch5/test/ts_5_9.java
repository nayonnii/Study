package com.example.study.standard.ch5.test;

public class ts_5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] star = {
				{'*', '*', ' ', ' ', ' '},	//(0,0), (0,1), (0,2), (0,3), (0,4)
				{'*', '*', ' ', ' ', ' '},	//(1,0), (1,1), (1,2), (1,3), (1,4)
				{'*', '*', '*', '*', '*'},	//(2,0), (2,1), (2,2), (2,3), (2,4)
				{'*', '*', '*', '*', '*'},	//(3,0), (3,1), (3,2), (3,3), (3,4)
		};
		
		char[][] result = new char[star[0].length][star.length];	//char[4][3] -> 4*5
		
		for(int i=0; i<star.length; i++) {	// 0,1,2,3
			for(int j=0; j<star[i].length; j++) {	//0,1,2,3,4
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
	
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				//(1) ½ÃÀÛ
//				result[j][i] = star[star[0].length-j][star.length - i];
				result[j][i] = star[i][j];
//				result.length == 5, result[0].length == 4
//				star.length == 4, star[0].length == 5
				System.out.print(result[j][i]);
				//(1) ³¡
			}
			System.out.println();
		}
	}

}
