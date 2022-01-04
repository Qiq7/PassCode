package javaxm3.sbww;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyLeetCode0262 {

    public static void main(String[] args) {
        MyLeetCode0262 a = new MyLeetCode0262();
        a.loudAndRich(new int[][]{
                {1,0},{2,1},{3,1},{3,7},{4,3},{5,3},{6,3}
        },new int[]{
                3,2,5,4,6,1,7,0
        });
    }

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int[] aus = new int[quiet.length];
        List<Integer>[] map = new ArrayList[quiet.length];

        for (int i = 0; i < quiet.length; i++) {
            map[i] = new ArrayList<>();
        }


        for (int [] x:richer) {
            map[x[1]].add(x[0]);
        }
        Arrays.fill(aus,-1);

        for (int i = 0; i < quiet.length; i++) {
            dfs(i,quiet,map,aus);
        }
        return aus;
    }
    public void dfs(int x,int[] quiet,List<Integer>[] map,int [] aus){
        if (aus[x]!=-1){
            return;
        }
        aus[x] = x;
        for (Integer a:map[x]) {
            dfs(a,quiet,map,aus);
            if (quiet[aus[a]]<quiet[aus[x]]){
                aus[x] = aus[a];
            }
        }
    }
}
