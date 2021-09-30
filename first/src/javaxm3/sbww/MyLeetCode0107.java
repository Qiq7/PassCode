package javaxm3.sbww;

public class MyLeetCode0107 {
    public static void main(String[] args) {

    }
    public int[] maximizeXor(int[] nums, int[][] queries) {
        int [] a = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            a[i] = -1;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]<=queries[i][1])
                {
                    a[i] = Math.max(a[i],nums[j]^queries[i][0]);
                }
            }
        }
        return a;
    }
}
