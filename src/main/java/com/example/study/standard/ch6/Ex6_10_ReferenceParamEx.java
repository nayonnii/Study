package Exercise;

class Data2{int x;}

public class Ex6_10_ReferenceParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);	//Data2 ��ü ��ü(��ü �ּ�)�� �Ѱ���
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data2 d) {	//������ �Ű�����
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}
