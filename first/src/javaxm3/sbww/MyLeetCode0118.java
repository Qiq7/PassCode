package javaxm3.sbww;

public class MyLeetCode0118 {
    public static void main(String[] args) {

    }
    public static int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int aus = 0;
        int len = group.length,MOD = (int)1e9+7;
        int [][][] dp = new int[len+1][n+1][minProfit+1];
        dp[0][0][0] = 1;
        for (int i = 1; i <= len ; i++) {
            int members = group[i - 1],ear = profit[i - 1];
            for (int j = 0; j <= n ; j++) {
                for (int k = 0; k <= minProfit ; k++) {
                    if(j<members)
                    {
                        dp[i][j][k] = dp[i-1][j][k];
                    }else {
                        dp[i][j][k] = (dp[i-1][j][k] + dp[i-1][j-members][Math.max(0,k-ear)])%MOD;
                    }
                }
            }
        }
        for (int i = 0; i <= n ; i++) {
            aus=(aus+dp[len][i][minProfit])%MOD;
        }
        return aus;
    }
}
