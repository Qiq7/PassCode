package javaxm3.sbww;
//over#767
import java.util.Comparator;
import java.util.PriorityQueue;

public class MyLeetCode0023 {
    public static void main(String[] args) {
        String a="aacb";
        System.out.println(reorganizeString(a));
    }
    public static String reorganizeString(String S)
    {
        if(S.length()<=1) return S;
        String a="";int m=0;
        int[] b=new int[26];
        char[] c=S.toCharArray();
        for (int i = 0; i < c.length; i++) {
            b[c[i]-'a']++;
            m=Math.max(m,b[c[i]-'a']);
        }
        if(m>(c.length+1)/2) return a;
        PriorityQueue<Character> q=new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return b[o2-'a']-b[o1-'a'];
            }
        });
        for (char i = 'a'; i <= 'z'; i++) {
            if(b[i-'a']>0) q.offer(i);
        }
        while (q.size()>1)
        {
            int a1=q.poll(),a2=q.poll();
            a+=(char)a1;
            a+=(char)a2;
            b[a1-'a']--;
            b[a2-'a']--;
            if(b[a1-'a']>0) q.offer((char)a1);
            if(b[a2-'a']>0) q.offer((char)a2);
        }
        if (q.size()>0) a+=q.poll();
        return a;
    }
}
