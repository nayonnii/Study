package com.example.study.algorithm.sort;

import java.util.Arrays;

public class CountingSort {
    public static int[] sort(int[] numArr) {
        // 1. 요소의 범위 확인
        // 2. 범위에 맞춰 count 배열(요소가 몇번 등장했는지) 생성
        // 3. count 배열 누적합으로 요소 업데이트
        // 4. count 배열을 참고하여 정렬 결과 배열 생성

        int max = numArr[0];
        int min = numArr[0];

        // 1. 요소의 범위 확인
        for(int i = 0; i < numArr.length; i++) {
            if(max < numArr[i]) max = numArr[i];
            if(min > numArr[i]) min = numArr[i];
        }
//        System.out.println("min: " + min);
//        System.out.println("max: " + max);

        // 2. 요소의 범위에 맞게 count 배열 생성
        int[] count = new int[max - min + 1];

        for(int data : numArr) {
            count[data - min]++;
        }

        System.out.println("count : " + Arrays.toString(count));

        // 3. count 배열 누적합으로 요소 업데이트
        for(int i = 0; i < count.length - 1; i++) {
            count[i + 1] += count[i];
        }
        System.out.println("count 누적합 : " + Arrays.toString(count));

        // 4. 정렬 결과 배열 생성
        int[] newNumArr = new int[numArr.length];
        for(int i = 0; i <  numArr.length; i++) {
            newNumArr[count[numArr[i] - 1] - 1] = numArr[i];
            count[numArr[i] - 1]--;
        }
        System.out.println("newNumArr : " + Arrays.toString(newNumArr));

        return newNumArr;
    }

    public static void main(String[] args) {
        int[] numArr = {9, 5, 3, 8, 1, 1, 5, 4, 9};
        System.out.println(Arrays.toString(CountingSort.sort(numArr)));
    }
}
