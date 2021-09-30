package javaxm3.sbww;

public class MyLeetcode0173 {
    public static void main(String[] args) {

    }
    public int checkRecord(int n) {
        int[][][] dp = new int[n+1][2][3];
        final int MOD = 1000000007;
        dp[0][0][0] = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    dp[i][j][0] =(dp[i][j][0]+dp[i-1][j][k])%MOD;
                }
            }

            for (int k = 0; k < 3; k++) {
                dp[i][1][0] = (dp[i][1][0]+dp[i-1][0][k])%MOD;
            }

            for (int j = 0; j < 2; j++) {
                for (int k = 1; k < 3; k++) {
                    dp[i][j][k] = (dp[i][j][k]+dp[i-1][j][k-1])%MOD;
                }
            }
        }
        int aus = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                aus = (aus+dp[n][i][j])%MOD;
            }
        }
        return aus;
    }
}
