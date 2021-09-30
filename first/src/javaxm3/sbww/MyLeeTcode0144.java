package javaxm3.sbww;

import java.util.*;

public class MyLeeTcode0144 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> aus = new ArrayList<List<Integer>>();
        PriorityQueue<int []> pq = new PriorityQueue<int[]>((a,b)->b[1]-a[1]);
        List<Integer> bo = new LinkedList<>();
        for (int[] x:buildings) {
            bo.add(x[0]);
            bo.add(x[1]);
        }
        Collections.sort(bo);
        int n = buildings.length,i = 0;
        for (int x:bo) {
            while (i < n && buildings[i][0] <= x)
            {
                pq.add(new int[]{buildings[i][1],buildings[i][2]});
                i++;
            }
            while (!pq.isEmpty() && pq.peek()[0] <= x)
            {
                pq.poll();
            }
            int m = pq.isEmpty()?0:pq.peek()[1];
            if(aus.size()==0||m!=aus.get(aus.size()-1).get(1))
            {
                aus.add(Arrays.asList(x,m));
            }
        }
        return aus;
    }
}
