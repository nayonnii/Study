package com.example.study.algorithm.sort;

import java.util.Arrays;

public class SelectionSort {
    public static int[] sort(int[] numArr) {
        // 1. 배열의 가장 작은 숫자 판별하기
        // 2. 가장 작은 숫자를 첫번째 요소로 위치 옮기기
        // 3. 첫번째 요소를 제외한 나머지 숫자끼리 위 과정 반복하기
        int n = numArr.length;

        for(int i = 0; i < n; i++) {
            int minIdx = i;
            for(int j = i + 1; j < n; j++) {
                if(numArr[minIdx] > numArr[j]) {
                    minIdx = j;
                }
            }
            int temp = numArr[minIdx];
            numArr[minIdx] = numArr[i];
            numArr[i] = temp;
        }
        return numArr;
    }

    public static void main(String[] args) {
        int[] numArr = {9, 5, 3, 8, 1};
        System.out.println(Arrays.toString(SelectionSort.sort(numArr)));
    }
}
