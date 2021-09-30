package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.Scanner;

public class Lqb009 {
    private static int aus = 0;
    public static void f(int [] a,int l,int r,int t,int k)
    {
        if ( (r - l) < k) {return;}
        int q = 0;
        if (k == 0)
        {
            for (int i = l; i <= r ; i++) {
                q = q*10 + a[i];
            }
            aus = Math.max(aus,t*q);
        }else {
            for (int i = l; i <= r - k; i++) {
                q = q * 10 + a[i];
                f(a,i+1,r,t*q,k - 1);
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        int [] a= new  int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = c[i] - '0';
        }
        f(a,0,a.length-1,1,k);
        System.out.println(aus);
    }

}
