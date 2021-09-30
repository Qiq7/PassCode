package javaxm3.sbww;

import java.util.Arrays;

public class MyLeeTcode0145 {
    public static void main(String[] args) {

    }
    public int f(int [] num,int target)
    {
        int l = 0,r = num.length - 1;
        int mid;
        if(num[r] < target)
        {
            return r + 1;
        }
        while (l<r)
        {
            mid = l+(r-l)/2;
            if(num[mid]<target)
            {
                l = mid + 1;
            }else {
                r = mid;
            }
        }
        return l;
    }
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int aus = 0,MOD = 1000000007,m = 0;
        int n = nums1.length;
        int[] ret = new int[n];
        System.arraycopy(nums1,0,ret,0,n);
        Arrays.sort(ret);
        for (int i = 0; i < n; i++) {
            int dif = Math.abs(nums1[i]-nums2[i]),j = f(ret,nums2[i]);
            aus = (aus + dif)%MOD;
            if(j<n)
            {
                m = Math.max(m,dif - (ret[j] - nums2[i]));
            }
            if(j>0)
            {
                m = Math.max(m,dif - (nums2[i] - ret[j - 1]));
            }
        }
        return (aus - m + MOD)%MOD;
    }
}
