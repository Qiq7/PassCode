package javaxm3.sbww;
//over#1370
import java.util.Arrays;

public class MyLeetCode0014 {
    public static void main(String[] args) {
        String a="sdfsdfsdf";
        System.out.println(sortString(a));
    }
    public static String sortString(String s)
    {
        String result="";
        int[] nums=new int[26];
        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i)-'a']++;
        }
        while (result.length()!=s.length())
        {
            for (int i = 0; i < 26; i++) {
                if(nums[i]==0) continue;
                result+=(char)(i+'a');
                nums[i]--;
            }
            for (int i = 25; i >= 0; i--) {
                if (nums[i] == 0) continue;
                result += (char) (i + 'a');
                nums[i]--;
            }
        }
        return result;
    }
}
