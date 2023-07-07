package Exercise;

public class Ex6_27_BlockTest {

	static {	//클래스 초기화 블럭
		System.out.println("static { }");
	}
	
	{	//인스턴스 초기화 블럭
		System.out.println();
	}
	
	public Ex6_27_BlockTest() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest()");
		Ex6_27_BlockTest bt = new Ex6_27_BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest()");
		Ex6_27_BlockTest bt2 = new Ex6_27_BlockTest();
		
	}
}

