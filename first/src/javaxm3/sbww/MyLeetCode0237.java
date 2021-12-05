package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0237 {
    public int missingNumber(int[] nums) {
        int n = nums.length;int i;
        Arrays.sort(nums);
        for ( i = 0; i < n; i++) {
            if(nums[i]!=i) break;
        }
        return i;
    }
}
