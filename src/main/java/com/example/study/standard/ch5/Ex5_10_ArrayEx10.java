package com.example.study.standard.ch5;

import java.util.Arrays;

public class Ex5_10_ArrayEx10 {
//�����ϱ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {	//numArr ��ҿ� ������ �� ����
			System.out.print(numArr[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		for(int i=0; i<numArr.length-1; i++) {	//i<9 -> i�� 0~8
			boolean changed = false;	//�ڸ��ٲ��� �߻��ߴ��� üũ�Ѵ�.
			
			for(int j=0; j<numArr.length-1-i;j++) {	//j<9-0, 9-1 ,,, 9-8 -> j�� 9~1
				if(numArr[j] > numArr[j+1]) {	//���� ���� ������ ���� �ٲ۴�.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;
				}
			}
			
			if (!changed) break;	//�ڸ��ٲ��� ������(changed�� false�̸�) �ݺ����� �����.
			
			for(int k=0; k<numArr.length;k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}
	}

}
