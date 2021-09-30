package javaxm3.sbww;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyLeetCode0161 {
    public static void main(String[] args) {

    }
    public boolean f(int[][] g,int [] color ,int x)
    {
        if(color[x]>0)
        {
            return color[x] == 2;
        }
        color[x] = 1;
        for (int a:g[x]) {
            if(!f(g,color,a)) return false;
        }
        color[x] = 2;
        return true;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> aus = new LinkedList<>();
        int n = graph.length;
        int [] color = new int[n];
        for (int i = 0; i < n; i++) {
            if(f(graph,color,i)) aus.add(i);
        }
        return aus;
    }
}
