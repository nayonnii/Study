package com.example.study.algorithm.programmers.lv0;
/*
문제: a와 b 출력하기 https://school.programmers.co.kr/learn/courses/30/lessons/181951
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prg181951 {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer numToken = new StringTokenizer(reader.readLine());
        String a = numToken.nextToken();
        String b = numToken.nextToken();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) throws IOException {
        new Prg181951().solution();
    }
}
