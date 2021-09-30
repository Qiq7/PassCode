package javaxm3.sbww;

public class MyLeetCode0203 {
    public static void main(String[] args) {

    }
    public int minDistance(String word1, String word2) {
            int n = word1.length(),m = word2.length();
            int [][] dp = new int[n+1][m+1];
        for (int i = 1; i <= n ; i++) {
            char ch = word1.charAt(i-1);
            for (int j = 1; j <= m ; j++) {
                char ch2 = word2.charAt(j-1);
                if(ch==ch2)
                {
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return n+m-2*dp[n][m];
    }
}
