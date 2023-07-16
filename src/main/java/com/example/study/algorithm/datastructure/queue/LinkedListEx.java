package com.example.study.algorithm.datastructure.queue;

public class LinkedListEx {
    private Node start; // 제일 앞쪽에 있는 노드

    private static class Node {
        private int data;
        private Node link;  //

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node link) {
            this.data = data;
            this.link = link;
        }
    }

    // add: 제일 뒤에 데이터 추가
    public void add(int data) {
        // LinkedList가 비어 있을 경우 제일 앞쪽에 데이터 추가
        if (start == null) {
            start = new Node(data);
        }

        // 아닐 경우, link가 null인 node가 나올 때까지 데이터를 찾아감
        else {
            Node head = start;
            while (head.link != null) {
                head = head.link;
            }
            // head.link가 null인 노드(마지막 노드)에 data 추가
            head.link = new Node(data);
        }
    }

    // remove: idx번째 데이터를 회수 및 노드 제거
    public int remove(int idx) {
        // 맨 앞의 노드를 제거할 경우
        if (idx == 0) {
            int value = start.data;
            // start.link가 가리키는 노드를 start에 할당
            start = start.link;
            // start.data 반환
            return value;
        } else {
            int i = 0;
            Node head = start;  // 현재 노드
            Node prev = start;  // 이전 노드

            // idx번째 노드에 도달할 때까지 반복
            while (i < idx) {
                // 이전 노드에 현재 노드 할당
                prev = head;
                // 현재 노드에 다음 노드 할동
                head = head.link;
                i++;
            }
            // idx번째의 이전, 다음 노드를 연결
            prev.link = head.link;
            // 삭제된 idx번째 노드 데이터 반환
            return head.data;
        }
    }
}
