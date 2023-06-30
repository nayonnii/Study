package com.example.study.standard.ch11;

import java.util.EmptyStackException;
import java.util.Vector;


public class Ex11_8_MyStack extends Vector {

    // push
    public Object push(Object item)  {
        addElement(item);
        return item;
    }

    // pop
    public Object pop() {
        // Stack에 저장된 마지막 요소 읽어오기
        // 만약 Stack이 비어 있으면 peek()가 EmptyStackException을 발생시킴
        Object obj = peek();
        // 마지막 요소 삭제
        removeElementAt(size() - 1);
        return obj;
    }

    // peek()
    public Object peek() {
        int len = size();

        if(len == 0) {
            throw new EmptyStackException();
        }
        return elementAt(len - 1);
    }

    // empty()
    public boolean empty() {
        return size() == 0;
    }

    public int search(Object o) {
        // 마지막부터 객체를 찾기
        // 반환값: 배열의 index
        int i = lastIndexOf(o);

        if(i >= 0) {
            // Stack은 맨 위에 저장된 객체의 index를 1로 정의
            return size() - i;
        }
        // 객체를 찾지 못하면 -1 반환
        return -1;
    }

    public static void main(String[] args) {
        Ex11_8_MyStack stack = new Ex11_8_MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.search(3));
    }
}
