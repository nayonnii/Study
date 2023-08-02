package com.example.study.algorithm.programmers.lv0;

/*
문제: 더 크게 합치기 https://school.programmers.co.kr/learn/courses/30/lessons/181939
*/
public class Prg181939 {
    public int solution(int a, int b) {

        int aFirst = Integer.parseInt(a + "" + b);
        int bFirst = Integer.parseInt(b + "" + a);

        if (aFirst < bFirst) return bFirst;
        return aFirst;
    }
}
