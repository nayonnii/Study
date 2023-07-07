package Exercise;

public class OperatorEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a';
		
//		char c2 = c1+1;		//에러, 형변환 필요
		char c3 = 'a'+1;	//'a'+1은 리터럴 간 연산이라서 컴퓨터에서 알아서 97 + 1 = 98의 문자를 출력해줌
		
		System.out.println(c1);
		System.out.println(c3);
	}

}
