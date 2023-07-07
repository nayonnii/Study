package Exercise;
public class Ex5_7_ArrayEx7 {
//섞기(shuffle)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i;	//배열의 숫자를 0~9의 숫자로 초기화한다.
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
