package com.example.study.algorithm.programmers.lv0;
/*
문제: 문자열 붙여서 출력하기 https://school.programmers.co.kr/learn/courses/30/lessons/181946
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prg181946 {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inputToken = new StringTokenizer(reader.readLine());
        System.out.println(inputToken.nextToken() + inputToken.nextToken());
    }

    public static void main(String[] args) throws IOException {
        new Prg181946().solution();
    }
}
