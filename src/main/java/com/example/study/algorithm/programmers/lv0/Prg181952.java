package com.example.study.algorithm.programmers.lv0;
/*
문제: 문자열 출력하기 https://school.programmers.co.kr/learn/courses/30/lessons/181952
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg181952 {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println(str);
    }

    public static void main(String[] args) throws IOException {
        new Prg181952().solution();
    }
}
