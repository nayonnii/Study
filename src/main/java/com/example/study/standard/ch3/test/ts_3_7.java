package test;

public class ts_3_7 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)(((5/9f * (fahrenheit - 32)) * 100) + 0.5) / 100.0f;
		//5/9의 몫은 0이기 때문에 반드시 실수형으로 결과값을 받아야 함
		System.out.println("Fahrenheit:" + fahrenheit);
		System.out.println("Celcius:" + celcius);

	}
}
