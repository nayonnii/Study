package Exercise;

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}

public class Ex6_5_TvTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Card.width= " + Card.width);	//클래스 변수(static)은 인스턴스를 생성하지 않고도 사용 가능
		System.out.println("Card.width= " + Card.height);	//클래스 변수(static)은 인스턴스를 생성하지 않고도 사용 가능
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");	//static 변수는 Card.width, Card.height로 쓰는 것을 권장
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		
		c1.width = 50;
		c1.height = 70;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		
	}
}