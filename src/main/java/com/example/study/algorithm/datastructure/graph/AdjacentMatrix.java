package com.example.study.algorithm.datastructure.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
 인접행렬 - 배열 활용
*/
public class AdjacentMatrix {
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
    }

    public static void main(String[] args) throws IOException {
        new AdjacentMatrix().solution();
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
[0, 1, 1, 1, 0, 0, 0, 0]
[1, 0, 0, 1, 1, 0, 0, 0]
[1, 0, 0, 0, 0, 1, 0, 0]
[1, 1, 0, 0, 1, 0, 0, 0]
[0, 1, 0, 1, 0, 0, 0, 1]
[0, 0, 1, 0, 0, 0, 1, 0]
[0, 0, 0, 0, 0, 1, 0, 1]
[0, 0, 0, 0, 1, 0, 1, 0]
*/
