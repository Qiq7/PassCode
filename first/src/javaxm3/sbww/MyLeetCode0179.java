package javaxm3.sbww;

import java.util.LinkedList;
import java.util.List;

public class MyLeetCode0179 {
    public static void main(String[] args) {
    }
    public List<List<Integer>> aus;
    public void f(List<Integer> a,boolean[] vis,int[][] map,int i)
    {
            if(i == map.length-1)
            {
                System.out.println(a);
                aus.add(new LinkedList<>(a));
                System.out.println(aus);
                return;
            }else {
                for (int j = 0; j < map[i].length ; j++) {
                    if(map[i][j]==1&&!vis[j])
                    {
                        a.add(j);
                        vis[j] = true;
                        f(a,vis,map,j);
                        //a.remove(a.get(a.size()-1));
                        vis[j] = false;
                    }
                }
            }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        aus = new LinkedList<>();
        int [][] map = new int[graph.length][graph.length];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                map[i][graph[i][j]] = 1;
            }
        }
        boolean[] visited = new boolean[graph.length];
        visited[0] = true;
        for (int i = 0; i < map[0].length; i++) {
            List<Integer> a = new LinkedList<>();
            a.add(0);
            if(map[0][i]==1&&!visited[i])
            {
                a.add(i);
                visited[i] = true;
                f(a,visited,map,i);
                //a.remove(a.get(a.size()-1));
                visited[i] = false;
            }
        }
        return aus;
    }
}
