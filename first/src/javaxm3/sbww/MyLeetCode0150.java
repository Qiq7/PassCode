package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0150 {
    public static void main(String[] args) {

    }
    public int minPairSum(int[] nums) {
        int aus = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length/2; i++) {
            aus = Math.max(aus,nums[i]+nums[nums.length-i-1]);
        }
        return aus;
    }
}
