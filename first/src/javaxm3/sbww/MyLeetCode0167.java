package javaxm3.sbww;

public class MyLeetCode0167 {
    public static void main(String[] args) {

    }
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int [][] dp = new int[n][n];
        for (int i = n-1; i >= 0 ; i--) {
            dp[i][i] = 1;
            char c1 = s.charAt(i);
            for (int j = i+1; j < n; j++) {
                if(s.charAt(j)==c1)
                {
                    dp[i][j] = dp[i+1][j-1]+2;
                }else {
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }
}
