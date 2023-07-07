
package com.example.study.standard.ch6;

public class Ex6_15_FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = factorial(4);	//원랜 Ex6_15_FactorialTest.factorial(4)라고 표기해야하지만 같은 클래스 안에 있으므로 클래스명 생략 가능
		
		System.out.println(result);
	}
	
//	static int factorial(int n) {
//		int result=0;
//		
//		if(n==1) {
//			result=1;
//		}else {
//			result = n * factorial(n-1);	//메서드 자신을 재호출한다.
//		}
//	return result;
//	}

	static int factorial(int n) {
		if(n==1) return 1;
		return n * factorial(n-1);
	}
	
//	static int factorial(int n) {
//		int result = 1;
//		while(n != 0)
//			result *= n--;
//		return result;
//	}
//}
}

