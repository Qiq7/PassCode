package javaxm3.sbww;

public class MyLeetCode0086 {
    public static void main(String[] args) {
        int [] a = {
                0,1,2,3,4,8,9,11
        };
        System.out.println(canCross(a));
    }
    private static boolean t = false;
    public static  boolean isok(int [] st,int i,int now,int i0)
    {
        if(now == st[i]-st[i0]||now == st[i]-st[i0]-1||now==st[i]-st[i0]+1)
        {
            return true;
        }else{
            return false;
        }
    }
    public static void f(int [] st,int now ,int i0)
    {
            if(i0 == st.length-1)
            {
                t = true;
                return;
            }
        for (int i = i0+1; i < st.length; i++) {
            if(isok(st,i,now,i0))
            {
                //System.out.println(i);
                f(st,st[i]-st[i0],i);
            }
        }
    }
    public static boolean canCross(int[] stones) {
        int now = 1;
        f(stones,now,0);
        return t;
    }
}
