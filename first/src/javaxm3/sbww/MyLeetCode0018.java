package javaxm3.sbww;
//over#17
import java.util.LinkedList;
import java.util.List;

public class MyLeetCode0018 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
    }
    public static void dfs(char[] b,char[][] n,List<String> a,String s,char[][] c,int x)
    {
        if(x==b.length)
        {
            a.add(s);
            return;
        }
        for (int i=0;i<c[b[x]-49].length;i++)
        {
            s+=c[b[x]-49][i];
            dfs(b,n,a,s,c,x+1);
            s=s.substring(0,s.length()-1);
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
        for (int i=0,j=0; i < n[b[j]-49].length; i++) {
            s+=n[b[j]-49][i];
            dfs(b,n,a,s,n,j+1);
            s=s.substring(0,s.length()-1);
        }
        return a;
    }
}
