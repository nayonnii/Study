package test;

public class ts_6_22 {
	static boolean isNumber(String str) {
		for(int i = 0; i<str.length(); i++) {
//			System.out.println(str.charAt(i));
			char ch = str.charAt(i);
		if(str == null || str.equals("") || !('0' <= ch && ch <= '9'))
			return false;
		}
		return true;	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str = "123";
	System.out.println(str + "는 숫자입니까?" + isNumber(str));
//	System.out.println(str.length());
	
	str = "1234ㅇ";
	System.out.println(str + "는 숫자입니까?" + isNumber(str));
	}
}
