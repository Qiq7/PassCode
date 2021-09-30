package javaxm2.sbww.study;

import java.util.*;

public class Lqb007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //String s = new String();
        String s = sc.next();
        char [] ch = s.toCharArray();
        List<Integer> aus = new ArrayList<>();
        List<Integer> t1 = new ArrayList<>();
        for (int i = 0; i < ch.length; i++) {
            if(n > 10 && ch[i]>='A')
            {
                aus.add(ch[i]-'A'+10);
            }else {
                aus.add( ch[i] - '0');
            }
        }
        int i ;
        for ( i = 0; i <= 30; i++) {
            //System.out.println(aus);
            if(f(aus))
            {
                System.out.println(i);
                return;
            }
            //System.out.println(aus);
            int t = 0;
            for (int j = 0; j < aus.size(); j++) {
                List<Integer> aus2 = new ArrayList<>();
                int d = (t+aus.get(j)+aus.get(aus.size()-1-j))%n;
                t = (aus.get(j)+aus.get(aus.size()-1-j)+t)/n;
                //aus.set(j,d);
                //System.out.println(aus);
                //System.out.println(aus.get(j)+"  "+aus.get(aus.size()-1-j)+" "+d+" "+t+" ");
                aus2.add(d);
                //t1 = aus2;
                t1.addAll(aus2);
            }
            aus.clear();
            aus.addAll(t1);
            t1.clear();
            if (t!=0)
            {
                aus.add(t);
            }

        }
        if(i > 30)
        {
            System.out.println("Impossible!");
        }
        //System.out.println(Arrays.toString(aus));
    }
    public static boolean f(List<Integer> a)
    {
        int l = 0,r = a.size()-1;
        while (l<r)
        {
            if(a.get(l)!=a.get(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
