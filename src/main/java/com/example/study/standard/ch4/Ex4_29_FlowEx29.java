package Exercise;

public class Ex4_29_FlowEx29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100까지 정수로 369게임 반복문 생성
		
	
		for(int i=1; i<=100; i++) {
			System.out.printf("i= %d", i);
			int tmp = i;
			
			do {			
				if((tmp%10%3 == 0) && (tmp%10 != 0)){
					System.out.print("짝");
				}
				tmp = tmp/10;
			}while(tmp != 0);
			System.out.println();
		}
//			do {			
//				if((tmp%10%3 == 0) && (tmp%10 != 0)){
//					System.out.print("짝");
//				}
//			}while((tmp/=10) != 0);	//(tmp = tmp/10) != 0
//			System.out.println();
//		}
//		
		
	}

}
