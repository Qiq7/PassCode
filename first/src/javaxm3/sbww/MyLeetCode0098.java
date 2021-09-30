package javaxm3.sbww;

public class MyLeetCode0098 {
    public static void main(String[] args) {

    }
    public static int f(int [] a,int x,int y)
    {
        int aus = 0;
        for (int i = x; i <= y ; i++) {
            aus ^= a[i];
        }
        return aus;
    }
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int [] aus = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            aus[i] = f(arr,queries[i][0],queries[i][1]);
        }
        return aus;
    }
}
