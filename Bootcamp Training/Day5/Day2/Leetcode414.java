package Day2;

public class Leetcode414 {
    public int thirdMax(int[] nums){
        int first = null;
        int second = null;
        int third = null;
        for(int num : nums){
             if ((first != null && num == first) ||
                (second != null && num == second) ||
                (third != null && num == third)) {
                continue;
            }
            if(first == null || num > first){
                third = second;
                second = first;
                first = num;
            }else if(second == null || num >second){
                third = second;
                second = num;
            }else if(third == null || num > third){
                third = num;
            }
        }
        return (third == null) ? first : third;
    }
}
