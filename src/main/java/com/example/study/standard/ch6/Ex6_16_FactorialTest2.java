
package Exercise;

public class Ex6_16_FactorialTest2 {
	static long power(int x, int n) {
//		if(n==1) return x;
//		return x * power(x, n-1);
		
		if(n==1) {
			return x;
		}else {
			return x*power(x,n-1);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int n = 5;
		long result = 0;
		
		for(int i =1; i<=n; i++) {
			result += power(x, i);
		}
		System.out.println(result);
	}
}

