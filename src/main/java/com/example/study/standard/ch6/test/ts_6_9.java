package test;

class Marine{
	int x = 0, y = 0;	//Marine의 위치좌표(x,y)
	int hp = 60;		//현재 체력
	static int weapon = 6;		//공격력
	static int armor = 0;		//방어력
		//방여력, 공격력은 모든 병사가 같아야하기 때문에 static변수여야 한다.
		//그러므로 static변수를 사용하는 weaponUp(), armorUp() 메서드도 static을 붙여야 한다..
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
