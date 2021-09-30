package javaxm2.sbww.study;

import java.util.*;

public class Lqb008 {
    public static boolean isok(double d,double c,double d2)
    {
        if(d<=0)
        {
            return false;
        }
        if(d2 * c >= d)
        {
            return true;
        }
        return false;
    }
    public static void f(double[][] m)
    {
        double [] t;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length - 1; j++) {
                if(m[j+1][1]<m[j][1]){
                    t = m[j];
                    m[j] = m[j+1];
                    m[j+1] = t;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1,c,d2,p;
        double aus = 0;
        int n;
        d1 = sc.nextDouble(); //两个城市的距离
        c = sc.nextDouble();  //油箱容量
        d2 = sc.nextDouble();  //每升油行驶距离
        p = sc.nextDouble();   //出发点油价
        n = sc.nextInt();     //加油站数
        //double[] pi = new double[n+1];   //对应油站价格
        //double[] di = new double[n+1];  //格油站到出发点的距离
        double[][] pd = new double[n][2];
        for (int i = 0; i < n; i++) {
            pd[i][0] = sc.nextDouble(); //距离
            pd[i][1] = sc.nextDouble(); //价格
        }
        f(pd);
        double nowc = 0;
        double nowp = p;
        double nowd = 0;
        boolean tag = true;
        //System.out.println(Arrays.deepToString(pd));
        while (d1 != 0)
        {

            int l = -1;
            double nextlowp = 666;
            for (int i = 0; i < pd.length; i++) {
                if(isok(pd[i][0] - nowd,c,d2)&&pd[i][1] < nextlowp )
                {
                    nextlowp = pd[i][1];
                    l = i;
                }
            }
            if(l==-1)
            {
                if (isok(d1,c,d2))
                {
                    aus += nowp*((d1-nowc*d2)/d2);
                    d1 = 0;
                }else{
                    d1 = 0;
                    tag = false;
                    break;
                }
            }else{
                if(nowp <= nextlowp)
                {
                    if(isok(d1,c,d2)){
                        aus += nowp*((d1 - (nowc*d2))/d2);
                        d1 = 0;
                    }else {
                        aus += nowp * (c - nowc);
                        d1 = d1 - (pd[l][0]-nowd);
                        nowc = c - ((pd[l][0]-nowd)/d2);
                        nowd = pd[l][0];
                        nowp = nextlowp;
                        //System.out.println(nowd+" "+nowp+" "+nowc+" ");
                    }
                }else{
                    aus += nowp*((pd[l][0]-nowd)/d2);
                    d1 = d1 - (pd[l][0]-nowd);
                    nowp = nextlowp;
                    nowc = nowc;
                    nowd = pd[l][0];
                }
            }

        }
        if (tag)System.out.println(String.format("%.2f",aus));
        else {
            System.out.println("No Solution");
        }

    }
}
