package com.example.study.algorithm.datastructure.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class RecursiveDFS {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer graphTokenizer = new StringTokenizer(reader.readLine());
        int maxNode = Integer.parseInt(graphTokenizer.nextToken());     // 정점 개수
        int edges = Integer.parseInt(graphTokenizer.nextToken());      // 간선 개수
        int[][] adjMatrix = new int[maxNode][maxNode];  // 인접행렬


        // 간선의 개수(=인접 정보)만큼 입력 받기
        for(int i = 0; i < edges; i++) {
            StringTokenizer edgeTokenizer = new StringTokenizer(reader.readLine());
            int startNode = Integer.parseInt(edgeTokenizer.nextToken());    // 시작 정점
            int endNode = Integer.parseInt(edgeTokenizer.nextToken());  // 끝 정점
            // 행, 열번호를 각각 그래프의 정점에 대응
            // 유향 그래프일 경우, 아래 줄만 작성
            adjMatrix[startNode][endNode] = 1;
            // 무향 그래프일 경우, 반대방향도 작성
            adjMatrix[endNode][startNode] = 1;
        }
        // adjMatrix 출력
        for(int[] row : adjMatrix) {
            System.out.println(Arrays.toString(row));
        }

        // Recursive 시작
        boolean[] visited = new boolean[maxNode];   // 정점별 방문 여부
        List<Integer> visitedOrder = new ArrayList<>(); // 방문 순서 기록 리스트
        // 정점 0부터 재귀 호출 시작
        recursive(0, maxNode, adjMatrix, visited, visitedOrder);
        // 방문 순서 출력
        // System.out.println(visitedOrder);

    }

    // DFS 진행 시 정점 방문 순서 기록
    public void recursive(
            int next,   // 다음 방문할 곳(이번에 호출할 곳)
            int maxNodes,   // 원활한 순회를 위한 maxNodes
            int[][] adjMatrix,  // 인접 정점 정보
            boolean[] visited,  // 여태까지의 정점별 방문 여부
            List<Integer> visitOrder    // 방문 순서 기록 리스트
    ) {
        // 이번에 호출한 곳 방문 처리하고,
        visited[next] = true;
        // 방문 순서 리스트에 삽입
        visitOrder.add(next);

        // 이번에 방문한 곳과 인접한 정점 찾기
        for(int i = 0; i < maxNodes; i++) {
            // 연결이 되어 있으며 && 방문한 적 없을 경우
            if(adjMatrix[next][i] == 1 && !visited[i])
                recursive(i, maxNodes, adjMatrix, visited, visitOrder);
        }
    }

    public static void main(String[] args) throws IOException {
        new RecursiveDFS().solution();
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
[0, 1, 3, 4, 7, 6, 5, 2]
*/