package javaxm3.sbww;

public class MyLeetCode0062 {
    public static void main(String[] args) {

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean flag = true;
        for (int i = 0; i < matrix.length; i++) {
            if(flag&&target<=matrix[i][matrix[i].length-1])
            {
                flag = false;
                for (int j = matrix[i].length-1; j >= 0; j--) {
                    if(target == matrix[i][j])
                    {
                        return true;
                    }
                }
            }
            if (!flag)
            {
                break;
            }
        }
        return false;
    }
}
