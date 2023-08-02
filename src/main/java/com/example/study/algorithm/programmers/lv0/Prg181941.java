package com.example.study.algorithm.programmers.lv0;
/*
문제: 문자 리스트를 문자열로 변환하기 https://school.programmers.co.kr/learn/courses/30/lessons/181941
*/
public class Prg181941 {
    public String solution(String[] arr){
        String result = "";

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == null) break;
            result += arr[i];
        }
        return result;
    }
}
