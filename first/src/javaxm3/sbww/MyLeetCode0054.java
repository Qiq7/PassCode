package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0054 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }
    public static int[][] generateMatrix(int n) {
        int [][] a=new int[n][n];
        int i = 1;
        int x=0,y=0;
        int [][] dir = {{0,1},{1,0},{0,-1},{-1,0}
        };
        int [] dir0 = dir[0];
        int k = 0;
        while (i<=n*n)
        {
            a[x][y] = i++;
            if(!(x+dir0[0]<n)||!(y+dir0[1]<n)||!(x+dir0[0]>=0)||!(y+dir0[1]>=0)||!(a[x+dir0[0]][y+dir0[1]]==0))
            {
                k++;
                dir0 = dir[k%4];
            }
            x=x+dir0[0];
            y=y+dir0[1];
           // a[x][y] = i++;
        }
        return a;
    }
}
