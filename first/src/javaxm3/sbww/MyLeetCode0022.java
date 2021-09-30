package javaxm3.sbww;
//over#75
import java.util.Arrays;

public class MyLeetCode0022 {
    public static void main(String[] args) {
     int [] a={2,1,2};
     sortColors(a);
    }
    public static void sortColors(int[] nums)
    {
        if(nums.length<=1) {
            System.out.println(Arrays.toString(nums));
            return;
        }
        int p0=0,p2=nums.length-1,i=0;
        int t;
        while (i<=p2)
        {
            while (i<=p2&&nums[i]==2)
            {
                t=nums[p2];
                nums[p2--]=nums[i];
                nums[i]=t;
            }
            if(nums[i]==0)
            {
                t=nums[p0];
                nums[p0++]=nums[i];
                nums[i]=t;
            }
            if(nums[i]==1)
            {
                i++;
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
