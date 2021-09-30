package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0117 {
    public static void main(String[] args) {
        System.out.println(lastStoneWeightII(new int[]{31,26,33,21,40}));
    }
    public static int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int x:stones) {
            sum+=x;
        }
        int n = stones.length,m = sum/2;
        boolean dp[][] = new boolean[n+1][m+1];
        dp[0][0] = true;
        for (int i = 0; i < n ; i++) {
            for (int j = 0;j <= m;j++)
            {
                if (j<stones[i])
                {
                    dp[i+1][j] = dp[i][j];
                }else {
                    dp[i+1][j] = dp[i][j]||dp[i][j-stones[i]];
                }
            }
        }
        for (int i = m;; i--) {
            if(dp[n][i])
            {
                return sum - 2*i;
            }
        }
    }
}
