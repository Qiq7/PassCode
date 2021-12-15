package javaxm3.sbww;

import java.util.HashMap;
import java.util.Map;

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
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < richer.length; i++) {
            int a = richer[i][0],
                    b = richer[i][1];
            int an = map.getOrDefault(a,0);
            if (an==0){
                map.put(a,map.getOrDefault(b,0)+1);
            }else {
                map.put(a,map.get(a)+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"===="+entry.getValue());
        }




        return aus;
    }
}
