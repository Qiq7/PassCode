package javaxm3.sbww;

import java.util.*;

public class MyLeetCode0128 {
    public static void main(String[] args) {

    }
    public static char numpre(char x)
    {
        return x == '0' ? '9': (char)(x - 1);
    }
    public static char numN(char x)
    {
        return x == '9'?'0':(char)(x + 1);
    }
    public static List<String> get(String x)
    {
        List<String> a = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            char[] m1 = x.toCharArray(),m2 = x.toCharArray();
            m1[i] = numN(m1[i]);
            m2[i] = numpre(m2[i]);
            a.add(new String(m1));
            a.add(new String(m2));
        }
        return a;
    }
    public int openLock(String[] deadends, String target) {
        if(target.equals("0000"))
        {
            return 0;
        }
            int aus = 0;
            if ("0000".equals(target))return -1;
            Set<String> dead = new HashSet<>(),q1 = new HashSet<>();
        for (String x:deadends) {
            dead.add(x);
        }
        if(dead.contains("0000"))
        {
            return -1;
        }
        Queue<String> q = new LinkedList<>();
        q.offer("0000");
        q1.add("0000");
        while (!q.isEmpty())
        {
            aus++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String next = q.poll();
                for (String x:get(next)) {
                    if(!dead.contains(x)&&!q1.contains(x))
                    {
                        if(x.equals(target))
                        {
                            return aus;
                        }
                        q1.add(x);
                        q.add(x);
                    }
                }
            }
        }
        return -1;
    }
}
