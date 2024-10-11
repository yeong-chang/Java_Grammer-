package practice1;

import java.util.ArrayList;
import java.util.List;

// 트리 노드 클래스 정의
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class BinaryTree {
    // 모든 경로를 찾는 메서드
    public List<List<Integer>> printAllPaths(TreeNode root) {
        List<List<Integer>> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        List<Integer> path = new ArrayList<>();
        findPaths(root, path, paths);
        return paths;
    }

    // 재귀적으로 경로를 찾는 헬퍼 메서드
    private void findPaths(TreeNode node, List<Integer> path, List<List<Integer>> paths) {
        path.add(node.val); // 현재 노드 값을 경로에 추가

        // 리프 노드인 경우 경로를 저장
        if (node.left == null && node.right == null) {
            paths.add(new ArrayList<>(path));
        } else {
            // 왼쪽과 오른쪽 서브트리 탐색
            if (node.left != null) {
                findPaths(node.left, path, paths);
            }
            if (node.right != null) {
                findPaths(node.right, path, paths);
            }
        }

        path.remove(path.size() - 1); // 현재 노드를 경로에서 제거
    }

    public static void main(String[] args) {
        // 높이 3의 이진 트리 생성
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        BinaryTree tree = new BinaryTree();
        List<List<Integer>> paths = tree.printAllPaths(root);

        // 결과 출력
        System.out.println("모든 경로:");
        for (List<Integer> path : paths) {
            System.out.println(path);
        }
    }
}