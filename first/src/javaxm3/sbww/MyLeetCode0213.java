package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0213 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int aus = nums[nums.length-1];
        int now = aus,tag = 1;
        for (int i = nums.length-2 ;i >= 0  ; i--) {
            if (now!=nums[i])
            {
                tag++;
                now = nums[i];
            }
            if (tag==3)
            {
                return now;
            }
        }
        return aus;
    }
}
