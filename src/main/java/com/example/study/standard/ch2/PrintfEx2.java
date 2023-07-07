package com.example.study.standard.ch2;

public class PrintfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "www.codechobo.com";
		
		//%f�� �Ҽ��� �Ʒ� 6�ڸ������� ���, �Ҽ��� �Ʒ� 7�ڸ����� �ݿø��� 
		//%e�� �������·� ���
		//%g�� �Ϲ�, ���� �� �����ϰ� ǥ���Ǵ� ������� ���(�Ҽ��� ���� 7�ڸ�?) 
		float f1 = .10f;		//0.100000f
		float f2 = 1e1f;		//1 * 10^1f = 10.000000f
		float f3 = 3.14e3f;		//3.14 * 10^3f = 3140.000000f 
		double d = 1.23456789;
		
		System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);			//d=1.123566789
		System.out.printf("d=%14.10f%n", d);	//������� 14�ڸ�, �Ҽ��� 10�ڸ����� ���
		System.out.printf("d=%014.10f%n", d);	//������� 14�ڸ�, �Ҽ��� 10�ڸ����� ���

		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);				//������� 20�ڸ�
		System.out.printf("[%-20s]%n", url);			//������� 20�ڸ�, ��������
		System.out.printf("[%.8s]%n", url);				//���ʿ��� 8���ڸ� ���
	}

}
