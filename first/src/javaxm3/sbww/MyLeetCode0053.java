package javaxm3.sbww;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyLeetCode0053 {
    public static void main(String[] args) {
        int[][] a= new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(Arrays.deepToString(a));
        System.out.println(spiralOder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
    public static boolean isok(int x, int y,int[][] m)
    {
        return m[x][y]==1?false:true;
    }
    public static List<Integer> spiralOder(int [][] matrix)
    {
        List<Integer> aus = new LinkedList<>();
        int [][] m =new int[matrix.length][matrix[0].length];
        int n = matrix.length*matrix[0].length;
        int i = 0,x=0,y=0;
        while (i < n)
        {
            while (y<matrix[0].length&&isok(x,y,m)){
                System.out.println(matrix[x][y]);
                aus.add(matrix[x][y]);
                m[x][y] = 1;
                y++;
                i++;
            }
            y--;
            x++;
            while (x<matrix.length&&isok(x,y,m)){
                System.out.println(matrix[x][y]);
                aus.add(matrix[x][y]);
                m[x][y] = 1;
                x++;
                i++;
            }
            x--;y--;
            while (y>=0&&isok(x,y,m)){
                System.out.println(matrix[x][y]);
                aus.add(matrix[x][y]);
                m[x][y] = 1;
                y--;
                i++;
            }
            y++;
            x--;
            while (x>=0&&isok(x,y,m)){
                System.out.println(matrix[x][y]);
                aus.add(matrix[x][y]);
                m[x][y] = 1;
                x--;
                i++;
            }
            x++;
            y++;
        }
        return aus;
    }
}
