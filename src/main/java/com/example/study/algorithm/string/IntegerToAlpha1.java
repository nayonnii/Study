package com.example.study.algorithm.string;

import java.util.Stack;

public class IntegerToAlpha1 {
    // 숫자를 문자열로 만들기_Stack 활용

    public String solution(int num) {
        char digit; // 각 자리의 숫자
        boolean isNegative = false; // 음수 여부

        // num이 음수일 경우
        // 양수로 변환(임시), 음수여부 true
        if(num < 0) {
            num = -num;
            isNegative = true;
        }

        Stack<Character> numStack = new Stack<>(); // 각 자리의 숫자를 담을 stack

        // 마지막 자리의 숫자부터 stack에 push
        while(num > 0) {
            digit = (char)(num % 10 + '0');
            numStack.push(digit);
            num = num / 10;
        }

        String result;  // 결과값
        StringBuilder  stringBuilder = new StringBuilder();

        // stack이 비어있지 않을 때까지 pop
        while(!numStack.empty()){
            stringBuilder.append(numStack.pop());
        }

        // num이 음수였을 경우 - 붙여서 반환
        if(isNegative) {
            return ("-" + stringBuilder.toString());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        IntegerToAlpha1 integerToAlpha = new IntegerToAlpha1();
        System.out.println(integerToAlpha.solution(12345));
        System.out.println(integerToAlpha.solution(-12345));
        System.out.println(integerToAlpha.solution(12345) + integerToAlpha.solution(-12345));
    }
}
