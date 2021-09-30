package javaxm3.sbww;

public class MyLeetCode0055 {
    public static void main(String[] args) {
        System.out.println(numDistinct("babgbag","bag"));
    }
    public static int numDistinct(String s, String t) {
        if(t.length()>s.length()) return 0;
        int[][] aus = new int[s.length()+1][t.length()+1];
        for (int i = 0; i < s.length()+1; i++) {
            aus[i][0] = 1;
        }
        for (int i = 1; i < t.length()+1; i++) {
            for (int j = 1; j < s.length()+1; j++) {
                if(s.charAt(j-1)==t.charAt(i-1))
                {
                    aus[j][i] = aus[j-1][i]+aus[j-1][i-1];
                }else {
                    aus[j][i] = aus[j-1][i];
                }
            }
        }
        return aus[s.length()][t.length()];
    }
}
