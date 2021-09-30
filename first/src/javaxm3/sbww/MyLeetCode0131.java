package javaxm3.sbww;

import java.util.LinkedList;
import java.util.Queue;

public class MyLeetCode0131 {
    public static void main(String[] args) {

    }
    public static int[] f(int x,int n)
    {
        int l = (x-1)/n,r = (x-1)%n;
        if(l%2==1)
        {
            r = n - r -1;
        }
        return new int[]{
            n - 1 - l,r
        };
    }
    public int snakesAndLadders(int[][] board) {

        Queue<int[]> q = new LinkedList<>();
         int n = board.length;
         boolean[] vised = new boolean[n*n+1];
        q.add(new int[]{1,0});

        while (!q.isEmpty())
        {
            int [] a = q.poll();
            for (int i = 1; i <= 6 ; i++) {
                int next = a[0] + i;
                if(next>n*n) break;
                int [] z = f(next,n);
                if(board[z[0]][z[1]]>0)
                {
                    next = board[z[0]][z[1]];
                }
                if(next == n*n)
                {
                    return a[1]+1;
                }
                if(!vised[next])
                {
                    vised[next] = true;
                    q.add(new int[]{
                       next,a[1]+1
                    });
                }
            }
        }
        return -1;
    }
}
