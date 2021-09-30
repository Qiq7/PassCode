package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0006 {
    public static void main(String[] args) {
        int[] a={1};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
    public static void moveZeroes(int[] nums)
    {
        int i=0,j,n=nums.length;
        while(i<n)
        {
            if(i>=n) break;
            while (nums[i]!=0)
            {
                i++;
                if(i>=n&&nums[i-1]!=0)
                {
                    return;
                }
            }
            for ( j = i; j < n; j++) {
                if(nums[j]!=0) break;
            }
            if (j==n) j--;
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            System.out.println(t);
        }
    }
}
