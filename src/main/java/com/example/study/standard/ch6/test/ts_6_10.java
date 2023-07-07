package com.example.study.standard.ch6.test;

public class ts_6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 6-10 ~ 6-19 문제풀기
10) b, d (e-> 오버로딩이 뭐더라)
 => b, e
 => d: 생성자가 '하나도' 없으면 컴파일러가 기본 생성자를 추가해줌
 => e: 생성자는 오버로딩이 가능해서 여러 개 생성이 가능함
11) b, c
 => b
 => c: this는 모든 인스턴스메서드에 숨겨진 채로 존재하는 지역변수로, 인스턴스메서드 내에서만 사용 가능 
12) c, d
13) b, c?, d => c도 매개변수 타입이 다르므로 올바름
14) c, d?, e
 => c, e
 => d: 명시적초기화를 제일 우선적으로 고려해야함
15) c
 => a: 인스턴스변수의 초기화 순서: 기본값 - 명시적초기화 - 초기화블럭 - 생성자
16) a, e => e: 힙(heap)영역은 인스턴스가 생성되는 영역이며, 지역변수는 호출스택(call stack)에 생성된다.
17) b, c
 => b
18) 라인B: static메서드에 객체생성 없이 인스턴스변수 사용함
	라인D: static메서드에 객체생성 없이 인스턴스메서드 호출함
	=> A,B,D
	=> A: static 변수에 인스턴스 변수 사용 불가(객체 생성 후 사용 가능)
19) ABC123
 	After change:ABC123456 => ABC123
 */
	
	
	}
}
