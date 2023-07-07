package Exercise;
import java.util.*;

public class OperatorEx25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.print("문자를 하나 입력하세요. >");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);				//charAt(index) : scanner로 입력받은 문자열 중 index번째의 글자를 읽음
		
		if('0' <= ch && ch <= '9') {
			System.out.println("입력하신 문자는 숫자입니다.");

			if(('a' <= ch && ch <= 'z') || ('A' < ch && ch <= 'Z')) {
				System.out.println("입력하신 문자는 영문자입니다.");
			}
		}
	}

}
