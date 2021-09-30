package javaxm2.sbww.study;

import java.util.Scanner;

public class Lqb017 {
    public static boolean f(int i)
    {   if(i == 2)
    {
        return true;
    } else {
        for (int j = 2; j * j<= i; j++) {
            if(i%j==0) return false;
        }
    }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        long  c = 1,aus = 1;
        for (int i = 2; c <= n ; i++) {
            if(f(i)){
                aus=((aus%50000)*(i%50000));
                c++;
            }
        }
        System.out.println(aus%50000);
    }
}

