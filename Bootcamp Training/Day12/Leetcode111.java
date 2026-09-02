package Day12;

public class Leetcode111 {

    // TreeNode class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int minDepth(TreeNode root) {

        // Empty tree
        if (root == null) {
            return 0;
        }

        // If there is no left child
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        // If there is no right child
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        // Both children exist
        return 1 + Math.min(
                minDepth(root.left),
                minDepth(root.right)
        );
    }

    public static void main(String[] args) {

        // Create tree
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = minDepth(root);

        System.out.println("Minimum Depth: " + result);
    }
}