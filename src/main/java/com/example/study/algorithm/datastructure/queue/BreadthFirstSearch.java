package com.example.study.algorithm.datastructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxNodes = Integer.parseInt(reader.readLine()); // 노드 개수
        int[][] adjMap = new int[maxNodes + 1][maxNodes + 1];   // 인접정보 저장용 배열
        String[] edges = reader.readLine().split(" ");   // 노드 간 연결 정보

        // 노드 간 연결정보 확인
        // 2개씩 확인하므로 edge.length / 2
        for (int i = 0; i < edges.length / 2; i++) {
            int leftNode = Integer.parseInt(edges[i * 2]);   // 현재 노드(0, 2, 4, ...)
            int rightNode = Integer.parseInt(edges[i * 2 + 1]);  // 현재 노드와 연결된 노드(1, 3, 5, ...)

            // 방문 정보 저장
            adjMap[leftNode][rightNode] = 1;
            adjMap[rightNode][leftNode] = 1;
        }

        // BFS 시작
        // 다음 방문 대상 기록용 Queue
        Queue<Integer> toVisit = new LinkedList<>();
        // 방문 순서 기록용 List
        List<Integer> visitedOrder = new ArrayList<>();
        // 방문 기록용 boolean[]
        boolean[] visited = new boolean[maxNodes + 1];

        // 첫 방문 대상은 1번 노드
        int next = 1;   // 다음 방문 노드

        // 다음 방문 노드를 queue에 삽입(enQueue)
        toVisit.offer(next);

        // 큐가 비어있지 않을 동안 반복
        while (!toVisit.isEmpty()) {
            // 다음 방문 정점 회수(deQueue)
            next = toVisit.poll();

            // 이미 방문했을 경우, 다음 반복 진행
            if (visited[next]) continue;

            // 방문했다고 표시
            visited[next] = true;

            // 방문한 순서 기록
            visitedOrder.add(next);

            // 다음 방문 대상을 검색한다.
            for (int i = 0; i < maxNodes + 1; i++) {
                // adjMap[next]가 담고 있는 배열은
                // idx번째가 1인 경우, idx에 연결되어 있다는 의미
                if (adjMap[next][i] == 1 && !visited[i]) {
                    toVisit.offer(i);
                }
            }
        }
        // 출력
        System.out.println(visitedOrder);
    }

    public static void main(String[] args) throws IOException {
        new BreadthFirstSearch().solution();
    }
}

/*
[입력]
7
1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7
[출력]
[1, 2, 3, 4, 5, 7, 6]
*/

