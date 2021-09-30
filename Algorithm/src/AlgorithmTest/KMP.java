package AlgorithmTest;

import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {
        String s1="abcabbbbbbadef";
        String s2="abbbbbba";
        System.out.println(violenceMatch(s1,s2));
        System.out.println(Arrays.toString(kmpNext(s2)));
        System.out.println(KMP0(s1,s2,kmpNext(s2)));

    }

    public static int violenceMatch(String str1,String str2)
    {
        char[] s1=str1.toCharArray();
        char[] s2=str2.toCharArray();
        int i=0,j=0;
        while (i<s1.length&&j<s2.length)
        {
            if(s1[i]==s2[j])
            {
                i++;
                j++;
            }else{
                i=i-j+1;
                j=0;
            }
        }
        return j==s2.length?i-j+1:-1;
    }
    public static int KMP0(String str1,String str2,int[] next)
    {
        for (int i = 0,j = 0; i < str1.length(); i++) {
            while(j>0&&str1.charAt(i)!=str2.charAt(j))
            {
                j=next[j-1];
            }
            if(str1.charAt(i)==str2.charAt(j))
            {
                j++;
            }
            if(j==str2.length())
            {
                return i-j+1;
            }

        }
        return -1;
    }
    public static int[] kmpNext(String s)
    {
        int[] next = new int[s.length()];
        next[0] = 0;
        for (int i = 1,j = 0; i < s.length(); i++) {
            while (j>0&&s.charAt(i)!=s.charAt(j))
            {
                j=next[j-1];
            }
            if(s.charAt(i)==s.charAt(j))
            {
                j++;
            }
            next[i]=j;
        }
        return next;
    }
}
