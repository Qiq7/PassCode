package javaxm3.sbww;

import java.util.LinkedList;

public class MyLeetCode0038b {
    public static void main(String[] args) {

    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] a=new int[nums.length-k+1];
        LinkedList<Integer> q=new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!q.isEmpty()&&nums[i]>=nums[q.peekLast()])
            {
                q.pollLast();
            }
            q.offerLast(i);
        }
        a[0]=nums[q.peekFirst()];
        for (int i = k; i < nums.length; i++) {
            while (!q.isEmpty()&&nums[i]>=nums[q.peekLast()])
            {
                q.pollLast();
            }
            q.offerLast(i);
            while (q.peekFirst()<=i-k)
            {
                q.pollFirst();
            }
            a[i-k+1]=nums[q.peekFirst()];
        }
        return a;
    }

}
