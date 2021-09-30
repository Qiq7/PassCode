package javaxm3.sbww;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MyLeetcode0059 {
    public static void main(String[] args) {

    }
    public static void f(int[][] matrix,int x,int y)
    {
        int i = 0, j =0;
        while (j<matrix[x].length)
        {
            matrix[x][j++] = 0;
        }
        while (i<matrix.length)
        {
            matrix[i++][y] = 0;
        }
    }
    public static void setZeroes(int[][] matrix) {
        List<List<Integer>> a = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0)
                {
                    List<Integer> b= new LinkedList<>();
                    b.add(i);
                    b.add(j);
                    a.add(b);
                }
            }
        }
        for (int i = 0; i < a.size(); i++) {
            f(matrix,a.get(i).get(0),a.get(i).get(1));
        }
    }
}
