package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.Scanner;

public class Lgu001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] op = new int[m][4];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 4; j++) {
                op[i][j] = sc.nextInt();
            }
        }
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                map[i][j - 1] = i * n + j;
            }
        }
        for (int i = 0; i < m; i++) {
            magic(map, op[i][0]-1, op[i][1]-1, op[i][2], op[i][3]);
        }
        //System.out.println(Arrays.deepToString(map));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void magic(int[][] map, int x, int y, int r, int z) {
        int a = x - r, b = y - r;
        int r0 = r;
        int t;
        if (z == 0) {
            for (int i = 0; i < r0; i++) {
                for (int j = 0; j < 2 * r ; j++) {
                    t = map[a + j][b + 2 * r];
                    map[a + j][b + 2 * r] = map[a][b + j];
                    map[a][b + j] = t;
                }
                for (int j = 0; j < 2 * r ; j++) {
                    t = map[a + 2 * r][b + 2 * r - j];
                    map[a + 2 * r][b + 2 * r - j] = map[a + 2 * r - j][b];
                    map[a + 2 * r - j][b] = t;
                }
                for (int j = 0; j < 2 * r; j++) {
                    t = map[a + 2 * r][b + 2 * r - j];
                    map[a + 2 * r][b + 2 * r - j] = map[a][b + j];
                    map[a][b + j] = t;
                }
                a++;
                b++;
                r--;
            }
        } else {
            for (int i = 0; i < r0; i++) {
                for (int j = 0; j < 2 * r ; j++) {
                    t = map[a + j][b + 2 * r];
                    map[a + j][b + 2 * r] = map[a][b + j];
                    map[a][b + j] = t;
                }
                for (int j = 0; j < 2 * r ; j++) {
                    t = map[a + 2 * r][b + 2 * r - j];
                    map[a + 2 * r][b + 2 * r - j] = map[a + 2 * r - j][b];
                    map[a + 2 * r - j][b] = t;
                }
                for (int j = 0; j < 2 * r ; j++) {
                    t = map[a + j][b + 2 * r];
                    map[a + j][b + 2 * r] = map[a + 2 * r - j][b];
                    map[a + 2 * r - j][b] = t;
                }
                a++;
                b++;
                r--;
            }
        }
    }
}