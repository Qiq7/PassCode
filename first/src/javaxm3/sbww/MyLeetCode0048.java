package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0048 {
    public static void main(String[] args) {

        System.out.println(minimumEffortPath(new int[][]{{1,10,6,7,9,10,4,9}}));
        //System.out.println(minimunEffortPath(new int[][]{{1,2,2},{3,8,2},{5,3,5}}));
    }
    private static int auns=666;
    private static int t;
    public static int minimumEffortPath(int [][] heights)
    {
        int[][] h=new int[heights.length][heights[0].length];
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[i].length; j++) {
                h[i][j]=0;
            }
        }
        dfs(heights,h,0,0);
        return auns;
    }
    public static void dfs(int [][] h,int[][] heigts,int x,int y)
    {
            heigts[x][y]=1;
        //System.out.println(x+"   "+y);
        //System.out.println(heigts.length+"  "+(heigts[heigts.length-1].length-1));
            if(x==heigts.length-1&&y==heigts[heigts.length-1].length-1)
            {
                auns=Math.min(auns,t);
                //System.out.println(auns);
            }
            int[][] dir=new int[][]{{1,0},{0,-1},{-1,0},{0,1}};
        for (int i = 0; i < dir.length; i++) {
            if(isOk(heigts,x+dir[i][0],y+dir[i][1]))
            {
                //System.out.println("ok");
                t=Math.max(t,Math.abs(h[x][y]-h[x+dir[i][0]][y+dir[i][1]]));
                dfs(h,heigts,x+dir[i][0],y+dir[i][1]);
                heigts[x+dir[i][0]][y+dir[i][1]]=0;
                t=0;
            }
        }
    }
    public static boolean isOk(int[][] heigts,int x,int y)
    {
        if(x<0||y<0||x>=heigts.length||y>=heigts[x].length||heigts[x][y]==1)
            return false;
        else
        return true;
    }
}
