package Exercise;

import java.util.Arrays;

public class Ex5_18_ArrayEx18 {
//2�����迭
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
		
		for (int[] tmp : score) {	//score�� �� 1�����迭�� tmp��� �ű� �迭�� �о�´�.
			for(int i : tmp) {		//tmp�� ��� ���� i��� �ű� ������ �о�´�. -> �ᱹ tmp�� 1���� �迭�� ����Ŵ
				sum+=i;		//sum=sum+i;
			}
		}
		System.out.println("sum=" + sum);
	
	}

}