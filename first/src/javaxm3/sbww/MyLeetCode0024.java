package javaxm3.sbww;
//over#34
import java.util.Arrays;

public class MyLeetCode0024 {
    public static void main(String[] args) {
        int[] a={2,2};
        System.out.println(Arrays.toString(searchRange(a,2)));
    }
    public static int f(int[] nums,int target,boolean g)
    {
        int l=0,r=nums.length-1;
        int m,ans=nums.length;
        while (r>=l)
        {
            m=(r+l)/2;
            if(nums[m]>target||g&&nums[m]>=target)
            {
                r=m-1;
                ans=m;
            }else
            {
                l=m+1;
            }
        }
        return ans;
    }
    public static int[] searchRange(int[] nums,int target)
    {
        int[] a={-1,-1};
        int l=f(nums,target,true);
        int r=f(nums,target,false)-1;
        if(l<=nums.length-1&&r<=nums.length&&nums[l]==target&&nums[r]==target)
        {
            return new int[]{l,r};
        }else return a;
    }
}
