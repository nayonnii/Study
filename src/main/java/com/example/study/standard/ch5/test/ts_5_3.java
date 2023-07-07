package com.example.study.standard.ch5.test;

public class ts_5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
//(1) Ω√¿€
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
//(1) ≥°
		System.out.println("sum=" + sum);
	}

}
