package javaxm3.sbww;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MyLeetCode0255 {
    public static void main(String[] args) {
        findRelativeRanks(new int[]{
                5,4,3,2,1
        });
    }
    public static String[] findRelativeRanks(int[] score) {
        String [] aus = new String[score.length];
        Map<Integer,Integer> a = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            a.put(score[i],i);
        }
        Arrays.sort(score);
        String[] b = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        int c = 0;
        for (int i = score.length-1; i >= 0 ; i--) {
            if (c<b.length){
                System.out.println(a.get(score[i]));
                aus[a.get(score[i])] = b[c];
            }else {
                aus[a.get(score[i])] = String.valueOf(c+1);
            }
            c++;
        }


        return aus;
    }
}
