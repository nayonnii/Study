package com.example.study.algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
문제: 줄세우기 https://www.acmicpc.net/problem/2252
핵심: 위상정렬
*/

public class Baekjoon2252 {
    // 끝점을 저장할 리스트
    List<List<Integer>> adjList = new ArrayList<>();
    StringBuilder result = new StringBuilder();


    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer infoToken = new StringTokenizer(reader.readLine());
        int studentNum = Integer.parseInt(infoToken.nextToken());   // 학생 수
        int compareCount = Integer.parseInt(infoToken.nextToken());  // 비교 횟수

        // 인접 리스트 초기화
        // 학생 수만큼 리스트 저장
        for (int i = 0; i < studentNum; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < compareCount; i++) {
            StringTokenizer students = new StringTokenizer(reader.readLine());
            int firstStudent = Integer.parseInt(students.nextToken());  // 첫번째 학생
            int secondStudent = Integer.parseInt(students.nextToken()); // 두번째 학생

            // 첫번째 학생 번호 - 1과 동일한 인덱스에 두번째 학생 번호 - 1 저장
            adjList.get(firstStudent - 1).add(secondStudent - 1);
        }
        kann();
    }

    public void kann() {
        int[] inDegrees = new int[adjList.size()];    // 인접 차수 리스트
        // 인접차수 업데이트
        for (List<Integer> neighbors : adjList) {
            for (int neighbor : neighbors) {
                inDegrees[neighbor]++;
            }
        }

        // 인접 차수가 0인 노드 삽입
        Queue<Integer> queue = new LinkedList<>();
        for (int j = 0; j < inDegrees.length; j++) {
            if (inDegrees[j] == 0) queue.offer(j);
        }

        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            int student = queue.poll();
            // 학생번호 + 1을 결과값에 저장(배열 인덱스로 인해 현재는 (학생번호 - 1) 값임)
            result.append(student + 1).append(" ");

            // 큐에서 꺼낸 학생번호와 인접한 학생번호의 인접 차수 1 차감
            for (int n : adjList.get(student)) {
                inDegrees[n]--;
                // 인접 차수가 0일 경우 큐에 삽입
                if (inDegrees[n] == 0) queue.offer(n);
            }
        }
        System.out.println(result.toString());
    }

    public static void main(String[] args) throws IOException {
        new Baekjoon2252().solution();
    }
}

