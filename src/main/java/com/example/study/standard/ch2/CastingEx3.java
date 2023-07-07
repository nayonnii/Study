package Exercise;

public class CastingEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double)f;
		
		System.out.printf("f = %20.18f\n", f);	//f와 d에 같은 값을 저장했지만 정밀도가 달라 출력값 상이
		System.out.printf("d = %20.18f\n", d);
		System.out.printf("d2 = %20.18f\n", d2);
	}

}
