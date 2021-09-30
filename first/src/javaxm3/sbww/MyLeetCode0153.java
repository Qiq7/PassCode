package javaxm3.sbww;

import java.util.*;

public class MyLeetCode0153 {
    public static void main(String[] args) {

    }
    public int minOperations(int[] target, int[] arr) {
        Map<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            m.put(target[i],i);
        }
        List<Integer> a = new ArrayList<>();
        for (int x:arr) {
            if(m.containsKey(x))
            {
                int q = m.get(x);
                int w = f(a,q);
                if(w!=a.size())
                {
                    a.set(w,q);
                }else {
                    a.add(q);
                }
            }
        }
        return target.length-a.size() ;
    }
    public int f(List<Integer> a,int target)
    {
        int size = a.size();
        if(size==0||target>a.get(a.size()-1)) return size;
        int l = 0,r = size - 1;
        while (l<r){
         int mid = (r-l)/2 + l;
         if(a.get(mid) < target)
         {
            l = mid+1;
         }else {
            r = mid;
         }
        }
        return l;
    }
}
