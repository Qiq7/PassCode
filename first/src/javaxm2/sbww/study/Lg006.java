package javaxm2.sbww.study;


import java.util.Arrays;
import java.util.Scanner;


public class Lg006 {
    private static int aus = 0;
    private static int N,K;
    private static int[] ans = new int[20],a = new int[20];
    private static int [] f = new int[10000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         K = sc.nextInt();
        f(1,0);
        for (int i = 1; i <= K ; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        System.out.println("MAX="+aus);
    }
    private static void f(int u,int num){
       if(u==K+1){
           if(num>aus){
               aus=num;
               for (int i = 1; i <= K; i++) {
                   ans[i] = a[i];
               }
           }
       }else {
           for (int i = a[u-1]+1; i <= num+1 ; i++) {
               a[u] = i;
               f(u+1,dp(u));
           }
       }
    }
    private static int dp(int u){
        for (int i = 1; i <= a[u]*N+1 ; i++) {
            f[i] = 666;
        }

        for (int i = 1; i <= u; i++) {
            for (int j = a[i]; j <= a[u]*N   ; j++) {
                f[j] = Math.min(f[j],f[j-a[i]]+1);
            }
        }

        int t = 0;
        for (int i = 1; i <= a[u]*N+1 ; i++) {
            if(f[i]>N){
                t = i-1;
                break;
            }
        }
        return t;
    }

}
