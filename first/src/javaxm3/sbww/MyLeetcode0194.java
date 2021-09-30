package javaxm3.sbww;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyLeetcode0194 {
    public static void main(String[] args) {

    }
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()==o2.length()?o1.compareTo(o2):o2.length()-o1.length();
            }
        });
        for (String t:dictionary) {
            int i=0,j=0;
            while (i<t.length()&&j<s.length()){
                if(t.charAt(i)==s.charAt(j))
                {
                    i++;
                }
                j++;
            }
            if(i==t.length())
            {
                return t;
            }
        }
        return "";
    }
}
