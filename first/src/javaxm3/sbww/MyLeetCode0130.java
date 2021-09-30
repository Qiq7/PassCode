package javaxm3.sbww;

import java.util.*;

public class MyLeetCode0130 {
    public static void main(String[] args) {

    }
    int[][] n = new int[][]{
            {1,3},{0,4,2},{1,5},{0,4},{1,3,5},{4,2}
    } ;
    public static void s(char[] x,int i,int y)
    {
            char t = x[i];
            x[i] = x[y];
            x[y] = t;
    }
    public List<String> get(String s)
    {
            List<String> a = new LinkedList<>();
            char[] x = s.toCharArray();
            int i = s.indexOf('0');
        for (int j = 0; j < n[i].length; j++) {
            s(x,n[i][j],i);
            a.add(new String(x));
            s(x,i,n[i][j]);
        }
            return a;
    }
    public int slidingPuzzle(int[][] board) {
        int aus = 0;
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                s.append(board[i][j]);
            }
        }
        String init = s.toString();
        if(init.equals("123450")) return 0;
        Queue<String> q = new LinkedList<>();
        Set<String> seem = new HashSet<>();
        q.add(s.toString());
        seem.add(s.toString());

        while (!q.isEmpty())
        {
            aus++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String b = q.poll();
                for (String m:get(b)) {
                    if(!seem.contains(m))
                    {
                        if ("123450".equals(m))
                        {
                            return aus;
                        }
                        q.add(m);
                        seem.add(m);
                    }
                }
            }
        }

        return -1;
    }
}
