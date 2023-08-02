package com.example.study.algorithm.programmers.lv0;

/*
문제: 두 수의 연산값 비교하기 https://school.programmers.co.kr/learn/courses/30/lessons/181938
*/
public class Prg181938 {
    public int solution(int a, int b) {

        int aPlusb = Integer.parseInt(a + "" + b);
        int aPlusbMultiple2 = a * b * 2;

        if (aPlusb < aPlusbMultiple2) return aPlusbMultiple2;
        return aPlusb;
    }
}
