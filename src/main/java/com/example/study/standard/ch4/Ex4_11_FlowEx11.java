package Exercise;

import java.util.Scanner;

public class Ex4_11_FlowEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("����� �ֹε�Ϲ�ȣ�� �Է��ϼ���.(010101-111111) >");
		
		Scanner scanner = new Scanner(System.in);
		String regno = scanner.nextLine();
		char gender = regno.charAt(7);
		
		switch(gender) {
		case '1': case '3':
			switch(gender) {
			case '1':
				System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
				break;
			case '3':
				System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
				break;
			} break; // break;�� ������ �ʵ��� ����
		case '2': case '4':
			switch(gender) {
			case '2':
				System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
				break;
			case '4':
				System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
				break;
			} break;
		default:
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
	}

}
