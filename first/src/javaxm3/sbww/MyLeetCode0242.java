package javaxm3.sbww;

public class MyLeetCode0242 {
    public int getMoneyAmount(int n) {
       int [][] dp = new int[n+1][n+1];
        for (int i = n-1; i >= 1 ; i--) {
            for (int j = i+1; j <= n ; j++) {
                int mi = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int ma = k+Math.max(dp[i][k-1],dp[k+1][j]);
                    mi = Math.min(mi,ma);
                }
                dp[i][j] = mi;
            }
        }


        return dp[1][n];
    }
}
