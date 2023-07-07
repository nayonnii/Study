package test;

public class ts_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfApples = 123;	//사과의 개수
		int sizeOfBucket = 10;	//바구나의 크기(바구니에 담을 수 있는 사과의 개수)
		//		int numOfBucket = (numOfApples%sizeOfBucket) == 0 ? numOfBucket : numOfBucket + 1;
		int numOfBucket = (numOfApples / sizeOfBucket) + (numOfApples % sizeOfBucket > 0 ? 1 : 0);
		System.out.println(numOfBucket);
	}

}
