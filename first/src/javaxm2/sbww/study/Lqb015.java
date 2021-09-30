package javaxm2.sbww.study;
import java.util.Scanner;

public class Lqb015 {
    private static int[] f = new int[10000],a = new int[20],s = new int[20];
    private static int max0 = 0,n,k;
    public static int dp(int u)
    {
        for (int i = 1; i <= a[u]*n + 1 ; i++) {
            f[i] = 666;
        }
        for (int i = 1; i <= u ; i++) {
            for (int j = a[i]; j <= a[i]*n ; j++) {
                f[j] = Math.min(f[j],f[j - a[i]]+1);
            }
        }
//        for (int i = 1; i <= a[u]*n + 1; i++) {
//            System.out.println(f[i]);
//        }
//        System.out.println(u);
        int t = 0;
        for (int i = 1; i <= a[u]*n + 1 ; i++) {
            //System.out.println(f[i]);
            if(f[i] > n) {
                t = i - 1;
                break;
            }
        }
        //System.out.println(t);
        return t;
    }
    public static void dfs(int u,int num)
    {
        if(u == k+1)
        {
            if (num > max0)
            {
                max0 = num;
                for (int i = 1; i <= k; i++) {
                    s[i] = a[i];
                }
            }
        }else{
            for (int i = a[u - 1] + 1; i <= num + 1 ; i++) {
                a[u] = i;
                dfs(u+1,dp(u));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        dfs(1,0);
        for (int i = 1; i <= k ; i++) {
            System.out.print(s[i]+" ");
        }
        System.out.println();
        System.out.println("MAX="+max0);
    }
}
