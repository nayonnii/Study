
package Exercise;

class MyMath2{
	long a, b;
	
	//인스턴스변수 a, b,만을 이용해서 작업하므로 매개변수가 필요없다.
	long add() {return a+b;}		//a,b는 인스턴스 변수
	long substract() {return a-b;}
	long multiply() {return a*b;}
	double divide() {return a/b;}
	
	//인스턴스변수와 관계 없이 매개변수만으로 작업이 가능하다.
	static long add(long a, long b) {return a+b;}	//a,b는 지역변수
	static long substract(long a, long b) {return a-b;}
	static long multiply(long a, long b) {return a*b;}
	static double divide(long a, long b) {return a/b;}
}

public class Ex6_19_MyMathTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.substract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		
		MyMath2 mm = new MyMath2();	//인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
	}
}

