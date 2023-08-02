package com.example.study.algorithm.programmers.lv0;
/*
문제: 문자열 곱하기 https://school.programmers.co.kr/learn/courses/30/lessons/181940
*/
public class Prg181940 {
    public String solution(String myString, int k){
        String result = "";
        for(int i = 0; i < k; i++) {
            result += myString;
        }
        return result;
    }
}
