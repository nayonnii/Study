package com.example.study.algorithm.programmers.lv0;
/*
문제: 덧셈식 출력하기 https://school.programmers.co.kr/learn/courses/30/lessons/181947
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prg181947 {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inputToken = new StringTokenizer(reader.readLine());
        int num1 = Integer.parseInt(inputToken.nextToken());
        int num2 = Integer.parseInt(inputToken.nextToken());
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void main(String[] args) throws IOException {
        new Prg181947().solution();
    }
}
