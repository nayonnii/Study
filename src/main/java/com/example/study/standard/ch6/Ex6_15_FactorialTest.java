
package com.example.study.standard.ch6;

public class Ex6_15_FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = factorial(4);	//���� Ex6_15_FactorialTest.factorial(4)��� ǥ���ؾ������� ���� Ŭ���� �ȿ� �����Ƿ� Ŭ������ ���� ����
		
		System.out.println(result);
	}
	
//	static int factorial(int n) {
//		int result=0;
//		
//		if(n==1) {
//			result=1;
//		}else {
//			result = n * factorial(n-1);	//�޼��� �ڽ��� ��ȣ���Ѵ�.
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

