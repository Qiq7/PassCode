package javaxm2.sbww.study;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Acm002 {

    public static long[] aus;
    public static int MOD = 998244353;
    public static long [] dp = new long[1000000];

    public static long q1(int x,int n){
        if (n==0) return 1;
        else if (n%2==1){
            return q1(x,n-1)*x%MOD;
        }else {
            long tmp = q1(x,n/2);
            return tmp*tmp%MOD;
        }
    }
    public static long q(long x,int n){
        long aus = 1;
        while (n!=0){
            if (n!=0){
                aus=aus*x;
            }
            x=x*x;
            n>>=1;
        }
        return aus%MOD;
    }

    public static long q2(int x,int n){
        if (dp[n]==-1){
            if (n==1){
                dp[n] = 2;
            }else if (n%2==1){
                dp[n] = q2(x,n-1)*x%MOD;
            }else{
                dp[n/2] = q2(x,n/2);
                dp[n] = dp[n/2]*dp[n/2]%MOD;
            }
        }
        return dp[n];
    }
    public static void f(int i,int[] num){
        int n = num[i]/2;
        long t = q2(2,n);
        for (int j = 1; j < n; j++) {
            t+=q2(2,j);
            t%=MOD;
        }
        aus[i] = t;
    }
    public static void main(String[] args) {
        Arrays.fill(dp,-1);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num = new int[n+1];
        aus = new long[n+1];
        for (int i = 1; i <= n ; i++) {
            num[i]=sc.nextInt();
        }
        for (int i = 1; i <= n ; i++) {
            f(i,num);
            //System.out.println(Arrays.toString(num));
        }
        for (long x:dp) {
            System.out.println(x);
        }
        //System.out.println(Arrays.toString(num));
        for (int i = 1; i < aus.length ; i++) {
            System.out.println(aus[i]);
        }
    }
}
