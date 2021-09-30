package javaxm3.sbww;

public class MyLeetCode0079 {
    public static void main(String[] args) {

    }
    public static int[] f(String s)
    {
        int [] a = new int[s.length()];
        for (int i = 1,j = 0 ; i <s.length() ; i++) {
            while (j>0&&s.charAt(i)!=s.charAt(j))
            {
                j = a[j - 1];
            }
            if(s.charAt(i)==s.charAt(j))
            {
                j++;
            }
            a[i] = j;
        }
        return a;
    }

    public static int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        int [] next = f(needle);
        for (int i = 0,j = 0; i < haystack.length(); i++) {
            while (j>0&&haystack.charAt(i)!=needle.charAt(j))
            {
                j = next[j - 1];
            }
            if(haystack.charAt(i)==needle.charAt(j))
            {
                j++;
            }
            if(j==needle.length())
            {
                return i-needle.length()+1;
            }
        }

        return -1;
    }
}
