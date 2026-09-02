package Day9;

import java.util.HashMap;
public class Leetcode2461 {
     public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long currentSum = 0;
        long maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // Add new element to the window
            currentSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            // Keep window size equal to k
            if (i >= k) {
                currentSum -= nums[i - k];
                map.put(nums[i - k],
                        map.get(nums[i - k]) - 1);
                if (map.get(nums[i - k]) == 0) {
                    map.remove(nums[i - k]);
                }
            }
           // Check if window has k distinct elements
            if (i >= k - 1 && map.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}
