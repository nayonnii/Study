package com.example.study.standard.ch11;

import java.util.ArrayList;
import java.util.List;

public class Ex11_2_ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10; // 자르고자 하는 글자의 개수 지정
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()zzz";
        int length = source.length();

        List list = new ArrayList(length / LIMIT + 10);   // 크기를 여유있게 잡음

        for (int i = 0; i < length; i += LIMIT) {
            if (i + LIMIT < length) {
                list.add(source.substring(i, i + LIMIT));
            } else {
                list.add(source.substring(i));  // substring()의 인자가 하나일 경우, 해당 인덱스부터 끝까지 반환
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
