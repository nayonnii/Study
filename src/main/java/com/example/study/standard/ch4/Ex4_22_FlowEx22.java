package Exercise;

public class Ex4_22_FlowEx22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0; i< arr.length; i++) {
			System.out.printf("%d", arr[i]);
			System.out.println();
		}
		
		for(int tmp: arr) {
			System.out.printf("%4d", tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println("sum=" + sum);
	}

}
