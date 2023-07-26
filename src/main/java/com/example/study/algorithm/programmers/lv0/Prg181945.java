package com.example.study.algorithm.programmers.lv0;
/*
문제: 문자열 돌리기 https://school.programmers.co.kr/learn/courses/30/lessons/181945
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg181945 {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = reader.readLine();

        for(int i = 0; i < inputStr.length(); i++) {
            System.out.println(inputStr.charAt(i));
        }
    }

    public static void main(String[] args) throws IOException {
        new Prg181945().solution();
    }
}
