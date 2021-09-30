package javaxm3.sbww;

public class MyLeetCode0084 {
    public static void main(String[] args) {
        int[] a= new int[]{
                10,50,100,100,50,100,100,100
    };
        //System.out.println(aus);
        System.out.println(shipWithinDays(a,5));
    }
    private static int aus = Integer.MAX_VALUE;
    public static void f(int [] w,int d,int now,int t)
    {
        if(d == 0 && now!=w.length) return;
        if(now == w.length+1&&d!=0) return;
        if(d == 0&&now==w.length)
        {
            aus = Math.min(aus,t);
            return;
        }
        int x = 0;
        for (int i = now; i <= w.length - d; i++) {
            int t0 = 0;
            x+=w[i];
            t0 = Math.max(t,x);
            f(w,d-1,i+1,t0);
        }
    }
    public static int shipWithinDays(int[] weights, int D) {
        if(D == 1)
        {
            int aum = 0;
            for (int i = 0; i < weights.length; i++) {
                aum = weights[i]+aum;
            }
            return aum;
        }else {
            f(weights,D,0,0);
        }
        return aus;
    }
}
