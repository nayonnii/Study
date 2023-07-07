package test;

public class ts_6_20 {
	static int[] shuffle(int[] arr){
		//매개변수 유효성체크 필수
		if(arr == null || arr.length == 0) {
			return arr;	// 배열의 값이 null이거나 크기가 0이면 배열 그대로 반환
		}
		
		for(int i = 0; i<arr.length; i++) {
			int random = ((int)Math.random() * arr.length) + 1;
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
	
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
