package javaxm3.sbww;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MyLeetCode0038 {
    public static void main(String[] args) {

    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] b=new int[nums.length-k+1];
        PriorityQueue<int[]> p =new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0]?o2[0]-o1[0]:o2[1]-o2[1];
            }
        });
        for (int i = 0; i < k; i++) {
            p.offer(new int[]{nums[i],i});
        }
        b[0]=p.peek()[0];
        for (int i = k; i < nums.length; i++) {
            p.offer(new int[]{nums[i],i});
            while (p.peek()[1]<=i-k)
            {
                p.poll();
            }
            b[i-k+1]=p.peek()[0];
        }
        return b;
    }
}
