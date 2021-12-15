package javaxm3.sbww;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MyLeetCode0261 {

    public static void main(String[] args) {
        MyLeetCode0261 a = new MyLeetCode0261();
        a.scheduleCourse(new int[][]{
                {100,200},{200,1300},{1000,1250},{2000,3200}
//                {3,2},{4,3}
//                {5,15},{3,19},{6,7},{2,10},{5,16},{8,14},{10,11},{2,19}
        });
    }

    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(x,y)->{
            return x[1]-y[1];
        });
        PriorityQueue<Integer> q = new PriorityQueue<>((x,y)->y-x);

        int total = 0;
        for (int [] x:courses) {
            int t1 = x[0],d = x[1];
            if (total+t1<=d){
                total+=t1;
                q.offer(t1);
            } else if (!q.isEmpty()&&q.peek()>t1) {
                total -= q.poll() - t1;
                q.offer(t1);
            }
        }

        return q.size();
    }
}
