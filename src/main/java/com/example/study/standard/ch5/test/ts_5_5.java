package test;

public class ts_5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		
		//�迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
		for(int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp;
			//(1) ����
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
			//(1) ��	
		}
//		for(int i=0; i<ballArr.length; i++) {
//			System.out.println(ballArr[i]);
//		}
		
		//�迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
		//(2) ����
		for(int i=0; i<ball3.length; i++) {
			ball3[i] = ballArr[i];
		}
		//(2) ��
		
		for(int i=0; i<ball3.length; i++) {
			System.out.print(ball3[i]);
		}
		
	}

}
