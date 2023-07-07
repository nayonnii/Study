package com.example.study.standard.ch5;

import java.util.Scanner;

public class Ex5_23_MultiArrEx4_2 {
//다차원 배열 - 단어 맞추기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words = {
				{"chair", "의자"},		//words[0][0], words[0][1]
				{"computer", "컴퓨터"},	//words[1][0], words[1][1]
				{"integer", "정수기"}		//words[2][0], words[2][1]
		};
	
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은 무엇입니까?", i+1, words[i][0]);
			String answer = scanner.nextLine();
			
			if(answer.equals(words[i][1])) {
				System.out.printf("정답입니다. %n");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다. %n", words[i][1]);
			}
			System.out.println();
		}
			}

}