package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.Scanner;

public class lqb003 {
    private static int aus = 0;
    private static int[] kv = new int[21];
    private static int a = 1;
    private static int[] a1 = new int[21];
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        if(n<2) System.out.println(0);
        else {
            for (int i = 1; i <= n; i++) {
                a1[a++] = i;
                kv[i] = 1;
                dfs(2, n);
                kv[i] = 0;
                a--;
            }
            System.out.println(aus);
        }
    }
    public static boolean isOk(int i,int j)
    {
        if(i == 2) return true;
        //if(i == 1) return false;
        if((j-a1[i-2])*(a1[i-1]-a1[i-2])<0)
        {

            return true;
        }
        return false;
    }
    public static void dfs(int i,int k)
    {
        if(i > k)
        {
            return;
        }
        for (int j = 1; j <= k; j++) {
            if(kv[j]==0&&isOk(i,j))
            {
                aus++;
                a1[a++] = j;
                kv[j] = 1;
                //System.out.println(Arrays.toString(a1)+(a-1));
                dfs(i+1,k);
                a--;
                kv[j] = 0;
            }
        }
    }
}
