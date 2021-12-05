package javaxm3.sbww;


public class MyLeetCode0241 {
    public int kInversePairs(int n, int k) {
        final int MOD = 1000000007;
        int [][] dp = new int[2][k+1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k ; j++) {
                int cur = i&1,
                        prev = cur^1;
                dp[cur][j] = (j-1>=0?dp[cur][j-1]:0)-(j-i>=0?dp[prev][j-i]:0)+dp[prev][j];
                if (dp[cur][j]>=MOD){
                    dp[cur][j]-= MOD;
                }else if (dp[cur][j]<0){
                    dp[cur][j]+=MOD;
                }
            }
        }
        return dp[n&1][k];
    }
}
