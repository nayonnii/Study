package com.example.study.algorithm.string;

public class AlphaToInteger {
    // String타입의 숫자 문자열을 int형 숫자로 변환하기

    public int solution(String str) {


        int[] strTochar = new int[str.length()];    // str요소를 숫자로 변환하여 담을 배열
        int start = 0;  // str 요소 검사 시작점
        boolean isNegative = false;   // 음수 여부

        // str이 음수인지 판별
        // 음수일 경우, start지점을 하나 건너 뜀
        if(str.indexOf('-') == 0) {
            start++;
            isNegative = true;
        }

        // 문자열을 하나씩 숫자로 변환하여 배열에 저장
        for(int i = start; i < str.length(); i++){
            strTochar[i] = str.charAt(i) - '0';
        }

        int result = 0; // 결과
        int weight = 1; // 가중치

        for(int i = strTochar.length - 1; i >= start; i--) {
            // 1, 10, 10*10 ...
            result += strTochar[i] * weight;
            weight *= 10;
//            System.out.println("i = " + i + "result = " + result);
        }

        // str이 음수일 경우 결과값에 '-' 붙임
        if(isNegative) {
            return -result;
        }
        return result;
    }

    public static void main(String[] args) {
        AlphaToInteger alphaToInteger = new AlphaToInteger();
        System.out.println(alphaToInteger.solution("12345"));
        System.out.println(alphaToInteger.solution("-12345"));
        System.out.println(alphaToInteger.solution("12345") + alphaToInteger.solution("-12345"));
    }
}
