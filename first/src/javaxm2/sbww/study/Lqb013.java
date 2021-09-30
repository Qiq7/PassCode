package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.Scanner;

public class Lqb013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v,n;
        v = sc.nextInt();
        n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] dp = new int[n+1][v+1];
        for (int i = 0; i <= v ; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= v; j++) {
                if(j >= a[i-1])
                {
                    dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j - a[i-1]]);
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        //System.out.println(Arrays.deepToString(dp));
        System.out.println(dp[n][v]);
    }
}
