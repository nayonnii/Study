package test;

import java.util.Scanner;

public class ts_5_12 {
//������ �迭 - �ܾ� ���߱�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words = {
				{"chair", "����"},		//words[0][0], words[0][1]
				{"computer", "��ǻ��"},	//words[1][0], words[1][1]
				{"integer", "������"}		//words[2][0], words[2][1]
		};
		
		int count = 0; //5-23�������� �߰�
	
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s�� ���� �����Դϱ�?", i+1, words[i][0]);
			String answer = scanner.nextLine();
			
			if(answer.equals(words[i][1])) {
				System.out.printf("�����Դϴ�. %n");
			}else {
				count++;
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�. %n", words[i][1]);
			}
			System.out.println();
		}
		//5-23�������� �Ʒ� ���� �߰�
		System.out.printf("��ü %d���� �� %d���� ���߼̽��ϴ�.", words.length, words.length - count);
		
			}

}