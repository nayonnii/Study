package com.example.study.algorithm.datastructure.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
 인접행렬 - List 활용
*/
public class AdjacentMatrixList {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer graphTokenizer = new StringTokenizer(reader.readLine());

        int maxNode = Integer.parseInt(graphTokenizer.nextToken());     // 정점 개수
        int edges = Integer.parseInt(graphTokenizer.nextToken());      // 간선 개수
        int[][] adjMatrix = new int[maxNode][maxNode];  // 인접 행렬

        // 정점과 list 인덱스를 대응하고, 각 인덱스에 리스트 생성
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < maxNode; i++) {
            adjList.add(new ArrayList<>());
        }

        // 간선의 개수(=인접 정보)만큼 입력 받기
        for(int i = 0; i < edges; i++) {
            StringTokenizer edgeTokenizer = new StringTokenizer(reader.readLine());
            int startNode = Integer.parseInt(edgeTokenizer.nextToken());    // 시작 정점
            int endNode = Integer.parseInt(edgeTokenizer.nextToken());  // 끝 정점
            // 행, 열번호를 각각 그래프의 정점에 대응
            // 유향 그래프일 경우, 아래 줄만 작성
            adjList.get(startNode).add(endNode);
            // 무향 그래프일 경우, 반대방향도 작성
            adjList.get(endNode).add(startNode);
        }

        // 각 정점별 인접 정점 리스트 정렬
        for(List<Integer> adjRow : adjList) {
            Collections.sort(adjRow);
        }

        // 각 정점별 인접 정점 출력
        for(List<Integer> adjRow : adjList) {
            System.out.println(adjRow);
        }
    }

    public static void main(String[] args) throws IOException {
        new AdjacentMatrixList().solution();
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
[1, 2, 3] --> 0과 인접 정점
[0, 3, 4] --> 1과 인접 정접
[0, 5]            ...
[0, 1, 4]
[1, 3, 7]
[2, 6]
[5, 7]
[4, 6]
*/
