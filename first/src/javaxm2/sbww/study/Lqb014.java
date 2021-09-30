package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.Scanner;

public class Lqb014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ,k ;
        n = sc.nextInt();
        k = sc.nextInt();
        int [][] dp = new int[n + 1][k + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= k ; j++) {
                if(j<=i)
                {
                    dp[i][j] = dp[i-j][j]+dp[i-1][j-1];
                }
            }
        }
        System.out.println(dp[n][k]);
    }
}
