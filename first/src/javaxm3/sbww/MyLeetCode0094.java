package javaxm3.sbww;
//error
import java.util.*;

public class MyLeetCode0094 {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.numberOfTrailingZeros(a));
        //System.out.println(minimumTimeRequired(new int[]{1,2,3,4},3));
    }
    public static int minimumTimeRequired(int[] jobs, int k) {
        int aus = 0;
        int [] m = new int[k];
        Arrays.sort(jobs);
        Queue<Integer> a = new LinkedList<>();
        for (int i = jobs.length-1; i >= 0; i--) {
            a.add(jobs[i]);
        }
        while (!a.isEmpty())
        {
            int mi = 666;
            for (int i = 0; i < m.length&&!a.isEmpty(); i++){
                if(m[i]==0) {
                    m[i] = m[i] + a.poll();
                }
                    mi = Math.min(mi,m[i]);
            }
            aus += mi;
            for (int i = 0; i < m.length; i++) {
                m[i] -= mi;
            }
            Arrays.sort(m);
        }
        int ma = 0;
        for (int i = 0; i < m.length; i++) {
            ma = Math.max(ma,m[i]);
        }
        aus += ma;
        return aus;
    }
}
