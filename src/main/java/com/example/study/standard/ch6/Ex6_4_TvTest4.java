package com.example.study.standard.ch6;

class Tv4{
	//Tv�� �Ӽ�(�������)
	String color;	//����
	boolean power;	//��������(on/off)
	int channel;	//ä��
	
	//Tv�� ���(�޼���)
	void power() {power = !power;}	//Tv�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() {++channel;}	//Tv�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() {--channel;}	//Tv�� ä���� ���ߴ� ����� �ϴ� �޼���
}

public class Ex6_4_TvTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv[] tvArr = new Tv[3];	//���̰� 3�� Tv��ü �迭
		
		//Tv��ü�� �����ؼ� Tv��ü �迭�� �� ��ҿ� ����
		for(int i=0; i<tvArr.length; i++){
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
		
			}

}
