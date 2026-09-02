package Day12;

import java.util.ArrayList;
import java.util.List;

public class Leetcode144 {

    // TreeNode class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        preorder(root, result);

        return result;
    }

    private static void preorder(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        // Root
        result.add(root.val);

        // Left
        preorder(root.left, result);

        // Right
        preorder(root.right, result);
    }

    public static void main(String[] args) {

        // Creating tree
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = preorderTraversal(root);

        System.out.println(result);
    }
}