package com.example.study.algorithm.datastructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ListBreadthFirstSearch {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer graphTokenizer = new StringTokenizer(reader.readLine());

        int maxNodes = Integer.parseInt(graphTokenizer.nextToken());    // 정점 개수
        int edges = Integer.parseInt(graphTokenizer.nextToken());   // 간선 개수

        // 정점과 list 인덱스를 대응하고, 각 인덱스에 리스트 생성
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < maxNodes; i++) {
            adjList.add(new ArrayList<>());
        }

        // 간선의 개수(=인접 정보)만큼 입력 받기
        for (int i = 0; i < edges; i++) {
            StringTokenizer edgeTokenizer = new StringTokenizer(reader.readLine());
            int startNode = Integer.parseInt(edgeTokenizer.nextToken());
            int endNode = Integer.parseInt(edgeTokenizer.nextToken());

            adjList.get(startNode).add(endNode);
            adjList.get(endNode).add(startNode);

            // 방문 순서를 오름차순 정렬(선택사항)
            for (List<Integer> adjRow : adjList) {
                Collections.sort(adjRow);
            }
        }

        // BFS
        Queue<Integer> toVisit = new LinkedList<>();    // 다음 방문 대상 기록용 큐
        List<Integer> visitedOrder = new ArrayList<>(); // 방문 순서 기록용 리스트
        boolean[] visited = new boolean[maxNodes];  // 방문 여부 기록용 배열

        // 0부터 방문 시작
        int next = 0;
        // 다음 방문 대상에 0 저장
        toVisit.offer(next);

        // 다음 방문 대상이 없을 때까지 반복
        while (!toVisit.isEmpty()) {
            // 다음 방문 정점 회수
            next = toVisit.poll();

            // 이미 방문했다면 다음 반복으로
            if (visited[next]) continue;

            // 아직 방문하지 않았다면
            // 방문 처리
            visited[next] = true;
            // 방문 순서 기록
            visitedOrder.add(next);

            // 다음 방문 대상 검색
            // 방문했던 정점에서 방문 가능한 점(인접 정점) 리스트 생성
            List<Integer> canVisitList = adjList.get(next);

            for (int canVisit : canVisitList) {
                // 인접 정점이 방문하지 않은 점이면
                if (!visited[canVisit])
                    // 다음 방문 대상 리스트에 저장
                    toVisit.offer(canVisit);
            }
        }
        System.out.println(visitedOrder);
    }

    public static void main(String[] args) throws IOException {
        new ListBreadthFirstSearch().solution();
    }
}
/*
[입력값]
8 10
0 1
0 2
0 3
1 3
1 4
2 5
3 4
4 7
5 6
6 7

[출력값]
[0, 1, 2, 3, 4, 5, 7, 6]
*/
