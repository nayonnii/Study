package com.example.study.standard.ch5;
public class Ex5_5_ArrayEx5 {
//���հ� ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;		//������ �����ϱ� ���� ����
		float average = 0f;	//����� �����ϱ� ���� ����
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}
		average = sum / (float)score.length;	//������� float�� ��� ���� ����ȯ
		
		System.out.println("����: " + sum);
		System.out.println("���: " + average);
	}

}
