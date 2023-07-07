package test;

public class ts_5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money=" + money);
		
		for(int i=0; i<coinUnit.length; i++) {
			//(1) 시작
//			while(money != 0) {
//			int count = money / coinUnit[i];
//			System.out.println(coinUnit[i] + "원: " + count);
//			money %= coinUnit[i];
//			break;
//			}
			int count = money / coinUnit[i];
			System.out.println(coinUnit[i] + "원: " + count);
			money %= coinUnit[i];
			
			//(1) 끝
		}
	}

}
