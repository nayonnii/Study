package com.example.study.standard.ch5;

import java.util.Arrays;

public class Ex5_10_ArrayEx10 {
//정렬하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {	//numArr 요소에 임의의 수 저장
			System.out.print(numArr[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		for(int i=0; i<numArr.length-1; i++) {	//i<9 -> i는 0~8
			boolean changed = false;	//자리바꿈이 발생했는지 체크한다.
			
			for(int j=0; j<numArr.length-1-i;j++) {	//j<9-0, 9-1 ,,, 9-8 -> j는 9~1
				if(numArr[j] > numArr[j+1]) {	//옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;
				}
			}
			
			if (!changed) break;	//자리바꿈이 없으면(changed가 false이면) 반복문을 벗어난다.
			
			for(int k=0; k<numArr.length;k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}
	}

}
