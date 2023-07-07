package Exercise;

import java.util.Arrays;

public class Ex5_18_ArrayEx18 {
//2차원배열
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}
		
		for (int[] tmp : score) {	//score의 각 1차원배열을 tmp라는 신규 배열에 읽어온다.
			for(int i : tmp) {		//tmp의 모든 값을 i라는 신규 변수에 읽어온다. -> 결국 tmp는 1차원 배열을 가리킴
				sum+=i;		//sum=sum+i;
			}
		}
		System.out.println("sum=" + sum);
	
	}

}