package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.Scanner;

public class Lqb010 {
    private static int aus = 0;
    private static int aust = 0;
    public static void f(int[] vi,String[] s,String now)
    {
        for (int i = 0; i < s.length; i++) {
            if (isok(now, s[i]) && vi[i] < 2) {
                vi[i] ++;
                int t = count(now,s[i]);
                aus += t;
                aust = Math.max(aus,aust);
//                System.out.println(s[i]);
//                System.out.println(aus);
                f(vi,s,s[i]);
                vi[i] --;
                aus -= t;
            }
        }
    }
    public static boolean isok(String a, String b)
    {
        int r = 0,t = 0;
        for (int i = 0; i < a.length(); i++) {
           int l = i;
           while (l<a.length()&&r<b.length())
           {
               if(a.charAt(l) == b.charAt(r))
               {
                   l++;
                   r++;
               }else {
                   r = 0;
                   if(a.charAt(l) == b.charAt(r))
                   {
                       l++;
                       r++;
                   }else {
                       l++;
                   }
               }
           }
           if(r != 0)
           {
               t = Math.max(t,r);
               r = 0;
           }
        }
        if (t == 0||(t == a.length())&&b.length()>a.length()||(t == b.length())&&a.length()>b.length()) return false;
        else return true;
    }
    public static int count(String a, String b)
    {
        int r = 0,t = 666;
        for (int i = 0; i < a.length(); i++) {
            int l = i;
            while (l<a.length()&&r<b.length())
            {
                if(a.charAt(l) == b.charAt(r))
                {
                    l++;
                    r++;
                }else {
                    r = 0;
                    if(a.charAt(l) == b.charAt(r))
                    {
                        l++;
                        r++;
                    }else {
                        l++;
                    }
                }
            }
            if(r != 0)
            {
                t = Math.min(r,t);
                r = 0;
            }
        }
        return b.length() - t ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        n =  sc.nextInt();
        String [] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        String st = sc.next();
        int [] vi = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            if(s[i].charAt(0)==st.charAt(0))
            {
                vi[i] ++;
                aus += s[i].length();
                aust = Math.max(aust,aus);
//                System.out.println(s[i]);
                f(vi,s,s[i]);
//                System.out.println("-------------------");
                aus -= s[i].length();
                vi[i] --;
            }
        }
        System.out.println(aust);
//        System.out.println(Arrays.toString(s));
//        System.out.println(st);

    }
}
