import java.util.*;
public class Leetcode733 {
    public static int[][] floodFill(
            int[][] image,
            int sr,
            int sc,
            int color) {
        int originalColor = image[sr][sc];
        // Nothing to change
        if (originalColor == color) {
            return image;
        }
        dfs(image, sr, sc, originalColor, color);
        return image;
    }
    private static void dfs(
            int[][] image,
            int row,
            int col,
            int originalColor,
            int color) {
        // Check boundaries
        if (row < 0 || row >= image.length ||
            col < 0 || col >= image[0].length) {
            return;
        }
        // Stop if this cell has a different color
        if (image[row][col] != originalColor) {
            return;
        }
        // Change the color
        image[row][col] = color;
        // Up
        dfs(image, row - 1, col, originalColor, color);
        // Down
        dfs(image, row + 1, col, originalColor, color);
        // Left
        dfs(image, row, col - 1, originalColor, color);
        // Right
        dfs(image, row, col + 1, originalColor, color);
    }
    public static void printImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int color = 2;
        floodFill(image, sr, sc, color);
        System.out.println("Image after flood fill:");
        printImage(image);
    }
}