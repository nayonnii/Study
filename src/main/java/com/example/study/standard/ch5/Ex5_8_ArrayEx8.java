package com.example.study.standard.ch5;
public class Ex5_8_ArrayEx8 {
//����(shuffle)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45];
		
		//�迭�� �� ����� 45���� ���� �����Ѵ�.
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;	//ball[0]���� 1�� ����ȴ�.
		}
		
		int temp = 0;	//�� ���� �ٲٴµ� ����� �ӽú���
		int j = 0;		//������ ���� �� ������ ����
		
		//�迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
		//0��°���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
		
		for(int i=0; i<6; i++) {
			j = (int)(Math.random() * 45);	//0~44�������� ������ ���� ��´�.
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		//�迭 ball�� �տ������� 6���� ��Ҹ� ����Ѵ�.
		for(int i=0; i<6; i++) {
			System.out.printf("ball[%d]=%d%n",i,ball[i]);
		}
	
	}

}
