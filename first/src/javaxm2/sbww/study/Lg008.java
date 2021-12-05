package javaxm2.sbww.study;


import java.util.Arrays;
import java.util.Scanner;

public class Lg008 {
    public static int maxaus;
    public static int minaus;
    public static int[] a;
    public static int m;

    public static int mod(int x){
        x = x%10;
        while (x < 0){
            x+=10;
        }
        return x;
    }

    public static void f(){

        int[] temp = new int[a.length];
        for (int j = 0; j < a.length; j++) {
            temp[j] = a[j];
        }
        for (int i = 0; i < a.length-1; i++) {
            a[i] = temp[i+1];
        }
        a[a.length-1] = temp[0];
        //System.out.println(Arrays.toString(a));
        int[] sum = new int[a.length];
        for (int i = 0; i < a.length ; i++) {
            if (i==0){
                sum[i] = a[i];
            }else {
                sum[i]+=sum[i-1]+a[i];
            }
        }
        //System.out.println(Arrays.toString(sum));
        int [][] num = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            num[0][i] = mod(sum[i]);
        }
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (i==0){
                    num[i][j]=mod(sum[0]);
                }else {
                    num[i][j]=mod(sum[j]-sum[i-1]);
                }
            }
        }
        //System.out.println(Arrays.deepToString(num));


        int [][] dp = new int[a.length][m];
        for (int i = 0; i < a.length; i++) {
            dp[i][0] = num[0][i];
        }
        for (int k = 1; k < m; k++) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < i; j++) {
                    dp[i][k] = Math.max(dp[i][k],dp[j][k-1]*num[j+1][i]);
                }
            }
        }
        maxaus=Math.max(dp[a.length-1][m-1],maxaus);


        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i],6666);
        }
        for (int i = 0; i < a.length; i++) {
            dp[i][0] = num[0][i];
        }
        for (int k = 1; k < m; k++) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < i; j++) {
                    dp[i][k] = Math.min(dp[i][k],dp[j][k-1]*num[j+1][i]);
                }
            }
        }
        minaus=Math.min(dp[a.length-1][m-1],minaus);
    }

    public static void main(String[] args) {

        maxaus=Integer.MIN_VALUE;
        minaus=Integer.MAX_VALUE;


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
                m = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            f();
        }
        System.out.println(minaus);
        System.out.println(maxaus);

//        System.out.println(n);
//        System.out.println(m);
//        System.out.println(Arrays.toString(a));
    }
}
