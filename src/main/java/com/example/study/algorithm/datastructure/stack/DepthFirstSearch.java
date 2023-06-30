package com.example.study.algorithm.datastructure.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
    public void solution(int node, String edges) {  // 정점 개수(7개), 연결정보(1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7)
        // 1. 0부터 시작
        // 2. 0방문 체크
        // 3. 인접점 체크하여 stack에 삽입(큰 수 먼저 push)
        // 4. (작은수부터 방문) 해당 수부터 시작 .. 반복

        // 정점 간 연결정보
        int[][] edgeMap = new int[node + 1][node + 1];  // 왜 node가 아니라 node + 1씩인지 -> 0열/행을 추가해서 index 계산 편리하게 함

        // 연결정보 split
        // 1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7
        String[] edgesSplit = edges.split(" ");
        // 연결정보를 edgeMap에 표시
        for (int i = 0; i < edgesSplit.length / 2; i++) {
            int leftNode = Integer.parseInt(edgesSplit[2 * i]);
            int rightNode = Integer.parseInt(edgesSplit[2 * i + 1]);

            edgeMap[leftNode][rightNode] = 1;
            edgeMap[rightNode][leftNode] = 1;
        }

        // 다음에 방문할 점들을 담아두는 (인접 숫자를 담을) stack 생성
        Stack<Integer> toVisit = new Stack<>();

        // 방문기록용 arr 생성
        boolean[] visited = new boolean[node + 1];

        // 여기서부터 DFS
        // 방문 순서를 출력하는 문제라고 가정
        // 방문 순서를 담기 위한 List
        List<Integer> visitedOrder = new ArrayList<>();

        // 첫 방문 대상 선정
        int next = 1;

        // 대상을 stack에 push
        toVisit.push(next);

        // stack이 빌 때까지 반복하는 while
        while (!toVisit.empty()) {
            // 다음 방문할 곳을 가져온다. (pop)
            next = toVisit.pop();

            // 이미 방문했다면 다음 곳으로 간다. (pop)
            if (visited[next]) continue;

            // 방문했다고 표시한다.
            visited[next] = true;

            visitedOrder.add(next); // 이 부분은 문제에 따라 다르다.

            // 다음 방문 대상을 검색해서 stack에 push한다.
            // 더 작은 숫자부터 방문하려면 stack에서 역순으로 넣는다.
            for (int i = node; i > 0; i--) {
                // 해당 정점에 도달할 수 있고, 아직 방문하지 않았다면
                if(edgeMap[next][i] == 1 && !visited[i]) {
                    // 다음에 방문할 곳으로 stack에 push
                    toVisit.push(i);
                }
            }
        }
        // 답을 출력한다.
        System.out.println(visitedOrder);
    }

    public static void main(String[] args) {
        int node = 7;
        String edges = "1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7";
        DepthFirstSearch dfs = new DepthFirstSearch();
        dfs.solution(node, edges);
    }
}

//        edgeMap 확인용
//        System.out.println(Arrays.toString(edgeMap[0]));
//        System.out.println(Arrays.toString(edgeMap[1]));
//        System.out.println(Arrays.toString(edgeMap[2]));
//        System.out.println(Arrays.toString(edgeMap[3]));
//        System.out.println(Arrays.toString(edgeMap[4]));
//        System.out.println(Arrays.toString(edgeMap[5]));
//        System.out.println(Arrays.toString(edgeMap[6]));
//        System.out.println(Arrays.toString(edgeMap[7]));