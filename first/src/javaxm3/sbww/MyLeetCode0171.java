package javaxm3.sbww;

import java.util.ArrayList;
import java.util.List;

public class MyLeetCode0171 {
    public static void main(String[] args) {

    }
    List<Integer>[] lists;
    int aus = 0;
    boolean[] visit;

    public void f(int i,int n)
    {
        if(i==n+1)
        {
            aus++;
            return;
        }
        for (int x:lists[i]) {
            if (!visit[x])
            {
                visit[x] =true;
                f(i+1,n);
                visit[x] =false;
            }
        }
    }
    public int countArrangement(int n) {
        lists = new List[n+1];
        visit = new boolean[n+1];
        for (int i = 0; i < n+1; i++) {
            lists[i] = new ArrayList<>();
        }
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i%j==0||j%i==0)
                {
                    lists[i].add(j);
                }
            }
        }
        f(1,n);
        return aus;
    }
}
