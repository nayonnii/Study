
package Exercise;

class MyMath2{
	long a, b;
	
	//�ν��Ͻ����� a, b,���� �̿��ؼ� �۾��ϹǷ� �Ű������� �ʿ����.
	long add() {return a+b;}		//a,b�� �ν��Ͻ� ����
	long substract() {return a-b;}
	long multiply() {return a*b;}
	double divide() {return a/b;}
	
	//�ν��Ͻ������� ���� ���� �Ű����������� �۾��� �����ϴ�.
	static long add(long a, long b) {return a+b;}	//a,b�� ��������
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
		
		MyMath2 mm = new MyMath2();	//�ν��Ͻ� ����
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
	}
}

