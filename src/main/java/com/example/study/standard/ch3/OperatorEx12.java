package Exercise;

public class OperatorEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';
		
		int i = c1 + 1;
		
		c3 = (char)(c1 + 1);
		c2++;	
		c2++;
		
		System.out.println("i=" + i);
		System.out.println("c2=" + c2);	//c1의 값인 97에서 +2가 된 99의 값을 가리키는 c가 출력됨
		System.out.println("c3=" + c3);
	}

}
