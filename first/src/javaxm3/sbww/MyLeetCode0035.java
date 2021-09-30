package javaxm3.sbww;

public class MyLeetCode0035 {
    public static void main(String[] args) {
        System.out.println(findtheDifference("abcd","abcde"));
    }
    public static char findtheDifference(String s,String t)
    {
        char c = 0;
        int[] a=new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch1=s.charAt(i);
            a[ch1-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch0=t.charAt(i);
            a[ch0-'a']--;
            if(a[t.charAt(i)-'a']==-1)
            {
                c=ch0;
                break;
            }
        }
        return c;
    }
}
