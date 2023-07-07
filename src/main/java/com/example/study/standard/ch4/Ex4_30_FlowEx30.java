package com.example.study.standard.ch4;

public class Ex4_30_FlowEx30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum이 100보다 커지면 반복문 종료
		int sum = 0, i=0;
		
		while(true) {
			if(sum > 100) {
				break;	
			}
			i++;	//i++?
			sum = sum + i;
		}
		System.out.println("i="+ i);
		System.out.println("sum="+ sum);
	}

}
