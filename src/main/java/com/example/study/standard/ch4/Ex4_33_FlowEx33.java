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
		
			System.out.print("(1)~(3) 메뉴를 선택해주세요.(종료: 0) >");
			menu = scanner.nextInt();
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴 선택을 잘못하셨습니다.(종료: 0)");
				continue;
			}
//			System.out.println("선택하신 메뉴는" + menu + "번 입니다.");
			for(;;) {
				System.out.print("계산할 값을 입력하세요.(계산종료: 0, 전체종료: 99)");
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
