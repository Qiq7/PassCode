package javaxm2.sbww.study;

import java.util.Scanner;

public class Lqb002 {
    private static int aus = 1;
    public static void f(int[][] map,int i,int [] a)
    {
        for (int j = 0; j < map.length; j++) {
            if(map[i][j]==1&&a[j] == 0)
            {
                aus++;
                a[j] = 1;
                //System.out.println(j);
                f(map,j,a);
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int x ,y;
        int [][] map = new int[n][n];
        for (int i = 0; i < m; i++) {
            x = sc.nextInt()-1;
            y = sc.nextInt()-1;
            map[x][y] = 1;
        }
        int[] a = new int[n];
        a[0] = 1;
        for (int i = 0; i < n; i++) {
            if(map[0][i] == 1&&a [i] == 0)
            {
                aus++;
                a[i] = 1;
                //System.out.println(i);
                f(map,i,a);
            }
        }
        System.out.println(aus);
    }
}
