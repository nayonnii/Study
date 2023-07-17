package com.example.study.algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TopologicalSort {

    private List<List<Integer>> adjList;
    private int nodes;

    public void topologicalSort() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer infoToken = new StringTokenizer(reader.readLine());

        nodes = Integer.parseInt(infoToken.nextToken());    // 정점 개수
        int edges = Integer.parseInt(infoToken.nextToken());    // 간선 개수
        adjList = new ArrayList<>();    // 인접 리스트

        // 인접리스트 초기화
        // 0~6까지 각각의 리스트 생성
        for (int i = 0; i < nodes; i++) {
            adjList.add(new ArrayList<>());
        }

        // 그래프 입력받기
        for (int i = 0; i < edges; i++) {
            StringTokenizer edgeToken = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(edgeToken.nextToken());
            int end = Integer.parseInt(edgeToken.nextToken());
            // start에 해당하는 list에 end 삽입
            adjList.get(start).add(end);
        }
        kann();
    }

    // nodes: 정점의 개수, adjList: 인접 리스트
    private void kann() {
        // 1. 진입 차수 구하기
        // 정점의 개수만큼 노드 생성
        int[] inDegrees = new int[nodes];
        // List<Integer> neighbors: 각 정점에서 도달할 수 있는 정점 리스트
        for (List<Integer> neighbors : adjList) {
            for (int neighbor : neighbors) {
                // 진입차수 높이기
                inDegrees[neighbor]++;
            }
        }

        // 2. 진입 차수가 0인 정점을 Queue에 삽입
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nodes; i++) {
            if (inDegrees[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> result = new ArrayList<>();
        // 3. Queue가 비어있지 않은 동안
        while (!queue.isEmpty()) {
            // 3-1. 이번 정점 기록
            int node = queue.poll();
            result.add(node);
            // 3-2. 현재 정점의 인접 정점딀의 진입 차수를 줄인다.
            for (int neighbor : adjList.get(node)) {
                inDegrees[neighbor]--;
                // 3-3. 진입 차수가 0이 되면 방문 가능(Queue에 삽입)
                if (inDegrees[neighbor] == 0) queue.offer(neighbor);
            }
        }
        // 4. 결과 확인
        // 결과 값의 정점의 개수가 실제 정점의 개수보다 적으면 위상정렬이 불가한 값이라는 의미(순환구조로 인한)
        if (result.size() < nodes) {
            System.out.println(new ArrayList<>());
        } else {
            System.out.println(result);
        }
    }

    public static void main(String[] args) throws IOException {
        new TopologicalSort().topologicalSort();
    }
}

/*
[상세 설명]
1. 정점 개수, 간선 개수 입력받기
2. 정점의 개수와 동일하게 인접 리스트 생성
3. 연결정보의 start, end점 입력 받기
4. 인접리스트에서 start에 해당하는 인덱스에 end 값 삽입
5. 진입 차수를 저장할 배열 생성
6. end 값과 동일한 인덱스가 동일할 경우, 해당 인덱스 1씩 증가(= 진입차수)
7. 큐 생성
6. 진입 차수가 0인 노드 삽입
7. 결과값을 저장할 리스트 생성
8. 진입 차수가 0인 노드 꺼내서 결과값 리스트에 삽입
9. 해당 노드를 필요로 하는 노드의 진입차수 1씩 차감
10. 진입 차수가 0이 되면 큐에 해당 노드 삽입
11. 위 과정을 반복하다가 큐가 비면 반복 종료
12. 결과값 확인(결과값이 실제 정점의 개수보다 적으면 순환구조 떄문에 위상 정렬이 불가한 값임)
*/

/*
[테스트 케이스]
[입력]
7 8
0 1
0 2
1 3
1 4
2 4
3 5
4 5
5 6
[출력]
[0, 1, 2, 3, 4, 5, 6]
 */

/*
[입력]
7 9
0 1
0 2
1 3
1 4
2 3
2 6
3 5
4 3
4 5
[출력]
[0, 1, 2, 4, 6, 3, 5]
 */

/*
[입력]
7 9
0 1
0 2
1 3
1 4
2 4
3 5
4 5
5 6
3 0
[출력] -> 위상정렬 불가 케이스
[]
 */
