package com.example.study.standard.ch6.test;

class SutdaCard2{
	int num;
	boolean isKwang;

	SutdaCard2(){
		this(1,true);
	};	//�⺻������
	
	SutdaCard2(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang == true ? "K" : "");
	}
}


public class ts_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard2 card1 = new SutdaCard2(3, false);
		SutdaCard2 card2 = new SutdaCard2();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		}

}
