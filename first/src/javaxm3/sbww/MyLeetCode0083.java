package javaxm3.sbww;

public class MyLeetCode0083 {
    public static void main(String[] args) {

    }
    public static int combinationSum4(int[] nums, int target) {
        int [] dp = new int[target+1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int x:nums) {
                if(x <= i)
                {
                    dp[i] += dp[i - x];
                }
            }
        }
        return dp[target];
    }
}
