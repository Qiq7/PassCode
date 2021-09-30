package javaxm3.sbww;
//over#134
public class MyLeetCode0005 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={3,4,5,1,2};
        System.out.println(canComletteCiruit(a,b));
    }
    public static int canComletteCiruit(int[] gas,int[] cost)
    {
        int now,ad=0,j=0;
        for (int i = 0; i < gas.length; i++) {
            ad=gas[i];
            now=ad-cost[i];
            int t=i;
            if(now>=0)
            {
                for (int k = (t+1)%gas.length;; k++) {
                    if(k%gas.length==t) return t;
                        //ad=ad+gas[k%gas.length];
                        now=now+gas[k%gas.length]-cost[k%gas.length];
                       // System.out.println(now);
                        if(now<0) break;
                }

            }
        }
        return -1;
    }
}
