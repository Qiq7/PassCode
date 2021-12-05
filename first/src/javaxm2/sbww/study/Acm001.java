package javaxm2.sbww.study;

import java.util.Scanner;

public class Acm001 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int [] core = new int[n+1];
        for (int i = 1; i <= n ; i++) {
            core[i] = sc.nextInt();
        }

        int[][][] dp = new int[m+1][n+1][11];
        for (int i = 1; i <= m ; i++) {
            //System.out.println(i+"===============");
            for (int j = 1; j <= n ; j++) {
                //System.out.println(j+"--------------------");
                for (int k = 1; k <= 10 && core[j]>=k ; k++) {
                    if (j*k==i){
                        dp[i][j][k] = Math.max(dp[i][j][k],k);
                    }
                    if (j*k<i){
                        for (int l = 1; l < j ; l++) {
                            for (int o = 1; o <= 10 && core[l]>=o ; o++) {
                                if (dp[i-j*k][l][o]!=0){
                                    dp[i][j][k] = Math.max(dp[i][j][k],k+dp[i-j*k][l][o]);
                                }
                            }
                        }
                    }
                    //System.out.print(dp[i][j][k]);
                    //System.out.println();
                }
            }
        }


        int aus = -1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1;  j <= core[i]; j++) {
                if (dp[m][i][j] != 0) {
                    aus = Math.max(aus, dp[m][i][j]);
                }
            }
        }
        System.out.println(aus);
    }
}
