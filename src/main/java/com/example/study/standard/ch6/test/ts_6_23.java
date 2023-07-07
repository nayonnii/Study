package test;

public class ts_6_23 {
	static int Max(int[] arr) {
		if(arr == null || arr.length == 0)
			return -999999;
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
		
//		for(int i = 0; i <arr.length; i++) {
//			for(int j = 0; j<arr.length-i-1; j++) {
//				if(arr[j] > arr[j+1]) {
//					int tmp = 0;
//
//					tmp = arr[j+1];
//					arr[j+1] = arr[j];
//					arr[j] = tmp;
//				}
//
//			}
//
//		}
//		return arr[arr.length-1];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] data = {3,2,9,4,7};
	System.out.println(java.util.Arrays.toString(data));
	System.out.println("최대값: " + Max(data));
	System.out.println("최대값: " + Max(null));
	System.out.println("최대값: " + Max(new int[] {}));	//크기가 0인 배열
	}
}
