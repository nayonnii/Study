package test;

//1+(-2)+3+(-4)+...�� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�.
public class ts_4_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=1;	//���� ��ȣ�� �ٲ��ִµ� ����� ����
		int num=0;	//���� ����
		int sum = 0;//������ ������ ����

		//���ǽ��� ���� true�̹Ƿ� ���ѹݺ����� �ȴ�.
//		for(int i = 1; true; i++, s=-s) {//�� �ݺ����� s�� ���� 1, -1, 1...
//			num = i * s;
//			sum += num;
//			
//		if(sum>=100) break;
//		}
		for(int i = 1; sum<100; i++, s=-s) {
			num = i * s;
			sum += num;
		}
		
	System.out.println("num=" + num);
	System.out.println("sum=" + sum);
	}
}
