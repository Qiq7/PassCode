package javaxm3.sbww;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLeetCode0124 {
    public static void main(String[] args) {

    }
    private static int aus = Integer.MIN_VALUE;
    public static void f(List<Integer> a,int post,int m)
    {
        if (post == a.size())
        {
            aus = Math.max(aus,Integer.bitCount(m));
            return;
        }
        if((a.get(post) & m)==0)
        {
            f(a,post+1,m|a.get(post));
        }
        f(a,post+1,m);
    }
    public int maxLength(List<String> arr) {
        List<Integer> m = new ArrayList<>();
        for (String x:arr) {
            int mt = 0;
            for (int i = 0; i < x.length(); i++) {
                int ch = x.charAt(i) - 'a';
                if(((mt >> ch ) & 1)==1)
                {
                    mt = 0;
                    break;
                }
                mt |= (1 << ch);
            }
            if(mt > 0)
            {
                m.add(mt);
            }

        }
        f(m,0,0);
        return aus;
    }
}
