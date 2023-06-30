package com.example.study.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] sort(int[] numArr) {
        int n = numArr.length; // 배열의 크기
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numArr[j] > numArr[j + 1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                }
            }
        }
        return numArr;
    }

    public static void main(String[] args) {
        int[] numArr = {9, 5, 3, 8, 1};
        System.out.println(Arrays.toString(BubbleSort.sort(numArr)));
    }
}
