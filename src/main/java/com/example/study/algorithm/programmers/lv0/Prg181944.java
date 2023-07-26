package com.example.study.algorithm.programmers.lv0;
/*
문제: 홀짝 구분하기 https://school.programmers.co.kr/learn/courses/30/lessons/181944
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg181944 {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        // 방법1) if문 사용
        if(num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

        // 방법2) 삼항연산자 사용
//        System.out.println(num % 2 == 0 ? num + " is even" : num + " is odd");
    }

    public static void main(String[] args) throws IOException {
        new Prg181944().solution();
    }
}
