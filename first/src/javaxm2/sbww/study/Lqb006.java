package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.Scanner;

public class Lqb006 {
    public static boolean ff(int [] n)
    {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 0)
            {
                return true;
            }
        }
        return false;
    }
    public static int f(int[] m,int [] n)
    {
        int aus = 0;
        while (ff(n))
        {
            for (int i = m.length-1; i >=0 ; i--) {
                if(n[i] == 0)
                {
                    n[i] = 1;
                    int ma = m[i];
                    for (int j = i; j >=0 ; j--) {
                        if(m[j]>ma&&n[j]==0)
                        {
                            ma = m[j];
                            n[j] = 1;
                        }
                    }
                    aus++;
                }
            }
        }
        return aus;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] s1 = s.split(" ");
        int [] n = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            n[i] = Integer.parseInt(s1[i]);
        }
        int [] a = new int[n.length];
        int[][] map =new int[n.length][n.length+1];
        for (int i = 0; i < n.length; i++) {
            map[i][0] = 0;
        }
        int ma = 0;
        //map[0][1] =1;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j <= i; j++) {
                if(n[j]>n[i])
                {
                    map[i][j+1] = Math.max(map[j][j+1]+1,map[i][j]);
                    if(ma < map[i][j+1])
                    {
                        ma = map[i][j+1];
                    }
                }else {
                    map[i][j+1] = map[i][j];
                }
            }
        }
        //System.out.println(Arrays.deepToString(map));
        System.out.println(ma+1);
        System.out.println(f(n,a));
        //System.out.println(Arrays.toString(n));
    }
}
