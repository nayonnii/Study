package Exercise;

import java.util.Scanner;

public class Ex4_8_FlowEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("����� �ֹε�Ϲ�ȣ�� �Է��ϼ���. (010101-111111)>");
		
		Scanner scanner = new Scanner(System.in);
		String regno = scanner.nextLine();
		
		char gender = regno.charAt(7);
		
		switch(gender) {
		case '1': case '3':
			System.out.println("����� �����Դϴ�.");
			break;
		case '2': case '4':
			System.out.println("����� �����Դϴ�.");
			break;
			default:
				System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
	}

}
