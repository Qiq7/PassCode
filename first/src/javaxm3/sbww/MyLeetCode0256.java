package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0256 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int aus = 0;
        for (int x:nums) {
            aus+=x;
        }
        for (int i = 0; i < k; i++) {
            Arrays.sort(nums);
            int a = nums[0];
            aus=aus-a-a;
            nums[0]=-a;
            System.out.println(aus);
        }
        return aus;
    }
}
