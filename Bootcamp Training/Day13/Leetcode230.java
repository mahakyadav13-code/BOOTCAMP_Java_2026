package Day12;

public class Leetcode230 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int count;
    static int answer;

    public static int kthSmallest(TreeNode root, int k) {

        count = 0;
        answer = 0;

        inorder(root, k);

        return answer;
    }

    private static void inorder(TreeNode root, int k) {

        if (root == null) {
            return;
        }

        // Left
        inorder(root.left, k);

        // Root
        count++;

        if (count == k) {
            answer = root.val;
            return;
        }

        // Right
        inorder(root.right, k);
    }

    public static void main(String[] args) {

        /*
                 3
                / \
               1   4
                \
                 2
        */

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(1);
        root.right = new TreeNode(4);

        root.left.right = new TreeNode(2);

        int k = 2;

        int result = kthSmallest(root, k);

        System.out.println("Kth smallest element: " + result);
    }
}