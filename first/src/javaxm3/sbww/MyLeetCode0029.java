package javaxm3.sbww;
//over#621
import java.nio.charset.CharacterCodingException;
import java.util.*;

public class MyLeetCode0029 {
    public static void main(String[] args) {
        char[] a={'A','A','B','B','C','C','D','D',
                'E','E','F','F','G','G','H','H',
                'I','I','J','J','K','K','L','L',
                'M','M','N','N','O','O','P','P',
                'Q','Q','R','R','S','S','T','T',
                'U','U','V','V','W','W','X','X',
                'Y','Y','Z','Z'
        };
        System.out.println(leastInterval(a,2));
    }
    public static PriorityQueue<Character> renew(PriorityQueue<Character> q,int[][] s)
    {
        PriorityQueue<Character> r=new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return s[o2-'A'][1]==0&&00==s[o1-'A'][1]?s[o2-'A'][0]-s[o1-'A'][0]:s[o1-'A'][1]-s[o2-'A'][1];
            }
        });
        while (!q.isEmpty())
        {
            char ch=q.poll();
            r.offer(ch);
        }
        return r;
    }
    public static  int leastInterval(char[] tasks,int n )
    {
        int all=0;int[][] s=new int[26][2];
        for (int i = 0; i < tasks.length; i++) {
            s[tasks[i]-'A'][0]++;
        }
        PriorityQueue<Character> q=new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return s[o2-'A'][1]==0&&00==s[o1-'A'][1]?s[o2-'A'][0]-s[o1-'A'][0]:s[o1-'A'][1]-s[o2-'A'][1];
            }
        });
        for (char i = 'A'; i <= 'Z'; i++) {
            if(s[i-'A'][0]>0) q.offer(i);
        }
        System.out.println(q);
        while (!q.isEmpty())
        {
            char ch=q.poll();
            if(s[ch-'A'][1]==0)
            {
                all+=1;
                System.out.println(all);
                s[ch-'A'][1]=n;
                s[ch-'A'][0]--;
                //System.out.println("k");
                System.out.println(ch);
                for (char ch1:q) {
                    if(s[ch1-'A'][1]>0)
                    {
                        s[ch1-'A'][1]--;
                    }
                }
                if(s[ch-'A'][0]!=0)q.offer(ch);
                q=renew(q,s);
            }else{
                q.offer(ch);
                all+=1;
                //System.out.println("o");
                for (char ch1:q) {
                    if(s[ch1-'A'][1]>0)
                    {
                        s[ch1-'A'][1]--;
                    }
                }
                q=renew(q,s);
            }
        }
        //System.out.println(q);
        return all;
    }
}
