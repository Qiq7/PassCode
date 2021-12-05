package javaxm3.sbww;

public class MyLeetCode0250 {

    public boolean buddyStrings(String s, String goal) {
         if (s.length()!=goal.length()) return false;
         if (s.equals(goal)) return false;
         int [] a = new int[26],
                 b = new int[26];
         int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)-'a']++;
            b[goal.charAt(i)-'a']++;
            if (s.charAt(i)-'a'!=goal.charAt(i)-'a') sum++;
        }

        boolean ok = false;
        for (int i = 0; i < 26; i++) {
            if (a[i]!=b[i]) return false;
            if (a[i]>1) ok = true;
        }
        return sum==2 ||(ok&&sum==0);
    }
}
