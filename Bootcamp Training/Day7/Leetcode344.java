package Day7;
import java.util.Arrays;

public class Leetcode344 {
    public void reversestring(char[] s){
        int left = 0;
        int right = s.length-1;
        while(left<right){
            char[temp]=s.left;
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        char[] s = {'h','e','l','l','o'};
        System.out.println("Original string: " + Arrays.toString(s));
        reversestring(s);
        System.out.println("Reversed string: " + Arrays.toString(s));
    }
}
