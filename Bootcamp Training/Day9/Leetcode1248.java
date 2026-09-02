package Day9;

import java.util.HashMap;

public class Leetcode1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int oddCount = 0;
        int result = 0;
        for (int num : nums) {
            if (num % 2 != 0) {
                oddCount++;
            }
            int required = oddCount - k;
            if (map.containsKey(required)) {
                result += map.get(required);
            }
            map.put(
                oddCount,
                map.getOrDefault(oddCount, 0) + 1
            );
        }
        return result;
    }
}
