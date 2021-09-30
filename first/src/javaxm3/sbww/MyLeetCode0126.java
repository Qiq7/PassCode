package javaxm3.sbww;

import java.util.*;

public class MyLeetCode0126 {
    public static void main(String[] args) {
        MyLeetCode0126 a = new MyLeetCode0126();
        //System.out.println(a.permutation("dkjphedy"));
    }
    List<String> aus;
    public static boolean isok(boolean[] b)
    {
        for (int i = 0; i < b.length; i++) {
            if(b[i]==false)
            {
                return false;
            }
        }
        return true;
    }
    public void f(String s,boolean[] b,String sb,int i1)
    {
        if(i1 == s.length())
        {
            if (!aus.contains(sb))
            {
                aus.add(sb);
            }
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if(b[i]==false)
            {
                b[i] = true;
                f(s,b,sb+s.charAt(i),i1+1);
                b[i] = false;
            }
        }
    }
    public String[] permutation(String s) {
        aus = new ArrayList<>();
        boolean[] b = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            b[i] = true;
            f(s,b,s.charAt(i)+"",1);
            b[i] = false;
        }
        String[] ans = new String[aus.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = aus.get(i);
        }
        return ans;
    }
}
