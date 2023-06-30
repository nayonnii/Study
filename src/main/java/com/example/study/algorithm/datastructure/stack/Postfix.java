package com.example.study.algorithm.datastructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Postfix {
    // 1. str길이만큼 순회한다.
    // 2. 이 때 str요소가 0~9이면 push
    // 3. str요소가 '+, -, *, /, %'이면 stack에서 2번 pop
    // 3-1. 이 때 2번 pop 할 숫자가 없다면 return -999
    // 4. 계산한 숫자는 다시 stack에 push

    // 입력값: 12+5*3/
    // 출력값: 5

    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        Stack<Integer> stack = new Stack<>();
        int result = 0;

        // str 길이만큼 순회
        for(int i = 0; i < str.length(); i++) {

            // 숫자일 경우
            if('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                // int형으로 변환하여 stack에 push
                stack.push(str.charAt(i) - '0');

            } else if(
                    // 연산자일 경우
                    str.charAt(i) == '+'
                 || str.charAt(i) == '-'
                 || str.charAt(i) == '*'
                 || str.charAt(i) == '/'
            ) {
               // stack이 비어 있을 경우
               if(stack.isEmpty()) {
                   System.out.println("stack is empty");
               }
                // 해당 문자를 연산자로 저장하고, pop 2번하여 피연산자 생성
                int op = str.charAt(i);
                int postNum = stack.pop();
                int preNum = stack.pop();

//                *확인용
//                System.out.println("op : " +  op);
//                System.out.println("postNum : " +  postNum);
//                System.out.println("preNum : " +  preNum);

                switch (op) {
                    case '+':
                        result = preNum + postNum;
                        stack.push(result);
                        break;
                    case '-':
                        result = preNum - postNum;
                        stack.push(result);
                        break;
                    case '*':
                        result = preNum * postNum;
                        stack.push(result);
                        break;
                    case '/':
                        result = preNum / postNum;
                        stack.push(result);
                        break;
                    default:
                        throw new IllegalArgumentException("invalid operator");
                }
            }
        }
        stack.pop();
        if(stack.empty()) {
            System.out.println(result);
        } else {
            System.out.println("error");
        }
    }

    public static void main(String[] args) throws IOException {
        Postfix postfix = new Postfix();
        postfix.solution();
    }
}