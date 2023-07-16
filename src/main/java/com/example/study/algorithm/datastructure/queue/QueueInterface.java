package com.example.study.algorithm.datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // enQueue에 해당하는 메소드: offer, add
        // Queue가 가득 차 있다면 offer는 false 반환, add는 예외 발생
        queue.offer(1);
        queue.add(2);

        // deQueue에 해당하는 메소드: poll, remove
        // Queue가 비어있다면 poll은 null 반환, remove는 예외 발생
        System.out.println(queue.poll());
        System.out.println(queue.remove());

        // peek에 해당하는 메소드: peek, element
        // Queue가 비어있다면 peek은 null 반환, element는 예외 발생
        System.out.println(queue.peek());
        System.out.println(queue.element());
    }
}
