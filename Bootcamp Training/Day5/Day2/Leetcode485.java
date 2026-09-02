package Day2;

class Leetcode485{
    public int findMaximumConsecutive(int[] nums){
        int count = 0;
        int max = 0;
        for(int num : nums){
            if(num == 1){
                count++;
                max=Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}