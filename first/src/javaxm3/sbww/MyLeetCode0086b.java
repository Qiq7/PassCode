package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0086b {
    public static void main(String[] args) {

    }
    private static Boolean [][] res;
    public static boolean dfs(int [] st,int i,int lastdis)
    {
        if(i == st.length - 1 )
        {
            return true;
        }
        if(res[i][lastdis] != null)
        {
            return res[i][lastdis];
        }
        for (int j = lastdis - 1; j <= lastdis+1 ; j++) {
            if(j>0) {
                int k = Arrays.binarySearch(st, i + 1, st.length,st[i]+j);
                if(j>=0&&dfs(st,k,j))
                {
                    return res[i][j] =true;
                }
            }
        }
        return res[i][lastdis] = false;
    }
    public static boolean canCross(int[] stones) {
        res = new Boolean[stones.length][stones.length];
        return dfs(stones,0,0);
    }
}
