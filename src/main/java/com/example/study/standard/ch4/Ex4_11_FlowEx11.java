package Exercise;

import java.util.Scanner;

public class Ex4_11_FlowEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("당신의 주민등록번호를 입력하세요.(010101-111111) >");
		
		Scanner scanner = new Scanner(System.in);
		String regno = scanner.nextLine();
		char gender = regno.charAt(7);
		
		switch(gender) {
		case '1': case '3':
			switch(gender) {
			case '1':
				System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
				break;
			case '3':
				System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
				break;
			} break; // break;문 빼먹지 않도록 유의
		case '2': case '4':
			switch(gender) {
			case '2':
				System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
				break;
			case '4':
				System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
				break;
			} break;
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
		}
	}

}
