package test;

//(1)~(2)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
public class ts_4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 ������ ������ ���� �� answer�� �����Ѵ�.
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;	//������Է��� ������ ����
		int count = 0;	//�õ�Ƚ���� �������� ����
		
		//ȭ�����κ��� ������Է��� �ޱ� ���ؼ� ScannerŬ���� ���
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			input = s.nextInt();//�Է¹��� ���� ���� input�� �����Ѵ�.

			if(input == answer) {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ����" + count + "���Դϴ�.");
				break;
			}else if(input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
//				continue;
			}else if(input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���.");
//				continue;
			}
		}while(true);	//���ѹݺ���
		}
}

