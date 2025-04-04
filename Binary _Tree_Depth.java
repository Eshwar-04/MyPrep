import java.util.Objects;

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}

public class Main {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(6);
        root.right = new Node(2);
        root.left.left = new Node(7);
        root.right.right = new Node(4);

        Solution solution = new Solution();
        int depth = solution.maxDepth(root);
        System.out.println(depth);
    }
}
