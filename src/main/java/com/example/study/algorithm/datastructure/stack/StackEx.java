package com.example.study.algorithm.datastructure.stack;

public class StackEx {
    int[] stackArr = new int[10];
    int top = 0;

    // push
    public void push(int num) {
        if(isFull()) {
            throw new RuntimeException("Stack is full");
        }
        stackArr[top++] = num;
    }

    // pop
    public int pop() {
        if(isEmpty()) {
            throw new RuntimeException(("Stack is Empty"));
        }
        int result = stackArr[top - 1];
        top--;
        return result;
    }

    // peek
    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException(("Stack is Empty"));
        }
        return stackArr[top - 1];
    }

    // isEmpty
    public boolean isEmpty() {
        return top == 0;
    }

    // ifFull
    public boolean isFull() {
        return top > stackArr.length - 1;
    }

    public static void main(String[] args) {
        StackEx stack = new StackEx();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
