package javaxm3.sbww;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyLeetCode0017 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    public static boolean isOk(int[] c)
    {
        for (int i = 0; i < c.length; i++) {
            if(c[i]==0) return false;
        }
        return true;
    }
    public static boolean Chick(List<String> a,String s)
    {
        for (String s2:a) {
            for (int i = 0; i < s.length(); i++) {
            }
        }
        return true;
    }
    public static void dfs(char[][] n,char[] b,int c[],List<String> a,String s)
    {
        if(isOk(c)&&s.length()==b.length)
        {
            //if(!Chick(a,s))
            a.add(s);
            //System.out.println(s);
            return;
        }
        for (int i = 0; i < b.length; i++) {
            if(c[i]==0)
            {
                c[i]=1;
                for (int j = 0; j < n[b[i]-49].length; j++) {
                    s+=n[b[i]-49][j];
                   //c[i]=1;
                    //System.out.println(s);
                    dfs(n,b,c,a,s);
                    //c[i]=0;
                    s=s.substring(0,s.length()-1);
                    //System.out.println(s);
                }
                c[i]=0;
            }
        }
    }
    public static List<String> letterCombinations(String digits)
    {
        char[][] n={{'!','@','#'},{'a','b','c'},{'d','e','f'},
                {'g','h','i'},{'j','k','l'},{'m','n','o'},
                {'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        char b[]=digits.toCharArray();
        int[] c=new int[b.length];
        List<String> a= new LinkedList<>();
        String s="";
        for (int i = 0; i < b.length; i++) {
            //int t=b[i];
            //System.out.println(t-48);
            c[i]=1;
            for (int j = 0; j < n[b[i]-49].length; j++) {
                s+=n[b[i]-49][j];
                //c[i]=1;
                dfs(n,b,c,a,s);
                //c[i]=0;
                s=s.substring(0,s.length()-1);
            }
            c[i]=0;
        }
        return a;
    }
}
