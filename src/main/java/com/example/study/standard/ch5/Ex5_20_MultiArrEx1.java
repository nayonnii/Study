package Exercise;

import java.util.Scanner;

public class Ex5_20_MultiArrEx1 {
//다차원 배열 - 좌표에 x표하기
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
		//1행에 행번호를, 1열에 열번호를 저장한다.
		for(int i=1; i<SIZE; i++) {
			board[0][i] = board[i][0] = (char)(i+'0');	// 숫자를 문자로 변환
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.printf("좌료를 입력하세요.(종료는 00)>");	
			String input = scanner.nextLine();	//화면 입력받은 값을 input에 저장
			
			if(input.length() == 2) {	//두 글자를 입력한 경우
				x = input.charAt(0) - '0';	//문자를 숫자로 변환
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0)	//x와 y가 모두 0인 경우 종료
					break;
			}
			
			if(input.length() != 2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			
			//shipBoard[x-1][y-1]의 값이 1이면, 'O'를 board[x][y]에 저장한다.
			board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';
			
			//배열 board의 내용을 화면에 출력한다.
			for(int i=0; i<SIZE; i++) {
				System.out.println(board[i]);	//board[i]는 1차원 배열
				}	//println으로 1차원배열을 출력하면 배열의 모든 요소가 출력됨(단, char배열에 한함)
			System.out.println();
			
//			for(int i=0; i<SIZE; i++) {
//				for(int j=0; j<SIZE; j++) {
//					System.out.print(board[i][j]);
//				}
//				System.out.println();
//			}
		
		}
	}

}