package test;

public class ts_5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		
		//문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money=" + money);
		
		int[] coinUnit = {500, 100, 50, 10};	//동전의 단위
		int[] coin = {5, 5, 5, 5};	//단위별 동전의 개수
		
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum = 0;			
			//(1) 시작
			coinNum = money/coinUnit[i];	// 단위별 필요한 동전의 개수
			if(coinNum >= coin[i]) {		// 필요한 동전의 개수가 가진 동전보다 같거나 많을 경우
				money = ((coinNum - coin[i]) * coinUnit[i]) + (money % coinUnit[i]); 
				coinNum = coin[i];
				coin[i] -= coinNum;
			} else {						// 필요한 동전의 개수가 가진 동전보다 적을 경우
				money %= coinUnit[i];
				coin[i] -= coinNum;
			}
			//(1) 끝
			System.out.println(coinUnit[i] + "원" + coinNum);
		}
		
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);	// 프로그램 종료
		}
		
		//남은 동전의 개수가 있을 경우에만 출력
		System.out.println("=남은 동전의 개수 =");
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원" + coin[i]);
		}
		
	}

}
