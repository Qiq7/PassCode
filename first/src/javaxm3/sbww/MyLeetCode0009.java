package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0009 {
    public static void main(String[] args) {
        String a="anagram";
        String b="nagaram";
        System.out.println(isAnagram(a,b));
    }
    public static boolean isAnagram(String s,String t)
    {
        char[] a=s.toCharArray(),b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        //System.out.println(new String(a)+"   "+new String(b));
        return new String(a).equals(new String(b));
    }
}
