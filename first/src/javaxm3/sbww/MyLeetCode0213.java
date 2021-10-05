package javaxm3.sbww;

import java.util.Arrays;
//给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
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
