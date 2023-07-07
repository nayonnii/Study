package test;

//1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
public class ts_4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;	//더할 횟수
		int num=0;	//더할 숫자
		int sum = 0;//더한 숫자의 합

		while(true) {
			i++;
			num = i;
			if(i%2 == 0) {
				num = -i;
			}
			sum += num;
			System.out.println("i=" + i + ", sum=" + sum);

			if(sum >= 100) break;
		}
		System.out.println(i + "번 더해야 총합이" + sum + "이 된다.");

	}
}
