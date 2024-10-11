package practice1;

public class Tree {
    public static void main(String[] args) {
//        노드(Node): 트리의 기본 단위. 각 노드는 데이터를 저장하고, 최대 두 개의 자식 노드
//                  (왼쪽 자식과 오른쪽 자식)를 가질 수 있습니다.
//        루트 노드(Root Node): 트리의 가장 상위 노드로, 트리의 시작점입니다.
//                             트리는 항상 하나의 루트 노드를 가집니다.
//        리프 노드(Leaf Node): 자식 노드가 없는 노드입니다.
//        높이(Height): 트리의 높이는 루트 노드에서 가장 깊은 리프 노드까지의 경로의 길이로 정의됩니다.
//                깊이(Depth): 특정 노드의 깊이는 그 노드까지의 경로에서 포함된 노드 수입니다.
    }
    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        // 생성자
        TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
