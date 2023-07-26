package com.example.study.algorithm.programmers.lv0;
/*
문제: 문자열 겹쳐쓰기 https://school.programmers.co.kr/learn/courses/30/lessons/181943
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg181943 {
    public String solution(String myString, String overwriteString, int s) {
        String myStringStart = myString.substring(0, s);

        String result = "";

        if(myString.length() <= s + overwriteString.length()) {
            result = myStringStart + overwriteString;
        } else {
            String myStringEnd = myString.substring(s + overwriteString.length());
            result = myStringStart + overwriteString + myStringEnd;
        }

        return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String myString = reader.readLine();
        String overwriteString = reader.readLine();
        int s = Integer.parseInt(reader.readLine());
        System.out.println(new Prg181943().solution(myString, overwriteString, s));

    }
}

/*
[입력값1]
He11oWor1d
lloWorl
2

[입력값2]
Program29b8UYP
merS123
7
*/
