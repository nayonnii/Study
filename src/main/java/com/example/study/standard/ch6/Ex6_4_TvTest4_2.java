package Exercise;

class Time{
	private int hour;
	private int minute;
	private float second;
	
	public int getHour() {return hour;}
	public int getMinute() {return minute;}
	public float getSecond() {return second;}
	
	public void setHour(int h) {
		if(!(0<=h && h<=23)) {
			return;
		}
		hour = h;
	}
	
	public void setMinute(int m) {
		if(!(0<=m && m<=59)) {
			return;
		}
		minute = m;
	}
	
	public void setSecond(float s) {
		if(!(0.0f<=s && s<=59.99f)) {
			return;
		}
		second = s;
	}
}

public class Ex6_4_TvTest4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time t = new Time();
		System.out.printf("����ð���" + t.getHour() + "��" + t.getMinute() + "��" + t.getSecond() + "�� �Դϴ�.");
		}
}