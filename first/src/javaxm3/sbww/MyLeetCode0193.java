package javaxm3.sbww;

import java.util.HashMap;
import java.util.Map;

public class MyLeetCode0193 {
    public static void main(String[] args) {

    }
    public int numberOfBoomerangs(int[][] points) {
        int aus = 0;
        for (int [] x:points) {
            Map<Integer,Integer> a = new HashMap<>();
            for (int [] y:points) {
                int val = (x[0]-y[0])*(x[0]-y[0])+(x[1]-y[1])*(x[1]-y[1]);
                a.put(val,a.getOrDefault(val,0)+1);
            }

            for (Map.Entry<Integer,Integer> v :a.entrySet()) {
                    int m = v.getValue();
                    aus+=m*(m-1);
            }
        }



        return aus;
    }
}
