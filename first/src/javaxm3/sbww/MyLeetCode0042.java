package javaxm3.sbww;

import javax.swing.plaf.IconUIResource;
import javax.swing.text.html.HTMLDocument;
import java.time.Year;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLeetCode0042 {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{0},23));
    }

    public static List<Integer> addToArrayForm(int [] A,int K)
    {
        List<Integer> a=new LinkedList<>();
        String s=new String(String.valueOf(K));
        char[] c=s.toCharArray();
        int i=A.length-1,j=c.length-1;
        int y=0;
        while (i>=0&&j>=0)
        {
            if(A[i]+c[j]-48+y>=10)
            {
                a.add((A[i]+c[j]-48+y)%10);
                y=(A[i]+c[j]-48+y)/10;
            }else {
                a.add(y+A[i]+c[j]-48);
                y=0;
            }
            i--;
            j--;
        }
        while (i>=0)
        {
            if(y+A[i]>=10)
            {
                a.add((A[i]+y)%10);
                y=(A[i]+y)/10;
            }else {
                a.add(y+A[i]);
                y=0;
            }
            i--;
        }
        while (j>=0)
        {
            if(y+c[j]-48>=10)
            {
                a.add((y+c[j]-48)%10);
                y=(y+c[j]-48)/10;
            }else {
                a.add(y+c[j]-48);
                y=0;
            }
            j--;
        }
        if(y!=0)a.add(y);
        List<Integer> b=new ArrayList<>();
        for (int k = a.size()-1; k >=0; k--) {
            b.add(a.get(k));
        }
        return b;
    }
}
