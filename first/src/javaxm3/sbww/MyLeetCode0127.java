package javaxm3.sbww;


import java.util.HashMap;
import java.util.Map;

public class MyLeetCode0127 {
    public static void main(String[] args) {

    }
    public static int gcd(int a,int b)
    {
        return b!=0? gcd(b,a%b):a;
    }
    public int maxPoints(int[][] points) {
        int aus = 0;
        if(points.length <= 2)
        {
            return points.length;
        }
        for (int i = 0; i < points.length; i++) {
            Map<Integer,Integer> m = new HashMap<>();
            for (int j = i+1; j < points.length; j++) {
                int x = points[i][0]-points[j][0];
                int y = (points[i][1]-points[j][1]);
                if (x == 0)
                {
                    y = 1;
                }else if(y == 0)
                {
                    x = 1;
                }else
                {
                    if(y<0)
                    {
                        x = -x;
                        y = -y;
                    }
                    int gcdxy = gcd(Math.abs(x),Math.abs(y));
                    x /= gcdxy;
                    y /= gcdxy;
                }
                int key = y + 20001*x;
                m.put(key,m.getOrDefault(key,1)+1);
            }
            int Maxa = 0;
            for (Map.Entry<Integer , Integer> a:m.entrySet())
            {
                int num = a.getValue();
                Maxa = Math.max(Maxa,num);
            }
            aus = Math.max(aus,Maxa);
        }
        return aus;
    }
}
