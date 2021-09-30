package javaxm2.sbww.study;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Lqb012 {
    public static void tree(int ml,int mr,int r,String m,String l,Deque<Character> a)
    {
        if(ml == mr)
        {
            if(!a.contains(m.charAt(ml))) a.add(m.charAt(ml));
            return;
        }
        if(r <= 0 || mr < ml)
        {
            return;
        }
        for (int i = ml; i <= mr; i++) {
            if(m.charAt(i) == l.charAt(r) && !a.contains(l.charAt(i)))
            {
                int r0 = r - 1;
                while (a.contains(l.charAt(r0)))
                {
                    r0 --;
                }
                if(i+1>mr)
                {
                    tree(ml,i-1,r0,m,l,a);
                    a.add(l.charAt(r));
                    break;
                }else if(i-1<ml)
                {
                    tree(i+1,mr,r0,m,l,a);
                    a.add(l.charAt(r));
                    break;
                }else {
                    tree(i + 1, mr, r0, m, l, a);
                    r0 -- ;
                    while (a.contains(l.charAt(r0)))
                    {
                        r0 --;
                    }
                    tree(ml, i - 1, r0, m, l, a);
                    a.add(l.charAt(r));
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        String l = sc.nextLine();
        Deque<Character> a = new LinkedList<>();
        tree(0,m.length()-1,l.length()-1,m,l,a);
        String aus = "";
        while (!a.isEmpty())
        {
            aus+=a.getLast();
            a.removeLast();
        }
        System.out.println(aus);
    }
}
