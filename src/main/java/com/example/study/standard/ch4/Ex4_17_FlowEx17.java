package Exercise;

import java.util.Scanner;

public class Ex4_17_FlowEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print('*');	
//			} System.out.println();
//		}
//		
		
		int num = 0;
		
		System.out.print("*을 출력할 라인의 수를 입력하세요. >");
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
