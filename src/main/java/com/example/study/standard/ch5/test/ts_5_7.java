package test;

public class ts_5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		
		//���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�.
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money=" + money);
		
		int[] coinUnit = {500, 100, 50, 10};	//������ ����
		int[] coin = {5, 5, 5, 5};	//������ ������ ����
		
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum = 0;			
			//(1) ����
			coinNum = money/coinUnit[i];	// ������ �ʿ��� ������ ����
			if(coinNum >= coin[i]) {		// �ʿ��� ������ ������ ���� �������� ���ų� ���� ���
				money = ((coinNum - coin[i]) * coinUnit[i]) + (money % coinUnit[i]); 
				coinNum = coin[i];
				coin[i] -= coinNum;
			} else {						// �ʿ��� ������ ������ ���� �������� ���� ���
				money %= coinUnit[i];
				coin[i] -= coinNum;
			}
			//(1) ��
			System.out.println(coinUnit[i] + "��" + coinNum);
		}
		
		if(money > 0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0);	// ���α׷� ����
		}
		
		//���� ������ ������ ���� ��쿡�� ���
		System.out.println("=���� ������ ���� =");
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "��" + coin[i]);
		}
		
	}

}
