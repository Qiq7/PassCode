package javaxm2.sbww.sy2;

import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class PowerSet {
    public static void main(String[] args) {
        int[] a= {1,2,3};
        Pr(a);
    }
    public static void Pr(int [] a) {
            int[] b=new int[a.length];
            HashSet<TreeSet<Integer>> c=new HashSet<>();
            suPr(a,b,c);
        for (TreeSet<Integer> d:c) {
            for (int w:d) {
                System.out.print(w+"  ");
            }
            System.out.println();
        }
    }
    public static void suPr(int[] a,int[] b,HashSet<TreeSet<Integer>> c)
    {
        TreeSet<Integer> e=new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            if(b[i]!=1)
            {
                b[i]=1;
                suPr(a,b,c);
                b[i]=0;
            }else {
                e.add(a[i]);
            }
        }
        c.add(e);
    }

}
