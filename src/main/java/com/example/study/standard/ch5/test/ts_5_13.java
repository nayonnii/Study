package test;

import java.util.Scanner;

public class ts_5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();	//String을 char[]로 변환
			
			//(1) 시작
			int num = (int)(Math.random() * question.length);
			char tmp = ' ';
			
			tmp = question[i];
			question[i] = question[num];
			question[num] = tmp;
			//(1) 끝
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i+1, new String(question));	//char배열을 다시 String으로 변환한건가?
			
			String answer = scanner.nextLine();
			
			//trim으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
			if(words[i].equals(answer.trim()))
				System.out.printf("맞았습니다. %n%n");
			else
				System.out.printf("틀렸습니다. %n%n");
		}
	
	}

}