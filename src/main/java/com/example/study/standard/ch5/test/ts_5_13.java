package test;

import java.util.Scanner;

public class ts_5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();	//String�� char[]�� ��ȯ
			
			//(1) ����
			int num = (int)(Math.random() * question.length);
			char tmp = ' ';
			
			tmp = question[i];
			question[i] = question[num];
			question[num] = tmp;
			//(1) ��
			
			System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>", i+1, new String(question));	//char�迭�� �ٽ� String���� ��ȯ�Ѱǰ�?
			
			String answer = scanner.nextLine();
			
			//trim���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
			if(words[i].equals(answer.trim()))
				System.out.printf("�¾ҽ��ϴ�. %n%n");
			else
				System.out.printf("Ʋ�Ƚ��ϴ�. %n%n");
		}
	
	}

}