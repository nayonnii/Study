package test;

class Marine{
	int x = 0, y = 0;	//Marine�� ��ġ��ǥ(x,y)
	int hp = 60;		//���� ü��
	static int weapon = 6;		//���ݷ�
	static int armor = 0;		//����
		//�濩��, ���ݷ��� ��� ���簡 ���ƾ��ϱ� ������ static�������� �Ѵ�.
		//�׷��Ƿ� static������ ����ϴ� weaponUp(), armorUp() �޼��嵵 static�� �ٿ��� �Ѵ�..
	static void weaponUp() {
		weapon++;
	}
	
	static void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ts_6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
