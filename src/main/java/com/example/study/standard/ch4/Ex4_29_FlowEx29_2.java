package com.example.study.standard.ch4;

public class Ex4_29_FlowEx29_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<=100; i++) {
			System.out.printf("i=%d", i);
			
			int tmp = i;
			
			do {
				//tmp%10�� 3�� ������� Ȯ��(0 ����)
				if((tmp%10)%3 == 0 && (tmp%10) != 0) {
					System.out.println("¦");
				} 
			}while((tmp/=10) != 0);
			
			System.out.println();
		}
	
	}

}
