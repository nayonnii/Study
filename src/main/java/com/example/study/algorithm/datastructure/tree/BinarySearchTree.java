package com.example.study.algorithm.datastructure.tree;

public class BinarySearchTree {
    private static class Node {
        private int key;    // 데이터
        private Node left;  // 왼쪽 자식
        private Node right; // 오른쪽 자식

        public Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }

    private Node root;  // 루트 노드
    public BinarySearchTree() {
        this.root = null;
    }

    // 삽입 메소드
    public void insert(int key) {
        root = insertNode(root, key);
    }

    // 삽입 메소드에서 재귀호출 할 메소드
    // 노드를 반환하여 왼쪽 또는 오른쪽에 노드를 삽입할 수 있도록 함
    public Node insertNode(Node node, int key) {
        // node == null일 때 삽입 (이전 재귀에서 부모 노드의 자식 노드가 null)
        if(node == null) {
            node = new Node(key);
            return node;
        }

        // 탐색에 성공한 경우, 삽입 불가
        // 더 확인하지 않는다.
        if(node.key == key) {
            return node;
        }

        // 현재 노드보다 데이터가 작을 경우 왼쪽 트리로 이동(= 재귀호출)
        if(key < node.key) {
            // insertNode return값을 부모 노드의 left 노드로 삽입
            node.left = insertNode(node.left, key);
        }

        // 현재 노드보다 데이터가 클 경우, 오른쪽 트리로 이동(= 재귀호출)
        if(key > node.key) {
            // insertNode return값을 부모 노드의 right 노드로 삽입
            node.right = insertNode(node.right, key);
        }

        // 삽입이 일어나지 않았을 경우, 본래의 자식을 그대로 반환
        return node;
    }

    // 탐색 메소드
    public boolean search(int key) {
        return searchNode(root, key);
    }

    // 탐색 메소드에서 재귀호출 할 메소드
    private boolean searchNode(Node node, int key) {
        // 현재 노드가 null인 경우
        if(node == null) return false;

        // 탐색 성공 시
        if(key == node.key) return true;

        // 현재 노드보다 데이터가 더 작을 경우, 왼쪽 서브트리 탐색 결과 반환(=재귀호출)
        if(key < node.key) return searchNode(node.left, key);
        // 현재 노드보다 데이터가 더 클 경우, 오른쪽 서브트리 탐색 결과 반환(=재귀호출)
        else return searchNode(node.right, key);
    }

    // 중위 순회 메소드
    public void inorderTraversal() {
        inorder(root);
    }

    // 중위 순회 메소드에서 재귀호출 할 메소드
    private void inorder(Node node) {
        // 왼쪽 -> 자기 자신 -> 오른쪽 순으로 확인
        if(node != null) {
            inorder(node.left);
            System.out.print(node.key + ", ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{50, 30, 70, 20, 40, 60, 80};
        BinarySearchTree bst = new BinarySearchTree();

        for(int i = 0; i < data.length; i++) {
            bst.insert(data[i]);
        }

        System.out.println("중위순회");
        bst.inorderTraversal();
        System.out.println();

        System.out.println(bst.search(40));
        System.out.println(bst.search(55));
        System.out.println(bst.search(30));

        bst.search(40);
        bst.search(40);
    }
}
