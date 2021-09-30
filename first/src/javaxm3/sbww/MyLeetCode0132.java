package javaxm3.sbww;

import java.util.*;

public class MyLeetCode0132 {
    public static void main(String[] args) {

    }
    public static boolean isok(int[] x,int target)
    {
        for (int a:x) {
            if(a == target)
            {
                return true;
            }
        }
        return false;
    }
    public static boolean f(int [] x,int a)
    {
        for (int i = 0; i < x.length; i++) {
            if(x[i]==a)
            {
                return true;
            }
        }
        return false;
    }
    public static List<int[]> get(int[][] routes,int target,boolean[] b)
    {
        List<int[]> a = new LinkedList<>();
        for (int i = 0; i < routes.length; i++) {
            if(f(routes[i],target))
            {
                if(!b[i])
                {
                    a.add(routes[i]);
                }
            }
        }
        return a;
    }
    public int numBusesToDestination(int[][] routes, int source, int target) {
        int aus = 0;
        Queue<int[]> q = new LinkedList<>();
        Map<int[],Integer> bus = new HashMap<>();
        boolean[] b = new boolean[routes.length];
        for (int i = 0; i < routes.length; i++) {
            bus.put(routes[i],i);
        }
        for (int[] x:routes) {
            if(f(x,source))
            {
                if(isok(x,target))
                {
                    if(source == target)
                    {
                        return 0;
                    }
                    return 1;
                }
                q.add(x);
            }
        }
        while (!q.isEmpty())
        {
            aus++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int [] a = q.poll();
                b[bus.get(a)] = true;
                for (int j = 0; j < a.length; j++) {
                    for (int [] x:get(routes,a[j],b)) {
                        if(isok(x,target))
                        {
                            return aus+1;
                        }
                        q.add(x);
                    }
                }
            }
        }

        return -1;
    }
}
