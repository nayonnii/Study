package com.example.study.algorithm.datastructure.queue;

public class QueueEx {
    int[] queue = new int[3];
    int front = -1; // 맨 앞
    int rear = -1; // 맨 뒤

    // enQueue: 데이터 추가
    public void enQueue(int num) {
        if(isFull()) {
            throw new RuntimeException("queue is full");
        }
        rear++;
        queue[rear] = num;
    }

    // deQueue: 데이터 회수
    public int deQueue() {
        if(isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        front++;
        return queue[front];
    }

    // isEmpty: 비어있는지 확인
    public boolean isEmpty() {
        return front == rear;
    }

    // peek(): 제일 앞의 데이터 확인
    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return queue[front + 1];
    }

    // full: 가득 차있는지 확인
    public boolean isFull() {
        return rear == queue.length - 1;
    }
    public static void main(String[] args) {
        QueueEx queue = new QueueEx();
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
