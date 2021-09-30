package javaxm2.sbww.study;

import java.util.Scanner;

public class Lqb018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long aus = 0;
        long all = 0;
        for (int i = 0; i < a.length; i++) {
            if(all<0)
            {
                all = 0;
            }else {
                all += a[i];
                aus = Math.max(aus,all);
            }
        }
        System.out.println(aus);
    }
}
