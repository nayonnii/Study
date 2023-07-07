package test;

public class ts_5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
			{5, 5, 5, 5, 5},
			{10, 10, 10, 10, 10},
			{20, 20, 20, 20, 20},
			{30, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
//(1) Ω√¿€
		float num = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
			}
			num += arr[i].length;
		}
//		average = total / (arr.length * 5.0f);
		average = total/num;
		
//(1) ≥°
		System.out.println("total=" + total);
		System.out.println("average=" + average);
	}

}
