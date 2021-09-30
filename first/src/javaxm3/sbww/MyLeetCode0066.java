package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0066 {
    public static void main(String[] args) {

        String a = "ezupkr" ;
        String b = "ubmrapg";
        System.out.println(longestCommonSubsequence(a,b));
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int [][] map = new int[text1.length()+1][text2.length()+1];
        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map[i].length; j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                {
                    map[i][j] = Math.max(1+map[i-1][j],map[i][j-1]);
                }else {
                    map[i][j] = Math.max(map[i][j-1],map[i-1][j]);
                }
            }
        }
        //System.out.println(Arrays.deepToString(map));
        return map[text1.length()][text2.length()];
    }
}
