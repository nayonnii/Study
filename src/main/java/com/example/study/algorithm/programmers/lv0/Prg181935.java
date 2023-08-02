package com.example.study.algorithm.programmers.lv0;

/*
문제: 홀짝에 따라 다른 값 반환하기 https://school.programmers.co.kr/learn/courses/30/lessons/181935
*/
public class Prg181935 {
    public int solution(int n) {
        int sum = 0;

        if (n % 2 == 0) {
            for (int i = 0; i <= n; i += 2) {
                sum += Math.pow(i, 2);
            }
        } else {
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
        }
        return sum;
    }
}


