package javaxm3.sbww;


public class MyLeetCode0198 {
    public static void main(String[] args) {

    }
    public int minSteps(int n) {
        int [] dp = new int[n+1];
        for (int i = 2; i <= n ; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j*j <= n; j++) {
                if(i%j==0)
                {
                    dp[i] = Math.min(dp[i],i/j+dp[j]);
                    dp[i] = Math.min(dp[i],dp[i/j]+j);
                }
            }
        }
        return dp[n];
    }
}
