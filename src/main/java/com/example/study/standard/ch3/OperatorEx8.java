package Exercise;

public class OperatorEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b;	//a*b의 결과값은 int형이라서 오버플로우 된 상태로 출력됨
		
		System.out.println(c);
	}

}
