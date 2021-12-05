package javaxm3.sbww;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyLeetCode0251 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> aus = new LinkedList<>();
        int np = p.length(),
        ns = s.length();

        if (ns<np){
            return aus;
        }
        int [] ap = new int[26],
        as = new int[26];

        for (int i = 0; i < np; i++) {
            ap[p.charAt(i)-'a']++;
            as[s.charAt(i)-'a']++;
        }
        if (Arrays.equals(ap,as)){
         aus.add(0);
        }
        for (int i = 0; i < ns-np; i++) {
            as[p.charAt(i)-'a']--;
            as[p.charAt(i+np)-'a']++;
            if (Arrays.equals(ap,as)){
                aus.add(i+1);
            }
        }







        return aus;
    }
}
