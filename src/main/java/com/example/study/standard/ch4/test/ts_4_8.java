package test;

//������ 2x+4y=10�� ��� �ظ� ���Ͻÿ�.
//��, x�� y�� �����̰�, ������ ������ 0<=x<=10, 0<=y<=10�̴�.
public class ts_4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(2*x+4*y==10) {
					System.out.printf("x=%d, y=%d%n", x, y);
				}
			}
		}
	}
}

