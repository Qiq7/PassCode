package javaxm2.sbww.study;


import java.util.Scanner;

public class Lg003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(),n = sc.nextInt();
        int[][] map = new int[m+1][n+1];
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n ; j++) {
                map[i][j]=sc.nextInt();
            }
        }
        int[][][][] dp = new int[m+1][n+1][m+1][n+1];
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                for (int k = 1; k <=m ; k++) {
                    for (int l = 1; l <= n ; l++) {
                        dp[i][j][k][l]=Math.max(Math.max(dp[i-1][j][k-1][l],dp[i-1][j][k][l-1])
                                ,Math.max(dp[i][j-1][k-1][l],dp[i][j-1][k][l-1]));
                        if (i==k&&j==l){
                            dp[i][j][k][l]+=map[i][j];
                        }else {
                            dp[i][j][k][l]+=(map[i][j]+map[k][l]);
                        }
                    }
                }
            }
        }
        System.out.println(dp[m][n][m][n]);
//        System.out.println(Arrays.deepToString(map));
    }
}
