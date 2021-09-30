package javaxm3.sbww;

import java.util.Arrays;
import java.util.Comparator;

public class MyleetCode0072 {
    public static void main(String[] args) {
        System.out.println(largestNumber(new int[]{12,25,45,87,15,45,87,64}));
    }
    public static boolean f(String a,String b)
    {
        int i = 0,j = 0;
        while (i<a.length()&&j<b.length()&&a.charAt(i)==b.charAt(j))
        {
            i++;
            j++;
        }
        if(i==a.length()&&j==b.length())
        {
            return false;
        }
        else if(i==a.length()&j!=b.length())
        {
            String t = b.substring(j);
            return f(a,t);
        }
        else if (j == b.length()&&i!=a.length())
        {
            String t = a.substring(i);
            return f(t,b);
        }
        return a.charAt(i)>b.charAt(j);
    }
    public static String largestNumber(int[] nums) {
        String s = "";
        String[] a = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[i] = new String(String.valueOf(nums[i]));
        }
        //Arrays.sort(a, Comparator.reverseOrder());
        String t;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if(f(a[j+1],a[j]))
                {
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        for (String x:a) {
            s+=x;
        }
        if (s.charAt(0)=='0') return "0";
        return s;
    }
}
