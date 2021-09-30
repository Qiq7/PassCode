package javaxm3.sbww;


import java.util.Arrays;

public class MyLeetCode0178 {
    public static void main(String[] args) {

    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        final int INt = 10000*101+1;
        int[][] dp = new int[k+2][n];
        for (int i = 0; i < k+2; i++) {
            Arrays.fill(dp[i],INt);
        }

        dp[0][src] = 0;
        for (int i = 1; i <= k+1 ; i++) {
            for (int [] x:flights) {
                int a = x[0],b = x[1],c = x[2];
                dp[i][b] = Math.min(dp[i][b],dp[i-1][a]+c);
            }
        }
        int aus = INt;
        for (int i = 1; i <=k+1 ; i++) {
            aus = Math.min(aus,dp[i][dst]);
        }
            return aus==INt?-1:aus;
    }
}
