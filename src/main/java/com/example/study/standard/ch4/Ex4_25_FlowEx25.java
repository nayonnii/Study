package Exercise;

import java.util.*;

public class Ex4_25_FlowEx25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요. (예:12345)>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num != 0) {
			sum += num % 10;
			num/=10;
		}
		System.out.println("각 자리수의 합: " + sum);

	}

}
