package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0136 {
    public static void main(String[] args) {
        System.out.println(maxIceCream(new int[]{1,3,2,4,1},7));
    }
    public static int f(int[] costs, int coins){
        Arrays.sort(costs);
        int aus = 0;
        for (int i = 0; i < costs.length; i++) {
            if(coins>=costs[i])
            {
                aus++;
                coins-=costs[i];
            }
        }
        return aus;
    }
    public static int maxIceCream(int[] costs, int coins) {
        int [][] dp = new int[costs.length+1][coins+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j <= coins ; j++) {
                if(costs[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-costs[i-1]]+1);
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[costs.length][coins];
    }
}
