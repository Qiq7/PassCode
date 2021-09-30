package javaxm3.sbww;
//over#60
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyLeetCode0004 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dicesProbability(1)));
    }
    public static int Find(int x,int n, int[] b)
    {
        if (n==0) {
          b[x]++;
          return 0;
        }
        for (int i = 1; i<=6; i++) {
            Find(x+i,n-1,b);
        }
        return 0;
    }
    public static double[] dicesProbability(int n)
    {
        Map<Double,Double> a=new TreeMap<>();
        int q;
        double x=Math.pow(6,n);
        double y=1/x;
        int[] b=new int[6*n+1];
        Find(0,n,b);
        for (int i = 1; i < 6*n+1; i++) {
            if(b[i]!=0)a.put((double) i,b[i]*y);
            System.out.println(b[i]+"  "+b[i]*y);
        }
        double[] c=new double[a.size()];
        int i=0;
        for (double w:a.keySet()) {
            System.out.println(a.get(w));
                if(w!=0)
                {
                    BigDecimal bf=new BigDecimal(a.get(w));
                    c[i++] = bf.setScale(5,BigDecimal.ROUND_UP).doubleValue();
                    //System.out.println( a.get(w));
                }
        }
        return c;
    }
}
