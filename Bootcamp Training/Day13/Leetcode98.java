package Day12;

public class Leetcode98 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static long previous = Long.MIN_VALUE;

    public static boolean isValidBST(TreeNode root) {

        if (root == null) {
            return true;
        }

        // Check left subtree
        if (!isValidBST(root.left)) {
            return false;
        }

        // Check current node
        if (root.val <= previous) {
            return false;
        }

        previous = root.val;

        // Check right subtree
        return isValidBST(root.right);
    }

    public static void main(String[] args) {

        // Create a valid BST
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        previous = Long.MIN_VALUE;

        boolean result = isValidBST(root);

        System.out.println("Is valid BST? " + result);
    }
}