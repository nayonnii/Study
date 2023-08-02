package com.example.study.algorithm.programmers.lv0;

/*
문제: 두 수의 연산값 비교하기 https://school.programmers.co.kr/learn/courses/30/lessons/181936
*/
public class Prg181936 {
    public int solution(int number, int n, int m) {
        return (number % n == 0 && number % m == 0 ? 1 : 0);
    }
}
