package Day2;
public class suffixsum {
    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 8, 10};

        int[] suffix = new int[nums.length];

        suffix[nums.length - 1] = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i];
        }

        for (int num : suffix) {
            System.out.print(num + " ");
        }
    }
}
