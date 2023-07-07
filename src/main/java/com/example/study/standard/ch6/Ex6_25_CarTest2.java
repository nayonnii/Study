package Exercise;

class Car11 {
	String color;
	String gearType;
	int door;
	
	Car11(){
		this("white", "auto", 4);
	}
	
	Car11(String color) {
		this(color, "auto", 4);
	}
	
	Car11(String color, String gearType, int door){
		this.color = color;		//this.color는 인스턴스 변수, color는 매개변수
		this.gearType = gearType;
		this.door = door;
	}
}

public class Ex6_25_CarTest2 {
	
	public static void main(String[] args) {
	Car11 c1 = new Car11();
	Car11 c2 = new Car11("blue");
	
	System.out.println("c1의 color=" + c1.color + ", gearType = " + c1.gearType + ", door= " + c1.door);
	System.out.println("c2의 color=" + c2.color + ", gearType = " + c2.gearType + ", door= " + c2.door);
	
	}
}

