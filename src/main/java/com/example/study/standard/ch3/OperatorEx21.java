package Exercise;

public class OperatorEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("10==10.0f	\t %b%n", 10==10.f); // 비교연산자도 이항연산자이기 때문에 연산 시 자동형변환을 통해 피연산자의 타입을 일치시켜 놓은 후 비교함
		System.out.printf("'0'==0 		\t %b%n", '0'==0);
		System.out.printf("'A'==65		\t %b%n", 'A'==65);
		System.out.printf("'A'>'B'		\t %b%n", 'A' > 'B');
		System.out.printf("'A'+1 != 'B' 	\t %b%n", 'A'+1 != 'B');
	}

}
