package com.example.study.standard.ch3.test;

public class ts_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfApples = 123;	//����� ����
		int sizeOfBucket = 10;	//�ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		//		int numOfBucket = (numOfApples%sizeOfBucket) == 0 ? numOfBucket : numOfBucket + 1;
		int numOfBucket = (numOfApples / sizeOfBucket) + (numOfApples % sizeOfBucket > 0 ? 1 : 0);
		System.out.println(numOfBucket);
	}

}
