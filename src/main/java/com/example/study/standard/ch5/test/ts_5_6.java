package test;

public class ts_5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money=" + money);
		
		for(int i=0; i<coinUnit.length; i++) {
			//(1) ����
//			while(money != 0) {
//			int count = money / coinUnit[i];
//			System.out.println(coinUnit[i] + "��: " + count);
//			money %= coinUnit[i];
//			break;
//			}
			int count = money / coinUnit[i];
			System.out.println(coinUnit[i] + "��: " + count);
			money %= coinUnit[i];
			
			//(1) ��
		}
	}

}
