package com.example.study.algorithm.programmers.lv0;
/*
문제: 대소문자 바꿔서 출력하기 https://school.programmers.co.kr/learn/courses/30/lessons/181949
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg181949 {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String info = reader.readLine();
        String[] infoArr = info.split("");
        StringBuilder result = new StringBuilder();

        // 방법1) for문, split() 활용
//        for (int i = 0; i < info.length(); i++) {
//            char alpha = infoArr[i].charAt(0);
//            // 대문자일 경우
//            if (alpha < 'a') {
//                result.append((char)(alpha + ('a' - 'A')));
//            }
//            // 소문자일 경우
//            else {
//                result.append((char)(alpha - ('a' - 'A')));
//
//            }
//        }
        // 방법2) for each문, toCharArray() 활용
        for (char alpha : info.toCharArray()) {
            // 대문자일 경우
            if (alpha < 'a') {
                result.append((char)(alpha + ('a' - 'A')));
            }
            // 소문자일 경우
            else {
                result.append((char)(alpha - ('a' - 'A')));

            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        new Prg181949().solution();
    }
}
