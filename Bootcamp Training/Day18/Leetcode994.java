import java.util.LinkedList;
import java.util.Queue;
public class Leetcode994 {
    public static int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        int minutes = 0;
        // Find all rotten oranges
        // and count fresh oranges
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) {
                    queue.add(new int[]{r, c});
                }
                if (grid[r][c] == 1) {
                    fresh++;
                }
            }
        }
        int[][] directions = {
                {-1, 0}, // up
                {1, 0},  // down
                {0, -1}, // left
                {0, 1}   // right
        };
        // BFS
        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            // One BFS level = one minute
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];
                for (int[] direction : directions) {
                    int newRow = row + direction[0];
                    int newCol = col + direction[1];
                    // Check boundaries
                    if (newRow >= 0 &&
                        newRow < rows &&
                        newCol >= 0 &&
                        newCol < cols) {
                        // Fresh orange found
                        if (grid[newRow][newCol] == 1) {
                            grid[newRow][newCol] = 2;
                            fresh--;
                            queue.add(new int[]{
                                    newRow,
                                    newCol
                            });
                        }
                    }
                }
            }
            minutes++;
        }
        // If fresh oranges remain,
        // they can never become rotten
        if (fresh > 0) {
            return -1;
        }
        return minutes;
    }
    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        int result = orangesRotting(grid);
        System.out.println("Minutes required: " + result);
    }
}