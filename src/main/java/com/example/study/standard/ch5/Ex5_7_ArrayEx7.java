package Exercise;
public class Ex5_7_ArrayEx7 {
//����(shuffle)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i;	//�迭�� ���ڸ� 0~9�� ���ڷ� �ʱ�ȭ�Ѵ�.
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random() * 10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int i=0; i<numArr.length;i++) {
			System.out.print(numArr[i]);
		}
		
		System.out.println();
		for(int i=0; i<10; i++) {
			int n = (int)(Math.random() * 10);
			System.out.print(n);
		}
	}

}
