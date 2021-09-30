package javaxm2.sbww.study;

import java.util.Scanner;

public class Lqb005 {
    //private static int aus = 0;
    public static int f(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else if(n == 0)
        {
            return 1;
        }
        else {
            return f(n-1) + f(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }
}
