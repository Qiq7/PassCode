package javaxm3.sbww;

public class MyLeetCode0257 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] r = new int[26],
                m = new int[26];
        for (char x:magazine.toCharArray()) {
            m[x-'a']++;
        }
        for (char x:ransomNote.toCharArray()) {
            r[x-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (r[i]!=0&&r[i]>m[i])
            {
                return false;
            }
        }
        return true;
    }
}
