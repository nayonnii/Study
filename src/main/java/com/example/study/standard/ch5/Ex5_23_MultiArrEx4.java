package com.example.study.standard.ch5;

import java.util.Scanner;

public class Ex5_23_MultiArrEx4 {
//������ �迭 - �ܾ� ���߱�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words = {
				{"chair", "����"},		//words[0][0], words[0][1]
				{"computer", "��ǻ��"},	//words[1][0], words[1][1]
				{"integer", "������"}		//words[2][0], words[2][1]
		};
	
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s�� ����?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {	//���ڿ��� equals ���� �� ���� ����!!!!!!!!
				System.out.println("�����Դϴ�.");
			}else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s �Դϴ�.%n%n", words[i][1]);
			}
		}
	}

}