package com.example.study.algorithm.datastructure.tree;

public class TreeTraverse {
    private int nodes;  // 노드
    private int[] arr;  // 이진 트리를 표현하기 위한 배열

    // {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
    public void setArr(int[] arr) {
        this.arr = arr;
        this.nodes = arr.length;    // 실제 노드의 개수라기 보다 arr.length를 저장하기 위한 목적(arr.length가 노드보다 +1 더 많음)
    }

    // 전위 순회 (V -> L -> R)
    public void traversePreorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            System.out.print(arr[node] + ", ");
            this.traversePreorder(node * 2);    // L(왼쪽 자식)을 루트로 다시 전위순회(재귀호출)
            this.traversePreorder(node * 2 + 1);    // R(오른쪽 자식)을 루트로 다시 전위순회(재귀호출)
        }
    }

    // 중위 순회 (L -> V -> R)
    public void traverseInorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            this.traverseInorder(node * 2);
            System.out.print(arr[node] + ", ");
            this.traverseInorder(node * 2 + 1);
        }
    }

    // 후위 순회(L -> R -> V)
    public void traversePostorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            this.traversePostorder(node * 2);
            this.traversePostorder(node * 2 + 1);
            System.out.print(arr[node] + ", ");
        }
    }

    public static void main(String[] args) {
        TreeTraverse tree = new TreeTraverse();
        tree.setArr(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        // 전위 순회
        tree.traversePreorder(1);   // 1 2 4 8 9 5 10 11 3 6 12 7
        System.out.println();
        // 중위 순회
        tree.traverseInorder(1);   // 8 4 9 2 10 5 11 1 12 6 3 7
        System.out.println();
        // 후위 순회
        tree.traversePostorder(1);  // 8 9 4 10 11 5 2 12 6 7 3 1

    }
}
