package com.example.study.algorithm.programmers.lv0;

/*
문제: 두 수의 연산값 비교하기 https://school.programmers.co.kr/learn/courses/30/lessons/181937
*/
public class Prg181937 {
    public int solution(int num, int n) {
        return (num % n == 0 ? 1 : 0);
    }
}
