package javaxm2.sbww.study;

import java.util.Scanner;

public class Lqb001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        if(n==1)
        {
            System.out.println(1);
        }
        else if (n==2)
        {
            System.out.println(1);
        }else {
            int mod = 1007;
            long a = 1, b = 1;
            long t = 0;
            //n%=108;
            for (long i = 3; i <= n; i++) {

                    t = (a + b) % mod;
                    a = b;
                    b = t;

            }
            System.out.println(t);
        }
    }
}
