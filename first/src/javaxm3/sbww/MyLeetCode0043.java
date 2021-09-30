package javaxm3.sbww;

import java.util.ArrayList;
import java.util.List;

public class MyLeetCode0043 {
    static List<Integer>[] edge;
    static boolean a[];
    static int aus;
    public static void main(String[] args) {
        System.out.println(makeConnected(4,new int[][]{{0,1},{1,2},{0,2}}));
    }
    public static int makeConnected(int n,int [][] connections)
    {
        if(n-1>connections.length) return -1;
        edge=new List[n];
        a =new boolean[n];
        aus=0;
        for (int i = 0; i < n; i++){
            edge[i]=new ArrayList<Integer>();
        }
        for (int[] c:connections) {
                edge[c[0]].add(c[1]);
                edge[c[1]].add(c[0]);
        }
        for (int i = 0; i < n; i++) {
            if(!a[i])
            {
                dfs(i);
                aus++;
            }
        }
        return aus-1;
    }
    public static void dfs(int i)
    {
        a[i]=true;
        for (int i1:edge[i]) {
            if(!a[i1])
            {
                dfs(i1);
            }
        }
    }
}
