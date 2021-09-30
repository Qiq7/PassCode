package javaxm3.sbww;
//over#493
import java.util.Arrays;

public class MyLeetCode0020 {
    public static void main(String[] args) {
        int [] a={2,4,3,5,1};
        System.out.println(reversePairs(a));
        System.out.println(Arrays.toString(a));
    }
    public static int reversePairs(int[] nums)
    {
        if(nums.length==0) return 0;
        return f(nums,0,nums.length-1);
    }
    public static int f(int [] nums,int x,int y)
    {
        if(x==y) return 0;
        int n=0,m=(x+y)/2;
        n+=f(nums,x,m);
        n+=f(nums,m+1,y);
        int i=x,j=m+1;
        while (i<=m)
        {
            //j=m+1;
            while (j<=y)
            {
                if((long)nums[i]<=(long)nums[j]*2)
                {
                    break;
                }else
                {
                    j++;
                }
            }
            n+=j-m-1;
            i++;
        }
        System.out.println(n);
        int[] resord=new int[y-x+1];
        i=x;j=m+1;
        int p=0;
        while(i<=m||j<=y)
        {
            if(i>m)
            {
                resord[p++]=nums[j++];
            }else if(j>y)
            {
                resord[p++]=nums[i++];
            }else{
                if (nums[i]>nums[j]) {
                    resord[p++]=nums[j++];
                }else{
                    resord[p++]=nums[i++];
                }
            }
        }
        i=x;
        for (int k:resord) {
            nums[i++] = k;
        }
        return n;
    }
}

