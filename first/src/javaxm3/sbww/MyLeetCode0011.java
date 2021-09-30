package javaxm3.sbww;
//over#452
import java.util.Arrays;
import java.util.Comparator;

public class MyLeetCode0011 {
    public static void main(String[] args) {
        int[][] a={{-2147483646,-2147483645},{2147483646,2147483647}};
        int[][] b={{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShouts(b));
        System.out.println(Arrays.deepToString(b));
    }
    public static int findMinArrowShouts(int[][] points)
    {
        int nus=1;
        if(points.length==1)return 1;
        if (points.length==0) return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]>o2[1]) return 1;
                else if (o1[1]<o2[1]) return -1;
                else return 0;
            }
        });
        int t=points[0][1];
        for (int i = 0; i < points.length; i++) {
            if(t<points[i][0])
            {
                nus++;
                t=points[i][1];
            }
            System.out.println(t);
        }
        return nus;
    }
}
