package com.example.study.algorithm.programmers.lv0;
/*
문제: 문자열 반복해서 출력하기 https://school.programmers.co.kr/learn/courses/30/lessons/181950
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prg181950 {
    public String solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inputToken = new StringTokenizer(reader.readLine());
        String str = inputToken.nextToken();
        int count = Integer.parseInt(inputToken.nextToken());
        String result ="";

        for(int i = 0; i < count; i++) {
            result += str;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Prg181950().solution());
    }
}
