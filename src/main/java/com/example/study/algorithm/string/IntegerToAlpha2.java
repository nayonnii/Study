package com.example.study.algorithm.string;

public class IntegerToAlpha2 {
    // 숫자를 문자열로 만들기_StringBuilder만 활용

    public String solution(int num) {
        StringBuilder answerBuilder = new StringBuilder();
        boolean isNegative = false;  // 음수 여부

        // 음수인지 확인
        if(num < 0) {
            isNegative = true;
            num *= -1;
        }

        // 각 자리의 숫자를 뒤에서부터 차례대로 조합
        while(num > 0) {
            char digitChar = (char)(num % 10 + '0');
            answerBuilder.append(digitChar);

            num /= 10;
        }

        // num이 음수였을 경우 뒤에 '-' 붙여줌
        if(isNegative) answerBuilder.append('-');

        // 조합한 문자를 거꾸로 반환
        return answerBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        IntegerToAlpha2 integerToAlpha = new IntegerToAlpha2();
        System.out.println(integerToAlpha.solution(12345));
        System.out.println(integerToAlpha.solution(-12345));
        System.out.println(integerToAlpha.solution(12345) + integerToAlpha.solution(-12345));
    }
}
