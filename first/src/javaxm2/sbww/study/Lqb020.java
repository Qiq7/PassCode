package javaxm2.sbww.study;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;

public class Lqb020 {
    public static boolean t(int[] ch,int t)
    {
        int mi = ch[t];
        for (int i = t; i < ch.length; i++) {
            if(ch[i]>mi)
            {
                return true;
            }
        }
        return false;
    }
    public static int[] s(int[] ch,int t)
    {
        int [] s0 = new int[ch.length],s1;
        for (int i = 0; i < t; i++) {
            s0[i] = ch[i];
        }
        int mi = ch[t+1];
        int mt = t+1;
        for (int i = t+1; i < ch.length; i++) {
            if(ch[i]>ch[t])
            {
                if(ch[i]<mi)
                {
                    mi = ch[i];
                    mt = i;
                }
            }
        }
        int a = ch[t];
        s0[t] = mi;
        ch[mt] = a;
        //System.out.println(Arrays.toString(s0));
        int[] b = new int[ch.length-t-1];
        int j = t+1;
        for (int i = 0; i < b.length ; i++) {
            b[i] = ch[j++];
        }
        Arrays.sort(b);
        j=0;
        //System.out.println(Arrays.toString(b));
        for (int i = t+1; i <ch.length ; i++) {
            s0[i] = b[j++];
        }
        return s0;
    }
    public static int[] f(int[] ch)
    {

        for (int i = ch.length-2; i >= 0 ; i--) {
            if(t(ch,i))
            {
                ch = s(ch,i);
                break;
            }
        }
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),a = sc.nextInt();
        int[] ch = new int[n];
        for (int i = 0; i < n; i++) {
            ch[i] = sc.nextInt();
        }
        for (int i = 1; i <= a ; i++) {
            ch = f(ch);
        }
        for (int x:ch) {
            System.out.print(x+" ");
        }
    }
}
