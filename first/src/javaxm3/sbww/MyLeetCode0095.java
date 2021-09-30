package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0095 {
    public static void main(String[] args) {
        System.out.println(minDays(new int[]{7,7,7,12,7,7},2,3));
    }
    public static boolean f(int[] bi,int m,int k,int tar)
    {
        int [] b = new int[bi.length];
        int aus = 0;
        for (int i = 0; i < b.length; i++) {
            b[i] = bi[i] - tar;
        }
        int kc = 0;
        for (int i = 0; i < b.length; i++) {
            if(b[i]>0)
            {
                kc = 0;
                continue;
            }
            if(b[i]<=0)
            {
                kc++;
            }
            if(kc == k)
            {
                aus++;
                kc = 0;
            }
        }
        return aus >= m?true:false;
    }
    public static int minDays(int[] bloomDay, int m, int k) {
            int aus = 0;
            if(k*m>bloomDay.length)
            {
                return -1;
            }
            int n1 = bloomDay[0],m1=bloomDay[0];
        for (int i = 0; i < bloomDay.length; i++) {
            n1 = Math.min(n1,bloomDay[i]);
            m1 = Math.max(m1,bloomDay[i]);
        }
        int l = n1,r = m1;
        //System.out.println(l+"  "+r);
        while (l<r){
            int tar = (l+r)/2;
            //System.out.println(tar);
            if(f(bloomDay,m,k,tar))
            {
                r = tar;
            }else{
                l = tar+1;
            }
            //System.out.println(l+"  "+r);
        }
        return l;
    }
}
