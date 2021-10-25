package javaxm3.sbww;
//编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
//
//每行的元素从左到右升序排列。
//每列的元素从上到下升序排列。
//

public class MyLeetcode0228 {
    public static void main(String[] args) {

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[j][matrix[j].length-1]>target&&matrix[j][0]<target){
                int l=0,r=matrix[j].length-1;
                int mid;
                while (r>=l){
                    mid=(r+l)/2;
                    if(matrix[j][mid]>target){
                        r =mid-1;
                    }else if (matrix[j][mid]<target){
                        l=mid+1;
                    }else {
                        return true;
                    }
                }
            }else if (matrix[j][0]==target||matrix[j][matrix[j].length-1]==target){
                return true;
            }
        }
        return false;
    }
}
