package Exercise;

import java.util.Scanner;

public class Ex4_33_FlowEx33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int menu = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
		
			System.out.print("(1)~(3) �޴��� �������ּ���.(����: 0) >");
			menu = scanner.nextInt();
			
			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else if(!(1 <= menu && menu <= 3)) {
				System.out.println("�޴� ������ �߸��ϼ̽��ϴ�.(����: 0)");
				continue;
			}
//			System.out.println("�����Ͻ� �޴���" + menu + "�� �Դϴ�.");
			for(;;) {
				System.out.print("����� ���� �Է��ϼ���.(�������: 0, ��ü����: 99)");
				num = scanner.nextInt();
				
				if(num == 99) 
					break outer;
				if(num == 0) 
					break;
	
				switch(menu) {
				case 1 :
					System.out.println("result =" + num * num);
					break;
				case 2 :
					System.out.println("result =" + Math.sqrt(num));
					break;
				case 3 :
					System.out.println("result =" + Math.log(num));
					break;
				}
			}
		}
	}

}
