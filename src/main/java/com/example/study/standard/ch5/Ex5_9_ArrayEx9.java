package com.example.study.standard.ch5;

import java.util.Arrays;

public class Ex5_9_ArrayEx9 {
//������ ������ �迭 ä���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] code = {-4, -1, 3, 6, 11};
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {	//i<10
			int tmp = (int)(Math.random()*code.length);	//Math.random()*5 -> 0~4���� ���� ����
			arr[i] = code[tmp];
		}
		System.out.println(Arrays.toString(arr));
	
	}

}
