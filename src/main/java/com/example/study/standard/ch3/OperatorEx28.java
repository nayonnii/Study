package Exercise;
//import java.util.*;

public class OperatorEx28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x = 0xAB, y=0xF;
			
			System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
			System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
			System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x|y, toBinaryString(x|y));
			System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x&y, toBinaryString(x&y));
			System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x^y, toBinaryString(x^y));
			System.out.printf("%#X ^ %#X ^ %#X = %#X \t%s%n", x, y, y, x^y^y, toBinaryString(x^y^y));
	}
	
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length() - 32);		//substring(i) : i번째 문자부터 끝까지 출력
	}
}
