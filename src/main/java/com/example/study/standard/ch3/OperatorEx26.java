package Exercise;

public class OperatorEx26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n", a, b);						//a=5, b=0
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);		//true  --> 첫번째 식부터 true이므로 두번째 식은 계산 안함
		System.out.printf("a=%d, b=%d%n", a, b);						//a=5, b=0
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);		//false	--> 첫번째 식부터 false이므로 두번째 식은 계산 안함
		System.out.printf("a=%d, b=%d%n", a, b);						//a==5, b=0 --> 두번째 식(b식)은 모두 계산되지 않았으므로 b=0 유지
	}

}
