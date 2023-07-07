package com.example.study.standard.ch5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_20_MultiArrEx1_2 {
//다차원 배열 - 좌표에 x표 하기
//0은 바다, 1은 배인 상대방의 좌표에서 배의 위치를 알아가는 게임
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 10;
		int x = 0, y = 0;
		
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
			 	 //1, 2, 3, 4, 5, 6, 7, 8, 9
			   	  {0, 0, 0, 0, 0, 0, 1, 0, 0} //1
		    	, {1, 1, 1, 1, 0, 0, 1, 0, 0} //2
				, {0, 0, 0, 0, 0, 0, 1, 0, 0} //3
				, {0, 0, 0, 0, 0, 0, 1, 0, 0} //4
				, {0, 0, 0, 0, 0, 0, 0, 0, 0} //5
				, {1, 1, 0, 1, 0, 0, 0, 0, 0} //6
				, {0, 0, 0, 1, 0, 0, 0, 0, 0} //7
				, {0, 0, 0, 1, 0, 0, 0, 0, 0} //8
				, {0, 0, 0, 0, 0, 1, 1, 1, 0} //9
		};
		
		//board배열의 1열, 1행에 각각 열번호, 행번호 저장
		for(int i=0; i<SIZE; i++) {
			board[i][0] = board[0][i] = (char)(i + '0');
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("좌표를 입력하세요. (종료는 00)");
			String input = scanner.nextLine();
			
			if(input.length() == 2) {
				x = (int)(input.charAt(0)-'0');
				y = (int)(input.charAt(1)-'0');

				if(x == 0 && y == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
			
			
			if(input.length() != 2 || x<0 || x>SIZE || y<0 || y>SIZE) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			System.out.printf("입력하신 좌표는 (%d, %d)입니다. %n", x, y);
			if(shipBoard[x-1][y-1] == 1) {
				board[x][y] = 'O';
			} else {
				board[x][y] = 'X';
			}
		
			board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';
			
			for(int i = 0; i<SIZE; i++) {
				System.out.println(board[i]);				
			}
		}
		
		
		
			}

}