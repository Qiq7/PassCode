package javaxm2.sbww.study;

import java.util.Scanner;

public class Lqb021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(),n = sc.nextInt();
        int [][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        int [] all = new int[l+1];
        for (int i = 0; i < n; i++) {
            for (int j = a[i][0]; j <= a[i][1] ; j++) {
                all[j] = 1;
            }
        }
        int count = 0;
        for (int i = 0; i < all.length; i++) {
            if (all[i] == 0)  count++;
        }
        System.out.println(count);
    }
}
