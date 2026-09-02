package Day12;

public class Leetcode104 {

    // TreeNode class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Find maximum depth
    public static int maxDepth(TreeNode root) {

        // Base case
        if (root == null) {
            return 0;
        }

        // Find left subtree depth
        int leftDepth = maxDepth(root.left);

        // Find right subtree depth
        int rightDepth = maxDepth(root.right);

        // Current node + deeper subtree
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static void main(String[] args) {

        // Create tree
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Find maximum depth
        int result = maxDepth(root);

        System.out.println("Maximum Depth: " + result);
    }
}