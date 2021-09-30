package javaxm3.sbww;

public class MyLeetCode0121 {
    public static void main(String[] args) {

    }
    public static boolean stoneGame(int[] piles) {
        int[][] dp = new int[piles.length][piles.length];
        for (int i = 0; i < piles.length; i++) {
            dp[i][i] = piles[i];
        }
        for (int i = piles.length - 2;i >= 0; i--) {
            for (int j = i + 1; j < piles.length; j++) {
                dp[i][j] = Math.max(piles[j] - dp[i][j - 1],piles[i] - dp[i+1][j]);
            }
        }
        return dp[0][piles.length-1]>0;
    }
}
