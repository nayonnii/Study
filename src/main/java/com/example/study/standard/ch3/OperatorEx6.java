package Exercise;

public class OperatorEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b); // int보다 작은 값의 연산이므로 byte -> int로 형변환되어 연산됨, 따라서 결과값이 int임
		System.out.println(c);
	}

}
