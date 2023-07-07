package test;

//(1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
public class ts_4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;	//사용자입력을 저장할 공간
		int count = 0;	//시도횟수를 세기위한 변수
		
		//화면으로부터 사용자입력을 받기 위해서 Scanner클리스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = s.nextInt();//입력받은 값을 변수 input에 저장한다.

			if(input == answer) {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는" + count + "번입니다.");
				break;
			}else if(input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
//				continue;
			}else if(input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
//				continue;
			}
		}while(true);	//무한반복문
		}
}

