package javaxm3.sbww;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyLeetCode0089 {
    public static void main(String[] args) {

    }
    public static int leastBricks(List<List<Integer>> wall) {
        int n = wall.size();
        HashMap<Integer,Integer> m = new HashMap<>();
        for (List x:wall) {
            int y = 0;
            for (Object a:x) {
                y+=(Integer) a;
                m.put(y,m.getOrDefault(y,0)+1);
            }
            m.remove(y);
        }
        int s = 0;
        for (Map.Entry<Integer,Integer> m0:m.entrySet()) {
            s = Math.max(s,m0.getValue());
        }
        return n - s;
    }
}
