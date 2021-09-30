package javaxm3.sbww;

import java.util.LinkedList;
import java.util.Queue;

public class MyLeetCode0187 {
    public static void main(String[] args) {
    }
    public int balancedStringSplit(String s) {
        Queue<Character> a = new LinkedList<>();
        int aus = 0;
        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            if(a.isEmpty())
            {
                if(i!=0) aus++;
                a.offer(b);
                System.out.println(i+" "+aus);
                continue;
            }else{
                char c = a.poll();
                if(c==b)
                {
                    a.offer(c);
                    a.offer(b);
                }
            }
        }
        if (!s.equals("")&&a.isEmpty())
        {
            aus++;
        }
        return aus;
    }
}
