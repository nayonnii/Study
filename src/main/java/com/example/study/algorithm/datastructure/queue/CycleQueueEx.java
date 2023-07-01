package com.example.study.algorithm.datastructure.queue;

public class CycleQueueEx {
    private final int size = 3;
    private final int offset = size + 1; // 비어있을 때와 가득 차있을 때의 상태를 다르게 정의하기 위해 size + 1을 해줌
    private final int[] arr = new int[offset];
    private int front = 0;
    private int rear = 0;

    // enQueue: 데이터 추가
    public void enQueue(int num) {
        // 다음에 데이터가 들어가는 곳: (rear + 1) % (size + 1)
        // 다음에 데이터가 나올 곳과 일치할 경우 full
        if(isFull()) {
            throw new RuntimeException("queue is full");
        }

        rear = (rear + 1) % offset;
        arr[rear] = num;
    }

    // deQueue: 데이터 회수
    public int deQueue() {
        if(isEmpty()) {
            throw new RuntimeException("queue is empty");
        }

        front = (front + 1) % offset;
        return arr[front];
    }

    // isEmpty: 비어있는지 확인
    public boolean isEmpty() {
        return rear == front;
    }

    // peek(): 제일 앞의 데이터 확인
    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("queue is empty");
        }

        return arr[front + 1];
    }

    // full: 가득 차있는지 확인
    public boolean isFull() {
        return (rear + 1) % offset == front;
    }

    public static void main(String[] args) {
        CycleQueueEx queue = new CycleQueueEx();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
    }
}
