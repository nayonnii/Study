package com.example.study.standard.ch5;

import java.util.Scanner;

public class Ex5_22_MultiArrEx3_2 {
//다차원 배열 - 행렬
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {
				{1,2,3}, 
				{4,5,6}
		};
		
		int[][] b = {
				{1,2},
				{3,4},
				{5,6}	
		};
		
		final int ROW = a.length;
		final int COL = b[0].length;
		final int COL2 = b.length;
		
		int[][] c = new int[ROW][COL];
		
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COL; j++) {
				for(int k=0; k<COL2; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COL; j++) {
				System.out.printf("%3d", c[i][j]);
			}
			System.out.println();
		}
			}

}