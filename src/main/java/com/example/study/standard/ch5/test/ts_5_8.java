package test;

public class ts_5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length; i++) {
			//(1) 시작
			switch(answer[i]) {
			case 1 :
				counter[0]++;
				break;
			case 2 :
				counter[1]++;
				break;
			case 3 :
				counter[2]++;
				break;
			case 4 :
				counter[3]++;
				break;
			}			
			//(1) 끝
		}
		
		for(int i=0; i<counter.length; i++) {
			//(2) 시작
			System.out.print(counter[i]);
			for(int j=0; j<counter[i]; j++) {
				System.out.print("*");
			}
			//(2) 끝
			System.out.println();
		}
	}

}
