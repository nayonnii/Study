package Exercise;

public class PrintfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "www.codechobo.com";
		
		//%f는 소수점 아래 6자리까지만 출력, 소수점 아래 7자리에서 반올림함 
		//%e는 지수형태로 출력
		//%g는 일반, 지수 중 간략하게 표현되는 방법으로 출력(소숫점 포함 7자리?) 
		float f1 = .10f;		//0.100000f
		float f2 = 1e1f;		//1 * 10^1f = 10.000000f
		float f3 = 3.14e3f;		//3.14 * 10^3f = 3140.000000f 
		double d = 1.23456789;
		
		System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);			//d=1.123566789
		System.out.printf("d=%14.10f%n", d);	//저장공간 14자리, 소수점 10자리까지 출력
		System.out.printf("d=%014.10f%n", d);	//저장공간 14자리, 소수점 10자리까지 출력

		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);				//저장공간 20자리
		System.out.printf("[%-20s]%n", url);			//저장공간 20자리, 좌측정렬
		System.out.printf("[%.8s]%n", url);				//왼쪽에서 8글자만 출력
	}

}
