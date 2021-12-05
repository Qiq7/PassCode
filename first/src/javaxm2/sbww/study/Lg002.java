package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.Scanner;

public class Lg002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] map = new int[N+1][N+1];
        int x,y,v;
        do {
            x = sc.nextInt();
            y = sc.nextInt();
            v = sc.nextInt();
            map[x][y] = v;
        }while (!(x==0&&y==0&&v==0));
        //System.out.println(Arrays.deepToString(map));
        int dp[][][][] = new int[N+1][N+1][N+1][N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    for (int l = 1; l <= N; l++) {
                            dp[i][j][k][l]=Math.max(Math.max(dp[i-1][j][k-1][l],dp[i-1][j][k][l-1])
                                    ,Math.max(dp[i][j-1][k-1][l],dp[i][j-1][k][l-1]));
                            if (i==k&&j==l){
                                dp[i][j][k][l]+=map[i][j];
                            }else {
                                dp[i][j][k][l]+=map[i][j]+map[k][l];
                            }


                    }
                }
            }
        }
        System.out.println(dp[N][N][N][N]);
    }
}
