package javaxm3.sbww;

import java.util.Arrays;

public class Solution {
    int[] pre;
    int total;
    public Solution(int[] w)
    {
        pre = new int[w.length];
        pre[0] = w[0];
        for (int i = 1; i < pre.length; i++) {
            pre[i] = pre[i-1]+w[i];
        }
        total = Arrays.stream(w).sum();
    }
    public int f(int x)
    {
        int l = 0,r = pre.length-1;
        while (l<r)
        {
            int mid = (r-l)/2+l;
            if(pre[mid]<x)
            {
                l = mid+1;
            }else {
                r = mid;
            }
        }
        return l;
    }
    public int pickIndex() {


        int x = (int) (Math.random()*total)+1;
        return f(x);
    }


}
