package test;

//1+(1+2)+(1+2+3)+...+(1+2+3+...+10)�� ����� ����Ͻÿ�
public class ts_4_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int totalSum = 0;
		
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			totalSum = totalSum + sum;
	}
		System.out.println("���: " + totalSum);
	}

}
