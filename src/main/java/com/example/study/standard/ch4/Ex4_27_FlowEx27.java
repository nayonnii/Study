package Exercise;
import java.util.*;
public class Ex4_27_FlowEx27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int sum= 0;
		boolean flag = true;	//while���� ���ǽ����� ���� ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���.(�������� 0�� �Է�)");
		
		while(flag) {
			System.out.print(">>");
			
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num != 0) {
				sum += num;	//num�� 0�� �ƴϸ�, sum�� ���Ѵ�.
			} else {
				flag = false;	//num�� 0�̸�, flag�� ���� false�� ����
			}
		}
		System.out.println("�հ�: " + sum);
	}

}
