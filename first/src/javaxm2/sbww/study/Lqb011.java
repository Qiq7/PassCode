package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.Scanner;

public class Lqb011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,a,b,c;
        n = sc.nextInt();
        int[][] map = new int[n+1][n+1];
        int[][][][] m = new int[n+1][n+1][n+1][n+1];
        do {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            map[a][b] = c;
        }while (a!=0&&b!=0&&c!=0);
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    for (int l = 1; l <= n; l++) {
                        m[i][j][k][l] = Math.max(Math.max(m[i - 1][j][k - 1][l], m[i - 1][j][k][l - 1]), Math.max(m[i][j - 1][k - 1][l]
                                , m[i][j - 1][k][l - 1])) + map[i][j] + map[k][l];
                        if (i == k && j == l) {
                            m[i][j][k][l] -= map[i][j];
                        }
                    }
                }
            }
        }
        System.out.println(m[n][n][n][n]);
        //System.out.println(Arrays.deepToString(map));
    }
}
