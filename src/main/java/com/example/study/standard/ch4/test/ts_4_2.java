package test;

//1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
public class ts_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i<=20; i++){
			if(!(i%2==0 || i%3==0)){
			sum+=i;
		}
//			System.out.println("i=" + i);
//			System.out.println("sum= " + sum);
		}
		System.out.println("����: " + sum);
	}

}
