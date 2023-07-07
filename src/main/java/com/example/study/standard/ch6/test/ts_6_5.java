package com.example.study.standard.ch6.test;

class Student2{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student2(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {		
		return ((int)((this.getTotal()/3.0f)*10 + 0.5f))/10.0f;
	}
	
	String info() {
		return name 
				+ "," 
				+ ban + "," 
				+ no + "," 
				+ kor + "," 
				+ eng + "," 
				+ math + "," 
				+ this.getTotal() 
				+ "," + this.getAverage();
	}
}
	


public class ts_6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s = new Student2("ȫ�浿", 1, 1, 100, 60, 76);
		System.out.println(s.info());
				}

}
