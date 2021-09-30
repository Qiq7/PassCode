package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0091 {
    public static void main(String[] args) {
        System.out.println(deleteAndEarn(new int[]{
                5,1,2,8,9,7,4,0
        }));
    }
    public static int f0(int [] f)
    {
        int a0 = f[0],a1 = Math.max(f[0],f[1]);
        for (int i = 2; i < f.length; i++) {
            int t  = a1;
            a1 = Math.max(a1,a0+f[i]);
            a0 = t;
        }
        return a1;
    }
    public static int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int f = nums[nums.length-1];
        int dp [] = new int[f+1];
        for (int x:nums) {
            dp[x]+=x;
        }
        return f0(dp);
    }
}
