package Exercise;

import java.util.Scanner;

public class Ex5_21_MultiArrEx2_2 {
//다차원 배열 - 빙고
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 5;
		int x=0, y=0, num=0;
		
		int[][] bingo = new int [SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);
		
		//배열의 모든 요소를 연속된 숫자로 초기화
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;
			}
		}
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				x = (int)(Math.random() * SIZE);
				y = (int)(Math.random() * SIZE);
				
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					System.out.printf("%3d", bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println();

			System.out.printf("1~%d까지의 숫자를 입력해주세요, (종료는 0) >", SIZE*SIZE);
			num = scanner.nextInt();
			
			if(num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if(num > SIZE*SIZE || num < 0) {
				System.out.printf("1~%d사이의 수를 입력해주세요.", SIZE*SIZE);
				continue;
			}
			
			outer:
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					if(bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer;
					}
//					bingo[i][j] = bingo[i][j] == num ? 0 : bingo[i][j];
				}
			}
		}while(num != 0);
			}

}