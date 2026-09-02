package Day9;

public class Leetcode1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowSum = 0;
        int count = 0;
        // Sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        // Check first window
        if (windowSum >= k * threshold) {
            count++;
        }
        // Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];
            if (windowSum >= k * threshold) {
                count++;
            }
        }
        return count;
    }
}
