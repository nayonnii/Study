package Exercise;

class Tv{
	//Tv�� �Ӽ�(�������)
	String color;	//����
	boolean power;	//��������(on/off)
	int channel;	//ä��
	
	//Tv�� ���(�޼���)
	void power() {power = !power;}	//Tv�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() {++channel;}	//Tv�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() {--channel;}	//Tv�� ä���� ���ߴ� ����� �ϴ� �޼���
}

public class Ex6_1_TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;			//Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		t = new Tv();	//Tv�ν��Ͻ� ����
		t.channel = 7;	//Tv�ν��Ͻ��� ����Ǽ� channel�� ���� 7�� ����
		t.channelDown();//Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ��
		System.out.println("���� ä���� " + t.channel + " �Դϴ�.");
	}

}
