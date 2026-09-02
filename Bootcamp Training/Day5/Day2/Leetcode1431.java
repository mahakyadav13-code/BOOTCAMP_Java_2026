package Day2;
import java.util.ArrayList;
import java.util.List;
public class Leetcode1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        // Find maximum candies
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        List<Boolean> result = new ArrayList<>();
        // Check each kid
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}
