package Exercise;

import java.util.Scanner;

public class Ex4_28_FlowEx28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0, answer = 0;
		
		answer= (int)(Math.random() * 100) + 1;	// 1~100 ������ ������ ���� ����
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1�� 100 ������ ������ �Է��ϼ���. >");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� ���� �õ��غ�����.");
			}else if(input < answer) {
				System.out.println("�� ū���� �õ��غ�����.");
			}
		} while(input != answer);
		System.out.println("�����Դϴ�.");
	}

}
