package javaxm3.sbww;
//over#48
import java.util.Arrays;

public class MyLeetCode0036 {
    public static void main(String[] args) {
        int [][] a={{1,2,3},{4,5,6},{7,8,9}};
        int [][] b={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.deepToString(a));

                rotate(a);
    }
    public  static  void rotate(int [][] matrix)
    {
        int n=matrix.length;
        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = 0; j < (matrix.length+1)/2; j++) {
                int t=matrix[i][j];
                matrix[i][j]=matrix[n-1-j][i];
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                matrix[j][n-1-i]=t;
            }
        }


        System.out.println(Arrays.deepToString(matrix));
    }
}
