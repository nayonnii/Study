package com.example.study.algorithm.programmers.lv0;

/*
문제: 조건 문자열 https://school.programmers.co.kr/learn/courses/30/lessons/181934
*/
public class Prg181934 {
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals("<") && eq.equals("=")) {
            return (n <= m ? 1 : 0);
        }
        if(ineq.equals("<") && eq.equals("!")) {
            return (n < m ? 1 : 0);
        }
        if(ineq.equals(">") && eq.equals("=")) {
            return (n >= m ? 1 : 0);
        }
        if(ineq.equals(">") && eq.equals("!")) {
            return (n > m ? 1 : 0);
        }
        return 0;
    }
}


