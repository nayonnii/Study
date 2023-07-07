package Exercise;

public class OperatorEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 1_000_000 * 1_000_000;		//피연산자가 모두 int타입이라서 결과값이 초과됨
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
