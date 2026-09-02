package Day2;

public class Prefixsum {
    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 8, 10};

        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int num : prefix) {
            System.out.print(num + " ");
        }
    }
}
