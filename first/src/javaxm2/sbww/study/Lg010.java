package javaxm2.sbww.study;


import java.util.Arrays;
import java.util.Scanner;

public class Lg010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] neck = new int[n*2+1];
        for (int i = 1; i <= n; i++) {
            neck[i] = sc.nextInt();
            neck[i+n]=neck[i];
        }
        int[][] dp = new int[2*n+1][2*n+1];
        for (int i = 2; i <= n+1 ; i++) {
            for (int j = 1; j+i-1 <= 2*n; j++) {
                int r = j+i-1;
                for (int k = j+1; k < r ; k++) {
                    dp[j][r]=Math.max(dp[j][r],dp[j][k]+dp[k][r]+neck[j]*neck[k]*neck[r]);
                }
            }
        }
        int aus = 0;
        for (int i = 1; i < n+1 ; i++) {
            aus=Math.max(dp[i][i+n],aus);
        }

        System.out.println(aus);
    }
}
