package com.example.study.standard.ch3.test;

public class ts_3_7 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)(((5/9f * (fahrenheit - 32)) * 100) + 0.5) / 100.0f;
		//5/9�� ���� 0�̱� ������ �ݵ�� �Ǽ������� ������� �޾ƾ� ��
		System.out.println("Fahrenheit:" + fahrenheit);
		System.out.println("Celcius:" + celcius);

	}
}
