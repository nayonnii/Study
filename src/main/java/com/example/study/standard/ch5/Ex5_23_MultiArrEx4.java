package Exercise;

import java.util.Scanner;

public class Ex5_23_MultiArrEx4 {
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
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {	//문자열은 equals 쓰는 거 잊지 말기!!!!!!!!
				System.out.println("정답입니다.");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s 입니다.%n%n", words[i][1]);
			}
		}
	}

}