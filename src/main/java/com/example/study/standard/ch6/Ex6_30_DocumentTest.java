package com.example.study.standard.ch6;

public class Ex6_30_DocumentTest {
	static int count = 0;
	String name;	//문서명(Document name)
	
	Ex6_30_DocumentTest(String name){
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
	
	Ex6_30_DocumentTest() {	//문서 생성 시 문서명을 지정하지 않았을 때의 문서명
		this("제목없음" + ++count);
	}
	
	public static void main(String[] args) {
		Ex6_30_DocumentTest d1 = new Ex6_30_DocumentTest();
		Ex6_30_DocumentTest d2 = new Ex6_30_DocumentTest("자바.txt");
		Ex6_30_DocumentTest d3 = new Ex6_30_DocumentTest();
		Ex6_30_DocumentTest d4 = new Ex6_30_DocumentTest();
		}
}

