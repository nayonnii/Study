package com.example.study.algorithm.datastructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class ParTest {
    // 괄호검사: 괄호의 짝이 잘 맞는지 검사

    public boolean solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        Stack<Character> stack = new Stack<>();

        int size = str.length();

        // 1. str 문자열 길이만큼 순회
        for(int i = 0; i < size; i++) {
            int next = str.charAt(i);

            // 2. 다음 문자가 열린 괄호일 경우 push
            if(next == '(' || next == '{' || next == '[') {
                stack.push(str.charAt(i));
              // 3. 다음 문자가 닫힌 괄호일 경우
            } else if(next == ')' || next == '}' || next == ']') {
                // 3-1. stack이 비어 있는지 확인
                if(stack.isEmpty()) return false;

                char top = stack.pop();
                // 3-2. stack의 top 문자와 다음 문자가 짝이 맞는지 확인
                if(
                        next == ')' && top != '('
                     || next == '}' && top != '{'
                     || next == ']' && top != '['
                )
                    return false;
            }
        }
        // 4. 최종적으로 stack이 비어 있는지 확인
        if(stack.isEmpty()) return true;

       return false;
    }

    public static void main(String[] args) {
        ParTest parTest = new ParTest();
    }
}
