package test;

//1+(-2)+3+(-4)+...�� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�.
public class ts_4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;	//���� Ƚ��
		int num=0;	//���� ����
		int sum = 0;//���� ������ ��

		while(true) {
			i++;
			num = i;
			if(i%2 == 0) {
				num = -i;
			}
			sum += num;
			System.out.println("i=" + i + ", sum=" + sum);

			if(sum >= 100) break;
		}
		System.out.println(i + "�� ���ؾ� ������" + sum + "�� �ȴ�.");

	}
}
