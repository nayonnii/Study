package test;

//1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
public class ts_4_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=1;	//값의 부호를 바꿔주는데 사용할 변수
		int num=0;	//더할 숫자
		int sum = 0;//총합을 저장할 변수

		//조건식의 값이 true이므로 무한반복문이 된다.
//		for(int i = 1; true; i++, s=-s) {//매 반복마다 s의 값은 1, -1, 1...
//			num = i * s;
//			sum += num;
//			
//		if(sum>=100) break;
//		}
		for(int i = 1; sum<100; i++, s=-s) {
			num = i * s;
			sum += num;
		}
		
	System.out.println("num=" + num);
	System.out.println("sum=" + sum);
	}
}
