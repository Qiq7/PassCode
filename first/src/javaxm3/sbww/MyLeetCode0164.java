package javaxm3.sbww;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class MyLeetCode0164 {
    public static void main(String[] args) {

    }
    public int nthSuperUglyNumber(int n, int[] primes) {
        Queue<Long> q = new PriorityQueue<>();
        Set<Long> s = new HashSet<>();
        q.offer(1l);
        s.add(1l);
        int ugly = 0;
        for (int i = 0; i < n; i++) {
            long cur = q.poll();
            ugly = (int) cur;
            for (int x:primes) {
                if(s.add((long)x*cur)){
                    q.offer((long)x*cur);
                }
            }
        }
        return ugly;
    }
}
