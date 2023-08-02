package com.example.study.algorithm.programmers.lv0;
/*
문제: 문자열 섞기 https://school.programmers.co.kr/learn/courses/30/lessons/181942
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg181942 {
    public String solution(String str1, String str2) throws IOException {
        String result = "";
        int str1Idx = 0;
        int str2Idx = 0;

        for(int i = 0; i < str1.length() * 2; i++) {
            if(i % 2 == 0) {
                result += str1.substring(str1Idx, str1Idx + 1);
                str1Idx++;
            } else {
                result += str2.substring(str2Idx, str2Idx + 1);
                str2Idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = reader.readLine();
        String str2 = reader.readLine();

        System.out.println(new Prg181942().solution(str1, str2));
    }
}
