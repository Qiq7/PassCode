package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.Scanner;

public class Lqb016 {
    public static void f(int s,int e,char[] ch)
    {
        if (s == e||e + 1 == s)
        {
            System.out.println();
            f(s+1,e-1,ch);
        }
        else if(s - 1 == e + 1||e + 3 == s)
        {
            System.out.println(new String(ch));
            return;
        }else{
            char t = ch[s];
            ch[s] = ch[e];
            ch[e] = t;
            System.out.println(new String(ch));
            f(s+1,e-1,ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        f(0,s.length()-1,s.toCharArray());
    }
}
