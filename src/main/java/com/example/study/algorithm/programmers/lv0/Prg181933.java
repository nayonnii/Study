package com.example.study.algorithm.programmers.lv0;

/*
문제: flag에 따라 다른 값 반환하기 https://school.programmers.co.kr/learn/courses/30/lessons/181933
*/
public class Prg181933 {
    public int solution(int a, int b, boolean flag) {
        return (flag == true ? a + b : a - b);
    }
}


