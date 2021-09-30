package javaxm3.sbww;

import java.util.Arrays;

public class MyleetCode0071 {
    public static void main(String[] args) {
        nthUglyNumber(10);
    }
    public static int nthUglyNumber(int n) {
        int [] dp = new int[n+1];
        int p0 = 1,p1 = 1,p2 = 1;
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
            int n0 = dp[p0]*2,n1 = dp[p1]*3,n2 = dp[p2]*5;
            dp[i] = Math.min(Math.min(n0,n1),n2);
            if(dp[i] == n0)
            {
                p0++;
            } if(dp[i]==n1)
            {
                p1++;
            } if(dp[i] == n2){
                p2++;
            }
        }
        //System.out.println(Arrays.toString(dp));
        return dp[n];
    }
    public static boolean isUgly(int n)
    {
        if (n == 0) return false;
        if(n == 1||n == 3||n == 2||n == 5)
        {
            return true;
        }else {
            if(n%2 == 0) return isUgly(n/2);
            if(n%3 == 0) return isUgly(n/3);
            if(n%5 == 0) return isUgly(n/5);
        }
        return false;
    }
}
