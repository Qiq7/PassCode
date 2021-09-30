package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0149 {
    public static void main(String[] args) {

    }
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int aus = 1;
        int l = 0,n = nums.length;
        long all = 0;
        for (int i = 1; i < n; i++) {
             all += (long) (nums[i] - nums[i-1])*(i-l);
             while (all > k)
             {
                 all -= nums[i] - nums[l];
                 ++l;
             }
             aus = Math.max(aus,i - l + 1);
        }
        return aus;
    }
}
