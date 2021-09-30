package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0138 {
    public static void main(String[] args) {
            findErrorNums(new int[]{1,2,2,4});
    }
    public static int[] findErrorNums(int[] nums) {
        int [] a = new int[nums.length];
        for (int x:nums) {
            a[x-1] ++;
        }
        int m = 0,n = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==2)
            {
                m = i+1;
            }
            if(a[i]==0)
            {
                n=i+1;
            }
        }
        return new int[]{m,n};
    }
}
